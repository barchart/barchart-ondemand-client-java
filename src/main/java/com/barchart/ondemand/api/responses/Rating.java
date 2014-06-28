package com.barchart.ondemand.api.responses;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.barchart.ondemand.util.JsonUtil;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Rating {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("name")
	private String name;

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	private final Map<RatingType, RatingRecommendation> ratingMap = new LinkedHashMap<RatingType, RatingRecommendation>();

	public enum RatingType {
		AVERAGE, STRONG_BUY, STRONG_SELL, HOLD
	}

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public RatingRecommendation getRatingRecommendation(final RatingType ratingType) {
		return ratingMap.get(ratingType);
	}

	public Collection<RatingRecommendation> getRatingRecommendations() {
		return ratingMap.values();
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

		if (name.equalsIgnoreCase("averageRecommendation")) {
			ratingMap.put(RatingType.AVERAGE, JsonUtil.fromJson(RatingRecommendation.class, JsonUtil.intoJson(value))
					.setType(RatingType.AVERAGE));
		} else if (name.equalsIgnoreCase("strongBuy")) {
			ratingMap.put(RatingType.STRONG_BUY, JsonUtil
					.fromJson(RatingRecommendation.class, JsonUtil.intoJson(value)).setType(RatingType.STRONG_BUY));
		} else if (name.equalsIgnoreCase("hold")) {
			ratingMap.put(RatingType.HOLD, JsonUtil.fromJson(RatingRecommendation.class, JsonUtil.intoJson(value))
					.setType(RatingType.HOLD));
		} else if (name.equalsIgnoreCase("strongSell")) {
			ratingMap.put(
					RatingType.STRONG_SELL,
					JsonUtil.fromJson(RatingRecommendation.class, JsonUtil.intoJson(value)).setType(
							RatingType.STRONG_SELL));
		}

		this.additionalProperties.put(name, value);
	}

}
