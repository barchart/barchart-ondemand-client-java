package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class ProfileRequest implements OnDemandRequest {

	public enum ProfileRequestField {
		QTR_ONE_EARNINGS("qtrOneEarnings"), QTR_TWO_EARNINGS("qtrTwoEarnings"),
		QTR_THREE_EARNINGS("qtrThreeEarnings"), QTR_FOUR_EARNINGS("qtrFourEarnings");

		private final String value;

		private ProfileRequestField(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static String forQuery(ProfileRequestField[] fields) {
			if (fields == null) {
				return "";
			}

			final StringBuilder sb = new StringBuilder();

			for (ProfileRequestField f : fields) {
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

	private ProfileRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		this.fields = ProfileRequestField.forQuery(b.fields);

	}

	@Override
	public String endpoint() {

		return "getProfile.json";
	}

	@Override
	public String name() {

		return "Instrument Profile";
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
		private ProfileRequestField[] fields;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder eventTypes(final ProfileRequestField[] fields) {
			this.fields = fields;
			return this;
		}

		public OnDemandRequest build() {
			return new ProfileRequest(this);
		}
	}

}
