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
@JsonPropertyOrder({ "symbol", "symbolName", "exchange", "country", "sicSector", "industry", "subIndustry",
		"timestamp", "lastPrice", "priceNetChange", "pricePercentChange", "previousClose", "volume", "previousVolume",
		"standardDeviation" })
public class Leader {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("symbolName")
	private String symbolName;
	@JsonProperty("exchange")
	private String exchange;
	@JsonProperty("country")
	private String country;
	@JsonProperty("sicSector")
	private String sicSector;
	@JsonProperty("industry")
	private String industry;
	@JsonProperty("subIndustry")
	private String subIndustry;
	@JsonProperty("timestamp")
	private String timestamp;
	@JsonProperty("lastPrice")
	private double lastPrice;
	@JsonProperty("priceNetChange")
	private double priceNetChange;
	@JsonProperty("pricePercentChange")
	private double pricePercentChange;
	@JsonProperty("previousClose")
	private double previousClose;
	@JsonProperty("volume")
	private long volume;
	@JsonProperty("previousVolume")
	private long previousVolume;
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

	@JsonProperty("symbolName")
	public String getSymbolName() {
		return symbolName;
	}

	@JsonProperty("symbolName")
	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

	@JsonProperty("exchange")
	public String getExchange() {
		return exchange;
	}

	@JsonProperty("exchange")
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("sicSector")
	public String getSicSector() {
		return sicSector;
	}

	@JsonProperty("sicSector")
	public void setSicSector(String sicSector) {
		this.sicSector = sicSector;
	}

	@JsonProperty("industry")
	public String getIndustry() {
		return industry;
	}

	@JsonProperty("industry")
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	@JsonProperty("subIndustry")
	public String getSubIndustry() {
		return subIndustry;
	}

	@JsonProperty("subIndustry")
	public void setSubIndustry(String subIndustry) {
		this.subIndustry = subIndustry;
	}

	@JsonProperty("timestamp")
	public String getTimestamp() {
		return timestamp;
	}

	@JsonProperty("timestamp")
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@JsonProperty("lastPrice")
	public double getLastPrice() {
		return lastPrice;
	}

	@JsonProperty("lastPrice")
	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}

	@JsonProperty("priceNetChange")
	public double getPriceNetChange() {
		return priceNetChange;
	}

	@JsonProperty("priceNetChange")
	public void setPriceNetChange(double priceNetChange) {
		this.priceNetChange = priceNetChange;
	}

	@JsonProperty("pricePercentChange")
	public double getPricePercentChange() {
		return pricePercentChange;
	}

	@JsonProperty("pricePercentChange")
	public void setPricePercentChange(double pricePercentChange) {
		this.pricePercentChange = pricePercentChange;
	}

	@JsonProperty("previousClose")
	public double getPreviousClose() {
		return previousClose;
	}

	@JsonProperty("previousClose")
	public void setPreviousClose(double previousClose) {
		this.previousClose = previousClose;
	}

	@JsonProperty("volume")
	public long getVolume() {
		return volume;
	}

	@JsonProperty("volume")
	public void setVolume(long volume) {
		this.volume = volume;
	}

	@JsonProperty("previousVolume")
	public long getPreviousVolume() {
		return previousVolume;
	}

	@JsonProperty("previousVolume")
	public void setPreviousVolume(long previousVolume) {
		this.previousVolume = previousVolume;
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
