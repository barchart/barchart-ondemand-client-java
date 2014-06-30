package com.barchart.ondemand.api.responses;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "weatherType", "zipCode", "location", "currentCondition", "currentConditionIcon",
		"currentTemperature", "currentPressure", "feelsLike", "windDirection", "windSpeed", "humidity", "dewpoint",
		"forcastedPrecipitation", "mapRegion", "mapType", "mapUrl" })
public class WeatherForecast {

	@JsonProperty("weatherType")
	private String weatherType;
	@JsonProperty("zipCode")
	private String zipCode;
	@JsonProperty("location")
	private String location;
	@JsonProperty("currentCondition")
	private String currentCondition;
	@JsonProperty("currentConditionIcon")
	private String currentConditionIcon;
	@JsonProperty("currentTemperature")
	private String currentTemperature;
	@JsonProperty("currentPressure")
	private String currentPressure;
	@JsonProperty("feelsLike")
	private String feelsLike;
	@JsonProperty("windDirection")
	private String windDirection;
	@JsonProperty("windSpeed")
	private String windSpeed;
	@JsonProperty("humidity")
	private String humidity;
	@JsonProperty("dewpoint")
	private String dewpoint;
	@JsonProperty("forcastedPrecipitation")
	private Object forcastedPrecipitation;
	@JsonProperty("mapRegion")
	private Object mapRegion;
	@JsonProperty("mapType")
	private String mapType;
	@JsonProperty("mapUrl")
	private String mapUrl;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("weatherType")
	public String getWeatherType() {
		return weatherType;
	}

	@JsonProperty("weatherType")
	public void setWeatherType(String weatherType) {
		this.weatherType = weatherType;
	}

	@JsonProperty("zipCode")
	public String getZipCode() {
		return zipCode;
	}

	@JsonProperty("zipCode")
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@JsonProperty("location")
	public String getLocation() {
		return location;
	}

	@JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}

	@JsonProperty("currentCondition")
	public String getCurrentCondition() {
		return currentCondition;
	}

	@JsonProperty("currentCondition")
	public void setCurrentCondition(String currentCondition) {
		this.currentCondition = currentCondition;
	}

	@JsonProperty("currentConditionIcon")
	public String getCurrentConditionIcon() {
		return currentConditionIcon;
	}

	@JsonProperty("currentConditionIcon")
	public void setCurrentConditionIcon(String currentConditionIcon) {
		this.currentConditionIcon = currentConditionIcon;
	}

	@JsonProperty("currentTemperature")
	public String getCurrentTemperature() {
		return currentTemperature;
	}

	@JsonProperty("currentTemperature")
	public void setCurrentTemperature(String currentTemperature) {
		this.currentTemperature = currentTemperature;
	}

	@JsonProperty("currentPressure")
	public String getCurrentPressure() {
		return currentPressure;
	}

	@JsonProperty("currentPressure")
	public void setCurrentPressure(String currentPressure) {
		this.currentPressure = currentPressure;
	}

	@JsonProperty("feelsLike")
	public String getFeelsLike() {
		return feelsLike;
	}

	@JsonProperty("feelsLike")
	public void setFeelsLike(String feelsLike) {
		this.feelsLike = feelsLike;
	}

	@JsonProperty("windDirection")
	public String getWindDirection() {
		return windDirection;
	}

	@JsonProperty("windDirection")
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	@JsonProperty("windSpeed")
	public String getWindSpeed() {
		return windSpeed;
	}

	@JsonProperty("windSpeed")
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

	@JsonProperty("humidity")
	public String getHumidity() {
		return humidity;
	}

	@JsonProperty("humidity")
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	@JsonProperty("dewpoint")
	public String getDewpoint() {
		return dewpoint;
	}

	@JsonProperty("dewpoint")
	public void setDewpoint(String dewpoint) {
		this.dewpoint = dewpoint;
	}

	@JsonProperty("forcastedPrecipitation")
	public Object getForcastedPrecipitation() {
		return forcastedPrecipitation;
	}

	@JsonProperty("forcastedPrecipitation")
	public void setForcastedPrecipitation(Object forcastedPrecipitation) {
		this.forcastedPrecipitation = forcastedPrecipitation;
	}

	@JsonProperty("mapRegion")
	public Object getMapRegion() {
		return mapRegion;
	}

	@JsonProperty("mapRegion")
	public void setMapRegion(Object mapRegion) {
		this.mapRegion = mapRegion;
	}

	@JsonProperty("mapType")
	public String getMapType() {
		return mapType;
	}

	@JsonProperty("mapType")
	public void setMapType(String mapType) {
		this.mapType = mapType;
	}

	@JsonProperty("mapUrl")
	public String getMapUrl() {
		return mapUrl;
	}

	@JsonProperty("mapUrl")
	public void setMapUrl(String mapUrl) {
		this.mapUrl = mapUrl;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
