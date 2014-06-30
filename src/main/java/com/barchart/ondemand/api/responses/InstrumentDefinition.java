package com.barchart.ondemand.api.responses;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 
 * @author m-ehrenberg <br/>
 * <br/>
 * 
 *         TODO OnDemand should return a 'root' field as well.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "guid", "id", "symbolRealtime", "symbolHistorical", "symbolDdf", "symbol", "symbolName",
		"symbolExpiration", "symbolCFI", "exchange", "exchangeName", "exchangeCode", "tickIncrement", "baseCode",
		"unitCode", "pointValue" })
public class InstrumentDefinition {

	@JsonProperty("guid")
	private String guid;
	@JsonProperty("id")
	private String id;
	@JsonProperty("symbolRealtime")
	private String symbolRealtime;
	@JsonProperty("symbolHistorical")
	private String symbolHistorical;
	@JsonProperty("symbolDdf")
	private String symbolDdf;
	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("symbolName")
	private String symbolName;
	@JsonProperty("symbolExpiration")
	private String symbolExpiration;
	@JsonProperty("symbolCFI")
	private String symbolCFI;
	@JsonProperty("exchange")
	private String exchange;
	@JsonProperty("exchangeName")
	private String exchangeName;
	@JsonProperty("exchangeCode")
	private String exchangeCode;
	@JsonProperty("tickIncrement")
	private long tickIncrement;
	@JsonProperty("baseCode")
	private String baseCode;
	@JsonProperty("unitCode")
	private String unitCode;
	@JsonProperty("pointValue")
	private long pointValue;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("guid")
	public String getGuid() {
		return guid;
	}

	@JsonProperty("guid")
	public void setGuid(String guid) {
		this.guid = guid;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("symbolRealtime")
	public String getSymbolRealtime() {
		return symbolRealtime;
	}

	@JsonProperty("symbolRealtime")
	public void setSymbolRealtime(String symbolRealtime) {
		this.symbolRealtime = symbolRealtime;
	}

	@JsonProperty("symbolHistorical")
	public String getSymbolHistorical() {
		return symbolHistorical;
	}

	@JsonProperty("symbolHistorical")
	public void setSymbolHistorical(String symbolHistorical) {
		this.symbolHistorical = symbolHistorical;
	}

	@JsonProperty("symbolDdf")
	public String getSymbolDdf() {
		return symbolDdf;
	}

	@JsonProperty("symbolDdf")
	public void setSymbolDdf(String symbolDdf) {
		this.symbolDdf = symbolDdf;
	}

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

	@JsonProperty("symbolExpiration")
	public String getSymbolExpiration() {
		return symbolExpiration;
	}

	@JsonProperty("symbolExpiration")
	public void setSymbolExpiration(String symbolExpiration) {
		this.symbolExpiration = symbolExpiration;
	}

	@JsonProperty("symbolCFI")
	public String getSymbolCFI() {
		return symbolCFI;
	}

	@JsonProperty("symbolCFI")
	public void setSymbolCFI(String symbolCFI) {
		this.symbolCFI = symbolCFI;
	}

	@JsonProperty("exchange")
	public String getExchange() {
		return exchange;
	}

	@JsonProperty("exchange")
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	@JsonProperty("exchangeName")
	public String getExchangeName() {
		return exchangeName;
	}

	@JsonProperty("exchangeName")
	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	@JsonProperty("exchangeCode")
	public String getExchangeCode() {
		return exchangeCode;
	}

	@JsonProperty("exchangeCode")
	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	@JsonProperty("tickIncrement")
	public long getTickIncrement() {
		return tickIncrement;
	}

	@JsonProperty("tickIncrement")
	public void setTickIncrement(long tickIncrement) {
		this.tickIncrement = tickIncrement;
	}

	@JsonProperty("baseCode")
	public String getBaseCode() {
		return baseCode;
	}

	@JsonProperty("baseCode")
	public void setBaseCode(String baseCode) {
		this.baseCode = baseCode;
	}

	@JsonProperty("unitCode")
	public String getUnitCode() {
		return unitCode;
	}

	@JsonProperty("unitCode")
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	@JsonProperty("pointValue")
	public long getPointValue() {
		return pointValue;
	}

	@JsonProperty("pointValue")
	public void setPointValue(long pointValue) {
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
