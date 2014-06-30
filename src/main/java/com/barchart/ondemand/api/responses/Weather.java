package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather extends ResponseBase {

	@JsonProperty("results")
	private final List<WeatherForecast> results = new ArrayList<WeatherForecast>();

	public Collection<WeatherForecast> all() {
		return Collections.unmodifiableCollection(results);
	}

	public WeatherForecast current() {
		if (isEmptyResponse()) {
			return null;
		}

		return results.get(0);
	}
}
