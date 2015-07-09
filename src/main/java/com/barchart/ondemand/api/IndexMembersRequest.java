package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import com.barchart.ondemand.api.responses.IndexMembers;

public class IndexMembersRequest implements OnDemandRequest<IndexMembers> {

	private final String symbol;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private IndexMembersRequest(final Builder b) {

		this.symbol = b.symbol;

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

		params.put("symbol", symbol);

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	@Override
	public Class<IndexMembers> responseType() {
		return IndexMembers.class;
	}

	public static class Builder {
		private String symbol;

		public Builder symbol(final String symbol) {
			this.symbol = symbol;
			return this;
		}

		public IndexMembersRequest build() {
			return new IndexMembersRequest(this);
		}
	}

}
