package com.cocha.hotels.hotelmapper.algorithm;

public class BaseHotelMappingTest {

    protected RuleVerifier verify(RuleMatch ruleMatch) {
        return new RuleVerifier(ruleMatch);
    }

}