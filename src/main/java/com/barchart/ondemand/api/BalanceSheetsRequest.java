package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.responses.BalanceSheets;

public class BalanceSheetsRequest implements OnDemandRequest<BalanceSheets> {

	private final String symbols;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private BalanceSheetsRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		if (b.frequency == null) {
			b.frequency = GenericRequestField.QUARTER;
		}

		params.put("frequency", b.frequency);
		params.put("count", Math.max(b.count, 0));

		this.fields = "";

	}

	@Override
	public String endpoint() {

		return "getBalanceSheets.json";
	}

	@Override
	public String name() {

		return "Balance Sheets";
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
	public Class<BalanceSheets> responseType() {
		return BalanceSheets.class;
	}

	public static class Builder {

		private String[] symbols;
		private GenericRequestField frequency;
		private int count = 1;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder frequency(final GenericRequestField frequency) {
			this.frequency = frequency;
			return this;
		}

		public Builder count(final int count) {
			this.count = count;
			return this;
		}

		public BalanceSheetsRequest build() {
			return new BalanceSheetsRequest(this);
		}
	}

}
