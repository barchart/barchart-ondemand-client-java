package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class LeadersRequest implements OnDemandRequest {

	public enum LeadersAssetType {
		STOCK("STK"), ETF("ETF"), FUTURE("FUT"), FUND("FUND"), FOREX("FOREX");

		private final String value;

		private LeadersAssetType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static String getValue(LeadersAssetType field) {
			if (field == null) {
				return "";
			}

			return field.getValue();
		}
	}

	public enum LeadersRequestType {
		// Active
		ACTIVE("active"), ACTIVE_5_DAY("active_5d"),
		ACTIVE_1_MONTH("active_1m"), ACTIVE_3_MONTH("active_3m"), ACTIVE_6_MONTH("active_6m"), ACTIVE_9_MONTH("active_9m"),
		ACTIVE_12_MONTH("active_12m"), ACTIVE_YTD("active_ytd"),
		// Gainers
		GAINERS("gainers"), GAINERS_5_DAY("gainers_5d"),
		GAINERS_1_MONTH("gainers_1m"), GAINERS_3_MONTH("gainers_3m"), GAINERS_6_MONTH("gainers_6m"), GAINERS_9_MONTH("gainers_9m"),
		GAINERS_12_MONTH("gainers_12m"), GAINERS_YTD("gainers_ytd"),
		// Losers
		LOSERS("losers"), LOSERS_5_DAY("losers_5d"),
		LOSERS_1_MONTH("losers_1m"), LOSERS_3_MONTH("losers_3m"), LOSERS_6_MONTH("losers_6m"), LOSERS_9_MONTH("losers_9m"),
		LOSERS_12_MONTH("losers_12m"), LOSERS_YTD("losers_ytd"),
		// Hot
		HOT("hot"), HOT_DAILY("hot_daily"), HOT_WEEKLY("hot_weekly"), HOT_MONTHLY("hot_monthly"),
		// Not hot
		NOT_HOT("nothot"), NOT_HOT_DAILY("nothot_daily"), NOT_HOT_WEEKLY("nothot_weekly"), NOT_HOT_MONTHLY("nothot_monthly");

		private final String value;

		private LeadersRequestType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static String getValue(LeadersRequestType field) {
			if (field == null) {
				return "";
			}

			return field.getValue();
		}
	}

	private final String exchanges;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private LeadersRequest(final Builder b) {

		this.exchanges = StringUtils.join(b.exchanges, ",");

		this.fields = "";

		final String assetType = LeadersAssetType.getValue(b.assetType);
		final String requestType = LeadersRequestType.getValue(b.type);

		if (!assetType.isEmpty()) {
			params.put("assetType", assetType);
		}

		if (!requestType.isEmpty()) {
			params.put("type", requestType);
		}

		if (b.maxRecords > 0) {
			params.put("maxRecords", b.maxRecords);
		}

	}

	@Override
	public String endpoint() {

		return "getLeaders.json";
	}

	@Override
	public String name() {

		return "Leaderboards";
	}

	@Override
	public Map<String, Object> parameters() {

		if (!exchanges.isEmpty()) {
			params.put("exchanges", exchanges);
		}

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	public static class Builder {

		private String[] exchanges;
		private LeadersAssetType assetType;
		private LeadersRequestType type;
		private int maxRecords;

		public Builder exchanges(final String[] exchanges) {
			this.exchanges = exchanges;
			return this;
		}

		public Builder assetType(final LeadersAssetType assetType) {
			this.assetType = assetType;
			return this;
		}

		public Builder type(final LeadersRequestType type) {
			this.type = type;
			return this;
		}

		public OnDemandRequest build() {

			if (type == null) {
				throw new IllegalArgumentException("you must set the type field, LeadersRequestType");
			}

			if (assetType == null) {
				throw new IllegalArgumentException("you must set the assetType field, LeadersAssetType");
			}

			if (exchanges == null) {
				throw new IllegalArgumentException("you must set the exchanges field, eg: new String[]{'NYSE'}");
			}

			return new LeadersRequest(this);
		}
	}

}
