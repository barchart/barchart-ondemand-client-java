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
@JsonPropertyOrder({ "exchange", "advancingIssues", "decliningIssues", "unchangedIssues", "advancingIssuesPct",
		"decliningIssuesPct", "unchangedIssuesPct", "advancingShares", "decliningShares", "unchangedShares",
		"newHighs", "newLows" })
public class Momentum {

	@JsonProperty("exchange")
	private String exchange;
	@JsonProperty("advancingIssues")
	private int advancingIssues;
	@JsonProperty("decliningIssues")
	private int decliningIssues;
	@JsonProperty("unchangedIssues")
	private int unchangedIssues;
	@JsonProperty("advancingIssuesPct")
	private int advancingIssuesPct;
	@JsonProperty("decliningIssuesPct")
	private int decliningIssuesPct;
	@JsonProperty("unchangedIssuesPct")
	private int unchangedIssuesPct;
	@JsonProperty("advancingShares")
	private int advancingShares;
	@JsonProperty("decliningShares")
	private int decliningShares;
	@JsonProperty("unchangedShares")
	private int unchangedShares;
	@JsonProperty("newHighs")
	private int newHighs;
	@JsonProperty("newLows")
	private int newLows;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("exchange")
	public String getExchange() {
		return exchange;
	}

	@JsonProperty("exchange")
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	@JsonProperty("advancingIssues")
	public int getAdvancingIssues() {
		return advancingIssues;
	}

	@JsonProperty("advancingIssues")
	public void setAdvancingIssues(int advancingIssues) {
		this.advancingIssues = advancingIssues;
	}

	@JsonProperty("decliningIssues")
	public int getDecliningIssues() {
		return decliningIssues;
	}

	@JsonProperty("decliningIssues")
	public void setDecliningIssues(int decliningIssues) {
		this.decliningIssues = decliningIssues;
	}

	@JsonProperty("unchangedIssues")
	public int getUnchangedIssues() {
		return unchangedIssues;
	}

	@JsonProperty("unchangedIssues")
	public void setUnchangedIssues(int unchangedIssues) {
		this.unchangedIssues = unchangedIssues;
	}

	@JsonProperty("advancingIssuesPct")
	public int getAdvancingIssuesPct() {
		return advancingIssuesPct;
	}

	@JsonProperty("advancingIssuesPct")
	public void setAdvancingIssuesPct(int advancingIssuesPct) {
		this.advancingIssuesPct = advancingIssuesPct;
	}

	@JsonProperty("decliningIssuesPct")
	public int getDecliningIssuesPct() {
		return decliningIssuesPct;
	}

	@JsonProperty("decliningIssuesPct")
	public void setDecliningIssuesPct(int decliningIssuesPct) {
		this.decliningIssuesPct = decliningIssuesPct;
	}

	@JsonProperty("unchangedIssuesPct")
	public int getUnchangedIssuesPct() {
		return unchangedIssuesPct;
	}

	@JsonProperty("unchangedIssuesPct")
	public void setUnchangedIssuesPct(int unchangedIssuesPct) {
		this.unchangedIssuesPct = unchangedIssuesPct;
	}

	@JsonProperty("advancingShares")
	public int getAdvancingShares() {
		return advancingShares;
	}

	@JsonProperty("advancingShares")
	public void setAdvancingShares(int advancingShares) {
		this.advancingShares = advancingShares;
	}

	@JsonProperty("decliningShares")
	public int getDecliningShares() {
		return decliningShares;
	}

	@JsonProperty("decliningShares")
	public void setDecliningShares(int decliningShares) {
		this.decliningShares = decliningShares;
	}

	@JsonProperty("unchangedShares")
	public int getUnchangedShares() {
		return unchangedShares;
	}

	@JsonProperty("unchangedShares")
	public void setUnchangedShares(int unchangedShares) {
		this.unchangedShares = unchangedShares;
	}

	@JsonProperty("newHighs")
	public int getNewHighs() {
		return newHighs;
	}

	@JsonProperty("newHighs")
	public void setNewHighs(int newHighs) {
		this.newHighs = newHighs;
	}

	@JsonProperty("newLows")
	public int getNewLows() {
		return newLows;
	}

	@JsonProperty("newLows")
	public void setNewLows(int newLows) {
		this.newLows = newLows;
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
