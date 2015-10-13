package com.cocha.hotels.hotelmapper.algorithm;

import org.junit.Assert;

public class RuleVerifier {

    private RuleMatch ruleMatch;
    private Integer maxConfidence;

    public RuleVerifier(RuleMatch ruleMatch, Integer maxConfidence) {
        this.ruleMatch = ruleMatch;
        this.maxConfidence = maxConfidence;
    }

    public void isSuccessful() {
        Assert.assertTrue(this.ruleMatch.getConfidence() > 0.6 * maxConfidence);
    }

    public void isNotSuccessful() {
        Assert.assertTrue(this.ruleMatch.getConfidence() < 0.4 * maxConfidence);
    }

}