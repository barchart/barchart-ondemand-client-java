package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class QuoteRequest implements OnDemandRequest {

	public enum QuoteRequestMode {
		REAL_TIME, DELAYED, END_OF_DAY;

		public static String getValue(QuoteRequestMode field) {
			if (field == null) {
				return "I";
			}

			switch (field) {
			case REAL_TIME:
				return "R";
			case DELAYED:
				return "I";
			case END_OF_DAY:
				return "D";
			default:
				return "I";
			}
		}
	}

	public enum QuoteRequestField {
		_52_WEEK_HIGH, _52_WEEK_HIGH_DATE, _52_WEEK_LOW, _52_WEEK_LOW_DATE;

		public String getValue(QuoteRequestField field) {
			switch (field) {
			case _52_WEEK_HIGH:
				return "fiftyTwoWkHigh";
			case _52_WEEK_HIGH_DATE:
				return "fiftyTwoWkHighDate";
			case _52_WEEK_LOW:
				return "fiftyTwoWkLow";
			case _52_WEEK_LOW_DATE:
				return "fiftyTwoWkLowDate";
			default:
				return "";
			}
		}

		public static String forQuery(QuoteRequestField[] fields) {

			if (fields == null) {
				return "";
			}

			final StringBuilder sb = new StringBuilder();

			for (QuoteRequestField f : fields) {
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

	private QuoteRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		this.fields = QuoteRequestField.forQuery(b.fields);

		params.put("mode", QuoteRequestMode.getValue(b.mode));

	}

	@Override
	public String endpoint() {

		return "getQuote.json";
	}

	@Override
	public String name() {

		return "Quote";
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
		private QuoteRequestField[] fields;
		private QuoteRequestMode mode;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder fields(final QuoteRequestField[] fields) {
			this.fields = fields;
			return this;
		}

		public Builder mode(final QuoteRequestMode mode) {
			this.mode = mode;
			return this;
		}

		public OnDemandRequest build() {
			return new QuoteRequest(this);
		}
	}

}
