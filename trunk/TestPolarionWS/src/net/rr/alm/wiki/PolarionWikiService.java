package net.rr.alm.wiki;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

public class PolarionWikiService implements IWikiService {

	private static final Logger LOG = Logger
			.getLogger(PolarionWikiService.class.getName());

	private static final String WIKI_HTML_DIRECTIVE_START = "{{{ \n#!html \n";

	private static final String WIKI_HTML_DIRECTIVE_END = "\n }}}";

	private Properties prop = new Properties();

	private DefaultHttpClient httpclient;

	private String baseUrl;

	public PolarionWikiService() {
		try {
			prop.load(new FileInputStream("settings.properties"));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		httpclient = new DefaultHttpClient();
		this.baseUrl = prop.getProperty("polarion_server_address") + ":"
				+ prop.getProperty("polarion_server_port") + "/polarion/";

	}

	@Override
	public List<WikiPage> getWikiPages() {
		return null;
	}

	@Override
	public WikiPage getWikiPage(String name) {
		WikiPage wikiPage = null;
		LOG.info("Getting page " + name + " from polarion...");
		try {
			logIn(prop.getProperty("user"), prop.getProperty("passwd"));
			// https://vumstm002.rd.corpintra.net:8001/polarion/wiki/bin/view/project/plattformentwicklung/page/HowTo/Database%20Configuration

			HttpGet get = new HttpGet(baseUrl
					+ "wiki/bin/print/project/plattformentwicklung/page/"
					+ name.replaceAll(" ", "%20"));
			HttpResponse response = httpclient.execute(get);

			wikiPage = processResponse(response);
			wikiPage.setPageName(name.replaceAll("/", "_"));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return wikiPage;
	}

	@Override
	public void addWikiPage(WikiPage wiki) {
		// TODO Auto-generated method stub

	}

	private WikiPage processResponse(HttpResponse response) throws IOException {
		WikiPage wikiPage = new WikiPage();
		int status = response.getStatusLine().getStatusCode();
		if (status == HttpStatus.SC_OK) {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			response.getEntity().writeTo(bos);
			wikiPage.setRawContents(bos.toString("UTF-8"));
			wikiPage.setWikiMarkup(WIKI_HTML_DIRECTIVE_START
					+ "\n"
					+ StringUtils.substringBeforeLast(
							StringUtils
									.substringAfter(wikiPage.getRawContents(),
											"<div id=\"mainlayoutsubsection\" class=\"main layoutsubsection\">"),
							"</body>") + WIKI_HTML_DIRECTIVE_END);
		} else {
			throw new RuntimeException(
					"Error getting WikiPage - Unexpected respose status: "
							+ status + "\n\n"
							+ EntityUtils.toString(response.getEntity()));
		}
		return wikiPage;
	}

	private boolean logIn(String username, String password) throws IOException {
		doLogin(username, password);
		doGetBase();
		return doLogin(username, password) == 404;
	}

	private int doLogin(String username, String password)
			throws UnsupportedEncodingException, IOException,
			ClientProtocolException {
		HttpPost post = new HttpPost(baseUrl + "j_security_check");
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("j_username", username));
		nvps.add(new BasicNameValuePair("j_password", password));
		post.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));

		HttpResponse response = httpclient.execute(post);
		int status = response.getStatusLine().getStatusCode();
		EntityUtils.consume(response.getEntity());

		return status;
	}

	private void doGetBase() throws IOException, ClientProtocolException {
		HttpGet get = new HttpGet(baseUrl + "modulehome/");
		HttpResponse response = httpclient.execute(get);
		EntityUtils.consume(response.getEntity());
	}

}
