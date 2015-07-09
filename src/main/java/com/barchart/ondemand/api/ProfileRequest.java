package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.responses.Profiles;

public class ProfileRequest implements OnDemandRequest<Profiles> {

	public enum ProfileRequestField {
		QTR_ONE_EARNINGS, QTR_TWO_EARNINGS, QTR_THREE_EARNINGS, QTR_FOUR_EARNINGS;

		public String getValue(ProfileRequestField field) {
			switch (field) {
			case QTR_ONE_EARNINGS:
				return "qtrOneEarnings";
			case QTR_TWO_EARNINGS:
				return "qtrTwoEarnings";
			case QTR_THREE_EARNINGS:
				return "qtrThreeEarnings";
			case QTR_FOUR_EARNINGS:
				return "qtrFourEarnings";
			default:
				return "";
			}
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
				sb.append(f.getValue(f));
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

	@Override
	public Class<Profiles> responseType() {
		return Profiles.class;
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

		public ProfileRequest build() {
			return new ProfileRequest(this);
		}
	}

}
