package com.cocha.hotels.hotelmapper.algorithm;

import java.util.Arrays;
import java.util.List;

import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelRulesProcessor {

    public HotelMatch applyRules(final Hotel hotelReference, final Hotel hotelToCompare) {
        int confidence = 0;

        List<HotelRule> ruleList = Arrays.asList(new HotelNameRule(), new HotelAddressRule(), new HotelZipCodeRule(),
                new HotelStarRatingRule(), new HotelCurrencyCodeRule());

        for (HotelRule rule : ruleList) {
            RuleMatch match = rule.apply(hotelReference, hotelToCompare);
            confidence += match.getConfidence();
        }
        return new HotelMatch(confidence);
    }

}
