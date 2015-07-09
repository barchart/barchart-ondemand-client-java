package com.barchart.ondemand.api;

import java.util.Map;

import com.barchart.ondemand.api.responses.ResponseBase;

public interface OnDemandRequest<R extends ResponseBase> {

	public enum GenericRequestField {
		QUARTER, ANNUAL;

		public String getValue(GenericRequestField field) {
			switch (field) {
			case QUARTER:
				return "Quarter";
			case ANNUAL:
				return "Annual";
			default:
				return "";
			}
		}
	}

	public static String BASE_URL = "http://ondemand.websol.barchart.com/";

	String endpoint();

	String name();

	Map<String, Object> parameters();

	Class<R> responseType();
}
