package com.barchart.ondemand.api.responses;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.barchart.ondemand.api.responses.Rating.RatingType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RatingRecommendation {

	private RatingType type;

	@JsonProperty("current")
	private double current;
	@JsonProperty("one_month_ago")
	private double oneMonthAgo;
	@JsonProperty("two_months_ago")
	private double twoMonthsAgo;
	@JsonProperty("three_months_ago")
	private double threeMonthsAgo;

	public RatingRecommendation() {

	}

	public double getCurrent() {
		return current;
	}

	public double getOneMonthAgo() {
		return oneMonthAgo;
	}

	public double getTwoMonthsAgo() {
		return twoMonthsAgo;
	}

	public double getThreeMonthsAgo() {
		return threeMonthsAgo;
	}

	public RatingType getType() {
		return type;
	}

	public RatingRecommendation setType(final RatingType type) {
		this.type = type;

		return this;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
