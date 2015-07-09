package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.responses.FinancialRatios;

public class FinancialRatioRequest implements OnDemandRequest<FinancialRatios> {

	public enum FinancialRatioRequestField {
		DEBT_EQUITY("debtEquity"), INTEREST_COVERAGE("interestCoverage"), BOOK_VALUE("bookValue"), DIVIDEND_PAYOUT("dividendPayout");

		private final String value;

		private FinancialRatioRequestField(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	private final String symbols;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private FinancialRatioRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		if (b.fields != null) {
			StringBuilder sb = new StringBuilder();

			for (FinancialRatioRequestField f : b.fields) {
				if (sb.length() > 0) {
					sb.append(',');
				}
				sb.append(f.getValue());
			}

			this.fields = sb.toString();
		} else {
			this.fields = "";
		}

	}

	@Override
	public String endpoint() {

		return "getFinancialRatios.json";
	}

	@Override
	public String name() {

		return "Financial Ratios";
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
	public Class<FinancialRatios> responseType() {
		return FinancialRatios.class;
	}

	public static class Builder {

		private String[] symbols;
		private FinancialRatioRequestField[] fields;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder eventTypes(final FinancialRatioRequestField[] fields) {
			this.fields = fields;
			return this;
		}

		public FinancialRatioRequest build() {
			return new FinancialRatioRequest(this);
		}
	}

}
