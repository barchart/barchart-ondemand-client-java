import java.io.IOException;
import java.util.Map.Entry;

import org.joda.time.DateTime;

import com.barchart.ondemand.api.BalanceSheetsRequest;
import com.barchart.ondemand.api.ChartRequest;
import com.barchart.ondemand.api.CompetitorsRequest;
import com.barchart.ondemand.api.CompetitorsRequest.CompetitorsRequestField;
import com.barchart.ondemand.api.CorporateActionsRequest;
import com.barchart.ondemand.api.FinancialHighlightRequest;
import com.barchart.ondemand.api.FinancialRatioRequest;
import com.barchart.ondemand.api.FuturesOptionsRequest;
import com.barchart.ondemand.api.FuturesSpecificationsRequest;
import com.barchart.ondemand.api.HistoryRequest;
import com.barchart.ondemand.api.IncomeStatementRequest;
import com.barchart.ondemand.api.IndexMembersRequest;
import com.barchart.ondemand.api.InstrumentDefinitionRequest;
import com.barchart.ondemand.api.LeadersRequest;
import com.barchart.ondemand.api.LeadersRequest.LeadersAssetType;
import com.barchart.ondemand.api.LeadersRequest.LeadersRequestType;
import com.barchart.ondemand.api.MomentumRequest;
import com.barchart.ondemand.api.OnDemandRequest;
import com.barchart.ondemand.api.OnDemandRequest.GenericRequestField;
import com.barchart.ondemand.api.ProfileRequest;
import com.barchart.ondemand.api.ProfileRequest.ProfileRequestField;
import com.barchart.ondemand.api.QuoteRequest;
import com.barchart.ondemand.api.QuoteRequest.QuoteRequestMode;
import com.barchart.ondemand.api.RatingsRequest;
import com.barchart.ondemand.api.RatingsRequest.RatingsRequestField;
import com.barchart.ondemand.api.SDFuturesOptionsRequest;
import com.barchart.ondemand.api.SignalsRequest;
import com.barchart.ondemand.api.SignalsRequestField;
import com.barchart.ondemand.api.SpecialOptionsClassificationRequest;
import com.barchart.ondemand.api.TechnicalsRequest;
import com.barchart.ondemand.api.TechnicalsRequestField;
import com.barchart.ondemand.api.USDAGrainsRequest;
import com.barchart.ondemand.api.WeatherRequest;
import com.barchart.ondemand.api.responses.BalanceSheets;
import com.barchart.ondemand.api.responses.Charts;
import com.barchart.ondemand.api.responses.Competitors;
import com.barchart.ondemand.api.responses.CorporateActions;
import com.barchart.ondemand.api.responses.FinancialHighlights;
import com.barchart.ondemand.api.responses.FinancialRatios;
import com.barchart.ondemand.api.responses.FuturesOptions;
import com.barchart.ondemand.api.responses.FuturesSpecification;
import com.barchart.ondemand.api.responses.FuturesSpecifications;
import com.barchart.ondemand.api.responses.History;
import com.barchart.ondemand.api.responses.IncomeStatements;
import com.barchart.ondemand.api.responses.IndexMembers;
import com.barchart.ondemand.api.responses.InstrumentDefinitions;
import com.barchart.ondemand.api.responses.Leaders;
import com.barchart.ondemand.api.responses.Momentums;
import com.barchart.ondemand.api.responses.Profiles;
import com.barchart.ondemand.api.responses.Quotes;
import com.barchart.ondemand.api.responses.Rating.RatingType;
import com.barchart.ondemand.api.responses.Ratings;
import com.barchart.ondemand.api.responses.SDFuturesOptions;
import com.barchart.ondemand.api.responses.Signals;
import com.barchart.ondemand.api.responses.SpecialOption;
import com.barchart.ondemand.api.responses.SpecialOptionsCategory;
import com.barchart.ondemand.api.responses.SpecialOptionsClassifications;
import com.barchart.ondemand.api.responses.Technicals;
import com.barchart.ondemand.api.responses.USDAGrains;
import com.barchart.ondemand.api.responses.Weather;
import com.barchart.ondemand.util.HttpUtil;
import com.barchart.ondemand.util.JsonUtil;
import com.barchart.ondemand.util.QueryUtil;

