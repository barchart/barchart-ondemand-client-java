package com.barchart.ondemand.api.responses;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"id",
"commodity",
"symbol",
"delivery_start",
"delivery_end",
"basis",
"notes",
"active",
"import_id",
"sym_root",
"commodity_id",
"imported",
"unitvalue",
"unitweight",
"deliveryMonth",
"deliveryYear",
"basismonth",
"futures",
"rawfutures",
"futureschange",
"futurespctchange",
"basecode",
"timestamp",
"as_of",
"realtime",
"price",
"pricecwt",
"basiscwt",
"pricetonne",
"basistonne",
"change",
"rawchange",
"pctchange",
"cashprice",
"cashpricetonne",
"futuresprice",
"settlement",
"delivery_sort",
"delivery_start_raw",
"delivery_end_raw"
})
public class Bid {

@JsonProperty("id")
private String id;
@JsonProperty("commodity")
private String commodity;
@JsonProperty("symbol")
private String symbol;
@JsonProperty("delivery_start")
private String deliveryStart;
@JsonProperty("delivery_end")
private String deliveryEnd;
@JsonProperty("basis")
private String basis;
@JsonProperty("notes")
private Object notes;
@JsonProperty("active")
private boolean active;
@JsonProperty("import_id")
private Object importId;
@JsonProperty("sym_root")
private String symRoot;
@JsonProperty("commodity_id")
private String commodityId;
@JsonProperty("imported")
private boolean imported;
@JsonProperty("unitvalue")
private int unitvalue;
@JsonProperty("unitweight")
private int unitweight;
@JsonProperty("deliveryMonth")
private String deliveryMonth;
@JsonProperty("deliveryYear")
private String deliveryYear;
@JsonProperty("basismonth")
private String basismonth;
@JsonProperty("futures")
private String futures;
@JsonProperty("rawfutures")
private String rawfutures;
@JsonProperty("futureschange")
private String futureschange;
@JsonProperty("futurespctchange")
private String futurespctchange;
@JsonProperty("basecode")
private String basecode;
@JsonProperty("timestamp")
private int timestamp;
@JsonProperty("as_of")
private String asOf;
@JsonProperty("realtime")
private boolean realtime;
@JsonProperty("price")
private String price;
@JsonProperty("pricecwt")
private String pricecwt;
@JsonProperty("basiscwt")
private double basiscwt;
@JsonProperty("pricetonne")
private String pricetonne;
@JsonProperty("basistonne")
private double basistonne;
@JsonProperty("change")
private String change;
@JsonProperty("rawchange")
private double rawchange;
@JsonProperty("pctchange")
private String pctchange;
@JsonProperty("cashprice")
private String cashprice;
@JsonProperty("cashpricetonne")
private String cashpricetonne;
@JsonProperty("futuresprice")
private String futuresprice;
@JsonProperty("settlement")
private String settlement;
@JsonProperty("delivery_sort")
private String deliverySort;
@JsonProperty("delivery_start_raw")
private String deliveryStartRaw;
@JsonProperty("delivery_end_raw")
private String deliveryEndRaw;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The id
*/
@JsonProperty("id")
public String getId() {
return id;
}

/**
* 
* @param id
* The id
*/
@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

/**
* 
* @return
* The commodity
*/
@JsonProperty("commodity")
public String getCommodity() {
return commodity;
}

/**
* 
* @param commodity
* The commodity
*/
@JsonProperty("commodity")
public void setCommodity(String commodity) {
this.commodity = commodity;
}

/**
* 
* @return
* The symbol
*/
@JsonProperty("symbol")
public String getSymbol() {
return symbol;
}

/**
* 
* @param symbol
* The symbol
*/
@JsonProperty("symbol")
public void setSymbol(String symbol) {
this.symbol = symbol;
}

/**
* 
* @return
* The deliveryStart
*/
@JsonProperty("delivery_start")
public String getDeliveryStart() {
return deliveryStart;
}

/**
* 
* @param deliveryStart
* The delivery_start
*/
@JsonProperty("delivery_start")
public void setDeliveryStart(String deliveryStart) {
this.deliveryStart = deliveryStart;
}

/**
* 
* @return
* The deliveryEnd
*/
@JsonProperty("delivery_end")
public String getDeliveryEnd() {
return deliveryEnd;
}

/**
* 
* @param deliveryEnd
* The delivery_end
*/
@JsonProperty("delivery_end")
public void setDeliveryEnd(String deliveryEnd) {
this.deliveryEnd = deliveryEnd;
}

/**
* 
* @return
* The basis
*/
@JsonProperty("basis")
public String getBasis() {
return basis;
}

/**
* 
* @param basis
* The basis
*/
@JsonProperty("basis")
public void setBasis(String basis) {
this.basis = basis;
}

/**
* 
* @return
* The notes
*/
@JsonProperty("notes")
public Object getNotes() {
return notes;
}

/**
* 
* @param notes
* The notes
*/
@JsonProperty("notes")
public void setNotes(Object notes) {
this.notes = notes;
}

/**
* 
* @return
* The active
*/
@JsonProperty("active")
public boolean isActive() {
return active;
}

/**
* 
* @param active
* The active
*/
@JsonProperty("active")
public void setActive(boolean active) {
this.active = active;
}

/**
* 
* @return
* The importId
*/
@JsonProperty("import_id")
public Object getImportId() {
return importId;
}

/**
* 
* @param importId
* The import_id
*/
@JsonProperty("import_id")
public void setImportId(Object importId) {
this.importId = importId;
}

/**
* 
* @return
* The symRoot
*/
@JsonProperty("sym_root")
public String getSymRoot() {
return symRoot;
}

/**
* 
* @param symRoot
* The sym_root
*/
@JsonProperty("sym_root")
public void setSymRoot(String symRoot) {
this.symRoot = symRoot;
}

/**
* 
* @return
* The commodityId
*/
@JsonProperty("commodity_id")
public String getCommodityId() {
return commodityId;
}

/**
* 
* @param commodityId
* The commodity_id
*/
@JsonProperty("commodity_id")
public void setCommodityId(String commodityId) {
this.commodityId = commodityId;
}

/**
* 
* @return
* The imported
*/
@JsonProperty("imported")
public boolean isImported() {
return imported;
}

/**
* 
* @param imported
* The imported
*/
@JsonProperty("imported")
public void setImported(boolean imported) {
this.imported = imported;
}

/**
* 
* @return
* The unitvalue
*/
@JsonProperty("unitvalue")
public int getUnitvalue() {
return unitvalue;
}

/**
* 
* @param unitvalue
* The unitvalue
*/
@JsonProperty("unitvalue")
public void setUnitvalue(int unitvalue) {
this.unitvalue = unitvalue;
}

/**
* 
* @return
* The unitweight
*/
@JsonProperty("unitweight")
public int getUnitweight() {
return unitweight;
}

/**
* 
* @param unitweight
* The unitweight
*/
@JsonProperty("unitweight")
public void setUnitweight(int unitweight) {
this.unitweight = unitweight;
}

/**
* 
* @return
* The deliveryMonth
*/
@JsonProperty("deliveryMonth")
public String getDeliveryMonth() {
return deliveryMonth;
}

/**
* 
* @param deliveryMonth
* The deliveryMonth
*/
@JsonProperty("deliveryMonth")
public void setDeliveryMonth(String deliveryMonth) {
this.deliveryMonth = deliveryMonth;
}

/**
* 
* @return
* The deliveryYear
*/
@JsonProperty("deliveryYear")
public String getDeliveryYear() {
return deliveryYear;
}

/**
* 
* @param deliveryYear
* The deliveryYear
*/
@JsonProperty("deliveryYear")
public void setDeliveryYear(String deliveryYear) {
this.deliveryYear = deliveryYear;
}

/**
* 
* @return
* The basismonth
*/
@JsonProperty("basismonth")
public String getBasismonth() {
return basismonth;
}

/**
* 
* @param basismonth
* The basismonth
*/
@JsonProperty("basismonth")
public void setBasismonth(String basismonth) {
this.basismonth = basismonth;
}

/**
* 
* @return
* The futures
*/
@JsonProperty("futures")
public String getFutures() {
return futures;
}

/**
* 
* @param futures
* The futures
*/
@JsonProperty("futures")
public void setFutures(String futures) {
this.futures = futures;
}

/**
* 
* @return
* The rawfutures
*/
@JsonProperty("rawfutures")
public String getRawfutures() {
return rawfutures;
}

/**
* 
* @param rawfutures
* The rawfutures
*/
@JsonProperty("rawfutures")
public void setRawfutures(String rawfutures) {
this.rawfutures = rawfutures;
}

/**
* 
* @return
* The futureschange
*/
@JsonProperty("futureschange")
public String getFutureschange() {
return futureschange;
}

/**
* 
* @param futureschange
* The futureschange
*/
@JsonProperty("futureschange")
public void setFutureschange(String futureschange) {
this.futureschange = futureschange;
}

/**
* 
* @return
* The futurespctchange
*/
@JsonProperty("futurespctchange")
public String getFuturespctchange() {
return futurespctchange;
}

/**
* 
* @param futurespctchange
* The futurespctchange
*/
@JsonProperty("futurespctchange")
public void setFuturespctchange(String futurespctchange) {
this.futurespctchange = futurespctchange;
}

/**
* 
* @return
* The basecode
*/
@JsonProperty("basecode")
public String getBasecode() {
return basecode;
}

/**
* 
* @param basecode
* The basecode
*/
@JsonProperty("basecode")
public void setBasecode(String basecode) {
this.basecode = basecode;
}

/**
* 
* @return
* The timestamp
*/
@JsonProperty("timestamp")
public int getTimestamp() {
return timestamp;
}

/**
* 
* @param timestamp
* The timestamp
*/
@JsonProperty("timestamp")
public void setTimestamp(int timestamp) {
this.timestamp = timestamp;
}

/**
* 
* @return
* The asOf
*/
@JsonProperty("as_of")
public String getAsOf() {
return asOf;
}

/**
* 
* @param asOf
* The as_of
*/
@JsonProperty("as_of")
public void setAsOf(String asOf) {
this.asOf = asOf;
}

/**
* 
* @return
* The realtime
*/
@JsonProperty("realtime")
public boolean isRealtime() {
return realtime;
}

/**
* 
* @param realtime
* The realtime
*/
@JsonProperty("realtime")
public void setRealtime(boolean realtime) {
this.realtime = realtime;
}

/**
* 
* @return
* The price
*/
@JsonProperty("price")
public String getPrice() {
return price;
}

/**
* 
* @param price
* The price
*/
@JsonProperty("price")
public void setPrice(String price) {
this.price = price;
}

/**
* 
* @return
* The pricecwt
*/
@JsonProperty("pricecwt")
public String getPricecwt() {
return pricecwt;
}

/**
* 
* @param pricecwt
* The pricecwt
*/
@JsonProperty("pricecwt")
public void setPricecwt(String pricecwt) {
this.pricecwt = pricecwt;
}

/**
* 
* @return
* The basiscwt
*/
@JsonProperty("basiscwt")
public double getBasiscwt() {
return basiscwt;
}

/**
* 
* @param basiscwt
* The basiscwt
*/
@JsonProperty("basiscwt")
public void setBasiscwt(double basiscwt) {
this.basiscwt = basiscwt;
}

/**
* 
* @return
* The pricetonne
*/
@JsonProperty("pricetonne")
public String getPricetonne() {
return pricetonne;
}

/**
* 
* @param pricetonne
* The pricetonne
*/
@JsonProperty("pricetonne")
public void setPricetonne(String pricetonne) {
this.pricetonne = pricetonne;
}

/**
* 
* @return
* The basistonne
*/
@JsonProperty("basistonne")
public double getBasistonne() {
return basistonne;
}

/**
* 
* @param basistonne
* The basistonne
*/
@JsonProperty("basistonne")
public void setBasistonne(double basistonne) {
this.basistonne = basistonne;
}

/**
* 
* @return
* The change
*/
@JsonProperty("change")
public String getChange() {
return change;
}

/**
* 
* @param change
* The change
*/
@JsonProperty("change")
public void setChange(String change) {
this.change = change;
}

/**
* 
* @return
* The rawchange
*/
@JsonProperty("rawchange")
public double getRawchange() {
return rawchange;
}

/**
* 
* @param rawchange
* The rawchange
*/
@JsonProperty("rawchange")
public void setRawchange(double rawchange) {
this.rawchange = rawchange;
}

/**
* 
* @return
* The pctchange
*/
@JsonProperty("pctchange")
public String getPctchange() {
return pctchange;
}

/**
* 
* @param pctchange
* The pctchange
*/
@JsonProperty("pctchange")
public void setPctchange(String pctchange) {
this.pctchange = pctchange;
}

/**
* 
* @return
* The cashprice
*/
@JsonProperty("cashprice")
public String getCashprice() {
return cashprice;
}

/**
* 
* @param cashprice
* The cashprice
*/
@JsonProperty("cashprice")
public void setCashprice(String cashprice) {
this.cashprice = cashprice;
}

/**
* 
* @return
* The cashpricetonne
*/
@JsonProperty("cashpricetonne")
public String getCashpricetonne() {
return cashpricetonne;
}

/**
* 
* @param cashpricetonne
* The cashpricetonne
*/
@JsonProperty("cashpricetonne")
public void setCashpricetonne(String cashpricetonne) {
this.cashpricetonne = cashpricetonne;
}

/**
* 
* @return
* The futuresprice
*/
@JsonProperty("futuresprice")
public String getFuturesprice() {
return futuresprice;
}

/**
* 
* @param futuresprice
* The futuresprice
*/
@JsonProperty("futuresprice")
public void setFuturesprice(String futuresprice) {
this.futuresprice = futuresprice;
}

/**
* 
* @return
* The settlement
*/
@JsonProperty("settlement")
public String getSettlement() {
return settlement;
}

/**
* 
* @param settlement
* The settlement
*/
@JsonProperty("settlement")
public void setSettlement(String settlement) {
this.settlement = settlement;
}

/**
* 
* @return
* The deliverySort
*/
@JsonProperty("delivery_sort")
public String getDeliverySort() {
return deliverySort;
}

/**
* 
* @param deliverySort
* The delivery_sort
*/
@JsonProperty("delivery_sort")
public void setDeliverySort(String deliverySort) {
this.deliverySort = deliverySort;
}

/**
* 
* @return
* The deliveryStartRaw
*/
@JsonProperty("delivery_start_raw")
public String getDeliveryStartRaw() {
return deliveryStartRaw;
}

/**
* 
* @param deliveryStartRaw
* The delivery_start_raw
*/
@JsonProperty("delivery_start_raw")
public void setDeliveryStartRaw(String deliveryStartRaw) {
this.deliveryStartRaw = deliveryStartRaw;
}

/**
* 
* @return
* The deliveryEndRaw
*/
@JsonProperty("delivery_end_raw")
public String getDeliveryEndRaw() {
return deliveryEndRaw;
}

/**
* 
* @param deliveryEndRaw
* The delivery_end_raw
*/
@JsonProperty("delivery_end_raw")
public void setDeliveryEndRaw(String deliveryEndRaw) {
this.deliveryEndRaw = deliveryEndRaw;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}