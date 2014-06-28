package com.barchart.ondemand.api.responses;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class ResponseBase {

	@JsonProperty("status")
	protected final Map<String, Object> status = new HashMap<String, Object>();

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
