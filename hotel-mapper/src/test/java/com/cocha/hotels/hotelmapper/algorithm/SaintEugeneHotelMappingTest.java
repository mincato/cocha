package com.cocha.hotels.hotelmapper.algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.cocha.hotels.hotelmapper.mocks.HotelMock;
import com.cocha.hotels.hotelmapper.mocks.ReplacementRuleMock;
import com.cocha.hotels.hotelmapper.mocks.SaintEugeneHotelMock;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.hotelmapper.dictionary.HotelAttribute;
import com.cocha.hotels.model.hotelmapper.dictionary.ReplacementRule;

public class SaintEugeneHotelMappingTest extends BaseHotelMappingTest {

    private Hotel bookingHotel;
    private Hotel eanHotel;
    private Map<HotelAttribute, List<ReplacementRule>> replacementRules;

    @Before
    public void setUp() {
        HotelMock hotelMock = new SaintEugeneHotelMock();
        bookingHotel = hotelMock.buildWithBooking();
        eanHotel = hotelMock.buildWithEan();

        ReplacementRuleMock replacementRuleMock = new ReplacementRuleMock();
        replacementRules = new HashMap<HotelAttribute, List<ReplacementRule>>();
        replacementRules.put(HotelAttribute.ADDRESS, replacementRuleMock.buildAddressReplacements());
        replacementRules.put(HotelAttribute.NAME, replacementRuleMock.buildNameReplacements());
    }

    @Test
    public void testArmadaHotelMatchName() {

        HotelRule rule = new HotelNameRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel, replacementRules);
        verify(ruleMatch, HotelNameRule.MAX_CONFIDENCE).isSuccessful();
    }

    @Test
    public void testArmadaHotelMatchAddress() {

        HotelRule rule = new HotelAddressRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel, replacementRules);
        verify(ruleMatch, HotelAddressRule.MAX_CONFIDENCE).isSuccessful();
    }

    @Test
    public void testArmadaHotelMatchZipCode() {

        HotelRule rule = new HotelZipCodeRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel, replacementRules);
        verify(ruleMatch, 10).isSuccessful();
    }

    @Test
    public void testArmadaHotelMatchCurrencyCode() {

        HotelRule rule = new HotelCurrencyCodeRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel, replacementRules);
        verify(ruleMatch, 10).isSuccessful();
    }

    @Test
    public void testArmadaHotelStarRating() {

        HotelRule rule = new HotelStarRatingRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel, replacementRules);
        verify(ruleMatch, 10).isSuccessful();
    }
}
