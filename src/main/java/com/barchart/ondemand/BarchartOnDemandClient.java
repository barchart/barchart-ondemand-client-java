package com.barchart.ondemand;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.OnDemandRequest;
import com.barchart.ondemand.api.responses.ResponseBase;
import com.barchart.ondemand.util.JsonUtil;
import com.barchart.ondemand.util.QueryUtil;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

/**
 * Java client for Barchart's OnDemand APIs.
 * 
 * 
 * <pre>
 * BarchartOnDemandClient client = new BarchartOnDemandClient.Builder().apiKey(&quot;API-KEY&quot;).build();
 * </pre>
 * 
 * @see <a href="http://barchartondemand.com">http://barchartondemand.com</a>
 * 
 * @author m-ehrenberg
 * 
 * 
 */

public class BarchartOnDemandClient {

	private final String apiKey;
	private final String baseUrl;
	private final long cacheTime;
	private final boolean debug;

	private final OkHttpClient http = new OkHttpClient();

	//

	private BarchartOnDemandClient(final Builder b) {
		this.apiKey = b.apiKey;
		this.baseUrl = b.baseUrl;
		this.cacheTime = b.cacheTime;
		this.debug = b.debug;

	}

	//

	public <T extends ResponseBase> T fetch(final OnDemandRequest<T> request) throws Exception {

		if (request == null) {
			throw new RuntimeException("request cannot be null.");
		}

		final StringBuilder sb = new StringBuilder();

		sb.append(baseUrl);
		sb.append(request.endpoint());
		sb.append("?");
		sb.append(QueryUtil.urlEncodeUTF8(request.parameters()));
		sb.append("&key=");
		sb.append(apiKey);

		final String response = fetchString(sb.toString(), http);

		if (debug) {
			System.out.println("query URL = " + sb.toString());
			System.out.println("response = " + response);
		}
		final T base = JsonUtil.fromJson(request.responseType(), response);

		base.configure(request, this);

		return base;

	}

	public boolean refresh(final ResponseBase response) {

		try {

			JsonUtil.update(response, fetchApiString(response.getRequest(), http));

			if (debug) {
				System.out.println("Updated: " + response.getRequest().name() + " @ " + new Date());
			}

			return true;
		} catch (Exception e) {
			System.out.println("failed to update response, e = " + e);
		}

		return false;

	}

	private String fetchApiString(final OnDemandRequest<?> request, final OkHttpClient client) throws IOException {

		final StringBuilder sb = new StringBuilder();

		sb.append(baseUrl);
		sb.append(request.endpoint());
		sb.append("?");
		sb.append(QueryUtil.urlEncodeUTF8(request.parameters()));
		sb.append("&apikey=");
		sb.append(apiKey);

		return fetchString(sb.toString(), client);

	}

	private String fetchString(final String url, final OkHttpClient client) throws IOException {

		final Request request = new Request.Builder().url(url).build();
		final Response response = client.newCall(request).execute();
		final String body = response.body().string();

		if (QueryUtil.isResponseError(body)) {
			throw new RuntimeException("API call has failed: " + body);
		}

		return body;
	}

	//

	public static class Builder {

		private String baseUrl = "http://ondemand.websol.barchart.com/";
		private String apiKey;
		private long cacheTime = 10000;
		private boolean debug = false;

		public Builder baseUrl(final String baseUrl) {
			this.baseUrl = baseUrl;
			return this;
		}

		public Builder apiKey(final String apiKey) {
			this.apiKey = apiKey;
			return this;
		}

		public Builder cacheTime(final long cacheTime) {
			this.cacheTime = Math.max(3000, cacheTime);
			return this;
		}

		public Builder debug(final boolean debug) {
			this.debug = debug;
			return this;
		}

		public BarchartOnDemandClient build() {

			if (StringUtils.isBlank(apiKey)) {
				throw new UnsupportedOperationException("API key cannot be null.");
			}

			return new BarchartOnDemandClient(this);
		}
	}

}
