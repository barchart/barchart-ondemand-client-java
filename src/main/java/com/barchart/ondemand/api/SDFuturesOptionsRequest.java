package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import com.barchart.ondemand.api.responses.SDFuturesOptions;

public class SDFuturesOptionsRequest implements OnDemandRequest<SDFuturesOptions> {

	public enum FuturesOptionsRequestType {
		CALLS("Call"), PUTS("Put"), ALL("");

		private final String value;

		private FuturesOptionsRequestType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static String getValue(FuturesOptionsRequestType field) {
			if (field == null) {
				return "";
			}

			return field.getValue();
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

		if (b.strikesOnly) {
			params.put("jerq", false);
		}
	}

	@Override
	public String endpoint() {

		return "getSpecialOptions.json";
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

	@Override
	public Class<SDFuturesOptions> responseType() {
		return SDFuturesOptions.class;
	}

	public static class Builder {

		private FuturesOptionsRequestType type;
		private String root;
		private String contract;
		private boolean strikesOnly;

		public Builder root(final String root) {
			this.root = root;
			return this;
		}

		public Builder contract(final String contract) {
			this.contract = contract;
			return this;
		}

		public Builder strikesOnly(final Boolean strikesOnly) {
			this.strikesOnly = strikesOnly;
			return this;
		}

		public SDFuturesOptionsRequest build() {
			return new SDFuturesOptionsRequest(this);
		}
	}

}
