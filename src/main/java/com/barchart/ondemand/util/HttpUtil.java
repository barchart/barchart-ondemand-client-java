package com.barchart.ondemand.util;

import java.io.IOException;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class HttpUtil {

	private final static OkHttpClient client = new OkHttpClient();

	public static String apiKey = "changeMe";

	public static String fetchString(final String url) {

		try {
			final Request request = new Request.Builder().url(url + "&apikey=" + apiKey).build();
			final Response response = client.newCall(request).execute();
			final String body = response.body().string();

			if (QueryUtil.isResponseError(body)) {
				throw new RuntimeException("API call has failed: " + body);
			}

			return body;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;

	}
}
