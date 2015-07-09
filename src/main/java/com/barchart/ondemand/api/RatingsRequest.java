package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.responses.Ratings;

public class RatingsRequest implements OnDemandRequest<Ratings> {

	public enum RatingsRequestField {
		STRONG_BUY, HOLD, STRONG_SELL;

		public String getValue(RatingsRequestField field) {
			switch (field) {
			case STRONG_BUY:
				return "strongBuy";
			case HOLD:
				return "hold";
			case STRONG_SELL:
				return "strongSell";
			default:
				return "";
			}
		}

		public static String forQuery(RatingsRequestField[] fields) {
			if (fields == null) {
				return "";
			}

			final StringBuilder sb = new StringBuilder();

			for (RatingsRequestField f : fields) {
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

	private RatingsRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		this.fields = RatingsRequestField.forQuery(b.fields);

	}

	@Override
	public String endpoint() {

		return "getRatings.json";
	}

	@Override
	public String name() {

		return "Analysts Ratings";
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
	public Class<Ratings> responseType() {
		return Ratings.class;
	}

	public static class Builder {

		private String[] symbols;
		private RatingsRequestField[] fields;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder eventTypes(final RatingsRequestField[] fields) {
			this.fields = fields;
			return this;
		}

		public RatingsRequest build() {
			return new RatingsRequest(this);
		}
	}
}
