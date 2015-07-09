package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.responses.Quotes;

public class QuoteRequest implements OnDemandRequest<Quotes> {

	public enum QuoteRequestMode {
		REAL_TIME("R"), DELAYED("I"), END_OF_DAY("D");

		private final String value;

		private QuoteRequestMode(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static String getValue(QuoteRequestMode field) {
			if (field == null) {
				return "I";
			}

			return field.getValue();
		}
	}

	public enum QuoteRequestField {
		_52_WEEK_HIGH("fiftyTwoWkHigh"), _52_WEEK_HIGH_DATE("fiftyTwoWkHighDate"),
		_52_WEEK_LOW("fiftyTwoWkLow"), _52_WEEK_LOW_DATE("fiftyTwoWkLowDate");

		private final String value;

		private QuoteRequestField(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
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
				sb.append(f.getValue());
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

	@Override
	public Class<Quotes> responseType() {
		return Quotes.class;
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

		public QuoteRequest build() {
			return new QuoteRequest(this);
		}
	}

}
