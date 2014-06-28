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
@JsonPropertyOrder({ "symbol", "date", "cash", "marketableSec", "receivables", "prepaidExpenses", "inventories",
		"deferredIncomeTax", "otherCurrentAssets", "totalCurrentAssets", "ppeNet", "equityOtherInvestments",
		"intangibles", "otherNonCurrentAssets", "totalNonCurrentAssets", "totalAssets", "shorttermDebt",
		"accountsPayable", "incomeTaxPayable", "accruedExpenses", "otherCurrentLiabilities", "totalCurrentLiabilities",
		"longTermDebt", "deferredLongRevenues", "otherNonCurrentLiabilities", "totalNonCurrentLiabilities",
		"totalLiabilities", "commonShares", "retainedEarnings", "otherEquity", "totalShareholdersEquity",
		"totalLiabilitiesAndEquity" })
public class BalanceSheet {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("date")
	private String date;
	@JsonProperty("cash")
	private int cash;
	@JsonProperty("marketableSec")
	private int marketableSec;
	@JsonProperty("receivables")
	private int receivables;
	@JsonProperty("prepaidExpenses")
	private int prepaidExpenses;
	@JsonProperty("inventories")
	private int inventories;
	@JsonProperty("deferredIncomeTax")
	private int deferredIncomeTax;
	@JsonProperty("otherCurrentAssets")
	private int otherCurrentAssets;
	@JsonProperty("totalCurrentAssets")
	private int totalCurrentAssets;
	@JsonProperty("ppeNet")
	private int ppeNet;
	@JsonProperty("equityOtherInvestments")
	private int equityOtherInvestments;
	@JsonProperty("intangibles")
	private int intangibles;
	@JsonProperty("otherNonCurrentAssets")
	private int otherNonCurrentAssets;
	@JsonProperty("totalNonCurrentAssets")
	private int totalNonCurrentAssets;
	@JsonProperty("totalAssets")
	private int totalAssets;
	@JsonProperty("shorttermDebt")
	private int shorttermDebt;
	@JsonProperty("accountsPayable")
	private int accountsPayable;
	@JsonProperty("incomeTaxPayable")
	private int incomeTaxPayable;
	@JsonProperty("accruedExpenses")
	private int accruedExpenses;
	@JsonProperty("otherCurrentLiabilities")
	private int otherCurrentLiabilities;
	@JsonProperty("totalCurrentLiabilities")
	private int totalCurrentLiabilities;
	@JsonProperty("longTermDebt")
	private int longTermDebt;
	@JsonProperty("deferredLongRevenues")
	private int deferredLongRevenues;
	@JsonProperty("otherNonCurrentLiabilities")
	private int otherNonCurrentLiabilities;
	@JsonProperty("totalNonCurrentLiabilities")
	private int totalNonCurrentLiabilities;
	@JsonProperty("totalLiabilities")
	private int totalLiabilities;
	@JsonProperty("commonShares")
	private int commonShares;
	@JsonProperty("retainedEarnings")
	private int retainedEarnings;
	@JsonProperty("otherEquity")
	private int otherEquity;
	@JsonProperty("totalShareholdersEquity")
	private int totalShareholdersEquity;
	@JsonProperty("totalLiabilitiesAndEquity")
	private int totalLiabilitiesAndEquity;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("date")
	public String getDate() {
		return date;
	}

	@JsonProperty("date")
	public void setDate(String date) {
		this.date = date;
	}

	@JsonProperty("cash")
	public int getCash() {
		return cash;
	}

	@JsonProperty("cash")
	public void setCash(int cash) {
		this.cash = cash;
	}

	@JsonProperty("marketableSec")
	public int getMarketableSec() {
		return marketableSec;
	}

	@JsonProperty("marketableSec")
	public void setMarketableSec(int marketableSec) {
		this.marketableSec = marketableSec;
	}

	@JsonProperty("receivables")
	public int getReceivables() {
		return receivables;
	}

	@JsonProperty("receivables")
	public void setReceivables(int receivables) {
		this.receivables = receivables;
	}

