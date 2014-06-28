package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

public class SDFuturesOptionsRequest implements OnDemandRequest {

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

	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private SDFuturesOptionsRequest(final Builder b) {

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

		return "getShortDatedFuturesOptions.json";
	}

	@Override
	public String name() {

		return "Short Dated Futures Options";
	}

	@Override
	public Map<String, Object> parameters() {

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	public static class Builder {

		private FuturesOptionsRequestType type;
		private String root;
		private String contract;

		public Builder root(final String root) {
			this.root = root;
			return this;
		}

		public Builder contract(final String contract) {
			this.contract = contract;
			return this;
		}

		public OnDemandRequest build() {
			return new SDFuturesOptionsRequest(this);
		}
	}

}
