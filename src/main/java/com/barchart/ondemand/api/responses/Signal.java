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
@JsonPropertyOrder({ "symbol", "name", "trendspotterOpinion", "adi7DayOpinion", "maHiLo10_8DayOpinion",
		"ma20DaySignal", "macd20_50DaySignal", "bbands20DaySignal", "shortTermAverageSignal",
		"shortTermAveragePercent", "cci40DaySignal", "ma50DaySignal", "macd20_100DaySignal", "parabolic50DaySignal",
		"mediumTermAverageSignal", "mediumTermAveragePercent", "cci60DaySignal", "ma100DaySignal",
		"macd50_100DaySignal", "longTermAverageSignal", "longTermAveragePercent", "overallAverageSignal",
		"overallAveragePercent" })
public class Signal {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("name")
	private String name;
	@JsonProperty("trendspotterOpinion")
	private String trendspotterOpinion;
	@JsonProperty("adi7DayOpinion")
	private String adi7DayOpinion;
	@JsonProperty("maHiLo10_8DayOpinion")
	private String maHiLo10_8DayOpinion;
	@JsonProperty("ma20DaySignal")
	private String ma20DaySignal;
	@JsonProperty("macd20_50DaySignal")
	private String macd20_50DaySignal;
	@JsonProperty("bbands20DaySignal")
	private String bbands20DaySignal;
	@JsonProperty("shortTermAverageSignal")
	private String shortTermAverageSignal;
	@JsonProperty("shortTermAveragePercent")
	private int shortTermAveragePercent;
	@JsonProperty("cci40DaySignal")
	private String cci40DaySignal;
	@JsonProperty("ma50DaySignal")
	private String ma50DaySignal;
	@JsonProperty("macd20_100DaySignal")
	private String macd20_100DaySignal;
	@JsonProperty("parabolic50DaySignal")
	private String parabolic50DaySignal;
	@JsonProperty("mediumTermAverageSignal")
	private String mediumTermAverageSignal;
	@JsonProperty("mediumTermAveragePercent")
	private int mediumTermAveragePercent;
	@JsonProperty("cci60DaySignal")
	private String cci60DaySignal;
	@JsonProperty("ma100DaySignal")
	private String ma100DaySignal;
	@JsonProperty("macd50_100DaySignal")
	private String macd50_100DaySignal;
	@JsonProperty("longTermAverageSignal")
	private String longTermAverageSignal;
	@JsonProperty("longTermAveragePercent")
	private int longTermAveragePercent;
	@JsonProperty("overallAverageSignal")
	private String overallAverageSignal;
	@JsonProperty("overallAveragePercent")
	private int overallAveragePercent;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

	@JsonProperty("trendspotterOpinion")
	public String getTrendspotterOpinion() {
		return trendspotterOpinion;
	}

	@JsonProperty("trendspotterOpinion")
	public void setTrendspotterOpinion(String trendspotterOpinion) {
		this.trendspotterOpinion = trendspotterOpinion;
	}

	@JsonProperty("adi7DayOpinion")
	public String getAdi7DayOpinion() {
		return adi7DayOpinion;
	}

	@JsonProperty("adi7DayOpinion")
	public void setAdi7DayOpinion(String adi7DayOpinion) {
		this.adi7DayOpinion = adi7DayOpinion;
	}

	@JsonProperty("maHiLo10_8DayOpinion")
	public String getMaHiLo10_8DayOpinion() {
		return maHiLo10_8DayOpinion;
	}

	@JsonProperty("maHiLo10_8DayOpinion")
	public void setMaHiLo10_8DayOpinion(String maHiLo10_8DayOpinion) {
		this.maHiLo10_8DayOpinion = maHiLo10_8DayOpinion;
	}

	@JsonProperty("ma20DaySignal")
	public String getMa20DaySignal() {
		return ma20DaySignal;
	}

	@JsonProperty("ma20DaySignal")
	public void setMa20DaySignal(String ma20DaySignal) {
		this.ma20DaySignal = ma20DaySignal;
	}

	@JsonProperty("macd20_50DaySignal")
	public String getMacd20_50DaySignal() {
		return macd20_50DaySignal;
	}

	@JsonProperty("macd20_50DaySignal")
	public void setMacd20_50DaySignal(String macd20_50DaySignal) {
		this.macd20_50DaySignal = macd20_50DaySignal;
	}

	@JsonProperty("bbands20DaySignal")
	public String getBbands20DaySignal() {
		return bbands20DaySignal;
	}

	@JsonProperty("bbands20DaySignal")
	public void setBbands20DaySignal(String bbands20DaySignal) {
		this.bbands20DaySignal = bbands20DaySignal;
	}

	@JsonProperty("shortTermAverageSignal")
	public String getShortTermAverageSignal() {
		return shortTermAverageSignal;
	}