public class MainTest {

	public static void main(String[] args) {

		/* set API key */

		HttpUtil.apiKey = args[0];

		try {
			new MainTest();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public MainTest() throws IOException {

		if (true) {
			testSpecialOptions();
			return;
		}

		testHistory();
		sep();

		testSDFuturesOptions();
		sep();

		testFuturesSepecifications();
		sep();

		testUSDAGrains();
		sep();

		testCharts();
		sep();

		testLeaders();
		sep();

		testWeather();
		sep();

		testMomentums();
		sep();

		testTechnicals();
		sep();

		testSignals();
		sep();

		testProfiles();
		sep();

		testFinancialHighlights();
		sep();

		testFinancialRatios();
		sep();

		testIncomeStatements();
		sep();

		testBalanceSheets();
		sep();

		testCompetitors();
		sep();

		testRatings();
		sep();

		testQuote();
		sep();

		testIndexMembers();
		sep();

		testCorpActions();
		sep();

		testFuturesOptions();
		sep();

		testSDFuturesOptions();
		sep();

		testInstrumentDefinitons();
		sep();

	}

	private void sep() {
		System.out.println("------\\\\");
	}

	private void testSpecialOptions() throws IOException {

		final SpecialOptionsClassificationRequest.Builder builder = new SpecialOptionsClassificationRequest.Builder()
				.root("ZC");

		final SpecialOptionsClassificationRequest p = builder.build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("SpecialOptionsClassificationRequest ENDPOINT = " + url);

		final SpecialOptionsClassifications classifications = JsonUtil.fromJson(SpecialOptionsClassifications.class,
				HttpUtil.fetchString(url));

		System.out.println("SpecialOptionsClassifications = " + classifications.forRoot("ZC"));

		for (SpecialOptionsCategory soc : classifications.forRoot("ZC").getCategories()) {
			System.out.println("Category: " + soc.getName());
			for (SpecialOption so : soc.getOptionsTypes()) {
				System.out.println("Type: " + so.getName() + " Symbol: " + so.getSymbol());
			}
		}

	}

	private void testHistory() throws IOException {

		final HistoryRequest.Builder builder = new HistoryRequest.Builder().symbol("AAPL")
				.start(new DateTime(2012, 2, 3, 11, 11)).end(new DateTime(2012, 3, 3, 11, 11));

		final HistoryRequest p = builder.build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("HistoryRequest ENDPOINT = " + url);

		final History history = JsonUtil.fromJson(History.class, HttpUtil.fetchString(url));

		System.out.println("History = " + history.all());
	}

	private void testProfiles() throws IOException {

		final ProfileRequest.Builder builder = new ProfileRequest.Builder().symbols(new String[] { "AAPL", "GOOG" });

		builder.eventTypes(new ProfileRequestField[] { ProfileRequestField.QTR_FOUR_EARNINGS });

		final ProfileRequest p = builder.build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("ProfileRequest ENDPOINT = " + url);

		final Profiles profiles = JsonUtil.fromJson(Profiles.class, HttpUtil.fetchString(url));

		System.out.println("Profile for AAPL = " + profiles.bySymbol("AAPL"));
	}

	private void testFinancialHighlights() throws IOException {

		final FinancialHighlightRequest p = new FinancialHighlightRequest.Builder().symbols(new String[] { "AAPL", "GOOG" })
				.build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("FinancialHighlightRequest ENDPOINT = " + url);

		final FinancialHighlights results = JsonUtil.fromJson(FinancialHighlights.class, HttpUtil.fetchString(url));

		System.out.println("Highlights for AAPL = " + results.bySymbol("AAPL"));
	}

	private void testFinancialRatios() throws IOException {

		final FinancialRatioRequest p = new FinancialRatioRequest.Builder().symbols(new String[] { "AAPL", "GOOG" }).build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("FinancialHighlightRequest ENDPOINT = " + url);

		final FinancialRatios results = JsonUtil.fromJson(FinancialRatios.class, HttpUtil.fetchString(url));

		System.out.println("FinancialRatios = " + results.bySymbol("AAPL"));
	}

	private void testIncomeStatements() throws IOException {

		final IncomeStatementRequest.Builder pBuilder = new IncomeStatementRequest.Builder().symbols(new String[] {
				"AAPL", "GOOG" });

		pBuilder.eventTypes(GenericRequestField.ANNUAL);
		pBuilder.count(2);

		final IncomeStatementRequest p = pBuilder.build();

		String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("IncomeStatementRequest ENDPOINT = " + url);

		final IncomeStatements results = JsonUtil.fromJson(IncomeStatements.class, HttpUtil.fetchString(url));

		System.out.println("IncomeStatements for AAPL = " + results.bySymbol("AAPL"));
	}

	private void testBalanceSheets() throws IOException {

		final BalanceSheetsRequest p = new BalanceSheetsRequest.Builder().symbols(new String[] { "AAPL", "GOOG" }).build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("BalanceSheetsRequest ENDPOINT = " + url);

		final BalanceSheets results = JsonUtil.fromJson(BalanceSheets.class, HttpUtil.fetchString(url));

		System.out.println("BalanceSheets for AAPL = " + results.bySymbol("AAPL"));
	}

	private void testCompetitors() throws IOException {

		final CompetitorsRequest p = new CompetitorsRequest.Builder().symbol("GOOG")
				.eventTypes(new CompetitorsRequestField[] { CompetitorsRequestField._52_WEEK_HIGH }).build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("CompetitorsRequest ENDPOINT = " + url);

		final Competitors results = JsonUtil.fromJson(Competitors.class, HttpUtil.fetchString(url));

		System.out.println("Competitors = " + results.all());
	}

	private void testRatings() throws IOException {

		final RatingsRequest p = new RatingsRequest.Builder()
				.symbols(new String[] { "GOOG, AAPL" })
				.eventTypes(
						new RatingsRequestField[] { RatingsRequestField.STRONG_BUY, RatingsRequestField.STRONG_SELL })
				.build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("RatingsRequest ENDPOINT = " + url);

		final Ratings results = JsonUtil.fromJson(Ratings.class, HttpUtil.fetchString(url));

		System.out.println("Ratings for GOOG (Average) = "
				+ results.bySymbol("GOOG").getRatingRecommendation(RatingType.AVERAGE));
	}

	private void testIndexMembers() throws IOException {

		final IndexMembersRequest p = new IndexMembersRequest.Builder().symbol("$ONE").build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("IndexMembersRequest ENDPOINT = " + url);

		final IndexMembers results = JsonUtil.fromJson(IndexMembers.class, HttpUtil.fetchString(url));

		System.out.println("IndexMembers for $ONE = " + results.byMember("$ONE"));
	}

	private void testCorpActions() throws IOException {

		final CorporateActionsRequest p = new CorporateActionsRequest.Builder().symbols(new String[] { "AAPL", "NEM" })
				.maxRecords(10).build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("CorporateActionsRequest ENDPOINT = " + url);

		final CorporateActions results = JsonUtil.fromJson(CorporateActions.class, HttpUtil.fetchString(url));

		System.out.println("CorporateActions for AAPL = " + results.bySymbolAndEventType("AAPL", null));
	}

	private void testQuote() throws IOException {

		final QuoteRequest p = new QuoteRequest.Builder().symbols(new String[] { "AAPL", "NEM" })
				.mode(QuoteRequestMode.REAL_TIME).build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		final Quotes results = JsonUtil.fromJson(Quotes.class, HttpUtil.fetchString(url));

		System.out.println("Quotes for AAPL = " + results.bySymbol("AAPL"));
	}

	private void testFuturesOptions() throws IOException {

		final FuturesOptionsRequest p = new FuturesOptionsRequest.Builder().contract("ESU14").build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("FuturesOptionsRequest ENDPOINT = " + url);

		final FuturesOptions results = JsonUtil.fromJson(FuturesOptions.class, HttpUtil.fetchString(url));

		System.out.println("FuturesOptions = " + results.calls());
	}

	private void testSDFuturesOptions() throws IOException {

		final SDFuturesOptionsRequest p = new SDFuturesOptionsRequest.Builder().root("ZC").build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("SDFuturesOptionsRequest ENDPOINT = " + url);

		final SDFuturesOptions results = JsonUtil.fromJson(SDFuturesOptions.class, HttpUtil.fetchString(url));

		for (Entry<String, SDFuturesOptions> sets : results.expirationsForMonth("Z").entrySet()) {

			System.out.println("SDFuturesOptions, Z, EXP = " + sets.getKey() + " = " + sets.getValue().calls());

		}

		//
	}

	private void testTechnicals() throws IOException {

		final TechnicalsRequest p = new TechnicalsRequest.Builder().symbols(new String[] { "AAPL" })
				.fields(TechnicalsRequestField.all()).build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("TechnicalsRequest ENDPOINT = " + url);

		final Technicals results = JsonUtil.fromJson(Technicals.class, HttpUtil.fetchString(url));

		System.out.println("Technicals = " + results.all());
	}

	private void testSignals() throws IOException {

		final SignalsRequest p = new SignalsRequest.Builder().symbols(new String[] { "AAPL" })
				.fields(SignalsRequestField.all()).build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("SignalsRequest ENDPOINT = " + url);

		final Signals results = JsonUtil.fromJson(Signals.class, HttpUtil.fetchString(url));

		System.out.println("Signals = " + results.all());
	}

	private void testMomentums() throws IOException {

		final MomentumRequest p = new MomentumRequest.Builder().exchanges(new String[] { "NYSE", "NASDAQ" }).build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("MomentumRequest ENDPOINT = " + url);

		final Momentums results = JsonUtil.fromJson(Momentums.class, HttpUtil.fetchString(url));

		System.out.println("Momentums = " + results.all());
	}

	private void testInstrumentDefinitons() throws IOException {

		final InstrumentDefinitionRequest p = new InstrumentDefinitionRequest.Builder().exchanges(new String[] { "CME" })
				.maxRecords(100).build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("InstrumentDefinitionRequest ENDPOINT = " + url);

		final InstrumentDefinitions results = JsonUtil.fromJson(InstrumentDefinitions.class, HttpUtil.fetchString(url));

		System.out.println("InstrumentDefinitions = " + results.all());

	}

	private void testFuturesSepecifications() throws IOException {

		final FuturesSpecificationsRequest p = new FuturesSpecificationsRequest.Builder().exchanges(new String[] { "LME" }).build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("FuturesSpecificationsRequest ENDPOINT = " + url);

		final FuturesSpecifications results = JsonUtil.fromJson(FuturesSpecifications.class, HttpUtil.fetchString(url));

		for (FuturesSpecification s : results.byExchange("LME")) {
			System.out.println("S = " + s);
		}

		System.out.println("FuturesSpecifications for GLBX = " + results.byExchange("LME"));

	}

	private void testWeather() throws IOException {

		final WeatherRequest p = new WeatherRequest.Builder().zipCode("60614").build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("WeatherRequest ENDPOINT = " + url);

		final Weather results = JsonUtil.fromJson(Weather.class, HttpUtil.fetchString(url));

		System.out.println("Weather = " + results.all());
	}

	private void testLeaders() throws IOException {

		final LeadersRequest p = new LeadersRequest.Builder().exchanges(new String[] { "NYSE" })
				.type(LeadersRequestType.ACTIVE_YTD).assetType(LeadersAssetType.STOCK).build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("LeadersRequest ENDPOINT = " + url);

		final Leaders results = JsonUtil.fromJson(Leaders.class, HttpUtil.fetchString(url));

		System.out.println("Leaders (Active TYD for NYSE) = " + results.all());
	}

	private void testCharts() throws IOException {

		final ChartRequest p = new ChartRequest.Builder().symbols(new String[] { "GOOG", "NEM" }).build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("ChartRequest ENDPOINT = " + url);

		final Charts results = JsonUtil.fromJson(Charts.class, HttpUtil.fetchString(url));

		System.out.println("Charts = " + results.all());
	}

	private void testUSDAGrains() throws IOException {

		final USDAGrainsRequest p = new USDAGrainsRequest.Builder().build();

		final String url = OnDemandRequest.BASE_URL + p.endpoint() + "?" + QueryUtil.urlEncodeUTF8(p.parameters());

		System.out.println("USDAGrainsRequest ENDPOINT = " + url);

		final USDAGrains results = JsonUtil.fromJson(USDAGrains.class, HttpUtil.fetchString(url));

		System.out.println("USDAGrains = " + results.all());
	}

}
