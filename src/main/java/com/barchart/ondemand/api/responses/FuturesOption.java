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
@JsonPropertyOrder({ "symbol", "root", "contract", "contractName", "contractMonth", "exchange", "type", "strike",
		"expirationDate", "date", "impliedVolatility", "delta", "gamma", "theta", "vega", "open", "high", "low",
		"last", "close", "change", "percentChange" })
public class FuturesOption {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("root")
	private String root;
	@JsonProperty("contract")
	private String contract;
	@JsonProperty("contractName")
	private String contractName;
	@JsonProperty("contractMonth")
	private String contractMonth;
	@JsonProperty("exchange")
	private String exchange;
	@JsonProperty("type")
	private String type;
	@JsonProperty("strike")
	private long strike;
	@JsonProperty("expirationDate")
	private String expirationDate;
	@JsonProperty("date")
	private String date;
	@JsonProperty("impliedVolatility")
	private String impliedVolatility;
	@JsonProperty("delta")
	private String delta;
	@JsonProperty("gamma")
	private String gamma;
	@JsonProperty("theta")
	private String theta;
	@JsonProperty("vega")
	private String vega;
	@JsonProperty("open")
	private String open;
	@JsonProperty("high")
	private double high;
	@JsonProperty("low")
	private double low;
	@JsonProperty("last")
	private double last;
	@JsonProperty("close")
	private double close;
	@JsonProperty("change")
	private double change;
	@JsonProperty("percentChange")
	private double percentChange;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("root")
	public String getRoot() {
		return root;
	}

	@JsonProperty("root")
	public void setRoot(String root) {
		this.root = root;
	}

	@JsonProperty("contract")
	public String getContract() {
		return contract;
	}

	@JsonProperty("contract")
	public void setContract(String contract) {
		this.contract = contract;
	}

	@JsonProperty("contractName")
	public String getContractName() {
		return contractName;
	}

	@JsonProperty("contractName")
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	@JsonProperty("contractMonth")
	public String getContractMonth() {
		return contractMonth;
	}

	@JsonProperty("contractMonth")
	public void setContractMonth(String contractMonth) {
		this.contractMonth = contractMonth;
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
	public long getStrike() {
		return strike;
	}

	@JsonProperty("strike")
	public void setStrike(long strike) {
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

	@JsonProperty("date")
	public String getDate() {
		return date;
	}

	@JsonProperty("date")
	public void setDate(String date) {
		this.date = date;
	}

	@JsonProperty("impliedVolatility")
	public String getImpliedVolatility() {
		return impliedVolatility;
	}

	@JsonProperty("impliedVolatility")
	public void setImpliedVolatility(String impliedVolatility) {
		this.impliedVolatility = impliedVolatility;
	}

	@JsonProperty("delta")
	public String getDelta() {
		return delta;
	}

	@JsonProperty("delta")
	public void setDelta(String delta) {
		this.delta = delta;
	}

	@JsonProperty("gamma")
	public String getGamma() {
		return gamma;
	}

	@JsonProperty("gamma")
	public void setGamma(String gamma) {
		this.gamma = gamma;
	}

	@JsonProperty("theta")
	public String getTheta() {
		return theta;
	}

	@JsonProperty("theta")
	public void setTheta(String theta) {
		this.theta = theta;
	}

	@JsonProperty("vega")
	public String getVega() {
		return vega;
	}

	@JsonProperty("vega")
	public void setVega(String vega) {
		this.vega = vega;
	}

	@JsonProperty("open")
	public String getOpen() {
		return open;
	}

	@JsonProperty("open")
	public void setOpen(String open) {
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

	@JsonProperty("close")
	public double getClose() {
		return close;
	}

	@JsonProperty("close")
	public void setClose(double close) {
		this.close = close;
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
