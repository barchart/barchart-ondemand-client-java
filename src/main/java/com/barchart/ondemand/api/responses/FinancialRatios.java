package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FinancialRatios extends ResponseBase {

	@JsonProperty("results")
	private final List<FinancialRatio> results = new ArrayList<FinancialRatio>();

	public Collection<FinancialRatio> all() {
		if (results == null) {
			return new ArrayList<FinancialRatio>();
		}
		return Collections.unmodifiableCollection(results);
	}

	public FinancialRatio bySymbol(final String symbol) {
		if (symbol == null) {
			return null;
		}

		for (FinancialRatio fh : all()) {
			if (fh.getSymbol() != null && fh.getSymbol().equalsIgnoreCase(symbol)) {
				return fh;
			}
		}

		return null;
	}

}
