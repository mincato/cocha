package com.cocha.hotels.hotelmapper.algorithm;

import org.junit.Assert;
import org.junit.Test;

import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelAddressRuleTest {

    @Test
    public void testApply() {
        HotelAddressRule rule = new HotelAddressRule();
        Hotel reference = buildHotel("Boulevard Kukulcan Km 4.5 Zona Hotelera");
        Hotel toCompare = buildHotel("Boulevard Kukulkan km 4.5");
        RuleMatch match = rule.apply(reference, toCompare);

        Assert.assertTrue(match.getConfidence() > 0);
    }

    private Hotel buildHotel(String address) {
        Hotel hotel = new Hotel();
        hotel.setAddress(address);
        return hotel;
    }

}
