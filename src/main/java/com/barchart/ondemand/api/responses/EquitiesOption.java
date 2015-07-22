package com.barchart.ondemand.api.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "underlying_symbol", "symbol", "exchange", "type", "strike", "expirationDate", "expirationType",
		"date", "bid", "bidSize", "ask", "askSize", "open", "high", "low", "last", "previous", "change", "percentChange", })
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
	@JsonProperty("expirationType")
	private String expirationType;
	@JsonProperty("date")
	private String date;
	@JsonProperty("bid")
	private double bid;
	@JsonProperty("bidSize")
	private int bidSize;
	@JsonProperty("ask")
	private double ask;
	@JsonProperty("askSize")
	private int askSize;
	@JsonProperty("open")
	private double open;
	@JsonProperty("high")
	private double high;
	@JsonProperty("low")
	private double low;
	@JsonProperty("last")
	private double last;
	@JsonProperty("previous")
	private double previous;
	@JsonProperty("change")
	private double change;
	@JsonProperty("percentChange")
	private double percentChange;
	

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
	
	@JsonProperty("expirationType")
	public String getExpirationType() {
		return expirationType;
	}
	
	@JsonProperty("expirationType")
	public void setExpirationType(String expirationType) {
		this.expirationType = expirationType;
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

	@JsonProperty("last")
	public double getLast() {
		return last;
	}

	@JsonProperty("last")
	public void setLast(double last) {
		this.last = last;
	}

	@JsonProperty("previous")
	public double getPrevious() {
		return previous;
	}

	@JsonProperty("previous")
	public void setPrevious(double previous) {
		this.previous = previous;
	}

	@JsonProperty("change")
	public double getChange() {
		return change;
	}

	@JsonProperty("change")
	public void setChange(double change) {
		this.change = change;
	}

	@JsonProperty("percentChange")
	public double getPercentChange() {
		return percentChange;
	}

	@JsonProperty("percentChange")
	public void setPercentChange(double percentChange) {
		this.percentChange = percentChange;
	}
	
	

}
