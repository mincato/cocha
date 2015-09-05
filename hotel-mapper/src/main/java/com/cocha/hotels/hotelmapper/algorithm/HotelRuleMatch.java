package com.cocha.hotels.hotelmapper.algorithm;

public class HotelRuleMatch implements RuleMatch {

    private Integer confidence;

    public HotelRuleMatch(Integer confidence) {
        this.confidence = confidence;
    }

    @Override
    public Integer getConfidence() {
        return this.confidence;
    }

}
