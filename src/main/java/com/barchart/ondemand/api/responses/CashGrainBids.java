package com.barchart.ondemand.api.responses;

import java.util.ArrayList;
import java.util.Collection;
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
@JsonPropertyOrder({ "results" })
public class CashGrainBids extends ResponseBase {

	@JsonProperty("results")
	private List<CashGrainBid> results = new ArrayList<CashGrainBid>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The results
	 */
	@JsonProperty("results")
	public List<CashGrainBid> getResults() {
		return results;
	}

	/**
	 * 
	 * @param results
	 *            The results
	 */
	@JsonProperty("results")
	public void setResults(List<CashGrainBid> results) {
		this.results = results;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
	public Collection<Bid> forLocation(final String location) {
		for (CashGrainBid cashGrainBid : getResults()) {
			if (cashGrainBid.getLocationId().equals(location)) {
				return cashGrainBid.getBids();
			}
		}
		return null;
	}

}