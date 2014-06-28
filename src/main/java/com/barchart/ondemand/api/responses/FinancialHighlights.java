package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FinancialHighlights extends ResponseBase {

	@JsonProperty("results")
	private final List<FinancialHighlight> highlights = new ArrayList<FinancialHighlight>();

	public Collection<FinancialHighlight> all() {
		return Collections.unmodifiableCollection(highlights);
	}

	public FinancialHighlight bySymbol(final String symbol) {
		if (symbol == null) {
			return null;
		}

		for (FinancialHighlight fh : highlights) {
			if (fh.getSymbol() != null && fh.getSymbol().equalsIgnoreCase(symbol)) {
				return fh;
			}
		}

		return null;
	}
}
