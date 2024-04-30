package com.Challenge.Exchange;

public record ExchangeApi(String base_code, String target_code, String conversion_rate, String conversion_result) {

    @Override
    public String base_code() {
        return base_code;
    }

    @Override
    public String target_code() {
        return target_code;
    }

    @Override
    public String conversion_rate() {
        return conversion_rate;
    }

    @Override
    public String conversion_result() {
        return conversion_result;
    }
}
