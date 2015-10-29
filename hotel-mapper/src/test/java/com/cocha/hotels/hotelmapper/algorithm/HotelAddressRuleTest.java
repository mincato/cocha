package com.cocha.hotels.hotelmapper.algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.cocha.hotels.hotelmapper.mocks.ReplacementRuleMock;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.hotelmapper.dictionary.HotelAttribute;
import com.cocha.hotels.model.hotelmapper.dictionary.ReplacementRule;

public class HotelAddressRuleTest {

    @Test
    public void testApply() {
        ReplacementRuleMock replacementRuleMock = new ReplacementRuleMock();
        Map<HotelAttribute, List<ReplacementRule>> replacementRules = new HashMap<HotelAttribute, List<ReplacementRule>>();
        replacementRules.put(HotelAttribute.ADDRESS, replacementRuleMock.buildAddressReplacements());
        replacementRules.put(HotelAttribute.NAME, replacementRuleMock.buildNameReplacements());
        HotelAddressRule rule = new HotelAddressRule();
        Hotel reference = buildHotel("Boulevard Kukulcan Km 4.5 Zona Hotelera");
        Hotel toCompare = buildHotel("Boulevard Kukulkan km 4.5");
        RuleMatch match = rule.apply(reference, toCompare, replacementRules);

        Assert.assertTrue(match.getConfidence() > 0);
    }

    private Hotel buildHotel(String address) {
        Hotel hotel = new Hotel();
        hotel.setAddress(address);
        return hotel;
    }

}
