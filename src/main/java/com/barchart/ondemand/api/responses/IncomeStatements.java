package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IncomeStatements extends ResponseBase {

	@JsonProperty("results")
	private final List<IncomeStatement> results = new ArrayList<IncomeStatement>();

	public Collection<IncomeStatement> all() {
		return Collections.unmodifiableCollection(results);
	}

	public IncomeStatement bySymbol(final String symbol) {
		if (symbol == null) {
			return null;
		}

		for (IncomeStatement p : results) {
			if (p.getSymbol() != null && p.getSymbol().equalsIgnoreCase(symbol)) {
				return p;
			}
		}

		return null;
	}

}
