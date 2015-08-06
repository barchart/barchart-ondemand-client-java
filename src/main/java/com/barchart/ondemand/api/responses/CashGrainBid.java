package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "bids", "distance", "company", "locationId", "location", "address", "city", "state", "lng", "lat",
		"phone", "url", "zip" })
public class CashGrainBid {

	@JsonProperty("bids")
	private List<Bid> bids = new ArrayList<Bid>();
	@JsonProperty("distance")
	private String distance;
	@JsonProperty("company")
	private String company;
	@JsonProperty("locationId")
	private String locationId;
	@JsonProperty("location")
	private String location;
	@JsonProperty("address")
	private String address;
	@JsonProperty("city")
	private String city;
	@JsonProperty("state")
	private String state;
	@JsonProperty("lng")
	private String lng;
	@JsonProperty("lat")
	private String lat;
	@JsonProperty("phone")
	private String phone;
	@JsonProperty("url")
	private String url;
	@JsonProperty("zip")
	private String zip;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The bids
	 */
	@JsonProperty("bids")
	public List<Bid> getBids() {
		return bids;
	}

	/**
	 * 
	 * @param bids
	 *            The bids
	 */
	@JsonProperty("bids")
	public void setBids(List<Bid> bids) {
		this.bids = bids;
	}

	/**
	 * 
	 * @return The distance
	 */
	@JsonProperty("distance")
	public String getDistance() {
		return distance;
	}

	/**
	 * 
	 * @param distance
	 *            The distance
	 */
	@JsonProperty("distance")
	public void setDistance(String distance) {
		this.distance = distance;
	}

	/**
	 * 
	 * @return The company
	 */
	@JsonProperty("company")
	public String getCompany() {
		return company;
	}

	/**
	 * 
	 * @param company
	 *            The company
	 */
	@JsonProperty("company")
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * 
	 * @return The locationId
	 */
	@JsonProperty("locationId")
	public String getLocationId() {
		return locationId;
	}

	/**
	 * 
	 * @param locationId
	 *            The locationId
	 */
	@JsonProperty("locationId")
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	/**
	 * 
	 * @return The location
	 */
	@JsonProperty("location")
	public String getLocation() {
		return location;
	}

	/**
	 * 
	 * @param location
	 *            The location
	 */
	@JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * 
	 * @return The address
	 */
	@JsonProperty("address")
	public String getAddress() {
		return address;
	}

	/**
	 * 
	 * @param address
	 *            The address
	 */
	@JsonProperty("address")
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	 * @return The city
	 */
	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	/**
	 * 
	 * @param city
	 *            The city
	 */
	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 
	 * @return The state
	 */
	@JsonProperty("state")
	public String getState() {
		return state;
	}

	/**
	 * 
	 * @param state
	 *            The state
	 */
	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	 * @return The lng
	 */
	@JsonProperty("lng")
	public String getLng() {
		return lng;
	}

	/**
	 * 
	 * @param lng
	 *            The lng
	 */
	@JsonProperty("lng")
	public void setLng(String lng) {
		this.lng = lng;
	}

	/**
	 * 
	 * @return The lat
	 */
	@JsonProperty("lat")
	public String getLat() {
		return lat;
	}

	/**
	 * 
	 * @param lat
	 *            The lat
	 */
	@JsonProperty("lat")
	public void setLat(String lat) {
		this.lat = lat;
	}

	/**
	 * 
	 * @return The phone
	 */
	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	/**
	 * 
	 * @param phone
	 *            The phone
	 */
	@JsonProperty("phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 
	 * @return The url
	 */
	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	/**
	 * 
	 * @param url
	 *            The url
	 */
	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 
	 * @return The zip
	 */
	@JsonProperty("zip")
	public String getZip() {
		return zip;
	}

	/**
	 * 
	 * @param zip
	 *            The zip
	 */
	@JsonProperty("zip")
	public void setZip(String zip) {
		this.zip = zip;
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