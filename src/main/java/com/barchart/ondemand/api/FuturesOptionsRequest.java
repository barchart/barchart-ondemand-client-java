package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class FuturesOptionsRequest implements OnDemandRequest {

	public enum FuturesOptionsRequestType {
		CALLS, PUTS, ALL;

		public static String getValue(FuturesOptionsRequestType field) {
			if (field == null) {
				return "";
			}

			switch (field) {
			case CALLS:
				return "Call";
			case PUTS:
				return "Puts";
			case ALL:
				return "";
			default:
				return "";
			}
		}
	}

	private final String symbols;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private FuturesOptionsRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		this.fields = "";

		final String type = FuturesOptionsRequestType.getValue(b.type);

		if (!type.isEmpty()) {
			params.put("type", b.type);
		}

		if (b.contract != null) {
			params.put("contract", b.contract);
		}

		if (b.root != null) {
			params.put("root", b.root);
		}
	}

	@Override
	public String endpoint() {

		return "getFuturesOptions.json";
	}

	@Override
	public String name() {

		return "Futures Options";
	}

	@Override
	public Map<String, Object> parameters() {

		if (!symbols.isEmpty()) {
			params.put("symbols", symbols);
		}

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	public static class Builder {

		private String[] symbols = new String[] {};
		private FuturesOptionsRequestType type;
		private String root;
		private String contract;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder root(final String root) {
			this.root = root;
			return this;
		}

		public Builder contract(final String contract) {
			this.contract = contract;
			return this;
		}

		public OnDemandRequest build() {
			return new FuturesOptionsRequest(this);
		}
	}

}
