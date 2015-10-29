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

public class HotelNameRuleTest {

    @Test
    public void testApplyRemovingInsignificantWords() {
        HotelNameRule rule = new HotelNameRule();
        ReplacementRuleMock replacementRuleMock = new ReplacementRuleMock();
        Map<HotelAttribute, List<ReplacementRule>> replacementRules = new HashMap<HotelAttribute, List<ReplacementRule>>();
        replacementRules.put(HotelAttribute.ADDRESS, replacementRuleMock.buildAddressReplacements());
        replacementRules.put(HotelAttribute.NAME, replacementRuleMock.buildNameReplacements());
        Hotel reference = buildHotel("Hacienda Real del Caribe");
        Hotel toCompare = buildHotel("Hacienda del Carmen");
        RuleMatch match = rule.apply(reference, toCompare, replacementRules);

        Assert.assertTrue(match.getConfidence() > 0);
    }

    private Hotel buildHotel(String name) {
        Hotel hotel = new Hotel();
        hotel.setName(name);
        return hotel;
    }

}
