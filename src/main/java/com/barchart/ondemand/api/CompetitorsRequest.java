package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import com.barchart.ondemand.api.responses.Competitors;

public class CompetitorsRequest implements OnDemandRequest<Competitors> {

	public enum CompetitorsRequestField {
		_52_WEEK_HIGH("fiftyTwoWkHigh"), _52_WEEK_HIGH_DATE("fiftyTwoWkHighDate"),
		_52_WEEK_LOW("fiftyTwoWkLow"), _52_WEEK_LOW_DATE("fiftyTwoWkLowDate");

		private final String value;

		private CompetitorsRequestField(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static String forQuery(CompetitorsRequestField[] fields) {

			if (fields == null) {
				return "";
			}

			final StringBuilder sb = new StringBuilder();

			for (CompetitorsRequestField f : fields) {
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

	private CompetitorsRequest(final Builder b) {

		this.symbols = b.symbol;

		this.fields = CompetitorsRequestField.forQuery(b.fields);

		if (b.maxRecords > 0) {
			params.put("maxRecords", b.maxRecords);
		}

	}

	@Override
	public String endpoint() {

		return "getCompetitors.json";
	}

	@Override
	public String name() {

		return "Competitors";
	}

	@Override
	public Map<String, Object> parameters() {

		params.put("symbol", symbols);

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	@Override
	public Class<Competitors> responseType() {
		return Competitors.class;
	}

	public static class Builder {

		private String symbol;
		private CompetitorsRequestField[] fields;
		private int maxRecords;

		public Builder symbol(final String symbol) {
			this.symbol = symbol;
			return this;
		}

		public Builder eventTypes(final CompetitorsRequestField[] fields) {
			this.fields = fields;
			return this;
		}

		public Builder maxRecords(final int maxRecords) {
			this.maxRecords = maxRecords;
			return this;
		}

		public CompetitorsRequest build() {
			return new CompetitorsRequest(this);
		}
	}

}
