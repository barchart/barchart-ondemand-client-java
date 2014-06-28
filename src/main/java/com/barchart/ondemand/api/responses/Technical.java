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
@JsonPropertyOrder({ "symbol", "movingAverageFiveDay", "movingAverageTwentyDay", "movingAverageFiftyDay",
		"movingAverageOneHundredDay", "movingAverageTwoHundredDay", "movingAverageYTD", "priceChangeFiveDay",
		"priceChangeTwentyDay", "priceChangeFiftyDay", "priceChangeOneHundredDay", "priceChangeTwoHundredDay",
		"priceChangeYTD", "percentChangeFiveDay", "percentChangeTwentyDay", "percentChangeFiftyDay",
		"percentChangeOneHundredDay", "percentChangeTwoHundredDay", "percentChangeYTD", "averageVolumeFiveDay",
		"averageVolumeTwentyDay", "averageVolumeFiftyDay", "averageVolumeOneHundredDay", "averageVolumeTwoHundredDay",
		"averageVolumeYTD", "nineDayRawStochastic", "fourteenDayRawStochastic", "twentyDayRawStochastic",
		"fiftyDayRawStochastic", "oneHundredDayRawStochastic", "nineDayStochasticK", "fourteenDayStochasticK",
		"twentyDayStochasticK", "fiftyDayStochasticK", "oneHundredDayStochasticK", "nineDayStochasticD",
		"fourteenDayStochasticD", "twentyDayStochasticD", "fiftyDayStochasticD", "oneHundredDayStochasticD",
		"nineDayATR", "fourteenDayATR", "twentyDayATR", "fiftyDayATR", "oneHundredDayATR", "nineDayRelativeStrength",
		"fourteenDayRelativeStrength", "twentyDayRelativeStrength", "fiftyDayRelativeStrength",
		"oneHundredDayRelativeStrength", "nineDayPercentR", "fourteenDayPercentR", "twentyDayPercentR",
		"fiftyDayPercentR", "oneHundredDayPercentR", "nineDayHistoricVolatility", "fourteenDayHistoricVolatility",
		"twentyDayHistoricVolatility", "fiftyDayHistoricVolatility", "oneHundredDayHistoricVolatility", "nineDayMACD",
		"fourteenDayMACD", "twentyDayMACD", "fiftyDayMACD", "oneHundredDayMACD", "standardDeviation" })
