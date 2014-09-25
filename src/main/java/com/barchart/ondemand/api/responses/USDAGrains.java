package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class USDAGrains extends ResponseBase {

	@JsonProperty("results")
	private final List<USDAGrain> results = new ArrayList<USDAGrain>();

	public List<USDAGrain> all() {
		if (results == null) {
			return new ArrayList<USDAGrain>();
		}
		return results;
	}

	public USDAGrain byCommodityType(final String symbol) {
		if (symbol == null) {
			return null;
		}

		for (USDAGrain p : results) {
			if (p.getCommodityType() != null && p.getCommodityType().equalsIgnoreCase(symbol)) {
				return p;
			}
		}

		return null;
	}

}
