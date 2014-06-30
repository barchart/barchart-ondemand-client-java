package com.barchart.ondemand.api.responses;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class ResponseBase {

	protected static String RESPONSE_EMPTY = "Success, but no content to return.";

	@JsonProperty("status")
	protected final Map<String, Object> status = new HashMap<String, Object>();

	public boolean isEmptyResponse() {

		if (status == null) {
			return true;
		}

		if (status.containsKey("message") && ((String) status.get("message")).equalsIgnoreCase(RESPONSE_EMPTY)) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
