package com.cocha.hotels.hotelmapper.algorithm;

import org.junit.Assert;

public class RuleVerifier {

    private RuleMatch ruleMatch;

    public RuleVerifier(RuleMatch ruleMatch) {
        this.ruleMatch = ruleMatch;
    }

    public void isSuccessful() {
        Assert.assertTrue(this.ruleMatch.getConfidence() > 0);
    }

    public void isNotSuccessful() {
        Assert.assertTrue(this.ruleMatch.getConfidence() == 0);
    }

}