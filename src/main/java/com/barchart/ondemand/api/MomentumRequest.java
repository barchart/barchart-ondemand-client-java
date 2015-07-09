package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.responses.Momentums;

public class MomentumRequest implements OnDemandRequest<Momentums> {

	private final String exchanges;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private MomentumRequest(final Builder b) {

		this.exchanges = StringUtils.join(b.exchanges, ",");

		this.fields = "";

	}

	@Override
	public String endpoint() {

		return "getMomentum.json";
	}

	@Override
	public String name() {

		return "Exchange Momentum";
	}

	@Override
	public Map<String, Object> parameters() {

		params.put("exchanges", exchanges);

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	@Override
	public Class<Momentums> responseType() {
		return Momentums.class;
	}

	public static class Builder {

		private String[] exchanges;

		public Builder exchanges(final String[] exchanges) {
			this.exchanges = exchanges;
			return this;
		}

		public MomentumRequest build() {
			return new MomentumRequest(this);
		}
	}

}
