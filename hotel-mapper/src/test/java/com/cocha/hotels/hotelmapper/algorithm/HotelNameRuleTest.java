package com.cocha.hotels.hotelmapper.algorithm;

import org.junit.Assert;
import org.junit.Test;

import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelNameRuleTest {

    @Test
    public void testApply() {
        HotelNameRule rule = new HotelNameRule();
        Hotel reference = buildHotel("3B Barranco's - Chic and Basic - B&B");
        Hotel toCompare = buildHotel("Hotel B");
        RuleMatch match = rule.apply(reference, toCompare);

        Assert.assertTrue(match.getConfidence() > 0);
    }

    private Hotel buildHotel(String name) {
        Hotel hotel = new Hotel();
        hotel.setName(name);
        return hotel;
    }

}
