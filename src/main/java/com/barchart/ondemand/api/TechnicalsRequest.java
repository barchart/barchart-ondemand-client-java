package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.responses.Technicals;

public class TechnicalsRequest implements OnDemandRequest<Technicals> {

	private final String symbols;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private TechnicalsRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		this.fields = TechnicalsRequestField.forQuery(b.fields);

	}

	@Override
	public String endpoint() {

		return "getTechnicals.json";
	}

	@Override
	public String name() {

		return "Technical Quote";
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
	public Class<Technicals> responseType() {
		return Technicals.class;
	}

	public static class Builder {

		private String[] symbols;
		private TechnicalsRequestField[] fields;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder fields(final TechnicalsRequestField[] fields) {
			this.fields = fields;
			return this;
		}

		public TechnicalsRequest build() {
			return new TechnicalsRequest(this);
		}
	}

}
