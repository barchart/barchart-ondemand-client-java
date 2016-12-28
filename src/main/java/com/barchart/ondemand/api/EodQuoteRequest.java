package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.responses.EodQuotes;

public class EodQuoteRequest implements OnDemandRequest<EodQuotes> {

	private final Map<String, Object> params = new HashMap<String, Object>();

	private final String symbols;
	private final String exchanges;

	private EodQuoteRequest(Builder b) {
		this.symbols = StringUtils.join(b.symbols, ",");
		this.exchanges = StringUtils.join(b.exchanges, ",");
	}

	@Override
	public String endpoint() {
		return "getQuoteEod.json";
	}

	@Override
	public String name() {
		return "EOD Quote";
	}

	@Override
	public Map<String, Object> parameters() {

		params.put("symbols", symbols);

		if (exchanges != null) {
			params.put("exchange", exchanges);
		}

		return params;
	}

	@Override
	public Class<EodQuotes> responseType() {
		return EodQuotes.class;
	}

	public static class Builder {

		private String[] symbols;
		private String[] exchanges;

		public Builder symbols(String... symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder exchanges(String... exchanges) {
			this.exchanges = exchanges;
			return this;
		}

		public EodQuoteRequest build() {
			return new EodQuoteRequest(this);
		}
	}

}
