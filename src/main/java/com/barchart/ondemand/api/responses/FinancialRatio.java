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
@JsonPropertyOrder({ "symbol", "eps", "profitMargin", "roe", "roa", "priceSales", "priceEarnings", "priceBook" })
public class FinancialRatio {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("eps")
	private double eps;
	@JsonProperty("profitMargin")
	private double profitMargin;
	@JsonProperty("roe")
	private double roe;
	@JsonProperty("roa")
	private int roa;
	@JsonProperty("priceSales")
	private double priceSales;
	@JsonProperty("priceEarnings")
	private double priceEarnings;
	@JsonProperty("priceBook")
	private double priceBook;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("eps")
	public double getEps() {
		return eps;
	}

	@JsonProperty("eps")
	public void setEps(double eps) {
		this.eps = eps;
	}

	@JsonProperty("profitMargin")
	public double getProfitMargin() {
		return profitMargin;
	}

	@JsonProperty("profitMargin")
	public void setProfitMargin(double profitMargin) {
		this.profitMargin = profitMargin;
	}

	@JsonProperty("roe")
	public double getRoe() {
		return roe;
	}

	@JsonProperty("roe")
	public void setRoe(double roe) {
		this.roe = roe;
	}

	@JsonProperty("roa")
	public int getRoa() {
		return roa;
	}

	@JsonProperty("roa")
	public void setRoa(int roa) {
		this.roa = roa;
	}

	@JsonProperty("priceSales")
	public double getPriceSales() {
		return priceSales;
	}

	@JsonProperty("priceSales")
	public void setPriceSales(double priceSales) {
		this.priceSales = priceSales;
	}

	@JsonProperty("priceEarnings")
	public double getPriceEarnings() {
		return priceEarnings;
	}

	@JsonProperty("priceEarnings")
	public void setPriceEarnings(double priceEarnings) {
		this.priceEarnings = priceEarnings;
	}

	@JsonProperty("priceBook")
	public double getPriceBook() {
		return priceBook;
	}

	@JsonProperty("priceBook")
	public void setPriceBook(double priceBook) {
		this.priceBook = priceBook;
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
