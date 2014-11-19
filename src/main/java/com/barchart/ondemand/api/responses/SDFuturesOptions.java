package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SDFuturesOptions extends ResponseBase {

	@JsonProperty("results")
	public List<SDFuturesOption> results = new ArrayList<SDFuturesOption>();

	public Collection<SDFuturesOption> all() {
		if (results == null) {
			return new ArrayList<SDFuturesOption>();
		}
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

	public Collection<SDFuturesOption> forContractMonth(final String month) {
		final List<SDFuturesOption> results = new ArrayList<SDFuturesOption>();

		for (SDFuturesOption f : all()) {
			if (f.getContractMonth().equalsIgnoreCase(month)) {
				results.add(f);
			}
		}

		return results;
	}

	public Collection<String> allExpirations() {
		final List<String> results = new ArrayList<String>();

		for (SDFuturesOption f : all()) {
			if (!results.contains(f.getExpirationDate())) {
				results.add(f.getExpirationDate());
			}
		}

		return results;
	}

	public Map<String, SDFuturesOptions> expirationsForMonth(final String month) {
		final Map<String, SDFuturesOptions> results = new HashMap<String, SDFuturesOptions>();

		final Collection<SDFuturesOption> all = forContractMonth(month);

		if (all == null) {
			return new HashMap<String, SDFuturesOptions>();
		}

		for (SDFuturesOption a : all) {
			if (results.get(a.getExpirationDate()) == null) {
				results.put(a.getExpirationDate(), new SDFuturesOptions());
			}

			results.get(a.getExpirationDate()).results.add(a);
		}

		return results;
	}
}
