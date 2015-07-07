package com.barchart.ondemand.api;

import java.util.Map;

public interface OnDemandRequest {

	public enum GenericRequestField {
		QUARTER("Quarter"), ANNUAL("Annual");

		private final String value;

		private GenericRequestField(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	public static String BASE_URL = "http://ondemand.websol.barchart.com/";

	String endpoint();

	String name();

	Map<String, Object> parameters();

}