public class Technical {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("movingAverageFiveDay")
	private double movingAverageFiveDay;
	@JsonProperty("movingAverageTwentyDay")
	private double movingAverageTwentyDay;
	@JsonProperty("movingAverageFiftyDay")
	private double movingAverageFiftyDay;
	@JsonProperty("movingAverageOneHundredDay")
	private double movingAverageOneHundredDay;
	@JsonProperty("movingAverageTwoHundredDay")
	private double movingAverageTwoHundredDay;
	@JsonProperty("movingAverageYTD")
	private double movingAverageYTD;
	@JsonProperty("priceChangeFiveDay")
	private double priceChangeFiveDay;
	@JsonProperty("priceChangeTwentyDay")
	private double priceChangeTwentyDay;
	@JsonProperty("priceChangeFiftyDay")
	private double priceChangeFiftyDay;
	@JsonProperty("priceChangeOneHundredDay")
	private double priceChangeOneHundredDay;
	@JsonProperty("priceChangeTwoHundredDay")
	private double priceChangeTwoHundredDay;
	@JsonProperty("priceChangeYTD")
	private double priceChangeYTD;
	@JsonProperty("percentChangeFiveDay")
	private double percentChangeFiveDay;
	@JsonProperty("percentChangeTwentyDay")
	private double percentChangeTwentyDay;
	@JsonProperty("percentChangeFiftyDay")
	private double percentChangeFiftyDay;
	@JsonProperty("percentChangeOneHundredDay")
	private double percentChangeOneHundredDay;
	@JsonProperty("percentChangeTwoHundredDay")
	private double percentChangeTwoHundredDay;
	@JsonProperty("percentChangeYTD")
	private double percentChangeYTD;
	@JsonProperty("averageVolumeFiveDay")
	private int averageVolumeFiveDay;
	@JsonProperty("averageVolumeTwentyDay")
	private int averageVolumeTwentyDay;
	@JsonProperty("averageVolumeFiftyDay")
	private int averageVolumeFiftyDay;
	@JsonProperty("averageVolumeOneHundredDay")
	private int averageVolumeOneHundredDay;
	@JsonProperty("averageVolumeTwoHundredDay")
	private int averageVolumeTwoHundredDay;
	@JsonProperty("averageVolumeYTD")
	private int averageVolumeYTD;
	@JsonProperty("nineDayRawStochastic")
	private double nineDayRawStochastic;
	@JsonProperty("fourteenDayRawStochastic")
	private double fourteenDayRawStochastic;
	@JsonProperty("twentyDayRawStochastic")
	private double twentyDayRawStochastic;
	@JsonProperty("fiftyDayRawStochastic")
	private double fiftyDayRawStochastic;
	@JsonProperty("oneHundredDayRawStochastic")
	private double oneHundredDayRawStochastic;
	@JsonProperty("nineDayStochasticK")
	private double nineDayStochasticK;
	@JsonProperty("fourteenDayStochasticK")
	private double fourteenDayStochasticK;
	@JsonProperty("twentyDayStochasticK")
	private Object twentyDayStochasticK;
	@JsonProperty("fiftyDayStochasticK")
	private double fiftyDayStochasticK;
	@JsonProperty("oneHundredDayStochasticK")
	private double oneHundredDayStochasticK;
	@JsonProperty("nineDayStochasticD")
	private double nineDayStochasticD;
	@JsonProperty("fourteenDayStochasticD")
	private double fourteenDayStochasticD;
	@JsonProperty("twentyDayStochasticD")
	private double twentyDayStochasticD;
	@JsonProperty("fiftyDayStochasticD")
	private double fiftyDayStochasticD;
	@JsonProperty("oneHundredDayStochasticD")
	private double oneHundredDayStochasticD;
	@JsonProperty("nineDayATR")
	private double nineDayATR;
	@JsonProperty("fourteenDayATR")
	private double fourteenDayATR;
	@JsonProperty("twentyDayATR")
	private double twentyDayATR;
	@JsonProperty("fiftyDayATR")
	private double fiftyDayATR;
	@JsonProperty("oneHundredDayATR")
	private double oneHundredDayATR;
	@JsonProperty("nineDayRelativeStrength")
	private double nineDayRelativeStrength;
	@JsonProperty("fourteenDayRelativeStrength")
	private double fourteenDayRelativeStrength;
	@JsonProperty("twentyDayRelativeStrength")
	private double twentyDayRelativeStrength;
	@JsonProperty("fiftyDayRelativeStrength")
	private double fiftyDayRelativeStrength;
	@JsonProperty("oneHundredDayRelativeStrength")
	private double oneHundredDayRelativeStrength;
	@JsonProperty("nineDayPercentR")
	private double nineDayPercentR;
	@JsonProperty("fourteenDayPercentR")
	private double fourteenDayPercentR;
	@JsonProperty("twentyDayPercentR")
	private double twentyDayPercentR;
	@JsonProperty("fiftyDayPercentR")
	private double fiftyDayPercentR;
	@JsonProperty("oneHundredDayPercentR")
	private double oneHundredDayPercentR;
	@JsonProperty("nineDayHistoricVolatility")
	private double nineDayHistoricVolatility;
	@JsonProperty("fourteenDayHistoricVolatility")
	private double fourteenDayHistoricVolatility;
	@JsonProperty("twentyDayHistoricVolatility")
	private double twentyDayHistoricVolatility;
	@JsonProperty("fiftyDayHistoricVolatility")
	private double fiftyDayHistoricVolatility;
	@JsonProperty("oneHundredDayHistoricVolatility")
	private double oneHundredDayHistoricVolatility;
	@JsonProperty("nineDayMACD")
	private double nineDayMACD;
	@JsonProperty("fourteenDayMACD")
	private double fourteenDayMACD;
	@JsonProperty("twentyDayMACD")
	private double twentyDayMACD;
	@JsonProperty("fiftyDayMACD")
	private double fiftyDayMACD;
	@JsonProperty("oneHundredDayMACD")
	private double oneHundredDayMACD;
	@JsonProperty("standardDeviation")
	private double standardDeviation;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("movingAverageFiveDay")
	public double getMovingAverageFiveDay() {
		return movingAverageFiveDay;
	}

