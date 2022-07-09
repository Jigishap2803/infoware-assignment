package com.example.infoware.home;

public class WatchlistModelClass {
  private Integer logo_icon;
  private String stock_name;
  private String company_name;
  private String change;
  private String current_number;
  private String current_value;


    public WatchlistModelClass(Integer logo_icon, String stock_name, String company_name, String change, String current_number, String current_value) {
        this.logo_icon = logo_icon;
        this.stock_name = stock_name;
        this.company_name = company_name;
        this.change = change;
        this.current_number = current_number;
        this.current_value = current_value;

    }

    public Integer getLogo_icon() {
        return logo_icon;
    }

    public void setLogo_icon(Integer logo_icon) {
        this.logo_icon = logo_icon;
    }

    public String getStock_name() {
        return stock_name;
    }

    public void setStock_name(String stock_name) {
        this.stock_name = stock_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getCurrent_number() {
        return current_number;
    }

    public void setCurrent_number(String current_number) {
        this.current_number = current_number;
    }

    public String getCurrent_value() {
        return current_value;
    }

    public void setCurrent_value(String current_value) {
        this.current_value = current_value;
    }

}
