package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.responses.Signals;

public class SignalsRequest implements OnDemandRequest<Signals> {

	private final String symbols;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private SignalsRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		this.fields = SignalsRequestField.forQuery(b.fields);

	}

	@Override
	public String endpoint() {

		return "getSignal.json";
	}

	@Override
	public String name() {

		return "Signals";
	}

	@Override
	public Map<String, Object> parameters() {

		params.put("symbols", symbols);

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	@Override
	public Class<Signals> responseType() {
		return Signals.class;
	}

	public static class Builder {

		private String[] symbols;
		private SignalsRequestField[] fields;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder fields(final SignalsRequestField[] fields) {
			this.fields = fields;
			return this;
		}

		public SignalsRequest build() {
			return new SignalsRequest(this);
		}
	}

}
