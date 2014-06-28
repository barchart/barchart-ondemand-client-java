package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class IndexMembersRequest implements OnDemandRequest {

	private final String symbols;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private IndexMembersRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		this.fields = "";

	}

	@Override
	public String endpoint() {

		return "getIndexMembers.json";
	}

	@Override
	public String name() {

		return "Index Members";
	}

	@Override
	public Map<String, Object> parameters() {

		params.put("symbols", symbols);

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	public static class Builder {
		private String[] symbols;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public OnDemandRequest build() {
			return new IndexMembersRequest(this);
		}
	}

}
