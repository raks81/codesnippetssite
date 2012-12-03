package net.rr.polarion;

import info.bliki.html.HTML2WikiConverter;
import info.bliki.html.wikipedia.ToWikipedia;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.rmi.RemoteException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Logger;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.rpc.ServiceException;

import org.apache.commons.lang.StringUtils;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.lustin.trac.xmlprc.Ticket;
import org.lustin.trac.xmlprc.TrackerDynamicProxy;

import com.polarion.alm.ws.client.WebServiceFactory;
import com.polarion.alm.ws.client.projects.ProjectWebService;
import com.polarion.alm.ws.client.session.SessionWebService;
import com.polarion.alm.ws.client.tracker.TrackerWebService;
import com.polarion.alm.ws.client.types.projects.Project;
import com.polarion.alm.ws.client.types.projects.ProjectGroup;
import com.polarion.alm.ws.client.types.tracker.Attachment;
import com.polarion.alm.ws.client.types.tracker.Comment;
import com.polarion.alm.ws.client.types.tracker.LinkedWorkItem;
import com.polarion.alm.ws.client.types.tracker.WorkItem;

public class PolarionToTrac {

	private static final String NOT_FOUND = "NOTFOUND";

	private static final long MAX_ATTACHMENT_SIZE_TO_DOWNLOAD = 10485760L;

	private static final Logger LOG = Logger.getLogger(PolarionToTrac.class
			.getName());

	private Properties prop = new Properties();

	private WebServiceFactory factory;
	private SessionWebService sessionService;
	private TrackerWebService trackerService;
	private ProjectWebService projectService;
	private Project project;
	private Calendar lastUpdated = Calendar.getInstance();
	private FileWriter fw;

	public PolarionToTrac() throws FileNotFoundException, IOException {
		super();
		prop.load(new FileInputStream("settings.properties"));
		setLastUpdated();
		fw = new FileWriter(new File("output.txt"));
	}

	// always verify the host - dont check for certificate
	final static HostnameVerifier DO_NOT_VERIFY = new HostnameVerifier() {
		public boolean verify(String hostname, SSLSession session) {
			return true;
		}
	};

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException,
			IOException {

		PolarionToTrac importer = new PolarionToTrac();
		try {
			LOG.fine("Started imported from Polarion...");
			List<WorkItem> wis = importer.importWIs();
			LOG.info("Imported " + wis.size() + " tickets from polarion");
			for (WorkItem wi : wis) {
				importer.writeToTrac(wi);
			}
			LOG.info("Import complete. Updating settings");
			importer.updateSettings();
		} catch (Exception e) {
			System.err.println("RESULT: operation NOT successful :((");
			e.printStackTrace();
		}

	}

	private void setLastUpdated() {
		// Handle last updated
		String luYear = prop.getProperty("luYear");
		String luMonth = prop.getProperty("luMonth");
		String luDay = prop.getProperty("luDay");
		String luHour = prop.getProperty("luHour");
		String luMin = prop.getProperty("luMinute");

		// Remove the ones updated later before the lastUpdatedTime
		lastUpdated = Calendar.getInstance();
		lastUpdated.set(Calendar.YEAR, Integer.parseInt(luYear));
		lastUpdated.set(Calendar.MONTH, Integer.parseInt(luMonth) - 1);
		lastUpdated.set(Calendar.DAY_OF_MONTH, Integer.parseInt(luDay));
		lastUpdated.set(Calendar.HOUR_OF_DAY, Integer.parseInt(luHour));
		lastUpdated.set(Calendar.MINUTE, Integer.parseInt(luMin));

	}

