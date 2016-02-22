package com.barchart.ondemand.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.barchart.ondemand.api.responses.CorporateActions;
import com.barchart.ondemand.api.responses.CorporateActions.EventType;

public class CorporateActionsRequest implements OnDemandRequest<CorporateActions> {

	private final String symbols;
	private final String fields;

	private final Map<String, Object> params = new HashMap<String, Object>();

	private CorporateActionsRequest(final Builder b) {

		this.symbols = StringUtils.join(b.symbols, ",");

		// FIXME OnDemand should accept these as an array
		// if you pass 'Split' instead of 'split' you will get all even
		// types but only for the first symbol :)

		if (b.eventTypes == null) {
			params.put("eventType", "split");
		} else {
			params.put("eventType", StringUtils.join(b.eventTypes, ",").toLowerCase());
		}

		//

		if (b.maxRecords > 0) {
			params.put("maxRecords", b.maxRecords);
		}

		this.fields = "";

	}

	@Override
	public String endpoint() {

		return "getCorporateActions.json";
	}

	@Override
	public String name() {

		return "Corporate Actions";
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
	public Class<CorporateActions> responseType() {
		return CorporateActions.class;
	}

	/* builder magic * */

	public static class Builder {

		private String[] symbols;
		private EventType[] eventTypes;
		private int maxRecords;

		public Builder symbols(final String[] symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder eventTypes(final EventType[] eventTypes) {
			this.eventTypes = eventTypes;
			return this;
		}

		public Builder maxRecords(final int maxRecords) {
			this.maxRecords = maxRecords;
			return this;
		}

		public CorporateActionsRequest build() {
			return new CorporateActionsRequest(this);
		}
	}

}
