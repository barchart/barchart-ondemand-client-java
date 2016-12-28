package com.barchart.ondemand.api.responses;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "symbol", "name", "date", "open", "high", "low", "close", "volume", "totaltrades", "datasource" })
public class EodQuote {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("name")
	private String name;
	@JsonProperty("date")
	private String date;
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
	@JsonProperty("totaltrades")
	private int totaltrades;
	@JsonProperty("datasource")
	private String datasource;
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

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("date")
	public String getDate() {
		return date;
	}

	@JsonProperty("date")
	public void setDate(String date) {
		this.date = date;
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

	@JsonProperty("totaltrades")
	public int getTotaltrades() {
		return totaltrades;
	}

	@JsonProperty("totaltrades")
	public void setTotaltrades(int totaltrades) {
		this.totaltrades = totaltrades;
	}

	@JsonProperty("datasource")
	public String getDatasource() {
		return datasource;
	}

	@JsonProperty("datasource")
	public void setDatasource(String datasource) {
		this.datasource = datasource;
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