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
		"expirationDate", "date", "open", "high", "low", "last", "change", "percentChange", "premium" })
public class SDFuturesOption {

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
	@JsonProperty("open")
	private long open;
	@JsonProperty("high")
	private long high;
	@JsonProperty("low")
	private long low;
	@JsonProperty("last")
	private long last;
	@JsonProperty("change")
	private double change;
	@JsonProperty("percentChange")
	private double percentChange;
	@JsonProperty("premium")
	private long premium;
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

	@JsonProperty("open")
	public long getOpen() {
		return open;
	}

	@JsonProperty("open")
	public void setOpen(long open) {
		this.open = open;
	}

	@JsonProperty("high")
	public long getHigh() {
		return high;
	}

	@JsonProperty("high")
	public void setHigh(long high) {
		this.high = high;
	}

	@JsonProperty("low")
	public long getLow() {
		return low;
	}

	@JsonProperty("low")
	public void setLow(long low) {
		this.low = low;
	}

	@JsonProperty("last")
	public long getLast() {
		return last;
	}

	@JsonProperty("last")
	public void setLast(long last) {
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

	@JsonProperty("percentChange")
	public double getPercentChange() {
		return percentChange;
	}

	@JsonProperty("percentChange")
	public void setPercentChange(double percentChange) {
		this.percentChange = percentChange;
	}

	@JsonProperty("premium")
	public long getPremium() {
		return premium;
	}

	@JsonProperty("premium")
	public void setPremium(long premium) {
		this.premium = premium;
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
