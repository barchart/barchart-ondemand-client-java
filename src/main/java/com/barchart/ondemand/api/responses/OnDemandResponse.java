package com.barchart.ondemand.api.responses;

import com.barchart.ondemand.api.OnDemandRequest;

public interface OnDemandResponse {

	/**
	 * 
	 * @return True if the API call was Ok, but there were no results returned.
	 */
	public boolean isEmpty();

	/**
	 * Original request that produced this result.
	 * 
	 * @return
	 */
	public OnDemandRequest getRequest();

	/**
	 * Reruns the original query. Makes a new call and updates all data in the
	 * response.
	 * 
	 * @return True if query was successful.
	 */
	public boolean refresh();

}
