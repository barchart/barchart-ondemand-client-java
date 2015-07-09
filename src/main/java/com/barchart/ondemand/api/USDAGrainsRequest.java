package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import com.barchart.ondemand.api.responses.USDAGrains;

public class USDAGrainsRequest implements OnDemandRequest<USDAGrains> {

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

	@Override
	public Class<USDAGrains> responseType() {
		return USDAGrains.class;
	}

	public static class Builder {

		public USDAGrainsRequest build() {
			return new USDAGrainsRequest(this);
		}
	}

}
