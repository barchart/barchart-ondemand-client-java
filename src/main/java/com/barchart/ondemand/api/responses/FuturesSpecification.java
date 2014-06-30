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
@JsonPropertyOrder({ "symbol", "exchange", "futuresCategory", "contractName", "tradingHours", "ContractSize",
		"monthsTraded", "tickValue", "pointValue" })
public class FuturesSpecification {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("exchange")
	private String exchange;
	@JsonProperty("futuresCategory")
	private String futuresCategory;
	@JsonProperty("contractName")
	private String contractName;
	@JsonProperty("tradingHours")
	private String tradingHours;
	@JsonProperty("ContractSize")
	private String contractSize;
	@JsonProperty("monthsTraded")
	private String monthsTraded;
	@JsonProperty("tickValue")
	private String tickValue;
	@JsonProperty("pointValue")
	private String pointValue;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

	@JsonProperty("futuresCategory")
	public String getFuturesCategory() {
		return futuresCategory;
	}

	@JsonProperty("futuresCategory")
	public void setFuturesCategory(String futuresCategory) {
		this.futuresCategory = futuresCategory;
	}

	@JsonProperty("contractName")
	public String getContractName() {
		return contractName;
	}

	@JsonProperty("contractName")
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	@JsonProperty("tradingHours")
	public String getTradingHours() {
		return tradingHours;
	}

	@JsonProperty("tradingHours")
	public void setTradingHours(String tradingHours) {
		this.tradingHours = tradingHours;
	}

	@JsonProperty("ContractSize")
	public String getContractSize() {
		return contractSize;
	}

	@JsonProperty("ContractSize")
	public void setContractSize(String contractSize) {
		this.contractSize = contractSize;
	}

	@JsonProperty("monthsTraded")
	public String getMonthsTraded() {
		return monthsTraded;
	}

	@JsonProperty("monthsTraded")
	public void setMonthsTraded(String monthsTraded) {
		this.monthsTraded = monthsTraded;
	}

	@JsonProperty("tickValue")
	public String getTickValue() {
		return tickValue;
	}

	@JsonProperty("tickValue")
	public void setTickValue(String tickValue) {
		this.tickValue = tickValue;
	}

	@JsonProperty("pointValue")
	public String getPointValue() {
		return pointValue;
	}

	@JsonProperty("pointValue")
	public void setPointValue(String pointValue) {
		this.pointValue = pointValue;
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
