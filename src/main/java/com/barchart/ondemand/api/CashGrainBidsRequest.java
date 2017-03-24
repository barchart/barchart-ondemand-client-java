package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import com.barchart.ondemand.api.responses.CashGrainBids;

public class CashGrainBidsRequest implements OnDemandRequest<CashGrainBids> {

	private final String zipCode;
	private final String getAllBids;
	private final String location;
	private final String companyName;
	private final String getAllLocations;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private CashGrainBidsRequest(Builder builder) {

		this.zipCode = builder.zipCode;
		this.getAllBids = builder.getAllBids;
		this.location = builder.location;
		this.companyName = builder.companyName;
		this.getAllLocations = builder.getAllLocations;

	}

	@Override
	public String endpoint() {
		return "getGrainBids.json";
	}

	@Override
	public String name() {
		return "Cash Grain Bids";
	}

	@Override
	public Map<String, Object> parameters() {
		if (!zipCode.isEmpty()) {
			params.put("zipCode", zipCode);
		}
		if (getAllBids != null && !getAllBids.isEmpty()) {
			params.put("getAllBids", getAllBids);
		}
		if (location != null && !location.isEmpty()) {
			params.put("location", location);
		}
		if (location != null && !companyName.isEmpty()) {
			params.put("companyName", companyName);
		}
		if (location != null && !getAllLocations.isEmpty()) {
			params.put("getAllLocations", getAllLocations);
		}

		return params;
	}

	@Override
	public Class<CashGrainBids> responseType() {
		return CashGrainBids.class;
	}

	public static class Builder {

		String zipCode;
		String getAllBids;
		String location;
		String companyName;
		String getAllLocations;

		public Builder zipCode(final String zipCode) {
			this.zipCode = zipCode;
			return this;
		}

		public Builder getAllBids(final String getAllBids) {
			this.getAllBids = getAllBids;
			return this;
		}

		public Builder location(final String location) {
			this.location = location;
			return this;
		}

		public Builder companyName(final String companyName) {
			this.companyName = companyName;
			return this;
		}

		public Builder getAllLocations(final String getAllLocations) {
			this.getAllLocations = getAllLocations;
			return this;
		}

		public OnDemandRequest<CashGrainBids> build() {
			return new CashGrainBidsRequest(this);
		}
	}

}
