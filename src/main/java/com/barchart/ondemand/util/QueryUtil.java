package com.barchart.ondemand.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class QueryUtil {

	public static String ERROR_API_KEY = "API key is missing or not valid.";

	public static String urlEncodeUTF8(String s) {
		try {
			return URLEncoder.encode(s, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public static String urlEncodeUTF8(Map<?, ?> map) {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<?, ?> entry : map.entrySet()) {
			if (sb.length() > 0) {
				sb.append("&");
			}
			sb.append(String.format("%s=%s", urlEncodeUTF8(entry.getKey().toString()), urlEncodeUTF8(entry.getValue()
					.toString())));
		}
		return sb.toString();
	}

	public static boolean isResponseError(final String response) {
		if (response == null) {
			return true;
		}

		if (response.equalsIgnoreCase(ERROR_API_KEY)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("p1", 12);
		map.put("p2", "cat");
		map.put("p3", "a & b");
		System.out.println(urlEncodeUTF8(map));
		// prints "p3=a+%26+b&p2=cat&p1=12"
	}

}