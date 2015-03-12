package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SpecialOptionsCategory {

	@JsonProperty("categoryName")
	private String name;

	@JsonProperty("data")
	private Map<String, Object> data = new HashMap<String, Object>();

	@JsonProperty("sub-categories")
	private List<SpecialOption> subCategories = new ArrayList<SpecialOption>();

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getName() {
		return name;
	}

	public List<SpecialOption> getOptionsTypes() {
		final List<SpecialOption> results = new ArrayList<SpecialOption>();
		results.addAll(subCategories);

		if (!data.isEmpty()) {
			final SpecialOption single = new SpecialOption();
			single.setName(data.get("name").toString());
			single.setSymbol(data.get("symbol").toString());
			results.add(single);
		}

		return results;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Object> getData() {
		return data;
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