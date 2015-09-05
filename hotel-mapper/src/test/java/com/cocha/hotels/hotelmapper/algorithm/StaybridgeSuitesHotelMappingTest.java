package com.cocha.hotels.hotelmapper.algorithm;

import org.junit.Before;
import org.junit.Test;

import com.cocha.hotels.hotelmapper.mocks.HotelMock;
import com.cocha.hotels.hotelmapper.mocks.StaybridgeSuitesHotelMock;
import com.cocha.hotels.model.content.hotel.Hotel;

public class StaybridgeSuitesHotelMappingTest extends BaseHotelMappingTest {

    private Hotel bookingHotel;
    private Hotel eanHotel;

    @Before
    public void setUp() {
        HotelMock hotelMock = new StaybridgeSuitesHotelMock();
        bookingHotel = hotelMock.buildWithBooking();
        eanHotel = hotelMock.buildWithEan();
    }

    @Test
    public void testMatchName() {

        HotelRule rule = new HotelNameRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel);
        // los strings no siguen un pattern genérico para compararlos (city
        // name?)
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testMatchAddress() {

        HotelRule rule = new HotelAddressRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel);
        verify(ruleMatch).isSuccessful();
    }

    @Test
    public void testMatchZipCode() {

        HotelRule rule = new HotelZipCodeRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel);
        verify(ruleMatch).isSuccessful();
    }

    @Test
    public void testMatchCurrencyCode() {

        HotelRule rule = new HotelCurrencyCodeRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel);
        verify(ruleMatch).isSuccessful();
    }

    @Test
    public void testStarRating() {

        HotelRule rule = new HotelStarRatingRule();
        RuleMatch ruleMatch = rule.apply(eanHotel, bookingHotel);
        verify(ruleMatch).isSuccessful();
    }
}
