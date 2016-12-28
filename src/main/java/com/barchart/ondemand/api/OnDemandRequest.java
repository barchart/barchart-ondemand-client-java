package com.barchart.ondemand.api;

import java.util.Map;

import com.barchart.ondemand.api.responses.ResponseBase;

public interface OnDemandRequest<R extends ResponseBase> {

	public enum GenericRequestField {
		QUARTER("Quarter"), ANNUAL("Annual"), OPEN_INTEREST("openInterest"), //
		SETTLEMENT("settlement"), PREVIOUS_CLOSE("previousClose");

		private final String value;

		private GenericRequestField(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static String forQuery(GenericRequestField[] fields) {

			if (fields == null) {
				return "";
			}

			final StringBuilder sb = new StringBuilder();

			for (GenericRequestField f : fields) {
				if (sb.length() > 0) {
					sb.append(',');
				}
				sb.append(f.getValue());
			}

			return sb.toString();

		}
	}

	public static String BASE_URL = "http://ondemand.websol.barchart.com/";

	String endpoint();

	String name();

	Map<String, Object> parameters();

	Class<R> responseType();
}
