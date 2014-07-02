package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class LeadersRequest implements OnDemandRequest {

	public enum LeadersAssetType {
		STOCK, ETF, FUTURE, FUND, FOREX;

		public static String getValue(LeadersAssetType field) {
			if (field == null) {
				return "";
			}

			switch (field) {
			case STOCK:
				return "STK";
			case ETF:
				return "ETF";
			case FUTURE:
				return "FUT";
			case FUND:
				return "FUND";
			case FOREX:
				return "FOREX";
			default:
				return "";
			}
		}
	}

	public enum LeadersRequestType {
		ACTIVE, ACTIVE_5_DAY, ACTIVE_1_MONTH, ACTIVE_3_MONTH, ACTIVE_6_MONTH, ACTIVE_9_MONTH, ACTIVE_12_MONTH, ACTIVE_YTD, //
		GAINERS, GAINERS_5_DAY, GAINERS_1_MONTH, GAINERS_3_MONTH, GAINERS_6_MONTH, GAINERS_9_MONTH, GAINERS_12_MONTH, GAINERS_YTD, //
		LOSERS, LOSERS_5_DAY, LOSERS_1_MONTH, LOSERS_3_MONTH, LOSERS_6_MONTH, LOSERS_9_MONTH, LOSERS_12_MONTH, LOSERS_YTD, //
		HOT, HOT_DAILY, HOT_WEEKLY, HOT_MONTHLY, //
		NOT_HOT, NOT_HOT_DAILY, NOT_HOT_WEEKLY, NOT_HOT_MONTHLY;

		public static String getValue(LeadersRequestType field) {
			if (field == null) {
				return "";
			}

			switch (field) {
			case ACTIVE: // Active
				return "active";
			case ACTIVE_5_DAY:
				return "active_5d";
			case ACTIVE_1_MONTH:
				return "active_1m";
			case ACTIVE_3_MONTH:
				return "active_3m";
			case ACTIVE_6_MONTH:
				return "active_6m";
			case ACTIVE_9_MONTH:
				return "active_9m";
			case ACTIVE_12_MONTH:
				return "active_12m";
			case ACTIVE_YTD:
				return "active_ytd";
			case GAINERS: // Gainers
				return "gainers";
			case GAINERS_5_DAY:
				return "gainers_5d";
			case GAINERS_1_MONTH:
				return "gainers_1m";
			case GAINERS_3_MONTH:
				return "gainers_3m";
			case GAINERS_6_MONTH:
				return "gainers_6m";
			case GAINERS_9_MONTH:
				return "gainers_9m";
			case GAINERS_12_MONTH:
				return "gainers_12m";
			case GAINERS_YTD:
				return "gainers_ytd";
			case LOSERS: // Losers
				return "losers";
			case LOSERS_5_DAY:
				return "losers_5d";
			case LOSERS_1_MONTH:
				return "losers_1m";
			case LOSERS_3_MONTH:
				return "losers_3m";
			case LOSERS_6_MONTH:
				return "losers_6m";
			case LOSERS_9_MONTH:
				return "losers_9m";
			case LOSERS_12_MONTH:
				return "losers_12m";
			case LOSERS_YTD:
				return "losers_ytd";
			case HOT: // Hot
				return "hot";
			case HOT_DAILY:
				return "hot_daily";
			case HOT_WEEKLY:
				return "hot_weekly";
			case HOT_MONTHLY:
				return "hot_monthly";
			case NOT_HOT: // Not Hot
				return "nothot";
			case NOT_HOT_DAILY:
				return "nothot_daily";
			case NOT_HOT_WEEKLY:
				return "nothot_weekly";
			case NOT_HOT_MONTHLY:
				return "nothot_monthly";
			default:
				return "";
			}
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