	/**
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<WorkItem> importWIs() throws Exception {
		LOG.info("Logging in to Polarion...");
		try {
			trustAllHosts();

			setUpPolarionAddress();

			setUpPolarionWebServices();

			// Init the p/w authenticator for use later:
			Authenticator.setDefault(new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(prop.getProperty("user"),
							prop.getProperty("passwd").toCharArray());
				}
			});

			sessionService.logIn(prop.getProperty("user"),
					prop.getProperty("passwd"));

		} catch (MalformedURLException me) {
			printError("Provided URL is malformed - protocol unknown.");
			throw me;
		} catch (ServiceException se) {
			printError("Unreachable web services at Polarion server.");
			throw se;
		} catch (RemoteException re) {
			printWarning("Log in unsuccessful");
			throw re;
		}

		LOG.info("Login to Polarion successful");
		try {
			ProjectGroup group = projectService.getRootProjectGroup();
			Project[] allProjects = projectService
					.getDeepContainedProjects(group.getUri());
			String projectId = prop.getProperty("project_id");

			for (Project aProject : allProjects) {
				if (aProject.getName() != null
						&& aProject.getName().equalsIgnoreCase(projectId)) {
					project = aProject;
					break;
				}
			}

			if (project.isUnresolvable()) {
				printError("Project not found: " + projectId);
				throw new RuntimeException("Project not found: " + projectId);
			}

			// Get fields
			String[] fields = prop.getProperty("fields").split(",");
			LOG.info("Getting fields: " + StringUtils.join(fields, ", "));

			// Get query
			String query = prop.getProperty("query");
			LOG.info("Using query: " + query);

			// Get work items
			List<WorkItem> wis = new ArrayList<WorkItem>(
					Arrays.asList(trackerService.queryWorkItems(query,
							prop.getProperty("sortby"), fields)));

			ListIterator<WorkItem> li = wis.listIterator();
			while (li.hasNext()) {
				WorkItem wi = li.next();
				if (wi.getUpdated() != null
						&& !wi.getUpdated().after(lastUpdated)) {
					LOG.warning("Ignored: " + wi.getId() + " - Updated: "
							+ formatDate(wi.getUpdated()) + " but: "
							+ formatDate(lastUpdated));
					li.remove();
				}
			}

			return wis;

		} catch (RemoteException re) {
			printError("Error occured during the execution of a remote method call.");
			throw re;
		} finally {
			sessionService.endSession();
		}
	}

	private void updateSettings() throws IOException, FileNotFoundException {
		// Update the last update
		Calendar now = Calendar.getInstance();
		prop.setProperty("luYear", String.valueOf(now.get(Calendar.YEAR)));
		prop.setProperty("luMonth", String.valueOf(now.get(Calendar.MONTH)));
		prop.setProperty("luDay",
				String.valueOf(now.get(Calendar.DAY_OF_MONTH)));
		prop.setProperty("luHour", String.valueOf(now.get(Calendar.HOUR)));
		prop.setProperty("luMinute",
				String.valueOf(now.get(Calendar.MINUTE) + 1));

		// TODO Uncomment
		prop.store(new FileOutputStream(new File("settings.properties")), "");
	}

	/**
	 * @param wi
	 * @throws MalformedURLException
	 */
	private void writeToTrac(WorkItem wi) throws MalformedURLException {
		LOG.info("Updating " + wi.getId());
		if (wi.getId() != null && wi.getTitle() != null) {
			XmlRpcClientConfigImpl conf = new XmlRpcClientConfigImpl();
			conf.setBasicUserName(prop.getProperty("tracuser"));
			conf.setBasicPassword(prop.getProperty("tracpwd"));
			try {
				conf.setServerURL(new URL(prop.getProperty("tracrpcurl")));
			} catch (MalformedURLException e) {
				throw e;
			}
			XmlRpcClient client = new XmlRpcClient();
			client.setConfig(conf);
			TrackerDynamicProxy proxy = new TrackerDynamicProxy(client);

			Ticket ticket = (Ticket) proxy.newInstance(Ticket.class);
			Vector v = null;
			try {
				v = ticket.query("polarion_id=" + getPolarionLink(wi.getId()));
			} catch (Exception e) {
				audit("CREATE: Ticket " + wi.getId()
						+ " not found. Will have to create new one");
			}
			if (v == null || v.size() == 0) {
				String description = wi.getDescription() == null ? "<b>No description in Polarion</b>"
						: wi.getDescription().getContent();

				// Convert HTML to wiki
				String wikiDescription = convertHTMLtoWiki(description);

				Integer id = ticket.create(
						wi.getTitle() == null ? "[No Titile in Polarion]" : wi
								.getTitle(), wikiDescription);

				// Set creator and created date
				audit("CREATE: Created ticket in trac " + id
						+ " for polarion id " + wi.getId());

				if (wi.getComments() != null) {
					for (Comment comment : wi.getComments()) {
						ticket.update(id, comment.getText().getContent());
					}
					audit("CREATE: Added comment to " + id + " while creating.");
				}

				Hashtable<String, String> attrs = getPolarionAttributes(wi);
				ticket.update(id, "Updated from polarion", attrs);

				audit("UPDATE: Updated attributes of trac ticket " + id
						+ " from polarion id " + wi.getId());

				// Update the ticket paramets vector
				v = ticket.query("polarion_id=" + getPolarionLink(wi.getId()));

			} else {
				int id = (Integer) v.get(0);

				// Update comments
				if (wi.getComments() != null) {
					for (Comment comment : wi.getComments()) {
						if (comment.getCreated().after(lastUpdated)) {
							ticket.update(id, "Comment from Polarion: \n"
									+ comment.getText().getContent());
						}
					}
					audit("UPDATE: Added comment to trac ticket " + id
							+ " from polarion id " + wi.getId());
				}

				// Update fields
				Hashtable<String, String> attrs = getPolarionAttributes(wi);
				ticket.update(id, "Updated from polarion", attrs);
				audit("UPDATE: Updated attributes of trac ticket " + id
						+ " from polarion id " + wi.getId());

			}

			// Check attachments
			if (wi.getAttachments() != null && wi.getAttachments().length > 0) {
				for (Attachment attachment : wi.getAttachments()) {
					LOG.info("Getting attachment " + attachment.getFileName()
							+ " from " + attachment.getUrl());

					if (attachment.getLength() < MAX_ATTACHMENT_SIZE_TO_DOWNLOAD) {
						try {
							File f = downloadFile(attachment);
							byte[] content = new byte[(int) f.length()];
							BufferedInputStream fis = new BufferedInputStream(
									new FileInputStream(f));
							fis.read(content, 0, (int) f.length());

							ticket.putAttachment((Integer) v.get(0),
									f.getName(), f.getName(), content, true);
							fis.close();
							f.delete();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						LOG.warning("Not downloading file: "
								+ attachment.getFileName()
								+ " as the file size exceeds 10MB. File's actual size is: "
								+ attachment.getLength());
					}
				}
			}

			// Update relations to other tickets
			Hashtable<String, String> attrs = new Hashtable<String, String>();
			getTicketDependencies(wi.getLinkedWorkItems(), ticket, attrs,
					"polarion_parent");
			getTicketDependencies(wi.getLinkedWorkItemsDerived(), ticket,
					attrs, "polarion_related");
			ticket.update((Integer) v.get(0), "Updated relations", attrs);
		}
	}

	private void getTicketDependencies(LinkedWorkItem[] lwis, Ticket ticket,
			Hashtable<String, String> attrs, String tracAttribute) {
		if (lwis != null && lwis.length > 0) {
			String value = "";
			for (LinkedWorkItem parentWi : lwis) {
				Vector parentTracTix = ticket.query("polarion_id="
						+ getPolarionLink(StringUtils.substring(parentWi
								.getWorkItemURI(), parentWi.getWorkItemURI()
								.indexOf("PFE-"))));
				if (parentTracTix != null && parentTracTix.size() > 0) {
					value += " " + getTracLink((Integer) parentTracTix.get(0));
				} else {
					LOG.warning("Some inter-ticket relationships could not be updated. Running this tool again should do the trick.");
				}
			}
			attrs.put(tracAttribute, value);
		}
	}

	private File downloadFile(Attachment attachment)
			throws MalformedURLException, IOException {
		File file = new File(attachment.getFileName());
		ReadableByteChannel rbc;
		rbc = Channels.newChannel(new URL(attachment.getUrl()).openStream());
		FileOutputStream fos = new FileOutputStream(file);
		fos.getChannel().transferFrom(rbc, 0, 1 << 24);
		rbc.close();
		fos.flush();
		fos.close();
		return file;
	}

	private static String convertHTMLtoWiki(String description) {
		HTML2WikiConverter conv = new HTML2WikiConverter();
		conv.setInputHTML(description);
		String wikiDescription = conv.toWiki(new ToWikipedia());
		return wikiDescription;
	}

	private Hashtable<String, String> getPolarionAttributes(WorkItem wi) {
		Hashtable<String, String> attrs = new Hashtable<String, String>();
		attrs.put("polarion_id", getPolarionLink(wi.getId()));
		attrs.put("reporter",
				getTracEquivalent(wi.getAuthor() == null ? NOT_FOUND : wi
						.getAuthor().getId()));
		// attrs.put("time", getTracTime(wi.getCreated()));
		attrs.put("status",
				getTracEquivalent(wi.getStatus() == null ? NOT_FOUND : wi
						.getStatus().getId()));
		attrs.put("priority",
				getTracEquivalent(wi.getPriority() == null ? NOT_FOUND : wi
						.getPriority().getId()));
		attrs.put(
				"owner",
				getTracEquivalent(wi.getAssignee() == null
						|| wi.getAssignee().length == 0 ? NOT_FOUND : wi
						.getAssignee()[0].getId()));
		attrs.put("type", getTracEquivalent(wi.getType() == null ? NOT_FOUND
				: wi.getType().getId()));
		attrs.put("resolution",
				getTracEquivalent(wi.getResolution() == null ? "" : wi
						.getResolution().getId()));
		return attrs;
	}

	private String getPolarionLink(String id) {
		// http://community.polarion.org/polarion/#/project/Subversive/workitem?id=PLC-285
		return "[" + prop.getProperty("polarion_server_address")
				+ "/polarion/#/project/" + prop.getProperty("project_id")
				+ "/workitem?id=" + id + " " + id + "]";
	}

	private String getTracLink(Integer tracId) {
//		return "[" + prop.getProperty("trac_server_address") + "/ticket/"
//				+ tracId + " " + tracId + "]";
		return "#"+tracId;
	}

	// private String getTracTime(Calendar created) {
	// return String.valueOf(created.getTime().getTime());
	// }

	/**
	 * @param msg
	 */
	private void printError(String msg) {
		System.err.println("ERROR: " + msg);
	}

	/**
	 * @param msg
	 */
	private void printWarning(String msg) {
		System.err.println("WARNING: " + msg);
	}

	/**
	 * @param cal
	 * @return
	 */
	private static String formatDate(Calendar cal) {
		SimpleDateFormat formatter = new SimpleDateFormat();
		formatter.applyPattern("yyyyMMdd hh:mm");
		return formatter.format(cal.getTime());

	}

	/**
	 * 
	 * @throws MalformedURLException
	 *             If the string defined in properties specifies an unknown
	 *             protocol.
	 */
	private void setUpPolarionAddress() throws MalformedURLException {
		StringBuffer buf = new StringBuffer();
		buf.append(prop.getProperty("polarion_server_address")).append(":")
				.append(prop.getProperty("polarion_server_port"))
				.append("/polarion/ws/services/");

		factory = new WebServiceFactory(buf.toString());
	}

	/**
	 * 
	 * @throws ServiceException
	 *             If services are not accessable
	 */
	private void setUpPolarionWebServices() throws ServiceException {
		sessionService = factory.getSessionService();
		trackerService = factory.getTrackerService();
		projectService = factory.getProjectService();

	}

	/**
	 * Trust every server - dont check for any certificate
	 */
	private void trustAllHosts() {
		System.setProperty("javax.net.ssl.trustStore",
				prop.getProperty("keystore_location"));
		System.setProperty("javax.net.ssl.keyStorePassword",
				prop.getProperty("keystore_password"));

		System.out.println(new File(System
				.getProperty("javax.net.ssl.trustStore")).getAbsolutePath());

		// Create a trust manager that does not validate certificate chains
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return new java.security.cert.X509Certificate[] {};
			}

			public void checkClientTrusted(X509Certificate[] chain,
					String authType) throws CertificateException {
			}

			public void checkServerTrusted(X509Certificate[] chain,
					String authType) throws CertificateException {
			}
		} };

		// Install the all-trusting trust manager
		try {
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection
					.setDefaultSSLSocketFactory(sc.getSocketFactory());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String getTracEquivalent(String polarinVal) {
		if (polarinVal == null)
			return "";
		if (prop.getProperty(polarinVal.replaceAll(" ", "_")) == null
				|| NOT_FOUND.equalsIgnoreCase(polarinVal)) {
			// prop.setProperty(polarinVal.replaceAll(" ", "_"), NOT_FOUND);
			LOG.warning("NOT FOUND:\t" + polarinVal);
			return polarinVal;
			// throw new RuntimeException("No equivalent for: " + polarinVal);
		}
		return prop.getProperty(polarinVal.replaceAll(" ", "_"));
	}

	private void audit(String message) {
		try {
			fw.write(formatDate(Calendar.getInstance()) + ":\t" + message
					+ "\r\n");
			fw.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	protected void finalize() throws Throwable {
		fw.close();
	}
}
