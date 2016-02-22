package com.barchart.ondemand.api;

public enum SignalsRequestField {

	TREND_SPOTTER("trendspotterOpinion"), ADI_7_DAY("adi7DayOpinion"),
	MA_HI_LO_10_DAY("maHiLo10_8DayOpinion"), MA_20_DAY("ma20DaySignal"), MACD_20_DAY("macd20_50DaySignal"),
	BB_BANDS_20_DAY("bbands20DaySignal"), SHORT_TERM_AVG("shortTermAverageSignal"), SHORT_TERM_AVG_PCT("shortTermAveragePercent"),
	CCI_40_DAY("cci40DaySignal"), MA_50_DAY("ma50DaySignal"), MACD_20_100_DAY("macd20_100DaySignal"),
	PARABOL_50_DAY("parabolic50DaySignal"), MEDIUM_TERM_AVG("mediumTermAverageSignal"), MEDIUM_TERM_AVG_PCT("mediumTermAveragePercent"),
	CCI_60_DAY("cci60DaySignal"), MA_100_DAY("ma100DaySignal"), MACD_50_100_DAY("macd50_100DaySignal"),
	LONG_TERM_AVG("longTermAverageSignal"), LONG_TERM_AVG_PCT("longTermAveragePercent"),
	OVERALL_AVG("overallAverageSignal"), OVERALL_AVG_PCT("overallAveragePercent");

	private final String value;

	private SignalsRequestField(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
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
			sb.append(f.getValue());
		}

		return sb.toString();

	}

}
