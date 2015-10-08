package com.cocha.hotels.hotelmapper.algorithm;

public class BaseHotelMappingTest {

    protected RuleVerifier verify(RuleMatch ruleMatch, Integer maxConfidence) {
        return new RuleVerifier(ruleMatch, maxConfidence);
    }

}