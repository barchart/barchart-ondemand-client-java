package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

public class CashGrainBidsRequest implements OnDemandRequest {
	
	private final String zipCode;
	
	private final Map<String, Object> params = new HashMap<String, Object>();
	
	private CashGrainBidsRequest(Builder builder) {
		
		this.zipCode = builder.zipCode;
		
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
		return params;
	}
	
	public static class Builder {
		
		String zipCode;
		
		public Builder zipCode(final String zipCode) {
			this.zipCode = zipCode;
			return this;
		}

		public OnDemandRequest build() {
			return new CashGrainBidsRequest(this);
		}
	}


}
