import com.barchart.ondemand.BarchartOnDemandClient;
import com.barchart.ondemand.api.QuoteRequest;
import com.barchart.ondemand.api.QuoteRequest.QuoteRequestField;
import com.barchart.ondemand.api.QuoteRequest.QuoteRequestMode;
import com.barchart.ondemand.api.responses.Quote;
import com.barchart.ondemand.api.responses.Quotes;
import com.barchart.ondemand.util.JsonUtil;

public class ClientTest {

	public static void main(String[] args) throws Exception {
		new ClientTest(args[0]);
	}

	private final BarchartOnDemandClient onDemand;

	public ClientTest(final String apiKey) throws Exception {

		onDemand = new BarchartOnDemandClient.Builder().apiKey(apiKey).build();

		/* build a new getQuotes request */
		final QuoteRequest.Builder builder = new QuoteRequest.Builder();

		/* add symbols to request */
		builder.symbols(new String[] { "AAPL", "GOOG" });
		/* set mode to real-time */
		builder.mode(QuoteRequestMode.REAL_TIME);
		/* add optional request fields */
		builder.fields(new QuoteRequestField[] { QuoteRequestField._52_WEEK_HIGH_DATE });

		/* fetch results */
		final Quotes quotes = onDemand.fetch(builder.build());

		for (Quote q : quotes.all()) {
			System.out.println("Quote for : " + q.getSymbol() + " = " + q);
		}

		System.out.println("Quote by symbol = " + JsonUtil.intoJson(quotes.bySymbol("AAPL")));

		//

		System.out.println("Sleeping 5 seconds and then refreshing data...");

		Thread.sleep(5000);

		/* refresh data with new API call */

		final boolean refreshResult = quotes.refresh();

		System.out.println("Refreshed = " + refreshResult);

		for (Quote q : quotes.all()) {
			System.out.println("Refreshed Quote for : " + q.getSymbol() + " = " + q);
		}

	}
}
