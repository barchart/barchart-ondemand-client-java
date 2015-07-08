package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Momentums extends ResponseBase {

	@JsonProperty("results")
	private final List<Momentum> results = new ArrayList<Momentum>();

	public List<Momentum> all() {
		if (results == null) {
			return new ArrayList<Momentum>();
		}
		return results;
	}

	public Momentum byExchange(final String exchange) {
		if (exchange == null) {
			return null;
		}

		for (Momentum p : all()) {
			if (p.getExchange() != null && p.getExchange().equalsIgnoreCase(exchange)) {
				return p;
			}
		}

		return null;
	}

}