package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SpecialOptionsClassifications extends ResponseBase {

	@JsonProperty("results")
	private List<SpecialOptionsClassification> results = new ArrayList<SpecialOptionsClassification>();

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Collection<SpecialOptionsClassification> all() {
		return results;
	}

	public SpecialOptionsClassification forRoot(final String root) {
		if (results == null) {
			return null;
		}

		for (SpecialOptionsClassification soc : all()) {
			if (soc.getRoot().equals(root)) {
				return soc;
			}
		}

		return null;
	}

	public List<SpecialOptionsClassification> getResults() {
		return results;
	}

	public void setResults(List<SpecialOptionsClassification> results) {
		this.results = results;
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