	@JsonProperty("movingAverageFiveDay")
	public void setMovingAverageFiveDay(double movingAverageFiveDay) {
		this.movingAverageFiveDay = movingAverageFiveDay;
	}

	@JsonProperty("movingAverageTwentyDay")
	public double getMovingAverageTwentyDay() {
		return movingAverageTwentyDay;
	}

	@JsonProperty("movingAverageTwentyDay")
	public void setMovingAverageTwentyDay(double movingAverageTwentyDay) {
		this.movingAverageTwentyDay = movingAverageTwentyDay;
	}

	@JsonProperty("movingAverageFiftyDay")
	public double getMovingAverageFiftyDay() {
		return movingAverageFiftyDay;
	}

	@JsonProperty("movingAverageFiftyDay")
	public void setMovingAverageFiftyDay(double movingAverageFiftyDay) {
		this.movingAverageFiftyDay = movingAverageFiftyDay;
	}

	@JsonProperty("movingAverageOneHundredDay")
	public double getMovingAverageOneHundredDay() {
		return movingAverageOneHundredDay;
	}

	@JsonProperty("movingAverageOneHundredDay")
	public void setMovingAverageOneHundredDay(double movingAverageOneHundredDay) {
		this.movingAverageOneHundredDay = movingAverageOneHundredDay;
	}

	@JsonProperty("movingAverageTwoHundredDay")
	public double getMovingAverageTwoHundredDay() {
		return movingAverageTwoHundredDay;
	}

	@JsonProperty("movingAverageTwoHundredDay")
	public void setMovingAverageTwoHundredDay(double movingAverageTwoHundredDay) {
		this.movingAverageTwoHundredDay = movingAverageTwoHundredDay;
	}

	@JsonProperty("movingAverageYTD")
	public double getMovingAverageYTD() {
		return movingAverageYTD;
	}

	@JsonProperty("movingAverageYTD")
	public void setMovingAverageYTD(double movingAverageYTD) {
		this.movingAverageYTD = movingAverageYTD;
	}

	@JsonProperty("priceChangeFiveDay")
	public double getPriceChangeFiveDay() {
		return priceChangeFiveDay;
	}

	@JsonProperty("priceChangeFiveDay")
	public void setPriceChangeFiveDay(double priceChangeFiveDay) {
		this.priceChangeFiveDay = priceChangeFiveDay;
	}

	@JsonProperty("priceChangeTwentyDay")
	public double getPriceChangeTwentyDay() {
		return priceChangeTwentyDay;
	}

	@JsonProperty("priceChangeTwentyDay")
	public void setPriceChangeTwentyDay(double priceChangeTwentyDay) {
		this.priceChangeTwentyDay = priceChangeTwentyDay;
	}

	@JsonProperty("priceChangeFiftyDay")
	public double getPriceChangeFiftyDay() {
		return priceChangeFiftyDay;
	}

	@JsonProperty("priceChangeFiftyDay")
	public void setPriceChangeFiftyDay(double priceChangeFiftyDay) {
		this.priceChangeFiftyDay = priceChangeFiftyDay;
	}

	@JsonProperty("priceChangeOneHundredDay")
	public double getPriceChangeOneHundredDay() {
		return priceChangeOneHundredDay;
	}

