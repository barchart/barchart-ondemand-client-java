package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FuturesOptions extends ResponseBase {

	@JsonProperty("results")
	public List<FuturesOption> results = new ArrayList<FuturesOption>();

	public Collection<FuturesOption> all() {
		return Collections.unmodifiableCollection(results);
	}

	public Collection<FuturesOption> calls() {

		final List<FuturesOption> results = new ArrayList<FuturesOption>();
		for (FuturesOption f : all()) {
			if (f.getType() != null && f.getType().equalsIgnoreCase("call")) {
				results.add(f);
			}
		}

		return results;
	}

	public Collection<FuturesOption> puts() {

		final List<FuturesOption> results = new ArrayList<FuturesOption>();
		for (FuturesOption f : all()) {
			if (f.getType() != null && f.getType().equalsIgnoreCase("put")) {
				results.add(f);
			}
		}

		return results;
	}
}
