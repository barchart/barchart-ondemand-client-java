package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

public class USDAGrainsRequest implements OnDemandRequest {

	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private USDAGrainsRequest(final Builder b) {

		this.fields = "";

	}

	@Override
	public String endpoint() {

		return "getUSDAGrainPrices.json";
	}

	@Override
	public String name() {

		return "USDA Grain Prices";
	}

	@Override
	public Map<String, Object> parameters() {

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	public static class Builder {

		public OnDemandRequest build() {
			return new USDAGrainsRequest(this);
		}
	}

}
