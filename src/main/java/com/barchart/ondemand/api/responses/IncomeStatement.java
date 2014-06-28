package com.barchart.ondemand.api.responses;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "symbol", "date", "sales", "costGoods", "grossProfit", "operatingExpenses", "operatingIncome",
		"interestExpense", "otherIncomeExpenses", "preTaxIncome", "incomeTax", "netIncome", "basicEpsContOp",
		"basicEpsTotalOp", "dilutedEpsContOp", "dilutedEpsTotalOp", "ebitda" })
public class IncomeStatement {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("date")
	private String date;
	@JsonProperty("sales")
	private int sales;
	@JsonProperty("costGoods")
	private int costGoods;
	@JsonProperty("grossProfit")
	private int grossProfit;
	@JsonProperty("operatingExpenses")
	private int operatingExpenses;
	@JsonProperty("operatingIncome")
	private int operatingIncome;
	@JsonProperty("interestExpense")
	private int interestExpense;
	@JsonProperty("otherIncomeExpenses")
	private int otherIncomeExpenses;
	@JsonProperty("preTaxIncome")
	private int preTaxIncome;
	@JsonProperty("incomeTax")
	private int incomeTax;
	@JsonProperty("netIncome")
	private int netIncome;
	@JsonProperty("basicEpsContOp")
	private double basicEpsContOp;
	@JsonProperty("basicEpsTotalOp")
	private double basicEpsTotalOp;
	@JsonProperty("dilutedEpsContOp")
	private double dilutedEpsContOp;
	@JsonProperty("dilutedEpsTotalOp")
	private double dilutedEpsTotalOp;
	@JsonProperty("ebitda")
	private int ebitda;
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

	@JsonProperty("sales")
	public int getSales() {
		return sales;
	}

	@JsonProperty("sales")
	public void setSales(int sales) {
		this.sales = sales;
	}

	@JsonProperty("costGoods")
	public int getCostGoods() {
		return costGoods;
	}

	@JsonProperty("costGoods")
	public void setCostGoods(int costGoods) {
		this.costGoods = costGoods;
	}

	@JsonProperty("grossProfit")
	public int getGrossProfit() {
		return grossProfit;
	}

	@JsonProperty("grossProfit")
	public void setGrossProfit(int grossProfit) {
		this.grossProfit = grossProfit;
	}

	@JsonProperty("operatingExpenses")
	public int getOperatingExpenses() {
		return operatingExpenses;
	}

	@JsonProperty("operatingExpenses")
	public void setOperatingExpenses(int operatingExpenses) {
		this.operatingExpenses = operatingExpenses;
	}

	@JsonProperty("operatingIncome")
	public int getOperatingIncome() {
		return operatingIncome;
	}

	@JsonProperty("operatingIncome")
	public void setOperatingIncome(int operatingIncome) {
		this.operatingIncome = operatingIncome;
	}

	@JsonProperty("interestExpense")
	public int getInterestExpense() {
		return interestExpense;
	}

	@JsonProperty("interestExpense")
	public void setInterestExpense(int interestExpense) {
		this.interestExpense = interestExpense;
	}

	@JsonProperty("otherIncomeExpenses")
	public int getOtherIncomeExpenses() {
		return otherIncomeExpenses;
	}

	@JsonProperty("otherIncomeExpenses")
	public void setOtherIncomeExpenses(int otherIncomeExpenses) {
		this.otherIncomeExpenses = otherIncomeExpenses;
	}

	@JsonProperty("preTaxIncome")
	public int getPreTaxIncome() {
		return preTaxIncome;
	}

	@JsonProperty("preTaxIncome")
	public void setPreTaxIncome(int preTaxIncome) {
		this.preTaxIncome = preTaxIncome;
	}

	@JsonProperty("incomeTax")
	public int getIncomeTax() {
		return incomeTax;
	}

	@JsonProperty("incomeTax")
	public void setIncomeTax(int incomeTax) {
		this.incomeTax = incomeTax;
	}

	@JsonProperty("netIncome")
	public int getNetIncome() {
		return netIncome;
	}

	@JsonProperty("netIncome")
	public void setNetIncome(int netIncome) {
		this.netIncome = netIncome;
	}

	@JsonProperty("basicEpsContOp")
	public double getBasicEpsContOp() {
		return basicEpsContOp;
	}

	@JsonProperty("basicEpsContOp")
	public void setBasicEpsContOp(double basicEpsContOp) {
		this.basicEpsContOp = basicEpsContOp;
	}

	@JsonProperty("basicEpsTotalOp")
	public double getBasicEpsTotalOp() {
		return basicEpsTotalOp;
	}

	@JsonProperty("basicEpsTotalOp")
	public void setBasicEpsTotalOp(double basicEpsTotalOp) {
		this.basicEpsTotalOp = basicEpsTotalOp;
	}

	@JsonProperty("dilutedEpsContOp")
	public double getDilutedEpsContOp() {
		return dilutedEpsContOp;
	}

	@JsonProperty("dilutedEpsContOp")
	public void setDilutedEpsContOp(double dilutedEpsContOp) {
		this.dilutedEpsContOp = dilutedEpsContOp;
	}

	@JsonProperty("dilutedEpsTotalOp")
	public double getDilutedEpsTotalOp() {
		return dilutedEpsTotalOp;
	}

	@JsonProperty("dilutedEpsTotalOp")
	public void setDilutedEpsTotalOp(double dilutedEpsTotalOp) {
		this.dilutedEpsTotalOp = dilutedEpsTotalOp;
	}

	@JsonProperty("ebitda")
	public int getEbitda() {
		return ebitda;
	}

	@JsonProperty("ebitda")
	public void setEbitda(int ebitda) {
		this.ebitda = ebitda;
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
