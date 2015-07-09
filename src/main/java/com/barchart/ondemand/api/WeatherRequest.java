package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import com.barchart.ondemand.api.responses.Weather;

public class WeatherRequest implements OnDemandRequest<Weather> {

	public enum WeatherRequestType {
		CURRENT_CONTIDIONS, FORECAST, MAP;

		public static String getValue(WeatherRequestType field) {
			if (field == null) {
				return "CC";
			}
			switch (field) {
			case CURRENT_CONTIDIONS:
				return "CC";
			case FORECAST:
				return "F";
			case MAP:
				return "MAP";
			default:
				return "CC";
			}
		}

	}

	public enum WeatherRequestMapType {
		LOCAL_RADAR_ANIMATION, US_RADAR_SATELLITE, US_RADAR_SATELLITE_ANIMATION, TODAYS_WEATHER_MAP, //
		CURRENT_WIND_CONDITIONS, TODAYS_PRECIP_ACC, DAILY_PRECIP, US_SOIL_MOISTUE, US_CURRENT_TEMPS;

		public static String getValue(WeatherRequestMapType field) {
			if (field == null) {
				return "todaysWeatherMap";
			}
			switch (field) {
			case LOCAL_RADAR_ANIMATION:
				return "localRadarAnimation";
			case US_RADAR_SATELLITE:
				return "usRadarSatellite";
			case TODAYS_WEATHER_MAP:
				return "todaysWeatherMap";
			case CURRENT_WIND_CONDITIONS:
				return "currentWindConditions";
			case TODAYS_PRECIP_ACC:
				return "todaysPrecipitationAccumulation";
			case DAILY_PRECIP:
				return "dailyPrecipitation";
			case US_SOIL_MOISTUE:
				return "usSoilMoisture";
			case US_CURRENT_TEMPS:
				return "usCurrentTemperatures";
			default:
				return "";
			}
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

	@Override
	public Class<Weather> responseType() {
		return Weather.class;
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

		public WeatherRequest build() {
			return new WeatherRequest(this);
		}
	}

}
