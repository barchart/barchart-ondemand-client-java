package com.barchart.ondemand.api.responses;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SpecialOption {

	@JsonProperty("name")
	private String name;
	@JsonProperty("symbol")
	private String symbol;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@SuppressWarnings("rawtypes")
	public String getName() {
		if (additionalProperties.containsKey("data")) {
			return ((LinkedHashMap) additionalProperties.get("data")).get("name").toString();
		}
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@SuppressWarnings("rawtypes")
	public String getSymbol() {
		if (additionalProperties.containsKey("data")) {
			return ((LinkedHashMap) additionalProperties.get("data")).get("symbol").toString();
		}
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}
