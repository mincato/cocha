package com.cocha.hotels.hotelmapper.algorithm;

import org.junit.Before;
import org.junit.Test;

import com.cocha.hotels.hotelmapper.mocks.HotelMock;
import com.cocha.hotels.hotelmapper.mocks.WallStreet_HI_HotelMock;
import com.cocha.hotels.model.content.hotel.Hotel;

public class WallStreet_HI_HotelMappingTest extends BaseHotelMappingTest {

    private Hotel bookingHotel;
    private Hotel eanHotel;

    @Before
    public void setUp() {
        HotelMock hotelMock = new WallStreet_HI_HotelMock();
        bookingHotel = hotelMock.buildWithBooking();
        eanHotel = hotelMock.buildWithEan();
    }

    @Test
    public void testArmadaHotelMatchName() {

        HotelRule rule = new HotelNameRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel);
        verify(ruleMatch, HotelNameRule.MAX_CONFIDENCE).isSuccessful();
    }

    @Test
    public void testArmadaHotelMatchAddress() {

        HotelRule rule = new HotelAddressRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel);
        verify(ruleMatch, HotelAddressRule.MAX_CONFIDENCE).isSuccessful();
    }

    @Test
    public void testArmadaHotelMatchZipCode() {

        HotelRule rule = new HotelZipCodeRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel);
        verify(ruleMatch, 10).isSuccessful();
    }

    @Test
    public void testArmadaHotelMatchCurrencyCode() {

        HotelRule rule = new HotelCurrencyCodeRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel);
        verify(ruleMatch, 10).isSuccessful();
    }

    @Test
    public void testArmadaHotelStarRating() {

        HotelRule rule = new HotelStarRatingRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel);
        verify(ruleMatch, 10).isSuccessful();
    }
}
