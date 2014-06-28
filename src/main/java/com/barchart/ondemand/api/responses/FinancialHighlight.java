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
@JsonPropertyOrder({ "symbol", "marketCapitalization", "insiderShareholders", "annualRevenue", "ttmRevenue",
		"sharesOutstanding", "institutionalShareholders", "oneYearReturn", "threeYearReturn", "fiveYearReturn",
		"ttmRevenueGrowth", "fiveYearRevenueGrowth", "fiveYearEarningsGrowth", "fiveYearDividendGrowth", "lastQtrEPS",
		"annualEPS", "ttmEPS", "annualDividendRate", "annualDividendYield" })
public class FinancialHighlight {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("marketCapitalization")
	private long marketCapitalization;
	@JsonProperty("insiderShareholders")
	private double insiderShareholders;
	@JsonProperty("annualRevenue")
	private long annualRevenue;
	@JsonProperty("ttmRevenue")
	private long ttmRevenue;
	@JsonProperty("sharesOutstanding")
	private long sharesOutstanding;
	@JsonProperty("institutionalShareholders")
	private double institutionalShareholders;
	@JsonProperty("oneYearReturn")
	private double oneYearReturn;
	@JsonProperty("threeYearReturn")
	private double threeYearReturn;
	@JsonProperty("fiveYearReturn")
	private double fiveYearReturn;
	@JsonProperty("ttmRevenueGrowth")
	private long ttmRevenueGrowth;
	@JsonProperty("fiveYearRevenueGrowth")
	private Object fiveYearRevenueGrowth;
	@JsonProperty("fiveYearEarningsGrowth")
	private long fiveYearEarningsGrowth;
	@JsonProperty("fiveYearDividendGrowth")
	private long fiveYearDividendGrowth;
	@JsonProperty("lastQtrEPS")
	private double lastQtrEPS;
	@JsonProperty("annualEPS")
	private double annualEPS;
	@JsonProperty("ttmEPS")
	private double ttmEPS;
	@JsonProperty("annualDividendRate")
	private double annualDividendRate;
	@JsonProperty("annualDividendYield")
	private double annualDividendYield;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("marketCapitalization")
	public long getMarketCapitalization() {
		return marketCapitalization;
	}

	@JsonProperty("marketCapitalization")
	public void setMarketCapitalization(int marketCapitalization) {
		this.marketCapitalization = marketCapitalization;
	}

	@JsonProperty("insiderShareholders")
	public double getInsiderShareholders() {
		return insiderShareholders;
	}

	@JsonProperty("insiderShareholders")
	public void setInsiderShareholders(double insiderShareholders) {
		this.insiderShareholders = insiderShareholders;
	}

	@JsonProperty("annualRevenue")
	public long getAnnualRevenue() {
		return annualRevenue;
	}

	@JsonProperty("annualRevenue")
	public void setAnnualRevenue(int annualRevenue) {
		this.annualRevenue = annualRevenue;
	}

	@JsonProperty("ttmRevenue")
	public long getTtmRevenue() {
		return ttmRevenue;
	}

	@JsonProperty("ttmRevenue")
	public void setTtmRevenue(long ttmRevenue) {
		this.ttmRevenue = ttmRevenue;
	}

	@JsonProperty("sharesOutstanding")
	public long getSharesOutstanding() {
		return sharesOutstanding;
	}

	@JsonProperty("sharesOutstanding")
	public void setSharesOutstanding(long sharesOutstanding) {
		this.sharesOutstanding = sharesOutstanding;
	}

	@JsonProperty("institutionalShareholders")
	public double getInstitutionalShareholders() {
		return institutionalShareholders;
	}

	@JsonProperty("institutionalShareholders")
	public void setInstitutionalShareholders(double institutionalShareholders) {
		this.institutionalShareholders = institutionalShareholders;
	}

	@JsonProperty("oneYearReturn")
	public double getOneYearReturn() {
		return oneYearReturn;
	}

	@JsonProperty("oneYearReturn")
	public void setOneYearReturn(double oneYearReturn) {
		this.oneYearReturn = oneYearReturn;
	}

	@JsonProperty("threeYearReturn")
	public double getThreeYearReturn() {
		return threeYearReturn;
	}

	@JsonProperty("threeYearReturn")
	public void setThreeYearReturn(double threeYearReturn) {
		this.threeYearReturn = threeYearReturn;
	}

	@JsonProperty("fiveYearReturn")
	public double getFiveYearReturn() {
		return fiveYearReturn;
	}

	@JsonProperty("fiveYearReturn")
	public void setFiveYearReturn(double fiveYearReturn) {
		this.fiveYearReturn = fiveYearReturn;
	}

	@JsonProperty("ttmRevenueGrowth")
	public long getTtmRevenueGrowth() {
		return ttmRevenueGrowth;
	}

	@JsonProperty("ttmRevenueGrowth")
	public void setTtmRevenueGrowth(long ttmRevenueGrowth) {
		this.ttmRevenueGrowth = ttmRevenueGrowth;
	}

	@JsonProperty("fiveYearRevenueGrowth")
	public Object getFiveYearRevenueGrowth() {
		return fiveYearRevenueGrowth;
	}

	@JsonProperty("fiveYearRevenueGrowth")
	public void setFiveYearRevenueGrowth(Object fiveYearRevenueGrowth) {
		this.fiveYearRevenueGrowth = fiveYearRevenueGrowth;
	}

	@JsonProperty("fiveYearEarningsGrowth")
	public long getFiveYearEarningsGrowth() {
		return fiveYearEarningsGrowth;
	}

	@JsonProperty("fiveYearEarningsGrowth")
	public void setFiveYearEarningsGrowth(long fiveYearEarningsGrowth) {
		this.fiveYearEarningsGrowth = fiveYearEarningsGrowth;
	}

	@JsonProperty("fiveYearDividendGrowth")
	public long getFiveYearDividendGrowth() {
		return fiveYearDividendGrowth;
	}

	@JsonProperty("fiveYearDividendGrowth")
	public void setFiveYearDividendGrowth(long fiveYearDividendGrowth) {
		this.fiveYearDividendGrowth = fiveYearDividendGrowth;
	}

	@JsonProperty("lastQtrEPS")
	public double getLastQtrEPS() {
		return lastQtrEPS;
	}

	@JsonProperty("lastQtrEPS")
	public void setLastQtrEPS(double lastQtrEPS) {
		this.lastQtrEPS = lastQtrEPS;
	}

	@JsonProperty("annualEPS")
	public double getAnnualEPS() {
		return annualEPS;
	}

	@JsonProperty("annualEPS")
	public void setAnnualEPS(double annualEPS) {
		this.annualEPS = annualEPS;
	}

	@JsonProperty("ttmEPS")
	public double getTtmEPS() {
		return ttmEPS;
	}

	@JsonProperty("ttmEPS")
	public void setTtmEPS(double ttmEPS) {
		this.ttmEPS = ttmEPS;
	}

	@JsonProperty("annualDividendRate")
	public double getAnnualDividendRate() {
		return annualDividendRate;
	}

	@JsonProperty("annualDividendRate")
	public void setAnnualDividendRate(double annualDividendRate) {
		this.annualDividendRate = annualDividendRate;
	}

	@JsonProperty("annualDividendYield")
	public double getAnnualDividendYield() {
		return annualDividendYield;
	}

	@JsonProperty("annualDividendYield")
	public void setAnnualDividendYield(double annualDividendYield) {
		this.annualDividendYield = annualDividendYield;
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
