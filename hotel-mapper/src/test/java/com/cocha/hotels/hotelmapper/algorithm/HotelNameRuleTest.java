package com.cocha.hotels.hotelmapper.algorithm;

import org.junit.Assert;
import org.junit.Test;

import com.cocha.hotels.model.content.hotel.Hotel;


public class HotelNameRuleTest {

    @Test
    public void testApply() {
        HotelNameRule rule = new HotelNameRule();
        Hotel reference = buildHotel("HOLIDAY INN DOWNTOWN MEMPHIS");
        Hotel toCompare = buildHotel("HOLIDAY INN - MEMPHIS DOWNTOWN - BEALE ST.");
        RuleMatch match = rule.apply(reference, toCompare);
        
        Assert.assertTrue(match.getConfidence() > 0);
    }

    private Hotel buildHotel(String name) {
        Hotel hotel = new Hotel();
        hotel.setName(name);
        return hotel;
    }

}
