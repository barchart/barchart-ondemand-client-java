package com.barchart.ondemand.api.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "underlying_symbol", "symbol", "exchange", "type", "strike", "expirationDate", "expirationType",
		"date", "volatility", "delta", "gamma", "theta", "vega", "rho", "bid", "bidSize", "bidDate", "ask", "askSize", "askDate", "open", "high", "low", "last", "change", "percentChange", "settlement", "lastTradeDate", "volume"})
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
	@JsonProperty("volatility")
	private double volatility;
	@JsonProperty("delta")
	private double delta;
	@JsonProperty("gamma")
	private double gamma;
	@JsonProperty("theta")
	private double theta;
	@JsonProperty("vega")
	private double vega;
	@JsonProperty("rho")
	private double rho;
	@JsonProperty("bid")
	private double bid;
	@JsonProperty("bidSize")
	private int bidSize;
	@JsonProperty("bidDate")
	private String bidDate;
	@JsonProperty("ask")
	private double ask;
	@JsonProperty("askSize")
	private int askSize;
	@JsonProperty("askDate")
	private String askDate;
	@JsonProperty("open")
	private double open;
	@JsonProperty("high")
	private double high;
	@JsonProperty("low")
	private double low;
	@JsonProperty("last")
	private double last;
	@JsonProperty("change")
	private double change;
	@JsonProperty("volume")
	private String volume;
	@JsonProperty("settlement")
	private double settlement;
	@JsonProperty("lastTradeDate")
	private String lastTradeDate;
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

	@JsonProperty("change")
	public double getChange() {
		return change;
	}

	@JsonProperty("change")
	public void setChange(double change) {
		this.change = change;
	}
	
	@JsonProperty("rho")
	public double getRho() {
		return rho;
	}
	
	@JsonProperty("rho")
	public void setRho(double rho) {
		this.rho = rho;
	}

	@JsonProperty("bidDate")
	public String getBidDate() {
		return bidDate;
	}

	@JsonProperty("bidDate")
	public void setBidDate(String bidDate) {
		this.bidDate = bidDate;
	}

	@JsonProperty("askDate")
	public String getAskDate() {
		return askDate;
	}

	@JsonProperty("askDate")
	public void setAskDate(String askDate) {
		this.askDate = askDate;
	}

	@JsonProperty("settlement")
	public double getSettlement() {
		return settlement;
	}

	@JsonProperty("settlement")
	public void setSettlement(double settlement) {
		this.settlement = settlement;
	}

	@JsonProperty("lastTradeDate")
	public String getLastTradeDate() {
		return lastTradeDate;
	}

	@JsonProperty("lastTradeDate")
	public void setLastTradeDate(String lastTradeDate) {
		this.lastTradeDate = lastTradeDate;
	}

	@JsonProperty("volume")
	public String getVolume() {
		return volume;
	}
	
	@JsonProperty("volume")
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	@JsonProperty("volatility")
	public double getVolatility() {
		return volatility;
	}
	
	@JsonProperty("volatility")
	public void setVolatility(double volatility) {
		this.volatility = volatility;
	}
	
	@JsonProperty("delta")
	public double getDelta() {
		return delta;
	}
	
	@JsonProperty("delta")
	public void setDelta(double delta) {
		this.delta = delta;
	}
	
	@JsonProperty("gamma")
	public double getGamma() {
		return gamma;
	}
	
	@JsonProperty("gamma")
	public void setGamma(double gamma) {
		this.gamma = gamma;
	}
	
	@JsonProperty("theta")
	public double getTheta() {
		return theta;
	}

	@JsonProperty("theta")
	public void setTheta(double theta) {
		this.theta = theta;
	}
	
	@JsonProperty("vega")
	public double getVega() {
		return vega;
	}
	
	@JsonProperty("vega")
	public void setVega(double vega) {
		this.vega = vega;
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
