import com.barchart.ondemand.BarchartOnDemandClient;
import com.barchart.ondemand.api.QuoteRequest;
import com.barchart.ondemand.api.QuoteRequest.QuoteRequestField;
import com.barchart.ondemand.api.TechnicalsRequest;
import com.barchart.ondemand.api.TechnicalsRequestField;
import com.barchart.ondemand.api.responses.Quote;
import com.barchart.ondemand.api.responses.Quotes;
import com.barchart.ondemand.api.responses.Technical;
import com.barchart.ondemand.api.responses.Technicals;

public class ClientSandbox {

	public static void main(String[] args) throws Exception {
		new ClientSandbox(args[0]);
	}

	private final BarchartOnDemandClient onDemand;

	public ClientSandbox(final String apiKey) throws Exception {

		onDemand = new BarchartOnDemandClient.Builder().apiKey(apiKey).debug(true).build();

		final TechnicalsRequest.Builder builder = new TechnicalsRequest.Builder();

		builder.symbols(new String[] { "AAPL", "AMZN" });
		builder.fields(new TechnicalsRequestField[] { TechnicalsRequestField.HIST_VOL_20_DAY });

		final Technicals results = onDemand.fetch(builder.build());

		for (Technical q : results.all()) {
			System.out.println("Tech : " + q.getSymbol() + ", 20 day historic vol = "
					+ q.getTwentyDayHistoricVolatility());
		}

		// quote

		final QuoteRequest.Builder qBuilder = new QuoteRequest.Builder();

		qBuilder.fields(QuoteRequestField.values());
		qBuilder.symbols(new String[] { "APPL", "NEM", "TBY0", "GH*1" });

		final Quotes qResults = onDemand.fetch(qBuilder.build());

		for (Quote q : qResults.all()) {
			System.out.println("Quote : " + q.getSymbol() + " last = " + q.getLastPrice());
		}

	}
}
