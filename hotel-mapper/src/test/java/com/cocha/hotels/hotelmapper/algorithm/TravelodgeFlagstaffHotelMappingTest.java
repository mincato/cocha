package com.cocha.hotels.hotelmapper.algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.cocha.hotels.hotelmapper.mocks.HotelMock;
import com.cocha.hotels.hotelmapper.mocks.ReplacementRuleMock;
import com.cocha.hotels.hotelmapper.mocks.TravelodgeFlagstaffHotelMock;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.hotelmapper.dictionary.HotelAttribute;
import com.cocha.hotels.model.hotelmapper.dictionary.ReplacementRule;

public class TravelodgeFlagstaffHotelMappingTest extends BaseHotelMappingTest {

    private Hotel bookingHotel;
    private Hotel eanHotel;
    private Map<HotelAttribute, List<ReplacementRule>> replacementRules;

    @Before
    public void setUp() {
        HotelMock hotelMock = new TravelodgeFlagstaffHotelMock();
        bookingHotel = hotelMock.buildWithBooking();
        eanHotel = hotelMock.buildWithEan();

        ReplacementRuleMock replacementRuleMock = new ReplacementRuleMock();
        replacementRules = new HashMap<HotelAttribute, List<ReplacementRule>>();
        replacementRules.put(HotelAttribute.ADDRESS, replacementRuleMock.buildAddressReplacements());
        replacementRules.put(HotelAttribute.NAME, replacementRuleMock.buildNameReplacements());
    }

    @Test
    public void testMatchName() {

        HotelRule rule = new HotelNameRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel, replacementRules);
        // los strings son muy diferentes para que matcheen
        verify(ruleMatch, HotelNameRule.MAX_CONFIDENCE).isNotSuccessful();
    }

    @Test
    @Ignore
    public void testMatchAddress() {

        HotelRule rule = new HotelAddressRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel, replacementRules);
        // directamente no es la misma dirección, no son los mismos hoteles
        verify(ruleMatch, HotelAddressRule.MAX_CONFIDENCE).isNotSuccessful();
    }

    @Test
    public void testMatchZipCode() {

        HotelRule rule = new HotelZipCodeRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel, replacementRules);
        verify(ruleMatch, 10).isSuccessful();
    }

    @Test
    public void testMatchCurrencyCode() {

        HotelRule rule = new HotelCurrencyCodeRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel, replacementRules);
        verify(ruleMatch, 10).isSuccessful();
    }

    @Test
    public void testStarRating() {

        HotelRule rule = new HotelStarRatingRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel, replacementRules);
        // son distintos, tiene que fallar
        verify(ruleMatch, 10).isNotSuccessful();
    }
}
