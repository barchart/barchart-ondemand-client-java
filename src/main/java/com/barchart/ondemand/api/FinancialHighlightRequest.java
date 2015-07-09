package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.responses.FinancialHighlights;

public class FinancialHighlightRequest implements OnDemandRequest<FinancialHighlights> {

	public enum FinancialHighlightRequestField {
		LAST_QTR_EPS("lastQtrEPS"), ANNUAL_EPS("annualEPS"), TTM_EPS("ttmEPS");

		private final String value;

		private FinancialHighlightRequestField(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
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
				sb.append(f.getValue());
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

	@Override
	public Class<FinancialHighlights> responseType() {
		return FinancialHighlights.class;
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

		public FinancialHighlightRequest build() {
			return new FinancialHighlightRequest(this);
		}
	}

}
