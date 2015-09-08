package com.cocha.hotels.hotelmapper.algorithm;

import org.junit.Assert;

class MatchVerifier {

    private HotelMatch match;

    public MatchVerifier(HotelMatch match) {
        this.match = match;
    }

    public void hasLessConfidenceThan(Integer confidence) {
        Assert.assertFalse(this.match.getConfidence() >= confidence);
        System.out.println("Confidence: " + this.match.getConfidence());
    }

    public void hasGreatOrEqualConfidenceThan(Integer confidence) {
        Assert.assertTrue(this.match.getConfidence() >= confidence);
        System.out.println("Confidence: " + this.match.getConfidence());
    }

}