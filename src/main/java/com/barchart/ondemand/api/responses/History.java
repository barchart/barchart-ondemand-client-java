package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class History extends ResponseBase {

	@JsonProperty("results")
	private List<HistoryBar> results = new ArrayList<HistoryBar>();

	public Collection<HistoryBar> all() {
		if (results == null) {
			return new ArrayList<HistoryBar>();
		}
		return Collections.unmodifiableCollection(results);
	}

}
