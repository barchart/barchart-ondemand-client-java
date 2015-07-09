package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InstrumentDefinitions extends ResponseBase {

	@JsonProperty("results")
	private final List<InstrumentDefinition> results = new ArrayList<InstrumentDefinition>();

	public Collection<InstrumentDefinition> all() {
		if (results == null) {
			return new ArrayList<InstrumentDefinition>();
		}
		return Collections.unmodifiableCollection(results);
	}

	public InstrumentDefinition bySymbol(final String symbol) {

		if (symbol == null) {
			return null;
		}

		for (InstrumentDefinition fh : all()) {
			if (fh.getSymbol() != null && fh.getSymbol().equalsIgnoreCase(symbol)) {
				return fh;
			}
		}

		return null;
	}

}
