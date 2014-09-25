package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

public class HistoryRequest implements OnDemandRequest {

	public enum HistoryRequestType {
		TICKS, MINUTES, MINUTES_NEARBY, MINUTES_FORMT, //
		DAILY, DAILY_NEAREST, DAILY_CONTINUE, //
		WEEKLY, WEEKLY_NEAREST, WEEKLY_CONTINUE, //
		MONTHLY, MONTHLY_NEAREST, MONTHLY_CONTINUE, //
		QUARTERLY, QUARTERLY_NEAREST, QUARTERLY_CONTINUE, //
		YEARLY, YEARLY_NEAREST, YEARLY_CONTINUE;

		public static String getValue(HistoryRequestType type) {
			if (type == null) {
				return "minutes";
			}

			switch (type) {
			case TICKS:
				return "ticks";
			case MINUTES:
				return "minutes";
			case MINUTES_NEARBY:
				return "nearbyMinutes";
			case MINUTES_FORMT:
				return "formTMinutes";
			case DAILY: //
				return "daily";
			case DAILY_NEAREST:
				return "dailyNearest";
			case DAILY_CONTINUE:
				return "dailyContinue";
			case WEEKLY://
				return "weekly";
			case WEEKLY_NEAREST:
				return "weeklyNearest";
			case WEEKLY_CONTINUE:
				return "weeklyContinue";
			case MONTHLY: //
				return "monthly";
			case MONTHLY_NEAREST:
				return "monthlyNearest";
			case MONTHLY_CONTINUE:
				return "monthlyContinue";
			case QUARTERLY: //
				return "quarterly";
			case QUARTERLY_NEAREST:
				return "quarterlyNearest";
			case QUARTERLY_CONTINUE:
				return "quarterlyContinue";
			case YEARLY: //
				return "yearly";
			case YEARLY_NEAREST:
				return "yearlyNearest";
			case YEARLY_CONTINUE:
				return "yearlyContinue";
			default:
				return "";
			}
		}
	}

	public enum HistoryRequestVolume {
		TOTAL, SUM, SUM_CONTRACT, SUM_TOTAL;

		public static String getValue(HistoryRequestVolume field) {
			if (field == null) {
				return "";
			}

			switch (field) {
			case TOTAL:
				return "total";
			case SUM:
				return "sun";
			case SUM_CONTRACT:
				return "sumcontract";
			case SUM_TOTAL:
				return "sumtotal";
			default:
				return "total";
			}
		}
	}

	private final String symbol;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private HistoryRequest(final Builder b) {

		this.symbol = b.symbol;

		this.fields = "";

	}

	@Override
	public String endpoint() {

		return "getHisory.json";
	}

	@Override
	public String name() {

		return "Historical Data";
	}

	@Override
	public Map<String, Object> parameters() {

		params.put("symbol", symbol);

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	public static class Builder {

		private String symbol;

		public Builder symbol(final String symbol) {
			this.symbol = symbol;
			return this;
		}

		public OnDemandRequest build() {

			if (symbol == null) {
				throw new IllegalArgumentException("you must set the symbol field");
			}

			return new HistoryRequest(this);
		}
	}

}
