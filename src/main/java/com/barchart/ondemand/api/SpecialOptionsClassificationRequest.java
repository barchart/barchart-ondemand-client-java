package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import com.barchart.ondemand.api.responses.SpecialOptionsClassifications;

public class SpecialOptionsClassificationRequest implements OnDemandRequest<SpecialOptionsClassifications> {

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

	@Override
	public Class<SpecialOptionsClassifications> responseType() {
		return SpecialOptionsClassifications.class;
	}

	public static class Builder {

		private String root;

		public Builder root(final String root) {
			this.root = root;
			return this;
		}

		public SpecialOptionsClassificationRequest build() {
			return new SpecialOptionsClassificationRequest(this);
		}
	}

}
