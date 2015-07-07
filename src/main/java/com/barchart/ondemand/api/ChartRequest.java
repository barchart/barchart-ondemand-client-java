package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class ChartRequest implements OnDemandRequest {

	public enum ChartRequestType {
		BAR("BAR"), LINE("LINE"), CANDLE("CANDLE"), AREA("AREA");

		private final String value;

		private ChartRequestType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static String getValue(ChartRequestType field) {
			if (field == null) {
				return "BAR";
			}

			return field.getValue();
		}
	}

	public enum ChartRequestPeriod {
		// Day
		DAY_1("1d"), DAY_5("5d"), DAY_3("3d"), DAY_10("10d"),
		// Month
		MONTH_1("1m"), MONTH_3("3m"), MONTH_6("6m"),
		// Year
		YEAR_1("1y"), YEAR_2("2y"), YEAR_3("3y"), YEAR_5("5y"), YEAR_10("10y"), YEAR_15("15y"), YEAR_20("20y"), YEAR_25("25y");

		private final String value;

		private ChartRequestPeriod(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static String getValue(ChartRequestPeriod field) {

			if (field == null) {
				return "1d";
			}

			return field.getValue();
		}

	}

	private final String symbols;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private ChartRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");
		this.fields = "";

		params.put("period", ChartRequestPeriod.getValue(b.period));
		params.put("type", ChartRequestType.getValue(b.type));

		params.put("height", b.height);
		params.put("width", b.width);

	}

	@Override
	public String endpoint() {

		return "getChart.json";
	}

	@Override
	public String name() {

		return "Chart";
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
		private ChartRequestType type;
		private ChartRequestPeriod period;
		private int width = 640;
		private int height = 440;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder type(final ChartRequestType type) {
			this.type = type;
			return this;
		}

		public Builder period(final ChartRequestPeriod period) {
			this.period = period;
			return this;
		}

		public Builder width(final int width) {
			this.width = width;
			return this;
		}

		public Builder height(final int height) {
			this.height = height;
			return this;
		}

		public OnDemandRequest build() {
			return new ChartRequest(this);
		}
	}

}
