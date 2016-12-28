import com.barchart.ondemand.BarchartOnDemandClient;
import com.barchart.ondemand.api.EodQuoteRequest;
import com.barchart.ondemand.api.EquitiesByExchangeRequest;
import com.barchart.ondemand.api.FuturesByExchangeRequest;
import com.barchart.ondemand.api.QuoteRequest;
import com.barchart.ondemand.api.OnDemandRequest.GenericRequestField;
import com.barchart.ondemand.api.QuoteRequest.QuoteRequestField;
import com.barchart.ondemand.api.TechnicalsRequest;
import com.barchart.ondemand.api.TechnicalsRequestField;
import com.barchart.ondemand.api.responses.EodQuote;
import com.barchart.ondemand.api.responses.EodQuotes;
import com.barchart.ondemand.api.responses.EquitiesByExchange;
import com.barchart.ondemand.api.responses.FuturesByExchange;
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

		// EOD quote

		final EodQuoteRequest.Builder eodBuilder = new EodQuoteRequest.Builder();

		eodBuilder.symbols(new String[] { "APPL", "NEM", "TBY0", "GH*1" });

		final EodQuotes eodResults = onDemand.fetch(eodBuilder.build());

		for (EodQuote q : eodResults.all()) {
			System.out.println("EOD Quote : " + q.getSymbol() + " close = " + q.getClose());
		}

		// Futures by Exchange

		final FuturesByExchangeRequest.Builder futBuilder = new FuturesByExchangeRequest.Builder();

		futBuilder.exchange("CME");

		final FuturesByExchange futResults = onDemand.fetch(futBuilder.build());

		for (Quote q : futResults.all()) {
			System.out.println("Future Quote [CME] : " + q.getSymbol() + " last = " + q.getLastPrice());
		}

		// Equities by Exchange

		final EquitiesByExchangeRequest.Builder eqBuilder = new EquitiesByExchangeRequest.Builder();

		eqBuilder.exchange("NYSE");
		eqBuilder.fields(new GenericRequestField[] { GenericRequestField.PREVIOUS_CLOSE });

		final EquitiesByExchange eqResults = onDemand.fetch(eqBuilder.build());

		for (Quote q : eqResults.all()) {
			System.out.println("Equities Quote [NYSE] : " + q.getSymbol() + " last = " + q.getLast() + " prev close = "
					+ q.getPreviousClose());
		}
	}
}
