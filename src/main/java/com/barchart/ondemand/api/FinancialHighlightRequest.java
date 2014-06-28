package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class FinancialHighlightRequest implements OnDemandRequest {

	public enum FinancialHighlightRequestField {
		LAST_QTR_EPS, ANNUAL_EPS, TTM_EPS;

		public String getValue(FinancialHighlightRequestField field) {
			switch (field) {
			case LAST_QTR_EPS:
				return "lastQtrEPS";
			case ANNUAL_EPS:
				return "annualEPS";
			case TTM_EPS:
				return "ttmEPS";
			default:
				return "";
			}
		}

		public static String forQuery(FinancialHighlightRequestField[] fields) {
			if (fields == null) {
				return "";
			}

			final StringBuilder sb = new StringBuilder();

			for (FinancialHighlightRequestField f : fields) {
				if (sb.length() > 0) {
					sb.append(',');
				}
				sb.append(f.getValue(f));
			}

			return sb.toString();
		}
	}

	private final String symbols;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private FinancialHighlightRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		this.fields = FinancialHighlightRequestField.forQuery(b.fields);

	}

	@Override
	public String endpoint() {

		return "getFinancialHighlights.json";
	}

	@Override
	public String name() {

		return "Financial Highlights";
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
		private FinancialHighlightRequestField[] fields;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder fields(final FinancialHighlightRequestField[] eventTypes) {
			this.fields = eventTypes;
			return this;
		}

		public OnDemandRequest build() {
			return new FinancialHighlightRequest(this);
		}
	}

}
