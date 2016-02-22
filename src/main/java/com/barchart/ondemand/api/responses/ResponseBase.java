package com.barchart.ondemand.api.responses;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.barchart.ondemand.BarchartOnDemandClient;
import com.barchart.ondemand.api.OnDemandRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseBase implements OnDemandResponse {

	protected static String RESPONSE_EMPTY = "Success, but no content to return.";

	@JsonProperty("status")
	protected final Map<String, Object> status = new HashMap<String, Object>();

	protected OnDemandRequest<?> request;
	protected BarchartOnDemandClient client;

	public ResponseBase() {

	}

	public void configure(final OnDemandRequest<?> r, final BarchartOnDemandClient c) {
		this.request = r;
		this.client = c;
	}

	public OnDemandRequest<?> getRequest() {
		return this.request;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public boolean isEmpty() {

		if (status == null) {
			return true;
		}

		if (status.containsKey("message") && ((String) status.get("message")).equalsIgnoreCase(RESPONSE_EMPTY)) {
			return true;
		}

		return false;
	}

	@Override
	public boolean refresh() {

		return client.refresh(this);
	}

}
