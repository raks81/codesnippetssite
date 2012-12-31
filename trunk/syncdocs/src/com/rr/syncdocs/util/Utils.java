package com.rr.syncdocs.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class Utils {
	public static String mapToQueryString(Map<String, String> map) {
		StringBuilder sb = new StringBuilder();
		if (map != null) {
			for (Map.Entry<String, String> e : map.entrySet()) {
				if (sb.length() > 0) {
					sb.append('&');
				}
				try {
					sb.append(URLEncoder.encode(e.getKey(), "UTF-8"))
							.append('=')
							.append(URLEncoder.encode(e.getValue(), "UTF-8"));
				} catch (UnsupportedEncodingException e1) {
					throw new RuntimeException(e1);
				}
			}
		}
		return sb.toString();
	}
}