	@JsonProperty("priceChangeOneHundredDay")
	public void setPriceChangeOneHundredDay(double priceChangeOneHundredDay) {
		this.priceChangeOneHundredDay = priceChangeOneHundredDay;
	}

	@JsonProperty("priceChangeTwoHundredDay")
	public double getPriceChangeTwoHundredDay() {
		return priceChangeTwoHundredDay;
	}

	@JsonProperty("priceChangeTwoHundredDay")
	public void setPriceChangeTwoHundredDay(double priceChangeTwoHundredDay) {
		this.priceChangeTwoHundredDay = priceChangeTwoHundredDay;
	}

	@JsonProperty("priceChangeYTD")
	public double getPriceChangeYTD() {
		return priceChangeYTD;
	}

	@JsonProperty("priceChangeYTD")
	public void setPriceChangeYTD(double priceChangeYTD) {
		this.priceChangeYTD = priceChangeYTD;
	}

	@JsonProperty("percentChangeFiveDay")
	public double getPercentChangeFiveDay() {
		return percentChangeFiveDay;
	}

	@JsonProperty("percentChangeFiveDay")
	public void setPercentChangeFiveDay(double percentChangeFiveDay) {
		this.percentChangeFiveDay = percentChangeFiveDay;
	}

	@JsonProperty("percentChangeTwentyDay")
	public double getPercentChangeTwentyDay() {
		return percentChangeTwentyDay;
	}

	@JsonProperty("percentChangeTwentyDay")
	public void setPercentChangeTwentyDay(double percentChangeTwentyDay) {
		this.percentChangeTwentyDay = percentChangeTwentyDay;
	}

	@JsonProperty("percentChangeFiftyDay")
	public double getPercentChangeFiftyDay() {
		return percentChangeFiftyDay;
	}

	@JsonProperty("percentChangeFiftyDay")
	public void setPercentChangeFiftyDay(double percentChangeFiftyDay) {
		this.percentChangeFiftyDay = percentChangeFiftyDay;
	}

	@JsonProperty("percentChangeOneHundredDay")
	public double getPercentChangeOneHundredDay() {
		return percentChangeOneHundredDay;
	}

	@JsonProperty("percentChangeOneHundredDay")
	public void setPercentChangeOneHundredDay(double percentChangeOneHundredDay) {
		this.percentChangeOneHundredDay = percentChangeOneHundredDay;
	}

	@JsonProperty("percentChangeTwoHundredDay")
	public double getPercentChangeTwoHundredDay() {
		return percentChangeTwoHundredDay;
	}

	@JsonProperty("percentChangeTwoHundredDay")
	public void setPercentChangeTwoHundredDay(double percentChangeTwoHundredDay) {
		this.percentChangeTwoHundredDay = percentChangeTwoHundredDay;
	}

	@JsonProperty("percentChangeYTD")
	public double getPercentChangeYTD() {
		return percentChangeYTD;
	}

	@JsonProperty("percentChangeYTD")
	public void setPercentChangeYTD(double percentChangeYTD) {
		this.percentChangeYTD = percentChangeYTD;
	}

	@JsonProperty("averageVolumeFiveDay")
	public int getAverageVolumeFiveDay() {
		return averageVolumeFiveDay;
	}

	@JsonProperty("averageVolumeFiveDay")
	public void setAverageVolumeFiveDay(int averageVolumeFiveDay) {
		this.averageVolumeFiveDay = averageVolumeFiveDay;
	}

	@JsonProperty("averageVolumeTwentyDay")
	public int getAverageVolumeTwentyDay() {
		return averageVolumeTwentyDay;
	}

	@JsonProperty("averageVolumeTwentyDay")
	public void setAverageVolumeTwentyDay(int averageVolumeTwentyDay) {
		this.averageVolumeTwentyDay = averageVolumeTwentyDay;
	}

