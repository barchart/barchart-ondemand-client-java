import com.barchart.ondemand.BarchartOnDemandClient;
import com.barchart.ondemand.api.LeadersRequest;
import com.barchart.ondemand.api.LeadersRequest.LeadersAssetType;
import com.barchart.ondemand.api.LeadersRequest.LeadersRequestType;
import com.barchart.ondemand.api.responses.Leader;
import com.barchart.ondemand.api.responses.Leaders;

public class ClientSandbox {

	public static void main(String[] args) throws Exception {
		new ClientSandbox(args[0]);
	}

	private final BarchartOnDemandClient onDemand;

	public ClientSandbox(final String apiKey) throws Exception {

		onDemand = new BarchartOnDemandClient.Builder().apiKey(apiKey).debug(true).build();

		final LeadersRequest.Builder builder = new LeadersRequest.Builder();

		builder.assetType(LeadersAssetType.STOCK);
		builder.type(LeadersRequestType.GAINERS_5_DAY);
		builder.exchanges(new String[] { "NYSE", "NASDAQ" });
		final Leaders results = (Leaders) onDemand.fetch(builder.build());

		for (Leader q : results.all()) {
			System.out.println("Leader : [" + q.getExchange() + "] " + q.getSymbol() + " = " + q);
		}

	}
}
