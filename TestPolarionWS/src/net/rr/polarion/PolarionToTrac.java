package net.rr.polarion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.rpc.ServiceException;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.lustin.trac.xmlprc.Ticket;
import org.lustin.trac.xmlprc.TrackerDynamicProxy;

import com.polarion.alm.ws.client.WebServiceFactory;
import com.polarion.alm.ws.client.projects.ProjectWebService;
import com.polarion.alm.ws.client.session.SessionWebService;
import com.polarion.alm.ws.client.tracker.TrackerWebService;
import com.polarion.alm.ws.client.types.projects.Project;
import com.polarion.alm.ws.client.types.tracker.Comment;
import com.polarion.alm.ws.client.types.tracker.WorkItem;

public class PolarionToTrac {

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
			List<WorkItem> wis = importer.importWIs();
			for (WorkItem wi : wis) {
				importer.writeToTrac(wi);
			}
			importer.updateSettings();
		} catch (Exception e) {
			System.err.println("RESULT: operation unsuccessful");
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
		// prepare to import
		try {
			trustAllHosts();
			
			setUpPolarionAddress();

			setUpPolarionWebServices();

			sessionService.logIn(prop.getProperty("user"), prop
					.getProperty("passwd"));

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

		try {
			String projectId = prop.getProperty("project_id");
			project = projectService.getProject(projectId);
			if (project.isUnresolvable()) {
				printError("Project not found: " + projectId);
				throw new RuntimeException("Project not found: " + projectId);
			}

			// Get fields
			String[] fields = prop.getProperty("fields").split(",");

			// Get query
			String query = prop.getProperty("query");

			// Get work items
			List<WorkItem> wis = new ArrayList<WorkItem>(Arrays
					.asList(trackerService.queryWorkItems(query, prop
							.getProperty("sortby"), fields)));

			ListIterator<WorkItem> li = wis.listIterator();
			while (li.hasNext()) {
				WorkItem wi = li.next();
				if (wi.getUpdated() != null
						&& !wi.getUpdated().after(lastUpdated)) {
					System.out.println("Ignored: " + wi.getId()
							+ " - Updated: " + formatDate(wi.getUpdated())
							+ " but: " + formatDate(lastUpdated));
					li.remove();
				}
			}

			sessionService.endSession();
			return wis;

		} catch (RemoteException re) {
			printError("Error occured during the execution of a remote method call.");
			throw re;
		}
	}

	private void updateSettings() throws IOException, FileNotFoundException {
		// Update the last update
		Calendar now = Calendar.getInstance();
		prop.setProperty("luYear", String.valueOf(now.get(Calendar.YEAR)));
		prop.setProperty("luMonth", String.valueOf(now.get(Calendar.MONTH)));
		prop.setProperty("luDay", String
				.valueOf(now.get(Calendar.DAY_OF_MONTH)));
		prop.setProperty("luHour", String.valueOf(now.get(Calendar.HOUR)));
		prop.setProperty("luMinute", String
				.valueOf(now.get(Calendar.MINUTE) + 1));

		// TODO Uncomment
		prop.store(new FileOutputStream(new File("settings.properties")), "");
	}

	/**
	 * @param wi
	 * @throws MalformedURLException
	 */
	@SuppressWarnings("unchecked")
	private void writeToTrac(WorkItem wi) throws MalformedURLException {
		XmlRpcClientConfigImpl conf = new XmlRpcClientConfigImpl();
		conf.setBasicUserName(prop.getProperty("tracuser"));
		conf.setBasicPassword(prop.getProperty("tracpwd"));
		try {
			conf.setServerURL(new URL(prop.getProperty("tracurl")));
		} catch (MalformedURLException e) {
			throw e;
		}
		XmlRpcClient client = new XmlRpcClient();
		client.setConfig(conf);
		TrackerDynamicProxy proxy = new TrackerDynamicProxy(client);

		Ticket ticket = (Ticket) proxy.newInstance(Ticket.class);
		Vector v = ticket.query("polarion_id=" + getPolarionLink(wi.getId()));
		if (v == null || v.size() == 0) {
			Integer id = ticket.create(wi.getTitle(), wi.getDescription()
					.getContent());

			// Set creator and created date
			audit("CREATE: Created ticket in trac " + id + " for polarion id "
					+ wi.getId());

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

	}

	private Hashtable<String, String> getPolarionAttributes(WorkItem wi) {
		Hashtable<String, String> attrs = new Hashtable<String, String>();
		attrs.put("polarion_id", getPolarionLink(wi.getId()));
		attrs.put("reporter", getTracEquivalent(wi.getAuthor().getName()));
		// attrs.put("time", getTracTime(wi.getCreated()));
		attrs.put("status", getTracEquivalent(wi.getStatus().getId()));
		attrs.put("priority", getTracEquivalent(wi.getPriority().getId()));
		attrs.put("owner", getTracEquivalent(wi.getAssignee()[0].getName()));
		attrs.put("type", getTracEquivalent(wi.getType().getId()));
		attrs.put("resolution", getTracEquivalent(wi.getResolution().getId()));
		return attrs;
	}

	private String getPolarionLink(String id) {
		// http://community.polarion.org/polarion/#/project/Subversive/workitem?id=PLC-285
		return "[" + prop.getProperty("polarion_server_address")
				+ "/polarion/#/project/" + prop.getProperty("project_id")
				+ "/workitem?id=" + id + " " + id + "]";
	}

	private String getTracTime(Calendar created) {
		return String.valueOf(created.getTime().getTime());
	}

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
				.append(prop.getProperty("polarion_server_port")).append(
						"/polarion/ws/services/");

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
				System.setProperty("javax.net.ssl.trustStore", prop.getProperty("keystore_location"));
				System.setProperty("javax.net.ssl.keyStorePassword", prop.getProperty("keystore_password"));
				
				System.out.println(new File(System.getProperty("javax.net.ssl.trustStore")).getAbsolutePath());
				
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
		if (prop.getProperty(polarinVal.replaceAll(" ", "_")) == null
				|| "NOTFOUND".equalsIgnoreCase(polarinVal)) {
			prop.setProperty(polarinVal.replaceAll(" ", "_"), "NOTFOUND");
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