	@JsonProperty("averageVolumeFiftyDay")
	public int getAverageVolumeFiftyDay() {
		return averageVolumeFiftyDay;
	}

	@JsonProperty("averageVolumeFiftyDay")
	public void setAverageVolumeFiftyDay(int averageVolumeFiftyDay) {
		this.averageVolumeFiftyDay = averageVolumeFiftyDay;
	}

	@JsonProperty("averageVolumeOneHundredDay")
	public int getAverageVolumeOneHundredDay() {
		return averageVolumeOneHundredDay;
	}

	@JsonProperty("averageVolumeOneHundredDay")
	public void setAverageVolumeOneHundredDay(int averageVolumeOneHundredDay) {
		this.averageVolumeOneHundredDay = averageVolumeOneHundredDay;
	}

	@JsonProperty("averageVolumeTwoHundredDay")
	public int getAverageVolumeTwoHundredDay() {
		return averageVolumeTwoHundredDay;
	}

	@JsonProperty("averageVolumeTwoHundredDay")
	public void setAverageVolumeTwoHundredDay(int averageVolumeTwoHundredDay) {
		this.averageVolumeTwoHundredDay = averageVolumeTwoHundredDay;
	}

	@JsonProperty("averageVolumeYTD")
	public int getAverageVolumeYTD() {
		return averageVolumeYTD;
	}

	@JsonProperty("averageVolumeYTD")
	public void setAverageVolumeYTD(int averageVolumeYTD) {
		this.averageVolumeYTD = averageVolumeYTD;
	}

	@JsonProperty("nineDayRawStochastic")
	public double getNineDayRawStochastic() {
		return nineDayRawStochastic;
	}

	@JsonProperty("nineDayRawStochastic")
	public void setNineDayRawStochastic(double nineDayRawStochastic) {
		this.nineDayRawStochastic = nineDayRawStochastic;
	}

	@JsonProperty("fourteenDayRawStochastic")
	public double getFourteenDayRawStochastic() {
		return fourteenDayRawStochastic;
	}

	@JsonProperty("fourteenDayRawStochastic")
	public void setFourteenDayRawStochastic(double fourteenDayRawStochastic) {
		this.fourteenDayRawStochastic = fourteenDayRawStochastic;
	}

	@JsonProperty("twentyDayRawStochastic")
	public double getTwentyDayRawStochastic() {
		return twentyDayRawStochastic;
	}

	@JsonProperty("twentyDayRawStochastic")
	public void setTwentyDayRawStochastic(double twentyDayRawStochastic) {
		this.twentyDayRawStochastic = twentyDayRawStochastic;
	}

	@JsonProperty("fiftyDayRawStochastic")
	public double getFiftyDayRawStochastic() {
		return fiftyDayRawStochastic;
	}

	@JsonProperty("fiftyDayRawStochastic")
	public void setFiftyDayRawStochastic(double fiftyDayRawStochastic) {
		this.fiftyDayRawStochastic = fiftyDayRawStochastic;
	}

	@JsonProperty("oneHundredDayRawStochastic")
	public double getOneHundredDayRawStochastic() {
		return oneHundredDayRawStochastic;
	}

	@JsonProperty("oneHundredDayRawStochastic")
	public void setOneHundredDayRawStochastic(double oneHundredDayRawStochastic) {
		this.oneHundredDayRawStochastic = oneHundredDayRawStochastic;
	}

	@JsonProperty("nineDayStochasticK")
	public double getNineDayStochasticK() {
		return nineDayStochasticK;
	}

	@JsonProperty("nineDayStochasticK")
	public void setNineDayStochasticK(double nineDayStochasticK) {
		this.nineDayStochasticK = nineDayStochasticK;
	}

	@JsonProperty("fourteenDayStochasticK")
	public double getFourteenDayStochasticK() {
		return fourteenDayStochasticK;
	}

