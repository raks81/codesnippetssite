package net.rr.alm.polarion;

import info.bliki.html.HTML2WikiConverter;
import info.bliki.html.wikipedia.ToWikipedia;

import java.io.File;
import java.net.MalformedURLException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Properties;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.polarion.alm.ws.client.WebServiceFactory;

public class PolarionUtils {
	/**
	 * Trust every server - dont check for any certificate
	 */
	public static void trustAllHosts(Properties prop) {
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
	
	/**
	 * 
	 * @throws MalformedURLException
	 *             If the string defined in properties specifies an unknown
	 *             protocol.
	 */
	public static WebServiceFactory setUpPolarionAddress(Properties prop) throws MalformedURLException {
		StringBuffer buf = new StringBuffer();
		buf.append(prop.getProperty("polarion_server_address")).append(":")
				.append(prop.getProperty("polarion_server_port"))
				.append("/polarion/ws/services/");

		return new WebServiceFactory(buf.toString());
	}

	public static String convertHTMLtoWiki(String description) {
		HTML2WikiConverter conv = new HTML2WikiConverter();
		conv.setInputHTML(description);
		String wikiDescription = conv.toWiki(new ToWikipedia());
		return wikiDescription;
	}
}
