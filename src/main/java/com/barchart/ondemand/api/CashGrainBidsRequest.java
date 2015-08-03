package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

public class CashGrainBidsRequest implements OnDemandRequest {
	
	private CashGrainBidsRequest(Builder builder) {
		
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
		// TODO Auto-generated method stub
		return new HashMap<String, Object>();
	}
	
	public static class Builder {

		public OnDemandRequest build() {
			return new CashGrainBidsRequest(this);
		}
	}


}
