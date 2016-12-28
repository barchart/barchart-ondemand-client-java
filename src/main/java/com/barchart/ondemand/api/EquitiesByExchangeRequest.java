package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import com.barchart.ondemand.api.responses.EquitiesByExchange;

public class EquitiesByExchangeRequest implements OnDemandRequest<EquitiesByExchange> {

	private final String exchange;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private EquitiesByExchangeRequest(final Builder b) {

		this.exchange = b.exchange;

		this.fields = GenericRequestField.forQuery(b.fields);
	}

	@Override
	public String endpoint() {

		return "getEquitiesByExchange.json";
	}

	@Override
	public String name() {

		return "Equities By Exchange";
	}

	@Override
	public Map<String, Object> parameters() {

		if (exchange != null) {
			params.put("exchange", exchange);
		}

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	@Override
	public Class<EquitiesByExchange> responseType() {
		return EquitiesByExchange.class;
	}

	public static class Builder {

		private String exchange;
		private GenericRequestField[] fields;

		public Builder exchange(final String exchange) {
			this.exchange = exchange;
			return this;
		}

		public Builder fields(final GenericRequestField[] fields) {
			this.fields = fields;
			return this;
		}

		public EquitiesByExchangeRequest build() {
			return new EquitiesByExchangeRequest(this);
		}
	}

}
