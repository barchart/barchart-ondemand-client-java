package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BalanceSheets extends ResponseBase {

	@JsonProperty("results")
	private final List<BalanceSheet> results = new ArrayList<BalanceSheet>();

	public Collection<BalanceSheet> all() {
		if (results == null) {
			return new ArrayList<BalanceSheet>();
		}
		return Collections.unmodifiableCollection(results);
	}

	public BalanceSheet bySymbol(final String symbol) {
		if (symbol == null) {
			return null;
		}

		for (BalanceSheet fh : results) {
			if (fh.getSymbol() != null && fh.getSymbol().equalsIgnoreCase(symbol)) {
				return fh;
			}
		}

		return null;
	}
}
