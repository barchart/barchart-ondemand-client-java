package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

public class WeatherRequest implements OnDemandRequest {

	public enum WeatherRequestType {
		CURRENT_CONTIDIONS("CC"), FORECAST("F"), MAP("MAP");

		private final String value;

		private WeatherRequestType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static String getValue(WeatherRequestType field) {
			if (field == null) {
				return "CC";
			}
			return field.getValue();
		}

	}

	public enum WeatherRequestMapType {
		LOCAL_RADAR_ANIMATION("localRadarAnimation"), US_RADAR_SATELLITE("usRadarSatellite"),
		US_RADAR_SATELLITE_ANIMATION("usRadarSatelliteAnimation"), TODAYS_WEATHER_MAP("todaysWeatherMap"),
		CURRENT_WIND_CONDITIONS("currentWindConditions"), TODAYS_PRECIP_ACC("todaysPrecipitationAccumulation"),
		DAILY_PRECIP("dailyPrecipitation"), US_SOIL_MOISTUE("usSoilMoisture"),
		US_CURRENT_TEMPS("usCurrentTemperatures");

		private final String value;

		private WeatherRequestMapType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static String getValue(WeatherRequestMapType field) {
			if (field == null) {
				return "todaysWeatherMap";
			}
			return field.getValue();
		}
	}

	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private WeatherRequest(final Builder b) {

		params.put("weatherType", WeatherRequestType.getValue(b.weatherType));
		params.put("zipCode", b.zipCode);

		if (b.weatherType != null && b.weatherType == WeatherRequestType.MAP) {
			params.put("mapWidth", b.mapWidth);
			params.put("mapHeight", b.mapHeight);
			params.put("mapType", WeatherRequestMapType.getValue(b.mapType));
		}

		params.put("fields", "windDirection,windSpeed,humidity,dewpoint,forcastedDay,forcastedPrecipitation");

		this.fields = "";

	}

	@Override
	public String endpoint() {

		return "getWeather.json";
	}

	@Override
	public String name() {

		return "Weather";
	}

	@Override
	public Map<String, Object> parameters() {

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	public static class Builder {

		private String zipCode;
		private WeatherRequestType weatherType;
		private WeatherRequestMapType mapType = WeatherRequestMapType.TODAYS_WEATHER_MAP;
		private int mapWidth = 640;
		private int mapHeight = 480;

		public Builder zipCode(final String zipCode) {
			this.zipCode = zipCode;
			return this;
		}

		public Builder weatherType(final WeatherRequestType weatherType) {
			this.weatherType = weatherType;
			return this;
		}

		public Builder mapType(final WeatherRequestMapType mapType) {
			this.mapType = mapType;
			return this;
		}

		public Builder mapWidth(final int mapWidth) {
			this.mapWidth = mapWidth;
			return this;
		}

		public Builder mapHeight(final int mapHeight) {
			this.mapHeight = mapHeight;
			return this;
		}

		public OnDemandRequest build() {
			return new WeatherRequest(this);
		}
	}

}
