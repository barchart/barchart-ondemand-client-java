package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class EquitiesOptionsRequest implements OnDemandRequest {
	
	public enum EquitiesOptionsRequestType {
		CALLS, PUTS, ALL;

		public static String getValue(EquitiesOptionsRequestType field) {
			if (field == null) {
				return "";
			}

			switch (field) {
			case CALLS:
				return "Call";
			case PUTS:
				return "Puts";
			case ALL:
				return "";
			default:
				return "";
			}
		}
	}
	
	public enum EquitiesOptionsRequestOptionType {
		MONTHLY, WEEKLY, ALL;

		public static String getValue(EquitiesOptionsRequestOptionType field) {
			if (field == null) {
				return "";
			}

			switch (field) {
			case MONTHLY:
				return "Monthly";
			case WEEKLY:
				return "Weekly";
			case ALL:
				return "";
			default:
				return "";
			}
		}
	}
	
	private final String symbols;
	private final String fields;
	
	private final Map<String, Object> params = new HashMap<String, Object>();
	
	private EquitiesOptionsRequest(final Builder b) {
		
		this.symbols = StringUtils.join(b.underlying_symbols, ",");
		this.fields = "";
		
		final String type = EquitiesOptionsRequestType.getValue(b.type);
		final String optionType = EquitiesOptionsRequestOptionType.getValue(b.optionType);
		
		if (!type.isEmpty()) {
			params.put("type", b.type);
		}
		
		if (!optionType.isEmpty()) {
			params.put("optionType", b.optionType);
		}

	}

	@Override
	public String endpoint() {
		return "getEquityOptions.json";
	}

	@Override
	public String name() {
		return "Equities Options";
	}

	@Override
	public Map<String, Object> parameters() {
		
		if (!symbols.isEmpty()) {
			params.put("underlying_symbols", symbols);
		}

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}
	
	public static class Builder {
		
		private String[] underlying_symbols = new String[] {};
		private EquitiesOptionsRequestType type;
		private EquitiesOptionsRequestOptionType optionType;

		
		public Builder symbols(final String[] symbols) {
			this.underlying_symbols = symbols;
			return this;
		}

		
		public OnDemandRequest build() {
			return new EquitiesOptionsRequest(this);
		}
	}

}
