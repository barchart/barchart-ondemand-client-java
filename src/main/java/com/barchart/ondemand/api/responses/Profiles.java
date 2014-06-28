package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Profiles extends ResponseBase {

	@JsonProperty("results")
	private final List<Profile> profiles = new ArrayList<Profile>();

	public List<Profile> all() {
		return profiles;
	}

	public Profile bySymbol(final String symbol) {
		if (symbol == null) {
			return null;
		}

		for (Profile p : profiles) {
			if (p.getSymbol() != null && p.getSymbol().equalsIgnoreCase(symbol)) {
				return p;
			}
		}

		return null;
	}

}
