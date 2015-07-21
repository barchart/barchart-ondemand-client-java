package com.barchart.ondemand.api.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "underlying_symbol", "symbol", "exchange", "type", "strike", "expirationDate",
		"bid", "bidSize", "ask", "askSize" })
public class EquitiesOption {
	
	@JsonProperty("underlying_symbol")
	private String underlying_symbol;
	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("exchange")
	private String exchange;
	@JsonProperty("type")
	private String type;
	@JsonProperty("strike")
	private double strike;
	@JsonProperty("expirationDate")
	private String expirationDate;
	@JsonProperty("bid")
	private double bid;
	@JsonProperty("bidSize")
	private int bidSize;
	@JsonProperty("ask")
	private double ask;
	@JsonProperty("askSize")
	private int askSize;
	
	@JsonProperty("underlying_symbol")
	public String getUnderlying_symbol() {
		return underlying_symbol;
	}
	
	@JsonProperty("underlying_symbol")
	public void setUnderlying_symbol(String underlying_symbol) {
		this.underlying_symbol = underlying_symbol;
	}
	
	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}
	
	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	@JsonProperty("exchange")
	public String getExchange() {
		return exchange;
	}
	
	@JsonProperty("exchange")
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	
	@JsonProperty("type")
	public String getType() {
		return type;
	}
	
	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}
	
	@JsonProperty("strike")
	public double getStrike() {
		return strike;
	}
	
	@JsonProperty("strike")
	public void setStrike(double strike) {
		this.strike = strike;
	}
	
	@JsonProperty("expirationDate")
	public String getExpirationDate() {
		return expirationDate;
	}
	
	@JsonProperty("expirationDate")
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	@JsonProperty("bid")
	public double getBid() {
		return bid;
	}
	
	@JsonProperty("bid")
	public void setBid(double bid) {
		this.bid = bid;
	}
	
	@JsonProperty("bidSize")
	public int getBidSize() {
		return bidSize;
	}
	
	@JsonProperty("bidSize")
	public void setBidSize(int bidSize) {
		this.bidSize = bidSize;
	}
	
	@JsonProperty("ask")
	public double getAsk() {
		return ask;
	}
	
	@JsonProperty("ask")
	public void setAsk(double ask) {
		this.ask = ask;
	}
	
	@JsonProperty("askSize")
	public int getAskSize() {
		return askSize;
	}
	
	@JsonProperty("askSize")
	public void setAskSize(int askSize) {
		this.askSize = askSize;
	}
	
	

}
