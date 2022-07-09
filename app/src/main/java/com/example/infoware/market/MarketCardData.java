package com.example.infoware.market;

public class MarketCardData {
    private String stock_name;
    private String value_market;
    private String change_market;
    private Integer graph_market_iv;

    public MarketCardData(String stock_name, String value_market, String change_market, Integer graph_market_iv) {
        this.stock_name = stock_name;
        this.value_market = value_market;
        this.change_market = change_market;
        this.graph_market_iv = graph_market_iv;
    }

    public String getStock_name() {
        return stock_name;
    }

    public void setStock_name(String stock_name) {
        this.stock_name = stock_name;
    }

    public String getValue_market() {
        return value_market;
    }

    public void setValue_market(String value_market) {
        this.value_market = value_market;
    }

    public String getChange_market() {
        return change_market;
    }

    public void setChange_market(String change_market) {
        this.change_market = change_market;
    }

    public Integer getGraph_market_iv() {
        return graph_market_iv;
    }

    public void setGraph_market_iv(Integer graph_market_iv) {
        this.graph_market_iv = graph_market_iv;
    }
}
