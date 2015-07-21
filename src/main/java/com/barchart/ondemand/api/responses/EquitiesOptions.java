package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EquitiesOptions extends ResponseBase {

	@JsonProperty("results")
	public List<EquitiesOption> results = new ArrayList<EquitiesOption>();

	public Collection<EquitiesOption> all() {
		if (results == null) {
			return new ArrayList<EquitiesOption>();
		}
		return Collections.unmodifiableCollection(results);
	}
	
	public Collection<EquitiesOption> calls() {

		final List<EquitiesOption> results = new ArrayList<EquitiesOption>();
		for (EquitiesOption f : all()) {
			if (f.getType() != null && f.getType().equalsIgnoreCase("call")) {
				results.add(f);
			}
		}

		return results;
	}

	public Collection<EquitiesOption> puts() {

		final List<EquitiesOption> results = new ArrayList<EquitiesOption>();
		for (EquitiesOption f : all()) {
			if (f.getType() != null && f.getType().equalsIgnoreCase("put")) {
				results.add(f);
			}
		}

		return results;
	}
	
	public Collection<String> allExpirations() {
		final List<String> results = new ArrayList<String>();

		for (EquitiesOption f : all()) {
			if (!results.contains(f.getExpirationDate())) {
				results.add(f.getExpirationDate());
			}
		}

		return results;
	}
	
	
	
}
