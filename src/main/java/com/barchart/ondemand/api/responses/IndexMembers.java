package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class IndexMembers extends ResponseBase {

	@JsonProperty("results")
	private final List<IndexMember> results = new ArrayList<IndexMember>();

	private final Map<String, List<IndexMember>> indexMap = new HashMap<String, List<IndexMember>>();

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {

	}

	public Collection<IndexMember> all() {
		return Collections.unmodifiableCollection(results);
	}

	public Collection<IndexMember> byMember(String index) {

		if (indexMap.containsKey(index)) {
			return Collections.unmodifiableCollection(indexMap.get(index));
		}

		final List<IndexMember> results = new ArrayList<IndexMember>();

		for (IndexMember m : all()) {
			if (m.getIndex().equalsIgnoreCase(index)) {
				results.add(m);
			}
		}

		indexMap.put(index, results);

		return results;
	}

}