	@JsonProperty("fourteenDayStochasticK")
	public void setFourteenDayStochasticK(double fourteenDayStochasticK) {
		this.fourteenDayStochasticK = fourteenDayStochasticK;
	}

	@JsonProperty("twentyDayStochasticK")
	public Object getTwentyDayStochasticK() {
		return twentyDayStochasticK;
	}

	@JsonProperty("twentyDayStochasticK")
	public void setTwentyDayStochasticK(Object twentyDayStochasticK) {
		this.twentyDayStochasticK = twentyDayStochasticK;
	}

	@JsonProperty("fiftyDayStochasticK")
	public double getFiftyDayStochasticK() {
		return fiftyDayStochasticK;
	}

	@JsonProperty("fiftyDayStochasticK")
	public void setFiftyDayStochasticK(double fiftyDayStochasticK) {
		this.fiftyDayStochasticK = fiftyDayStochasticK;
	}

	@JsonProperty("oneHundredDayStochasticK")
	public double getOneHundredDayStochasticK() {
		return oneHundredDayStochasticK;
	}

	@JsonProperty("oneHundredDayStochasticK")
	public void setOneHundredDayStochasticK(double oneHundredDayStochasticK) {
		this.oneHundredDayStochasticK = oneHundredDayStochasticK;
	}

	@JsonProperty("nineDayStochasticD")
	public double getNineDayStochasticD() {
		return nineDayStochasticD;
	}

	@JsonProperty("nineDayStochasticD")
	public void setNineDayStochasticD(double nineDayStochasticD) {
		this.nineDayStochasticD = nineDayStochasticD;
	}

	@JsonProperty("fourteenDayStochasticD")
	public double getFourteenDayStochasticD() {
		return fourteenDayStochasticD;
	}

	@JsonProperty("fourteenDayStochasticD")
	public void setFourteenDayStochasticD(double fourteenDayStochasticD) {
		this.fourteenDayStochasticD = fourteenDayStochasticD;
	}

	@JsonProperty("twentyDayStochasticD")
	public double getTwentyDayStochasticD() {
		return twentyDayStochasticD;
	}

	@JsonProperty("twentyDayStochasticD")
	public void setTwentyDayStochasticD(double twentyDayStochasticD) {
		this.twentyDayStochasticD = twentyDayStochasticD;
	}

	@JsonProperty("fiftyDayStochasticD")
	public double getFiftyDayStochasticD() {
		return fiftyDayStochasticD;
	}

	@JsonProperty("fiftyDayStochasticD")
	public void setFiftyDayStochasticD(double fiftyDayStochasticD) {
		this.fiftyDayStochasticD = fiftyDayStochasticD;
	}

	@JsonProperty("oneHundredDayStochasticD")
	public double getOneHundredDayStochasticD() {
		return oneHundredDayStochasticD;
	}

	@JsonProperty("oneHundredDayStochasticD")
	public void setOneHundredDayStochasticD(double oneHundredDayStochasticD) {
		this.oneHundredDayStochasticD = oneHundredDayStochasticD;
	}

	@JsonProperty("nineDayATR")
	public double getNineDayATR() {
		return nineDayATR;
	}

	@JsonProperty("nineDayATR")
	public void setNineDayATR(double nineDayATR) {
		this.nineDayATR = nineDayATR;
	}

	@JsonProperty("fourteenDayATR")
	public double getFourteenDayATR() {
		return fourteenDayATR;
	}

	@JsonProperty("fourteenDayATR")
	public void setFourteenDayATR(double fourteenDayATR) {
		this.fourteenDayATR = fourteenDayATR;
	}

	@JsonProperty("twentyDayATR")
	public double getTwentyDayATR() {
		return twentyDayATR;
	}

	@JsonProperty("twentyDayATR")
	public void setTwentyDayATR(double twentyDayATR) {
		this.twentyDayATR = twentyDayATR;
	}

	@JsonProperty("fiftyDayATR")
	public double getFiftyDayATR() {
		return fiftyDayATR;
	}

