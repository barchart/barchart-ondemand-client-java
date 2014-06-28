package com.barchart.ondemand.api;

public enum SignalsRequestField {

	TREND_SPOTTER, ADI_7_DAY, MA_HI_LO_10_DAY, MA_20_DAY, MACD_20_DAY, BB_BANDS_20_DAY, SHORT_TERM_AVG, SHORT_TERM_AVG_PCT, //
	CCI_40_DAY, MA_50_DAY, MACD_20_100_DAY, PARABOL_50_DAY, MEDIUM_TERM_AVG, MEDIUM_TERM_AVG_PCT, //
	CCI_60_DAY, MA_100_DAY, MACD_50_100_DAY, LONG_TERM_AVG, LONG_TERM_AVG_PCT, //
	OVERALL_AVG, OVERALL_AVG_PCT;

	public String getValue(SignalsRequestField field) {
		switch (field) {
		case TREND_SPOTTER:
			return "trendspotterOpinion";
		case ADI_7_DAY:
			return "adi7DayOpinion";
		case MA_HI_LO_10_DAY:
			return "maHiLo10_8DayOpinion";
		case MA_20_DAY:
			return "ma20DaySignal";
		case MACD_20_DAY:
			return "macd20_50DaySignal";
		case BB_BANDS_20_DAY:
			return "bbands20DaySignal";
		case SHORT_TERM_AVG:
			return "shortTermAverageSignal";
		case SHORT_TERM_AVG_PCT:
			return "shortTermAveragePercent";
		case CCI_40_DAY:
			return "cci40DaySignal";
		case MA_50_DAY:
			return "ma50DaySignal";
		case MACD_20_100_DAY:
			return "macd20_100DaySignal";
		case PARABOL_50_DAY:
			return "parabolic50DaySignal";
		case MEDIUM_TERM_AVG:
			return "mediumTermAverageSignal";
		case MEDIUM_TERM_AVG_PCT:
			return "mediumTermAveragePercent";
		case CCI_60_DAY:
			return "cci60DaySignal";
		case MA_100_DAY:
			return "ma100DaySignal";
		case MACD_50_100_DAY:
			return "macd50_100DaySignal";
		case LONG_TERM_AVG:
			return "longTermAverageSignal";
		case LONG_TERM_AVG_PCT:
			return "longTermAveragePercent";
		case OVERALL_AVG:
			return "overallAverageSignal";
		case OVERALL_AVG_PCT:
			return "overallAveragePercent";
		default:
			return "";
		}
	}

	public static SignalsRequestField[] all() {
		return SignalsRequestField.values();
	}

	public static String forQuery(SignalsRequestField[] fields) {

		if (fields == null) {
			return "";
		}

		final StringBuilder sb = new StringBuilder();

		for (SignalsRequestField f : fields) {
			if (sb.length() > 0) {
				sb.append(',');
			}
			sb.append(f.getValue(f));
		}

		return sb.toString();

	}

}
