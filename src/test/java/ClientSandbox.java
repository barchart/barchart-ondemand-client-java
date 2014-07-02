import com.barchart.ondemand.BarchartOnDemandClient;
import com.barchart.ondemand.api.WeatherRequest;
import com.barchart.ondemand.api.WeatherRequest.WeatherRequestType;
import com.barchart.ondemand.api.responses.Weather;
import com.barchart.ondemand.api.responses.WeatherForecast;

public class ClientSandbox {

	public static void main(String[] args) throws Exception {
		new ClientSandbox(args[0]);
	}

	private final BarchartOnDemandClient onDemand;

	public ClientSandbox(final String apiKey) throws Exception {

		onDemand = new BarchartOnDemandClient.Builder().apiKey(apiKey).debug(true).build();

		final WeatherRequest.Builder builder = new WeatherRequest.Builder();

		builder.zipCode("60606");
		builder.weatherType(WeatherRequestType.FORECAST);

		final Weather results = (Weather) onDemand.fetch(builder.build());

		for (WeatherForecast q : results.all()) {
			System.out.println("WeatherForecast : " + q.getFeelsLike() + " = " + q);
		}

	}
}
