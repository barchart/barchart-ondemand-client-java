package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * TODO
 */

public class SpecialOptionsClassification {

	@JsonProperty("root")
	private String root;

	@JsonProperty("category")
	private List<SpecialOptionsCategory> categories = new ArrayList<SpecialOptionsCategory>();

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getRoot() {
		return root;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public void setCategory(List<SpecialOptionsCategory> cats) {
		this.categories = cats;
	}

	public List<SpecialOptionsCategory> getCategories() {
		return categories;
	}

}
