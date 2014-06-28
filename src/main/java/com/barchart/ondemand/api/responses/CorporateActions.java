package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CorporateActions extends ResponseBase {

	@JsonProperty("results")
	private List<CorporateAction> results = new ArrayList<CorporateAction>();

	private final Map<EventType, List<CorporateAction>> typeMap = new HashMap<EventType, List<CorporateAction>>();

	public enum EventType {
		SPLIT, EARNINGS, DIVIDEND
	}

	public Collection<CorporateAction> all() {
		return Collections.unmodifiableCollection(results);
	}

	public Collection<CorporateAction> byEventType(final EventType type) {
		if (typeMap.containsKey(type)) {
			return Collections.unmodifiableCollection(typeMap.get(type));
		}

		final List<CorporateAction> results = new ArrayList<CorporateAction>();

		for (CorporateAction a : results) {
			if (a.getEventType().equalsIgnoreCase(type.name())) {
				results.add(a);
			}
		}

		typeMap.put(type, results);

		return results;
	}

	public Collection<CorporateAction> bySymbolAndEventType(final String symbol, final EventType type) {

		final Collection<CorporateAction> base = (type == null) ? all() : byEventType(type);

		final List<CorporateAction> results = new ArrayList<CorporateAction>();

		for (CorporateAction a : base) {
			if (a.getSymbol().equalsIgnoreCase(symbol)) {
				results.add(a);
			}
		}

		return results;
	}
}
