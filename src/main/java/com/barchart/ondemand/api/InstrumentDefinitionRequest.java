package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.responses.InstrumentDefinitions;

/**
 * 
 * @author m-ehrenberg
 * 
 *         http://barchartondemand.com/api/getFuturesSpecifications
 * 
 */

public class InstrumentDefinitionRequest implements OnDemandRequest<InstrumentDefinitions> {

	private final String symbols;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private InstrumentDefinitionRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		this.fields = "";

		if (b.exchanges != null) {
			params.put("exchanges", StringUtils.join(b.exchanges, ","));
		}
		if (b.exchangeMics != null) {
			params.put("exchangeMics", StringUtils.join(b.exchangeMics, ","));
		}
		if (b.maxRecords > 0) {
			params.put("maxRecords", b.maxRecords);
		}
		if (b.offset > 0) {
			params.put("offset", b.offset);
		}

	}

	@Override
	public String endpoint() {

		return "getInstrumentDefinition.json";
	}

	@Override
	public String name() {

		return "Instrument Definition";
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
	public Class<InstrumentDefinitions> responseType() {
		return InstrumentDefinitions.class;
	}

	public static class Builder {
		private String[] symbols;
		private String[] exchanges;
		private String[] exchangeMics;
		private int maxRecords;
		private int offset;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder exchanges(final String[] exchanges) {
			this.exchanges = exchanges;
			return this;
		}

		public Builder exchangeMics(final String[] exchangeMics) {
			this.exchangeMics = exchangeMics;
			return this;
		}

		public Builder maxRecords(final int maxRecords) {
			this.maxRecords = maxRecords;
			return this;
		}

		public Builder offset(final int offset) {
			this.offset = offset;
			return this;
		}

		public InstrumentDefinitionRequest build() {
			return new InstrumentDefinitionRequest(this);
		}
	}

}
