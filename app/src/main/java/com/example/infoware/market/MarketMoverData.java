package com.example.infoware.market;

public class MarketMoverData {
    private Integer icon1;
    private String stock;
    private String company_name;
    private String current_number;
    private String change;
    private String value;
    private String shares;


    public MarketMoverData(Integer icon1, String stock, String company_name, String current_number, String change, String value, String shares) {
        this.icon1 = icon1;
        this.stock = stock;
        this.company_name = company_name;
        this.current_number = current_number;
        this.change = change;
        this.value = value;
        this.shares = shares;
    }

    public Integer getIcon1() {
        return icon1;
    }

    public void setIcon1(Integer icon1) {
        this.icon1 = icon1;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCurrent_number() {
        return current_number;
    }

    public void setCurrent_number(String current_number) {
        this.current_number = current_number;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getShares() {
        return shares;
    }

    public void setShares(String shares) {
        this.shares = shares;
    }
}
