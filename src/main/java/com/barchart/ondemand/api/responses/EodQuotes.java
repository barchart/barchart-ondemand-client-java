package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EodQuotes extends ResponseBase {

	@JsonProperty("results")
	private final List<EodQuote> results = new ArrayList<EodQuote>();

	public List<EodQuote> all() {
		if (results == null) {
			return new ArrayList<EodQuote>();
		}
		return results;
	}

	public EodQuote bySymbol(final String symbol) {
		if (symbol == null) {
			return null;
		}

		for (EodQuote p : all()) {
			if (p.getSymbol() != null && p.getSymbol().equalsIgnoreCase(symbol)) {
				return p;
			}
		}

		return null;
	}

}