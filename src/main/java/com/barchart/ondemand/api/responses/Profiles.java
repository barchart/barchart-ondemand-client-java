package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Profiles extends ResponseBase {

	@JsonProperty("results")
	private final List<Profile> results = new ArrayList<Profile>();

	public List<Profile> all() {
		if (results == null) {
			return new ArrayList<Profile>();
		}
		return results;
	}

	public Profile bySymbol(final String symbol) {
		if (symbol == null) {
			return null;
		}

		for (Profile p : results) {
			if (p.getSymbol() != null && p.getSymbol().equalsIgnoreCase(symbol)) {
				return p;
			}
		}

		return null;
	}

}
