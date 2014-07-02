import com.barchart.ondemand.BarchartOnDemandClient;
import com.barchart.ondemand.api.MomentumRequest;
import com.barchart.ondemand.api.SignalsRequest;
import com.barchart.ondemand.api.responses.Momentum;
import com.barchart.ondemand.api.responses.Momentums;
import com.barchart.ondemand.api.responses.Signal;
import com.barchart.ondemand.api.responses.Signals;

public class ClientSandbox {

	public static void main(String[] args) throws Exception {
		new ClientSandbox(args[0]);
	}

	private final BarchartOnDemandClient onDemand;

	public ClientSandbox(final String apiKey) throws Exception {

		onDemand = new BarchartOnDemandClient.Builder().apiKey(apiKey).debug(true).build();

		final MomentumRequest.Builder builder = new MomentumRequest.Builder();

		builder.exchanges(new String[] { "NYSE", "NASDAQ" });

		final Momentums results = (Momentums) onDemand.fetch(builder.build());

		for (Momentum q : results.all()) {
			System.out.println("Momentum : " + q.getExchange() + " = " + q);
		}

	}
}
