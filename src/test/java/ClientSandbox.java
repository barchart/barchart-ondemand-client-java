import com.barchart.ondemand.BarchartOnDemandClient;
import com.barchart.ondemand.api.ChartRequest;
import com.barchart.ondemand.api.WeatherRequest;
import com.barchart.ondemand.api.WeatherRequest.WeatherRequestType;
import com.barchart.ondemand.api.responses.Chart;
import com.barchart.ondemand.api.responses.Charts;
import com.barchart.ondemand.api.responses.Weather;
import com.barchart.ondemand.api.responses.WeatherForecast;

public class ClientSandbox {

	public static void main(String[] args) throws Exception {
		new ClientSandbox(args[0]);
	}

	private final BarchartOnDemandClient onDemand;

	public ClientSandbox(final String apiKey) throws Exception {

		onDemand = new BarchartOnDemandClient.Builder().apiKey(apiKey).debug(true).build();

		final ChartRequest.Builder builder = new ChartRequest.Builder();

		builder.symbols(new String[] { "AAPL", "AMZN" });

		final Charts results = (Charts) onDemand.fetch(builder.build());

		for (Chart q : results.all()) {
			System.out.println("Chart : " + q.getSymbol() + " = " + q);
		}

	}
}
