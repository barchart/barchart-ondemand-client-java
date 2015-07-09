package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.responses.IncomeStatements;

public class IncomeStatementRequest implements OnDemandRequest<IncomeStatements> {

	private final String symbols;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private IncomeStatementRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		if (b.frequency != null) {
			params.put("frequency", b.frequency.getValue(b.frequency));
		} else {
			params.put("frequency", GenericRequestField.QUARTER);
		}

		this.fields = "";

		params.put("count", b.count);

	}

	@Override
	public String endpoint() {

		return "getIncomeStatements.json";
	}

	@Override
	public String name() {

		return "Income Statement";
	}

	@Override
	public Map<String, Object> parameters() {

		params.put("symbols", symbols);

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	@Override
	public Class<IncomeStatements> responseType() {
		return IncomeStatements.class;
	}

	public static class Builder {

		private String[] symbols;
		private GenericRequestField frequency;
		private int count;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder eventTypes(final GenericRequestField frequency) {
			this.frequency = frequency;
			return this;
		}

		public Builder count(final int count) {
			this.count = count;
			return this;
		}

		public IncomeStatementRequest build() {
			return new IncomeStatementRequest(this);
		}
	}

}
