package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

/**
 * FIXME: this is not yet implemented on the OnDemand side.
 * 
 * <br/>
 * <br/>
 * http://barchartondemand.com/get/futuresexpirations.php <br/>
 * <br/>
 * 
 * @author m-ehrenberg
 * 
 */
public class FuturesExiprationsRequest implements OnDemandRequest {

	private final String symbols;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private FuturesExiprationsRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		this.fields = "";

		if (b.exchanges != null) {
			params.put("exchanges", StringUtils.join(b.exchanges, ","));
		}
		if (b.exchanges != null) {
			params.put("exchanges", StringUtils.join(b.exchanges, ","));
		}

	}

	@Override
	public String endpoint() {

		return "getFuturesExpirations.json";
	}

	@Override
	public String name() {

		return "Futures Expirations";
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
	public Class responseType() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public static class Builder {
		private String[] symbols;
		private String[] exchanges;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder exchanges(final String[] exchanges) {
			this.exchanges = exchanges;
			return this;
		}

		public FuturesExiprationsRequest build() {
			return new FuturesExiprationsRequest(this);
		}
	}

}
