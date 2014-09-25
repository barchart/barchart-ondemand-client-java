package com.barchart.ondemand.api.responses;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "commodityType", "location", "bidType", "lowPrice", "highPrice", "priceChange", "basis",
		"bidChange" })
public class USDAGrain {

	@JsonProperty("commodityType")
	private String commodityType;
	@JsonProperty("location")
	private String location;
	@JsonProperty("bidType")
	private String bidType;
	@JsonProperty("lowPrice")
	private double lowPrice;
	@JsonProperty("highPrice")
	private double highPrice;
	@JsonProperty("priceChange")
	private String priceChange;
	@JsonProperty("basis")
	private String basis;
	@JsonProperty("bidChange")
	private String bidChange;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("commodityType")
	public String getCommodityType() {
		return commodityType;
	}

	@JsonProperty("commodityType")
	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
	}

	@JsonProperty("location")
	public String getLocation() {
		return location;
	}

	@JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}

	@JsonProperty("bidType")
	public String getBidType() {
		return bidType;
	}

	@JsonProperty("bidType")
	public void setBidType(String bidType) {
		this.bidType = bidType;
	}

	@JsonProperty("lowPrice")
	public double getLowPrice() {
		return lowPrice;
	}

	@JsonProperty("lowPrice")
	public void setLowPrice(double lowPrice) {
		this.lowPrice = lowPrice;
	}

	@JsonProperty("highPrice")
	public double getHighPrice() {
		return highPrice;
	}

	@JsonProperty("highPrice")
	public void setHighPrice(double highPrice) {
		this.highPrice = highPrice;
	}

	@JsonProperty("priceChange")
	public String getPriceChange() {
		return priceChange;
	}

	@JsonProperty("priceChange")
	public void setPriceChange(String priceChange) {
		this.priceChange = priceChange;
	}

	@JsonProperty("basis")
	public String getBasis() {
		return basis;
	}

	@JsonProperty("basis")
	public void setBasis(String basis) {
		this.basis = basis;
	}

	@JsonProperty("bidChange")
	public String getBidChange() {
		return bidChange;
	}

	@JsonProperty("bidChange")
	public void setBidChange(String bidChange) {
		this.bidChange = bidChange;
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