	@JsonProperty("fiftyDayATR")
	public void setFiftyDayATR(double fiftyDayATR) {
		this.fiftyDayATR = fiftyDayATR;
	}

	@JsonProperty("oneHundredDayATR")
	public double getOneHundredDayATR() {
		return oneHundredDayATR;
	}

	@JsonProperty("oneHundredDayATR")
	public void setOneHundredDayATR(double oneHundredDayATR) {
		this.oneHundredDayATR = oneHundredDayATR;
	}

	@JsonProperty("nineDayRelativeStrength")
	public double getNineDayRelativeStrength() {
		return nineDayRelativeStrength;
	}

	@JsonProperty("nineDayRelativeStrength")
	public void setNineDayRelativeStrength(double nineDayRelativeStrength) {
		this.nineDayRelativeStrength = nineDayRelativeStrength;
	}

	@JsonProperty("fourteenDayRelativeStrength")
	public double getFourteenDayRelativeStrength() {
		return fourteenDayRelativeStrength;
	}

	@JsonProperty("fourteenDayRelativeStrength")
	public void setFourteenDayRelativeStrength(double fourteenDayRelativeStrength) {
		this.fourteenDayRelativeStrength = fourteenDayRelativeStrength;
	}

	@JsonProperty("twentyDayRelativeStrength")
	public double getTwentyDayRelativeStrength() {
		return twentyDayRelativeStrength;
	}

	@JsonProperty("twentyDayRelativeStrength")
	public void setTwentyDayRelativeStrength(double twentyDayRelativeStrength) {
		this.twentyDayRelativeStrength = twentyDayRelativeStrength;
	}

	@JsonProperty("fiftyDayRelativeStrength")
	public double getFiftyDayRelativeStrength() {
		return fiftyDayRelativeStrength;
	}

	@JsonProperty("fiftyDayRelativeStrength")
	public void setFiftyDayRelativeStrength(double fiftyDayRelativeStrength) {
		this.fiftyDayRelativeStrength = fiftyDayRelativeStrength;
	}

	@JsonProperty("oneHundredDayRelativeStrength")
	public double getOneHundredDayRelativeStrength() {
		return oneHundredDayRelativeStrength;
	}

	@JsonProperty("oneHundredDayRelativeStrength")
	public void setOneHundredDayRelativeStrength(double oneHundredDayRelativeStrength) {
		this.oneHundredDayRelativeStrength = oneHundredDayRelativeStrength;
	}

	@JsonProperty("nineDayPercentR")
	public double getNineDayPercentR() {
		return nineDayPercentR;
	}

	@JsonProperty("nineDayPercentR")
	public void setNineDayPercentR(double nineDayPercentR) {
		this.nineDayPercentR = nineDayPercentR;
	}

	@JsonProperty("fourteenDayPercentR")
	public double getFourteenDayPercentR() {
		return fourteenDayPercentR;
	}

	@JsonProperty("fourteenDayPercentR")
	public void setFourteenDayPercentR(double fourteenDayPercentR) {
		this.fourteenDayPercentR = fourteenDayPercentR;
	}

	@JsonProperty("twentyDayPercentR")
	public double getTwentyDayPercentR() {
		return twentyDayPercentR;
	}

	@JsonProperty("twentyDayPercentR")
	public void setTwentyDayPercentR(double twentyDayPercentR) {
		this.twentyDayPercentR = twentyDayPercentR;
	}

	@JsonProperty("fiftyDayPercentR")
	public double getFiftyDayPercentR() {
		return fiftyDayPercentR;
	}

	@JsonProperty("fiftyDayPercentR")
	public void setFiftyDayPercentR(double fiftyDayPercentR) {
		this.fiftyDayPercentR = fiftyDayPercentR;
	}

	@JsonProperty("oneHundredDayPercentR")
	public double getOneHundredDayPercentR() {
		return oneHundredDayPercentR;
	}

