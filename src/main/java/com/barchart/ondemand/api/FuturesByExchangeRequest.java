package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import com.barchart.ondemand.api.responses.FuturesByExchange;

public class FuturesByExchangeRequest implements OnDemandRequest<FuturesByExchange> {

	private final String exchange;
	private final String fields;
	private final String category;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private FuturesByExchangeRequest(final Builder b) {

		this.exchange = b.exchange;
		this.category = b.category;

		this.fields = GenericRequestField.forQuery(b.fields);
	}

	@Override
	public String endpoint() {

		return "getFuturesByExchange.json";
	}

	@Override
	public String name() {

		return "Futures By Exchange";
	}

	@Override
	public Map<String, Object> parameters() {

		if (exchange != null) {
			params.put("exchange", exchange);
		}

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		if (category != null) {
			params.put("category", category);
		}

		return params;
	}

	@Override
	public Class<FuturesByExchange> responseType() {
		return FuturesByExchange.class;
	}

	public static class Builder {

		private String exchange;
		private String category;
		private GenericRequestField[] fields;

		public Builder exchange(final String exchange) {
			this.exchange = exchange;
			return this;
		}

		public Builder fields(final GenericRequestField[] fields) {
			this.fields = fields;
			return this;
		}

		public Builder category(final String category) {
			this.category = category;
			return this;
		}

		public FuturesByExchangeRequest build() {
			return new FuturesByExchangeRequest(this);
		}
	}

}
