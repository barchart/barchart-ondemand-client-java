package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Signals extends ResponseBase {

	@JsonProperty("results")
	private final List<Signal> results = new ArrayList<Signal>();

	public List<Signal> all() {
		return results;
	}

	public Signal bySymbol(final String symbol) {
		if (symbol == null) {
			return null;
		}

		for (Signal p : results) {
			if (p.getSymbol() != null && p.getSymbol().equalsIgnoreCase(symbol)) {
				return p;
			}
		}

		return null;
	}

}
