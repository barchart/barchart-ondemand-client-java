package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FuturesSpecifications extends ResponseBase {

	@JsonProperty("results")
	private final List<FuturesSpecification> results = new ArrayList<FuturesSpecification>();

	public Collection<FuturesSpecification> all() {
		return Collections.unmodifiableCollection(results);
	}

	public FuturesSpecification bySymbol(final String symbol) {
		if (symbol == null) {
			return null;
		}

		for (FuturesSpecification fh : results) {
			if (fh.getSymbol() != null && fh.getSymbol().equalsIgnoreCase(symbol)) {
				return fh;
			}
		}

		return null;
	}

	public Collection<FuturesSpecification> byExchange(final String exchange) {
		if (exchange == null) {
			return null;
		}

		final Collection<FuturesSpecification> res = new ArrayList<FuturesSpecification>();

		if (isEmptyResponse()) {
			return res;
		}

		for (FuturesSpecification fh : results) {
			if (fh.getExchange() != null && fh.getExchange().equalsIgnoreCase(exchange)) {
				res.add(fh);
			}
		}

		return res;
	}

}
