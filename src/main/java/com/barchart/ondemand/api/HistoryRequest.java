package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.barchart.ondemand.api.responses.History;

public class HistoryRequest implements OnDemandRequest<History> {

	public static final DateTimeFormatter dateFormat = DateTimeFormat.forPattern("yyyyMMddhhmmss");

	public enum HistoryRequestType {
		TICKS("ticks"), MINUTES("minutes"), MINUTES_NEARBY("nearbyMinutes"), MINUTES_FORMT("formTMinutes"), //
		DAILY("daily"), DAILY_NEAREST("dailyNearest"), DAILY_CONTINUE("dailyContinue"), //
		WEEKLY("weekly"), WEEKLY_NEAREST("weeklyNearest"), WEEKLY_CONTINUE("weeklyContinue"), //
		MONTHLY("monthly"), MONTHLY_NEAREST("monthlyNearest"), MONTHLY_CONTINUE("monthlyContinue"), //
		QUARTERLY("quarterly"), QUARTERLY_NEAREST("quarterlyNearest"), QUARTERLY_CONTINUE("quarterlyContinue"), //
		YEARLY("yearly"), YEARLY_NEAREST("yearlyNearest"), YEARLY_CONTINUE("yearlyContinue");

		private final String value;

		private HistoryRequestType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
		public static String getValue(HistoryRequestType type) {
			if (type == null) {
				return "minutes";
			}

			return type.getValue();
		}
	}

	public enum HistoryRequestVolume {
		TOTAL("total"), SUM("sum"), SUM_CONTRACT("sumcontract"), SUM_TOTAL("sumtotal");

		private final String value;

		private HistoryRequestVolume(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static String getValue(HistoryRequestVolume field) {
			if (field == null) {
				return "";
			}

			return field.getValue();
		}
	}

	private final String symbol;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private HistoryRequest(final Builder b) {

		this.symbol = b.symbol;

		params.put("type", HistoryRequestType.getValue(b.type));
		params.put("interval", b.interval);

		if (b.volume != null) {
			params.put("volume", b.volume);
		}
		if (b.nearby > 0) {
			params.put("nearby", b.nearby);
		}
		if (b.maxRecords > 0) {
			params.put("maxRecords", b.maxRecords);
		}
		if (b.orderAscending) {
			params.put("order", "asc");
		} else {
			params.put("order", "desc");
		}
		if (b.start != null) {
			params.put("startDate", dateFormat.print(b.start));
		}
		if (b.end != null) {
			params.put("endDate", dateFormat.print(b.end));
		}
		if (b.splits) {
			params.put("splits", "true");
		}
		if (b.dividends) {
			params.put("dividends", "true");
		}

		this.fields = "";

	}

	@Override
	public String endpoint() {

		return "getHistory.json";
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

	@Override
	public Class<History> responseType() {
		return History.class;
	}

	public static class Builder {

		private String symbol;
		private HistoryRequestType type = HistoryRequestType.DAILY;
		private int interval = 1;
		private HistoryRequestVolume volume;
		private int nearby = -1;
		private boolean orderAscending = true;
		private int maxRecords = -1;
		private DateTime start;
		private DateTime end;
		private boolean splits = false;
		private boolean dividends = false;

		public Builder symbol(final String symbol) {
			this.symbol = symbol;
			return this;
		}

		public Builder type(final HistoryRequestType type) {
			this.type = type;
			return this;
		}

		public Builder maxRecords(final int maxRecords) {
			this.maxRecords = maxRecords;
			return this;
		}

		public Builder start(final DateTime start) {
			this.start = start;
			return this;
		}

		public Builder end(final DateTime end) {
			this.end = end;
			return this;
		}

		public Builder splits(final boolean splits) {
			this.splits = splits;
			return this;
		}

		public Builder dividends(final boolean dividends) {
			this.dividends = dividends;
			return this;
		}

		public Builder orderAscending(final boolean orderAscending) {
			this.orderAscending = orderAscending;
			return this;
		}

		public Builder interval(final int interval) {
			this.interval = interval;
			return this;
		}

		public Builder nearby(final int nearby) {
			this.nearby = nearby;
			return this;
		}

		public Builder volume(final HistoryRequestVolume volume) {
			this.volume = volume;
			return this;
		}

		public HistoryRequest build() {

			if (symbol == null) {
				throw new IllegalArgumentException("you must set the symbol field");
			}

			return new HistoryRequest(this);
		}
	}

}
