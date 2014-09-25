package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Charts extends ResponseBase {

	@JsonProperty("results")
	private final List<Chart> results = new ArrayList<Chart>();

	public Collection<Chart> all() {
		if (results == null) {
			return new ArrayList<Chart>();
		}
		return Collections.unmodifiableCollection(results);
	}

	public Chart bySymbol(final String symbol) {
		if (symbol == null) {
			return null;
		}

		for (Chart fh : results) {
			if (fh.getSymbol() != null && fh.getSymbol().equalsIgnoreCase(symbol)) {
				return fh;
			}
		}

		return null;
	}
}
