package com.barchart.ondemand.api;

public enum TechnicalsRequestField {
	PRICE_CHG_5_DAY, PRICE_CHG_20_DAY, PRICE_CHG_50_DAY, PRICE_CHG_100_DAY, PRICE_CHG_200_DAY, PRICE_CHG_YTD, //
	PCT_CHG_5_DAY, PCT_CHG_20_DAY, PCT_CHG_50_DAY, PCT_CHG_100_DAY, PCT_CHG_200_DAY, PCT_CHG_YTD, //
	AVG_VOL_5_DAY, AVG_VOL_20_DAY, AVG_VOL_50_DAY, AVG_VOL_100_DAY, AVG_VOL_200_DAY, AVG_VOL_YTD, //
	RAW_STOC_9_DAY, RAW_STOC_14_DAY, RAW_STOC_20_DAY, RAW_STOC_50_DAY, RAW_STOC_100_DAY, //
	STOC_K_9_DAY, STOC_K_14_DAY, STOC_K_20_DAY, STOC_K_50_DAY, STOC_K_100_DAY, //
	STOC_D_9_DAY, STOC_D_14_DAY, STOC_D_20_DAY, STOC_D_50_DAY, STOC_D_100_DAY, //
	ATR_9_DAY, ATR_14_DAY, ATR_20_DAY, ATR_50_DAY, ATR_100_DAY, //
	RSI_9_DAY, RSI_14_DAY, RSI_20_DAY, RSI_50_DAY, RSI_100_DAY, //
	PCT_R_9_DAY, PCT_R_14_DAY, PCT_R_20_DAY, PCT_R_50_DAY, PCT_R_100_DAY, //
	HIST_VOL_9_DAY, HIST_VOL_14_DAY, HIST_VOL_20_DAY, HIST_VOL_50_DAY, HIST_VOL_100_DAY, //
	MACD_9_DAY, MACD_14_DAY, MACD_20_DAY, MACD_50_DAY, MACD_100_DAY, //
	STD_DEV;

	public String getValue(TechnicalsRequestField field) {
		switch (field) {
		case PRICE_CHG_5_DAY:
			return "priceChangeFiveDay";
		case PRICE_CHG_20_DAY:
			return "priceChangeTwentyDay";
		case PRICE_CHG_50_DAY:
			return "priceChangeFiftyDay";
		case PRICE_CHG_100_DAY:
			return "priceChangeOneHundredDay";
		case PRICE_CHG_200_DAY:
			return "priceChangeTwoHundredDay";
		case PRICE_CHG_YTD:
			return "priceChangeYTD";
		case PCT_CHG_5_DAY:
			return "percentChangeFiveDay";
		case PCT_CHG_20_DAY:
			return "percentChangeTwentyDay";
		case PCT_CHG_50_DAY:
			return "percentChangeFiftyDay";
		case PCT_CHG_100_DAY:
			return "percentChangeOneHundredDay";
		case PCT_CHG_200_DAY:
			return "percentChangeTwoHundredDay";
		case PCT_CHG_YTD:
			return "percentChangeYTD";
		case AVG_VOL_5_DAY:
			return "averageVolumeFiveDay";
		case AVG_VOL_20_DAY:
			return "averageVolumeTwentyDay";
		case AVG_VOL_50_DAY:
			return "averageVolumeFiftyDay";
		case AVG_VOL_100_DAY:
			return "averageVolumeOneHundredDay";
		case AVG_VOL_200_DAY:
			return "averageVolumeTwoHundredDay";
		case AVG_VOL_YTD:
			return "averageVolumeYTD";
		case RAW_STOC_9_DAY:
			return "nineDayRawStochastic";
		case RAW_STOC_14_DAY:
			return "fourteenDayRawStochastic";
		case RAW_STOC_20_DAY:
			return "twentyDayRawStochastic";
		case RAW_STOC_50_DAY:
			return "fiftyDayRawStochastic";
		case RAW_STOC_100_DAY:
			return "oneHundredDayRawStochastic";
		case STOC_K_9_DAY:
			return "nineDayStochasticK";
		case STOC_K_14_DAY:
			return "fourteenDayStochasticK";
		case STOC_K_20_DAY:
			return "twentyDayStochasticK";
		case STOC_K_50_DAY:
			return "fiftyDayStochasticK";
		case STOC_K_100_DAY:
			return "oneHundredDayStochasticK";
		case STOC_D_9_DAY:
			return "nineDayStochasticD";
		case STOC_D_14_DAY:
			return "fourteenDayStochasticD";
		case STOC_D_20_DAY:
			return "twentyDayStochasticD";
		case STOC_D_50_DAY:
			return "fiftyDayStochasticD";
		case STOC_D_100_DAY:
			return "oneHundredDayStochasticD";
		case ATR_9_DAY:
			return "nineDayATR";
		case ATR_14_DAY:
			return "fourteenDayATR";
		case ATR_20_DAY:
			return "twentyDayATR";
		case ATR_50_DAY:
			return "fiftyDayATR";
		case ATR_100_DAY:
			return "oneHundredDayATR";
		case RSI_9_DAY:
			return "nineDayRelativeStrength";
		case RSI_14_DAY:
			return "fourteenDayRelativeStrength";
		case RSI_20_DAY:
			return "twentyDayRelativeStrength";
		case RSI_50_DAY:
			return "fiftyDayRelativeStrength";
		case RSI_100_DAY:
			return "oneHundredDayRelativeStrength";
		case PCT_R_9_DAY:
			return "nineDayPercentR";
		case PCT_R_14_DAY:
			return "fourteenDayPercentR";
		case PCT_R_20_DAY:
			return "twentyDayPercentR";
		case PCT_R_50_DAY:
			return "fiftyDayPercentR";
		case PCT_R_100_DAY:
			return "oneHundredDayPercentR";
		case HIST_VOL_9_DAY:
			return "nineDayHistoricVolatility";
		case HIST_VOL_14_DAY:
			return "fourteenDayHistoricVolatility";
		case HIST_VOL_20_DAY:
			return "twentyDayHistoricVolatility";
		case HIST_VOL_50_DAY:
			return "fiftyDayHistoricVolatility";
		case HIST_VOL_100_DAY:
			return "oneHundredDayHistoricVolatility";
		case MACD_9_DAY:
			return "nineDayMACD";
		case MACD_14_DAY:
			return "fourteenDayMACD";
		case MACD_20_DAY:
			return "twentyDayMACD";
		case MACD_50_DAY:
			return "fiftyDayMACD";
		case MACD_100_DAY:
			return "oneHundredDayMACD";
		case STD_DEV:
			return "standardDeviation";
		default:
			return "";
		}
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
			sb.append(f.getValue(f));
		}

		return sb.toString();

	}
}