	@JsonProperty("shortTermAverageSignal")
	public void setShortTermAverageSignal(String shortTermAverageSignal) {
		this.shortTermAverageSignal = shortTermAverageSignal;
	}

	@JsonProperty("shortTermAveragePercent")
	public int getShortTermAveragePercent() {
		return shortTermAveragePercent;
	}

	@JsonProperty("shortTermAveragePercent")
	public void setShortTermAveragePercent(int shortTermAveragePercent) {
		this.shortTermAveragePercent = shortTermAveragePercent;
	}

	@JsonProperty("cci40DaySignal")
	public String getCci40DaySignal() {
		return cci40DaySignal;
	}

	@JsonProperty("cci40DaySignal")
	public void setCci40DaySignal(String cci40DaySignal) {
		this.cci40DaySignal = cci40DaySignal;
	}

	@JsonProperty("ma50DaySignal")
	public String getMa50DaySignal() {
		return ma50DaySignal;
	}

	@JsonProperty("ma50DaySignal")
	public void setMa50DaySignal(String ma50DaySignal) {
		this.ma50DaySignal = ma50DaySignal;
	}

	@JsonProperty("macd20_100DaySignal")
	public String getMacd20_100DaySignal() {
		return macd20_100DaySignal;
	}

	@JsonProperty("macd20_100DaySignal")
	public void setMacd20_100DaySignal(String macd20_100DaySignal) {
		this.macd20_100DaySignal = macd20_100DaySignal;
	}

	@JsonProperty("parabolic50DaySignal")
	public String getParabolic50DaySignal() {
		return parabolic50DaySignal;
	}

	@JsonProperty("parabolic50DaySignal")
	public void setParabolic50DaySignal(String parabolic50DaySignal) {
		this.parabolic50DaySignal = parabolic50DaySignal;
	}

	@JsonProperty("mediumTermAverageSignal")
	public String getMediumTermAverageSignal() {
		return mediumTermAverageSignal;
	}

	@JsonProperty("mediumTermAverageSignal")
	public void setMediumTermAverageSignal(String mediumTermAverageSignal) {
		this.mediumTermAverageSignal = mediumTermAverageSignal;
	}

	@JsonProperty("mediumTermAveragePercent")
	public int getMediumTermAveragePercent() {
		return mediumTermAveragePercent;
	}

	@JsonProperty("mediumTermAveragePercent")
	public void setMediumTermAveragePercent(int mediumTermAveragePercent) {
		this.mediumTermAveragePercent = mediumTermAveragePercent;
	}

	@JsonProperty("cci60DaySignal")
	public String getCci60DaySignal() {
		return cci60DaySignal;
	}

	@JsonProperty("cci60DaySignal")
	public void setCci60DaySignal(String cci60DaySignal) {
		this.cci60DaySignal = cci60DaySignal;
	}

	@JsonProperty("ma100DaySignal")
	public String getMa100DaySignal() {
		return ma100DaySignal;
	}

	@JsonProperty("ma100DaySignal")
	public void setMa100DaySignal(String ma100DaySignal) {
		this.ma100DaySignal = ma100DaySignal;
	}

	@JsonProperty("macd50_100DaySignal")
	public String getMacd50_100DaySignal() {
		return macd50_100DaySignal;
	}

	@JsonProperty("macd50_100DaySignal")
	public void setMacd50_100DaySignal(String macd50_100DaySignal) {
		this.macd50_100DaySignal = macd50_100DaySignal;
	}

	@JsonProperty("longTermAverageSignal")
	public String getLongTermAverageSignal() {
		return longTermAverageSignal;
	}

	@JsonProperty("longTermAverageSignal")
	public void setLongTermAverageSignal(String longTermAverageSignal) {
		this.longTermAverageSignal = longTermAverageSignal;
	}

	@JsonProperty("longTermAveragePercent")
	public int getLongTermAveragePercent() {
		return longTermAveragePercent;
	}

	@JsonProperty("longTermAveragePercent")
	public void setLongTermAveragePercent(int longTermAveragePercent) {
		this.longTermAveragePercent = longTermAveragePercent;
	}

	@JsonProperty("overallAverageSignal")
	public String getOverallAverageSignal() {
		return overallAverageSignal;
	}

	@JsonProperty("overallAverageSignal")
	public void setOverallAverageSignal(String overallAverageSignal) {
		this.overallAverageSignal = overallAverageSignal;
	}

	@JsonProperty("overallAveragePercent")
	public int getOverallAveragePercent() {
		return overallAveragePercent;
	}

	@JsonProperty("overallAveragePercent")
	public void setOverallAveragePercent(int overallAveragePercent) {
		this.overallAveragePercent = overallAveragePercent;
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
