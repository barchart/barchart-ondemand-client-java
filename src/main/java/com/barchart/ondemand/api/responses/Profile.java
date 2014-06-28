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
@JsonPropertyOrder({ "symbol", "exchange", "exchangeName", "sicSector", "industry", "subIndustry", "businessSummary",
		"ceo", "qtrOneEarnings", "qtrTwoEarnings", "qtrThreeEarnings", "qtrFourEarnings", "address", "city", "state",
		"zipCode", "phoneNumber" })
public class Profile {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("exchange")
	private String exchange;
	@JsonProperty("exchangeName")
	private String exchangeName;
	@JsonProperty("sicSector")
	private String sicSector;
	@JsonProperty("industry")
	private String industry;
	@JsonProperty("subIndustry")
	private String subIndustry;
	@JsonProperty("businessSummary")
	private String businessSummary;
	@JsonProperty("ceo")
	private String ceo;
	@JsonProperty("qtrOneEarnings")
	private double qtrOneEarnings;
	@JsonProperty("qtrTwoEarnings")
	private double qtrTwoEarnings;
	@JsonProperty("qtrThreeEarnings")
	private double qtrThreeEarnings;
	@JsonProperty("qtrFourEarnings")
	private double qtrFourEarnings;
	@JsonProperty("address")
	private String address;
	@JsonProperty("city")
	private String city;
	@JsonProperty("state")
	private String state;
	@JsonProperty("zipCode")
	private String zipCode;
	@JsonProperty("phoneNumber")
	private String phoneNumber;
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

	@JsonProperty("exchangeName")
	public String getExchangeName() {
		return exchangeName;
	}

	@JsonProperty("exchangeName")
	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	@JsonProperty("sicSector")
	public String getSicSector() {
		return sicSector;
	}

	@JsonProperty("sicSector")
	public void setSicSector(String sicSector) {
		this.sicSector = sicSector;
	}

	@JsonProperty("industry")
	public String getIndustry() {
		return industry;
	}

	@JsonProperty("industry")
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	@JsonProperty("subIndustry")
	public String getSubIndustry() {
		return subIndustry;
	}

	@JsonProperty("subIndustry")
	public void setSubIndustry(String subIndustry) {
		this.subIndustry = subIndustry;
	}

	@JsonProperty("businessSummary")
	public String getBusinessSummary() {
		return businessSummary;
	}

	@JsonProperty("businessSummary")
	public void setBusinessSummary(String businessSummary) {
		this.businessSummary = businessSummary;
	}

	@JsonProperty("ceo")
	public String getCeo() {
		return ceo;
	}

	@JsonProperty("ceo")
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	@JsonProperty("qtrOneEarnings")
	public double getQtrOneEarnings() {
		return qtrOneEarnings;
	}

	@JsonProperty("qtrOneEarnings")
	public void setQtrOneEarnings(double qtrOneEarnings) {
		this.qtrOneEarnings = qtrOneEarnings;
	}

	@JsonProperty("qtrTwoEarnings")
	public double getQtrTwoEarnings() {
		return qtrTwoEarnings;
	}

	@JsonProperty("qtrTwoEarnings")
	public void setQtrTwoEarnings(double qtrTwoEarnings) {
		this.qtrTwoEarnings = qtrTwoEarnings;
	}

	@JsonProperty("qtrThreeEarnings")
	public double getQtrThreeEarnings() {
		return qtrThreeEarnings;
	}

	@JsonProperty("qtrThreeEarnings")
	public void setQtrThreeEarnings(double qtrThreeEarnings) {
		this.qtrThreeEarnings = qtrThreeEarnings;
	}

	@JsonProperty("qtrFourEarnings")
	public double getQtrFourEarnings() {
		return qtrFourEarnings;
	}

	@JsonProperty("qtrFourEarnings")
	public void setQtrFourEarnings(double qtrFourEarnings) {
		this.qtrFourEarnings = qtrFourEarnings;
	}

	@JsonProperty("address")
	public String getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(String address) {
		this.address = address;
	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("zipCode")
	public String getZipCode() {
		return zipCode;
	}

	@JsonProperty("zipCode")
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@JsonProperty("phoneNumber")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	@JsonProperty("phoneNumber")
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
