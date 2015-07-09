package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.responses.FuturesSpecifications;

public class FuturesSpecificationsRequest implements OnDemandRequest<FuturesSpecifications> {

	private final String symbols;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private FuturesSpecificationsRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		this.fields = "";

		if (b.exchanges != null) {
			params.put("exchanges", StringUtils.join(b.exchanges, ","));
		}
		if (b.futuresCategory != null) {
			params.put("futuresCategory", StringUtils.join(b.futuresCategory, ","));
		}

	}

	@Override
	public String endpoint() {

		return "getFuturesSpecifications.json";
	}

	@Override
	public String name() {

		return "Futures Specifications";
	}

	@Override
	public Map<String, Object> parameters() {

		if (symbols != null && !symbols.isEmpty()) {
			params.put("symbols", symbols);
		}

		if (!fields.isEmpty()) {
			params.put("fields", fields);
		}

		return params;
	}

	@Override
	public Class<FuturesSpecifications> responseType() {
		return FuturesSpecifications.class;
	}

	public static class Builder {
		private String[] symbols;
		private String[] exchanges;
		private String[] futuresCategory;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder exchanges(final String[] exchanges) {
			this.exchanges = exchanges;
			return this;
		}

		public Builder futuresCategory(final String[] futuresCategory) {
			this.futuresCategory = futuresCategory;
			return this;
		}

		public FuturesSpecificationsRequest build() {
			return new FuturesSpecificationsRequest(this);
		}
	}

}
