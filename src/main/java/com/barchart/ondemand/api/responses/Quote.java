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
@JsonPropertyOrder({ "symbol", "name", "dayCode", "serverTimestamp", "mode", "lastPrice", "tradeTimestamp",
		"netChange", "percentChange", "unitCode", "open", "high", "low", "close", "numTrades", "dollarVolume", "flag",
		"volume", "previousVolume", "fiftyTwoWkHigh", "fiftyTwoWkHighDate", "fiftyTwoWkLow", "fiftyTwoWkLowDate" })
public class Quote {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("name")
	private String name;
	@JsonProperty("dayCode")
	private String dayCode;
	@JsonProperty("serverTimestamp")
	private String serverTimestamp;
	@JsonProperty("mode")
	private String mode;
	@JsonProperty("lastPrice")
	private double lastPrice;
	@JsonProperty("last")
	private double last;
	@JsonProperty("tradeTimestamp")
	private String tradeTimestamp;
	@JsonProperty("netChange")
	private double netChange;
	@JsonProperty("percentChange")
	private double percentChange;
	@JsonProperty("unitCode")
	private String unitCode;
	@JsonProperty("open")
	private double open;
	@JsonProperty("high")
	private double high;
	@JsonProperty("low")
	private double low;
	@JsonProperty("close")
	private double close;
	@JsonProperty("settlement")
	private double settlement;
	@JsonProperty("previousClose")
	private double previousClose;
	@JsonProperty("numTrades")
	private long numTrades;
	@JsonProperty("dollarVolume")
	private double dollarVolume;
	@JsonProperty("flag")
	private String flag;
	@JsonProperty("volume")
	private long volume;
	@JsonProperty("previousVolume")
	private long previousVolume;
	@JsonProperty("fiftyTwoWkHigh")
	private double fiftyTwoWkHigh;
	@JsonProperty("fiftyTwoWkHighDate")
	private String fiftyTwoWkHighDate;
	@JsonProperty("fiftyTwoWkLow")
	private double fiftyTwoWkLow;
	@JsonProperty("fiftyTwoWkLowDate")
	private String fiftyTwoWkLowDate;
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

	@JsonProperty("dayCode")
	public String getDayCode() {
		return dayCode;
	}

	@JsonProperty("dayCode")
	public void setDayCode(String dayCode) {
		this.dayCode = dayCode;
	}

	@JsonProperty("serverTimestamp")
	public String getServerTimestamp() {
		return serverTimestamp;
	}

	@JsonProperty("serverTimestamp")
	public void setServerTimestamp(String serverTimestamp) {
		this.serverTimestamp = serverTimestamp;
	}

	@JsonProperty("mode")
	public String getMode() {
		return mode;
	}

	@JsonProperty("mode")
	public void setMode(String mode) {
		this.mode = mode;
	}

	@JsonProperty("lastPrice")
	public double getLastPrice() {
		return lastPrice;
	}

	@JsonProperty("lastPrice")
	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}

	@JsonProperty("tradeTimestamp")
	public String getTradeTimestamp() {
		return tradeTimestamp;
	}

	@JsonProperty("tradeTimestamp")
	public void setTradeTimestamp(String tradeTimestamp) {
		this.tradeTimestamp = tradeTimestamp;
	}

	@JsonProperty("netChange")
	public double getNetChange() {
		return netChange;
	}

	@JsonProperty("netChange")
	public void setNetChange(double netChange) {
		this.netChange = netChange;
	}

	@JsonProperty("percentChange")
	public double getPercentChange() {
		return percentChange;
	}

	@JsonProperty("percentChange")
	public void setPercentChange(double percentChange) {
		this.percentChange = percentChange;
	}

	@JsonProperty("unitCode")
	public String getUnitCode() {
		return unitCode;
	}

	@JsonProperty("unitCode")
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
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

	@JsonProperty("numTrades")
	public long getNumTrades() {
		return numTrades;
	}

	@JsonProperty("numTrades")
	public void setNumTrades(long numTrades) {
		this.numTrades = numTrades;
	}

	@JsonProperty("dollarVolume")
	public double getDollarVolume() {
		return dollarVolume;
	}

	@JsonProperty("dollarVolume")
	public void setDollarVolume(double dollarVolume) {
		this.dollarVolume = dollarVolume;
	}

	@JsonProperty("flag")
	public String getFlag() {
		return flag;
	}

	@JsonProperty("flag")
	public void setFlag(String flag) {
		this.flag = flag;
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

	@JsonProperty("fiftyTwoWkHigh")
	public double getFiftyTwoWkHigh() {
		return fiftyTwoWkHigh;
	}

	@JsonProperty("fiftyTwoWkHigh")
	public void setFiftyTwoWkHigh(double fiftyTwoWkHigh) {
		this.fiftyTwoWkHigh = fiftyTwoWkHigh;
	}

	@JsonProperty("fiftyTwoWkHighDate")
	public String getFiftyTwoWkHighDate() {
		return fiftyTwoWkHighDate;
	}

	@JsonProperty("fiftyTwoWkHighDate")
	public void setFiftyTwoWkHighDate(String fiftyTwoWkHighDate) {
		this.fiftyTwoWkHighDate = fiftyTwoWkHighDate;
	}

	@JsonProperty("fiftyTwoWkLow")
	public double getFiftyTwoWkLow() {
		return fiftyTwoWkLow;
	}

	@JsonProperty("fiftyTwoWkLow")
	public void setFiftyTwoWkLow(double fiftyTwoWkLow) {
		this.fiftyTwoWkLow = fiftyTwoWkLow;
	}

	@JsonProperty("fiftyTwoWkLowDate")
	public String getFiftyTwoWkLowDate() {
		return fiftyTwoWkLowDate;
	}

	@JsonProperty("fiftyTwoWkLowDate")
	public void setFiftyTwoWkLowDate(String fiftyTwoWkLowDate) {
		this.fiftyTwoWkLowDate = fiftyTwoWkLowDate;
	}

	public double getLast() {
		return last;
	}

	public void setLast(double last) {
		this.last = last;
	}

	public double getSettlement() {
		return settlement;
	}

	public void setSettlement(double settlement) {
		this.settlement = settlement;
	}

	public double getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(double previousClose) {
		this.previousClose = previousClose;
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
