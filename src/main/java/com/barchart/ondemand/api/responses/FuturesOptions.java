package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FuturesOptions extends ResponseBase {

	@JsonProperty("results")
	public List<SDFuturesOption> results = new ArrayList<SDFuturesOption>();

	public Collection<SDFuturesOption> all() {
		return Collections.unmodifiableCollection(results);
	}

	public Collection<SDFuturesOption> calls() {

		final List<SDFuturesOption> results = new ArrayList<SDFuturesOption>();
		for (SDFuturesOption f : all()) {
			if (f.getType() != null && f.getType().equalsIgnoreCase("call")) {
				results.add(f);
			}
		}

		return results;
	}

	public Collection<SDFuturesOption> puts() {

		final List<SDFuturesOption> results = new ArrayList<SDFuturesOption>();
		for (SDFuturesOption f : all()) {
			if (f.getType() != null && f.getType().equalsIgnoreCase("put")) {
				results.add(f);
			}
		}

		return results;
	}
}
