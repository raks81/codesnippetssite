package com.rr.syncdocs.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class HttpUtils {

	public static enum HttpRequestMethod {
		POST, GET;
	}

	public static String doHttpRequest(URL url, Map<String, String> params,
			HttpRequestMethod requestMethod) throws IOException {

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);

		switch (requestMethod) {
		case GET:
			connection.setRequestMethod("GET");
			break;
		default:
			StringBuffer sb = new StringBuffer();
			sb.append(Utils.mapToQueryString(params));
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Length", "" + sb.length());
			OutputStreamWriter outputWriter = new OutputStreamWriter(
					connection.getOutputStream());
			outputWriter.write(sb.toString());
			outputWriter.flush();
			outputWriter.close();
			break;
		}

		System.out.println("Response: " + connection.getResponseMessage());
		// Get the response
		BufferedReader rd = new BufferedReader(new InputStreamReader(
				connection.getInputStream()));

		StringBuffer atResponse = new StringBuffer();
		String line;
		while ((line = rd.readLine()) != null) {
			atResponse.append(line);
		}
		rd.close();
		return atResponse.toString();
	}
}
