package com.Challenge.Exchange;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Exchange implements Serializable {
    @SerializedName("base_code")
    private String baseCurrency;
    @SerializedName("target_code")
    private String targetCurrency;
    @SerializedName("conversion_rate")
    private String rate;
    @SerializedName("conversion_result")
    private String moneyExchange;



    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getMoneyExchange() {
        return moneyExchange;
    }

    public void setMoneyExchange(String moneyExchange) {
        this.moneyExchange = moneyExchange;
    }



    /**
     * @return a String with the format for the exchange
     */
    @Override
    public String toString() {
        return
                "Your base Currency is :'" + baseCurrency + '\n' +
                "Your target Currency is :'" + targetCurrency + '\n' +
                "The exchange rate per : '" + baseCurrency + " ,is : '" + rate + '\n' +
                "Your final money Exchange is: '" + moneyExchange + '\n'
                ;
    }
}