	@JsonProperty("prepaidExpenses")
	public int getPrepaidExpenses() {
		return prepaidExpenses;
	}

	@JsonProperty("prepaidExpenses")
	public void setPrepaidExpenses(int prepaidExpenses) {
		this.prepaidExpenses = prepaidExpenses;
	}

	@JsonProperty("inventories")
	public int getInventories() {
		return inventories;
	}

	@JsonProperty("inventories")
	public void setInventories(int inventories) {
		this.inventories = inventories;
	}

	@JsonProperty("deferredIncomeTax")
	public int getDeferredIncomeTax() {
		return deferredIncomeTax;
	}

	@JsonProperty("deferredIncomeTax")
	public void setDeferredIncomeTax(int deferredIncomeTax) {
		this.deferredIncomeTax = deferredIncomeTax;
	}

	@JsonProperty("otherCurrentAssets")
	public int getOtherCurrentAssets() {
		return otherCurrentAssets;
	}

	@JsonProperty("otherCurrentAssets")
	public void setOtherCurrentAssets(int otherCurrentAssets) {
		this.otherCurrentAssets = otherCurrentAssets;
	}

	@JsonProperty("totalCurrentAssets")
	public int getTotalCurrentAssets() {
		return totalCurrentAssets;
	}

	@JsonProperty("totalCurrentAssets")
	public void setTotalCurrentAssets(int totalCurrentAssets) {
		this.totalCurrentAssets = totalCurrentAssets;
	}

	@JsonProperty("ppeNet")
	public int getPpeNet() {
		return ppeNet;
	}

	@JsonProperty("ppeNet")
	public void setPpeNet(int ppeNet) {
		this.ppeNet = ppeNet;
	}

	@JsonProperty("equityOtherInvestments")
	public int getEquityOtherInvestments() {
		return equityOtherInvestments;
	}

	@JsonProperty("equityOtherInvestments")
	public void setEquityOtherInvestments(int equityOtherInvestments) {
		this.equityOtherInvestments = equityOtherInvestments;
	}

	@JsonProperty("intangibles")
	public int getIntangibles() {
		return intangibles;
	}

	@JsonProperty("intangibles")
	public void setIntangibles(int intangibles) {
		this.intangibles = intangibles;
	}

	@JsonProperty("otherNonCurrentAssets")
	public int getOtherNonCurrentAssets() {
		return otherNonCurrentAssets;
	}

	@JsonProperty("otherNonCurrentAssets")
	public void setOtherNonCurrentAssets(int otherNonCurrentAssets) {
		this.otherNonCurrentAssets = otherNonCurrentAssets;
	}

	@JsonProperty("totalNonCurrentAssets")
	public int getTotalNonCurrentAssets() {
		return totalNonCurrentAssets;
	}

	@JsonProperty("totalNonCurrentAssets")
	public void setTotalNonCurrentAssets(int totalNonCurrentAssets) {
		this.totalNonCurrentAssets = totalNonCurrentAssets;
	}

	@JsonProperty("totalAssets")
	public int getTotalAssets() {
		return totalAssets;
	}

	@JsonProperty("totalAssets")
	public void setTotalAssets(int totalAssets) {
		this.totalAssets = totalAssets;
	}

	@JsonProperty("shorttermDebt")
	public int getShorttermDebt() {
		return shorttermDebt;
	}

	@JsonProperty("shorttermDebt")
	public void setShorttermDebt(int shorttermDebt) {
		this.shorttermDebt = shorttermDebt;
	}

	@JsonProperty("accountsPayable")
	public int getAccountsPayable() {
		return accountsPayable;
	}

	@JsonProperty("accountsPayable")
	public void setAccountsPayable(int accountsPayable) {
		this.accountsPayable = accountsPayable;
	}

	@JsonProperty("incomeTaxPayable")
	public int getIncomeTaxPayable() {
		return incomeTaxPayable;
	}

	@JsonProperty("incomeTaxPayable")
	public void setIncomeTaxPayable(int incomeTaxPayable) {
		this.incomeTaxPayable = incomeTaxPayable;
	}

	@JsonProperty("accruedExpenses")
	public int getAccruedExpenses() {
		return accruedExpenses;
	}

