package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ratings extends ResponseBase {

	@JsonProperty("results")
	private final List<Rating> results = new ArrayList<Rating>();

	public List<Rating> all() {
		return results;
	}

	public Rating bySymbol(final String symbol) {
		if (symbol == null) {
			return null;
		}

		for (Rating p : all()) {
			if (p.getSymbol() != null && p.getSymbol().equalsIgnoreCase(symbol)) {
				return p;
			}
		}

		return null;
	}

}
