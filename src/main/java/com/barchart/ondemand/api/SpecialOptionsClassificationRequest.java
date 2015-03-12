package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

public class SpecialOptionsClassificationRequest implements OnDemandRequest {

	private final String symbols;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	public SpecialOptionsClassificationRequest(Builder b) {

		this.symbols = b.root;
		this.fields = "";
	}

	@Override
	public String endpoint() {

		return "getSpecialOptionsClassification.json";
	}

	@Override
	public String name() {

		return "Mappings for Special Options by root";
	}

	@Override
	public Map<String, Object> parameters() {

		params.put("root", symbols);

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	public static class Builder {

		private String root;

		public Builder root(final String root) {
			this.root = root;
			return this;
		}

		public OnDemandRequest build() {
			return new SpecialOptionsClassificationRequest(this);
		}
	}

}
