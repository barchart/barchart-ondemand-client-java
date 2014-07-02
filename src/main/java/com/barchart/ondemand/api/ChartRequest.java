package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class ChartRequest implements OnDemandRequest {

	public enum ChartRequestType {
		BAR, LINE, CANDLE, AREA;

		public static String getValue(ChartRequestType field) {
			if (field == null) {
				return "BAR";
			}

			switch (field) {
			case BAR:
				return "BAR";
			case LINE:
				return "LINE";
			case CANDLE:
				return "CANDLE";
			case AREA:
				return "AREA";
			default:
				return "BAR";
			}
		}
	}

	public enum ChartRequestPeriod {
		DAY_1, DAY_5, DAY_3, DAY_10, //
		MONTH_1, MONTH_3, MONTH_6, //
		YEAR_1, YEAR_2, YEAR_3, YEAR_5, YEAR_10, YEAR_15, YEAR_20, YEAR_25;

		public static String getValue(ChartRequestPeriod field) {

			if (field == null) {
				return "1d";
			}

			switch (field) {
			case DAY_1:
				return "1d";
			case DAY_3:
				return "3d";
			case DAY_5:
				return "5d";
			case DAY_10:
				return "10d";
			case MONTH_1: // month
				return "1m";
			case MONTH_3:
				return "3m";
			case MONTH_6:
				return "6m";
			case YEAR_1: // year
				return "1y";
			case YEAR_2:
				return "2y";
			case YEAR_3:
				return "3y";
			case YEAR_5:
				return "5y";
			case YEAR_10:
				return "10y";
			case YEAR_15:
				return "15y";
			case YEAR_20:
				return "20y";
			case YEAR_25:
				return "25y";
			default:
				return "";
			}
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
