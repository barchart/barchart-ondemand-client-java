import com.barchart.ondemand.BarchartOnDemandClient;
import com.barchart.ondemand.api.CorporateActionsRequest;
import com.barchart.ondemand.api.responses.CorporateAction;
import com.barchart.ondemand.api.responses.CorporateActions;

public class ClientSandbox {

	public static void main(String[] args) throws Exception {
		new ClientSandbox(args[0]);
	}

	private final BarchartOnDemandClient onDemand;

	public ClientSandbox(final String apiKey) throws Exception {

		onDemand = new BarchartOnDemandClient.Builder().apiKey(apiKey).debug(true).build();

		final CorporateActionsRequest.Builder builder = new CorporateActionsRequest.Builder();

		builder.symbols(new String[] { "AAPL", "GOOG" });

		final CorporateActions results = (CorporateActions) onDemand.fetch(builder.build());

		for (CorporateAction q : results.all()) {
			System.out.println("CorporateAction : " + q.getSymbol() + " = " + q);
		}

	}
}
