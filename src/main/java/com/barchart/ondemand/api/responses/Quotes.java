package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quotes extends ResponseBase {

	@JsonProperty("results")
	private final List<Quote> results = new ArrayList<Quote>();

	public List<Quote> all() {
		return results;
	}

	public Quote bySymbol(final String symbol) {
		if (symbol == null) {
			return null;
		}

		for (Quote p : results) {
			if (p.getSymbol() != null && p.getSymbol().equalsIgnoreCase(symbol)) {
				return p;
			}
		}

		return null;
	}

}