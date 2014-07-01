package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Leaders extends ResponseBase {

	@JsonProperty("results")
	private final List<Leader> results = new ArrayList<Leader>();

	public List<Leader> all() {
		return results;
	}

}
