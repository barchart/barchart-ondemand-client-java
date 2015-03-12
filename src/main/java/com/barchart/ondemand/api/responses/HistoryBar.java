package com.barchart.ondemand.api.responses;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "symbol", "timestamp", "tradingDay", "open", "high", "low", "close", "volume" })
public class HistoryBar {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("timestamp")
	private String timestamp;
	@JsonProperty("tradingDay")
	private String tradingDay;
	@JsonProperty("open")
	private double open;
	@JsonProperty("high")
	private double high;
	@JsonProperty("low")
	private double low;
	@JsonProperty("close")
	private double close;
	@JsonProperty("volume")
	private int volume;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("timestamp")
	public String getTimestamp() {
		return timestamp;
	}

	@JsonProperty("timestamp")
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@JsonProperty("tradingDay")
	public String getTradingDay() {
		return tradingDay;
	}

	@JsonProperty("tradingDay")
	public void setTradingDay(String tradingDay) {
		this.tradingDay = tradingDay;
	}

	@JsonProperty("open")
	public double getOpen() {
		return open;
	}

	@JsonProperty("open")
	public void setOpen(double open) {
		this.open = open;
	}

	@JsonProperty("high")
	public double getHigh() {
		return high;
	}

	@JsonProperty("high")
	public void setHigh(double high) {
		this.high = high;
	}

	@JsonProperty("low")
	public double getLow() {
		return low;
	}

	@JsonProperty("low")
	public void setLow(double low) {
		this.low = low;
	}

	@JsonProperty("close")
	public double getClose() {
		return close;
	}

	@JsonProperty("close")
	public void setClose(double close) {
		this.close = close;
	}

	@JsonProperty("volume")
	public int getVolume() {
		return volume;
	}

	@JsonProperty("volume")
	public void setVolume(int volume) {
		this.volume = volume;
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