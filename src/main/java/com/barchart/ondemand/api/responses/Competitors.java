package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Competitors extends ResponseBase {

	@JsonProperty("results")
	private final List<Competitor> results = new ArrayList<Competitor>();

	public Collection<Competitor> all() {
		if (results == null) {
			return new ArrayList<Competitor>();
		}
		return Collections.unmodifiableCollection(results);
	}

	public Competitor bySymbol(final String symbol) {
		if (symbol == null) {
			return null;
		}

		for (Competitor fh : all()) {
			if (fh.getSymbol() != null && fh.getSymbol().equalsIgnoreCase(symbol)) {
				return fh;
			}
		}

		return null;
	}
}
