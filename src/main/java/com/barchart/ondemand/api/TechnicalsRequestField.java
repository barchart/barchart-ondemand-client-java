package com.barchart.ondemand.api;

public enum TechnicalsRequestField {
	// Price Change
	PRICE_CHG_5_DAY("priceChangeFiveDay"), PRICE_CHG_20_DAY("priceChangeTwentyDay"), PRICE_CHG_50_DAY("priceChangeFiftyDay"),
	PRICE_CHG_100_DAY("priceChangeOneHundredDay"), PRICE_CHG_200_DAY("priceChangeTwoHundredDay"), PRICE_CHG_YTD("priceChangeYTD"),
	// Percent Change
	PCT_CHG_5_DAY("percentChangeFiveDay"), PCT_CHG_20_DAY("percentChangeTwentyDay"), PCT_CHG_50_DAY("percentChangeFiftyDay"),
	PCT_CHG_100_DAY("percentChangeOneHundredDay"), PCT_CHG_200_DAY("percentChangeTwoHundredDay"), PCT_CHG_YTD("percentChangeYTD"),
	// Average Volume
	AVG_VOL_5_DAY("averageVolumeFiveDay"), AVG_VOL_20_DAY("averageVolumeTwentyDay"), AVG_VOL_50_DAY("averageVolumeFiftyDay"),
	AVG_VOL_100_DAY("averageVolumeOneHundredDay"), AVG_VOL_200_DAY("averageVolumeTwoHundredDay"), AVG_VOL_YTD("averageVolumeYTD"),
	// Raw Sochastic
	RAW_STOC_9_DAY("nineDayRawStochastic"), RAW_STOC_14_DAY("fourteenDayRawStochastic"), RAW_STOC_20_DAY("twentyDayRawStochastic"),
	RAW_STOC_50_DAY("fiftyDayRawStochastic"), RAW_STOC_100_DAY("oneHundredDayRawStochastic"),
	// Stochastic %k
	STOC_K_9_DAY("nineDayStochasticK"), STOC_K_14_DAY("fourteenDayStochasticK"), STOC_K_20_DAY("twentyDayStochasticK"),
	STOC_K_50_DAY("fiftyDayStochasticK"), STOC_K_100_DAY("oneHundredDayStochasticK"),
	// Stochastic %d
	STOC_D_9_DAY("nineDayStochasticD"), STOC_D_14_DAY("fourteenDayStochasticD"), STOC_D_20_DAY("twentyDayStochasticD"),
	STOC_D_50_DAY("fiftyDayStochasticD"), STOC_D_100_DAY("oneHundredDayStochasticD"),
	// Average True Range
	ATR_9_DAY("nineDayATR"), ATR_14_DAY("fourteenDayATR"), ATR_20_DAY("twentyDayATR"),
	ATR_50_DAY("fiftyDayATR"), ATR_100_DAY("oneHundredDayATR"),
	// Relative Strength
	RSI_9_DAY("nineDayRelativeStrength"), RSI_14_DAY("fourteenDayRelativeStrength"), RSI_20_DAY("twentyDayRelativeStrength"),
	RSI_50_DAY("fiftyDayRelativeStrength"), RSI_100_DAY("oneHundredDayRelativeStrength"),
	// Percent R
	PCT_R_9_DAY("nineDayPercentR"), PCT_R_14_DAY("fourteenDayPercentR"), PCT_R_20_DAY("twentyDayPercentR"),
	PCT_R_50_DAY("fiftyDayPercentR"), PCT_R_100_DAY("oneHundredDayPercentR"),
	// Historic Volatility
	HIST_VOL_9_DAY("nineDayHistoricVolatility"), HIST_VOL_14_DAY("fourteenDayHistoricVolatility"), HIST_VOL_20_DAY("twentyDayHistoricVolatility"),
	HIST_VOL_50_DAY("fiftyDayHistoricVolatility"), HIST_VOL_100_DAY("oneHundredDayHistoricVolatility"),
	// Moving Average Convergence/Divergence
	MACD_9_DAY("nineDayMACD"), MACD_14_DAY("fourteenDayMACD"), MACD_20_DAY("twentyDayMACD"),
	MACD_50_DAY("fiftyDayMACD"), MACD_100_DAY("oneHundredDayMACD"),
	// Standard Deviation
	STD_DEV("standardDeviation");

	private final String value;

	private TechnicalsRequestField(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static TechnicalsRequestField[] all() {
		return TechnicalsRequestField.values();
	}

	public static String forQuery(TechnicalsRequestField[] fields) {

		if (fields == null) {
			return "";
		}

		final StringBuilder sb = new StringBuilder();

		for (TechnicalsRequestField f : fields) {
			if (sb.length() > 0) {
				sb.append(',');
			}
			sb.append(f.getValue());
		}

		return sb.toString();

	}
}