	@JsonProperty("oneHundredDayPercentR")
	public void setOneHundredDayPercentR(double oneHundredDayPercentR) {
		this.oneHundredDayPercentR = oneHundredDayPercentR;
	}

	@JsonProperty("nineDayHistoricVolatility")
	public double getNineDayHistoricVolatility() {
		return nineDayHistoricVolatility;
	}

	@JsonProperty("nineDayHistoricVolatility")
	public void setNineDayHistoricVolatility(double nineDayHistoricVolatility) {
		this.nineDayHistoricVolatility = nineDayHistoricVolatility;
	}

	@JsonProperty("fourteenDayHistoricVolatility")
	public double getFourteenDayHistoricVolatility() {
		return fourteenDayHistoricVolatility;
	}

	@JsonProperty("fourteenDayHistoricVolatility")
	public void setFourteenDayHistoricVolatility(double fourteenDayHistoricVolatility) {
		this.fourteenDayHistoricVolatility = fourteenDayHistoricVolatility;
	}

	@JsonProperty("twentyDayHistoricVolatility")
	public double getTwentyDayHistoricVolatility() {
		return twentyDayHistoricVolatility;
	}

	@JsonProperty("twentyDayHistoricVolatility")
	public void setTwentyDayHistoricVolatility(double twentyDayHistoricVolatility) {
		this.twentyDayHistoricVolatility = twentyDayHistoricVolatility;
	}

	@JsonProperty("fiftyDayHistoricVolatility")
	public double getFiftyDayHistoricVolatility() {
		return fiftyDayHistoricVolatility;
	}

	@JsonProperty("fiftyDayHistoricVolatility")
	public void setFiftyDayHistoricVolatility(double fiftyDayHistoricVolatility) {
		this.fiftyDayHistoricVolatility = fiftyDayHistoricVolatility;
	}

	@JsonProperty("oneHundredDayHistoricVolatility")
	public double getOneHundredDayHistoricVolatility() {
		return oneHundredDayHistoricVolatility;
	}

	@JsonProperty("oneHundredDayHistoricVolatility")
	public void setOneHundredDayHistoricVolatility(double oneHundredDayHistoricVolatility) {
		this.oneHundredDayHistoricVolatility = oneHundredDayHistoricVolatility;
	}

	@JsonProperty("nineDayMACD")
	public double getNineDayMACD() {
		return nineDayMACD;
	}

	@JsonProperty("nineDayMACD")
	public void setNineDayMACD(double nineDayMACD) {
		this.nineDayMACD = nineDayMACD;
	}

	@JsonProperty("fourteenDayMACD")
	public double getFourteenDayMACD() {
		return fourteenDayMACD;
	}

	@JsonProperty("fourteenDayMACD")
	public void setFourteenDayMACD(double fourteenDayMACD) {
		this.fourteenDayMACD = fourteenDayMACD;
	}

	@JsonProperty("twentyDayMACD")
	public double getTwentyDayMACD() {
		return twentyDayMACD;
	}

	@JsonProperty("twentyDayMACD")
	public void setTwentyDayMACD(double twentyDayMACD) {
		this.twentyDayMACD = twentyDayMACD;
	}

	@JsonProperty("fiftyDayMACD")
	public double getFiftyDayMACD() {
		return fiftyDayMACD;
	}

	@JsonProperty("fiftyDayMACD")
	public void setFiftyDayMACD(double fiftyDayMACD) {
		this.fiftyDayMACD = fiftyDayMACD;
	}

	@JsonProperty("oneHundredDayMACD")
	public double getOneHundredDayMACD() {
		return oneHundredDayMACD;
	}

	@JsonProperty("oneHundredDayMACD")
	public void setOneHundredDayMACD(double oneHundredDayMACD) {
		this.oneHundredDayMACD = oneHundredDayMACD;
	}

	@JsonProperty("standardDeviation")
	public double getStandardDeviation() {
		return standardDeviation;
	}

	@JsonProperty("standardDeviation")
	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation;
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
