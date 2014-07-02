## Java client for Barchart OnDemand

[Check out some examples here](https://github.com/barchart/barchart-ondemand-client-java/wiki/Fetching-Data)

### Currently supports

* getQuote
* getFuturesOptions
* getShortDatedFuturesOptions
* getProfile
* getFinancialHighlights
* getFinancialRatios
* getIncomeStatements
* getBalanceSheets
* getCompetitors
* getInsiders
* getRatings
* getIndexMembers
* getCorporateActions
* getEarningsEstimates
* getLeaders
* getHighsLows
* getInstrumentDefinition
* getFuturesSpecifications
* getFuturesExpirations
* getWeather

### Example Code

```java
private final BarchartOnDemandClient onDemand = new BarchartOnDemandClient.Builder().apiKey("CHANGE-ME").build();

/* build a new getQuotes request */
final QuoteRequest.Builder builder = new QuoteRequest.Builder();

/* add symbols to request */
builder.symbols(new String[] { "AAPL", "GOOG" });
/* set mode to real-time */
builder.mode(QuoteRequestMode.REAL_TIME);
/* add optional request fields */
builder.fields(new QuoteRequestField[] { QuoteRequestField._52_WEEK_HIGH_DATE });

/* fetch results */
final Quotes quotes = (Quotes) onDemand.fetch(builder.build());

for (Quote q : quotes.all()) {
	System.out.println("Quote for : " + q.getSymbol() + " = " + q);
}

System.out.println("Quote by symbol = " + JsonUtil.intoJson(quotes.bySymbol("AAPL")));
```
	
[See how to use the client in your project here](https://github.com/barchart/barchart-ondemand-example-java)