	@JsonProperty("accruedExpenses")
	public void setAccruedExpenses(int accruedExpenses) {
		this.accruedExpenses = accruedExpenses;
	}

	@JsonProperty("otherCurrentLiabilities")
	public int getOtherCurrentLiabilities() {
		return otherCurrentLiabilities;
	}

	@JsonProperty("otherCurrentLiabilities")
	public void setOtherCurrentLiabilities(int otherCurrentLiabilities) {
		this.otherCurrentLiabilities = otherCurrentLiabilities;
	}

	@JsonProperty("totalCurrentLiabilities")
	public int getTotalCurrentLiabilities() {
		return totalCurrentLiabilities;
	}

	@JsonProperty("totalCurrentLiabilities")
	public void setTotalCurrentLiabilities(int totalCurrentLiabilities) {
		this.totalCurrentLiabilities = totalCurrentLiabilities;
	}

	@JsonProperty("longTermDebt")
	public int getLongTermDebt() {
		return longTermDebt;
	}

	@JsonProperty("longTermDebt")
	public void setLongTermDebt(int longTermDebt) {
		this.longTermDebt = longTermDebt;
	}

	@JsonProperty("deferredLongRevenues")
	public int getDeferredLongRevenues() {
		return deferredLongRevenues;
	}

	@JsonProperty("deferredLongRevenues")
	public void setDeferredLongRevenues(int deferredLongRevenues) {
		this.deferredLongRevenues = deferredLongRevenues;
	}

	@JsonProperty("otherNonCurrentLiabilities")
	public int getOtherNonCurrentLiabilities() {
		return otherNonCurrentLiabilities;
	}

	@JsonProperty("otherNonCurrentLiabilities")
	public void setOtherNonCurrentLiabilities(int otherNonCurrentLiabilities) {
		this.otherNonCurrentLiabilities = otherNonCurrentLiabilities;
	}

	@JsonProperty("totalNonCurrentLiabilities")
	public int getTotalNonCurrentLiabilities() {
		return totalNonCurrentLiabilities;
	}

	@JsonProperty("totalNonCurrentLiabilities")
	public void setTotalNonCurrentLiabilities(int totalNonCurrentLiabilities) {
		this.totalNonCurrentLiabilities = totalNonCurrentLiabilities;
	}

	@JsonProperty("totalLiabilities")
	public int getTotalLiabilities() {
		return totalLiabilities;
	}

	@JsonProperty("totalLiabilities")
	public void setTotalLiabilities(int totalLiabilities) {
		this.totalLiabilities = totalLiabilities;
	}

	@JsonProperty("commonShares")
	public int getCommonShares() {
		return commonShares;
	}

	@JsonProperty("commonShares")
	public void setCommonShares(int commonShares) {
		this.commonShares = commonShares;
	}

	@JsonProperty("retainedEarnings")
	public int getRetainedEarnings() {
		return retainedEarnings;
	}

	@JsonProperty("retainedEarnings")
	public void setRetainedEarnings(int retainedEarnings) {
		this.retainedEarnings = retainedEarnings;
	}

	@JsonProperty("otherEquity")
	public int getOtherEquity() {
		return otherEquity;
	}

	@JsonProperty("otherEquity")
	public void setOtherEquity(int otherEquity) {
		this.otherEquity = otherEquity;
	}

	@JsonProperty("totalShareholdersEquity")
	public int getTotalShareholdersEquity() {
		return totalShareholdersEquity;
	}

	@JsonProperty("totalShareholdersEquity")
	public void setTotalShareholdersEquity(int totalShareholdersEquity) {
		this.totalShareholdersEquity = totalShareholdersEquity;
	}

	@JsonProperty("totalLiabilitiesAndEquity")
	public int getTotalLiabilitiesAndEquity() {
		return totalLiabilitiesAndEquity;
	}

	@JsonProperty("totalLiabilitiesAndEquity")
	public void setTotalLiabilitiesAndEquity(int totalLiabilitiesAndEquity) {
		this.totalLiabilitiesAndEquity = totalLiabilitiesAndEquity;
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
