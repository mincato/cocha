package com.cocha.hotels.hotelmapper.algorithm;

import org.junit.Before;
import org.junit.Test;

import com.cocha.hotels.hotelmapper.mocks.ArmadaHotelMock;
import com.cocha.hotels.hotelmapper.mocks.BlackstoneHotelMock;
import com.cocha.hotels.hotelmapper.mocks.HotelMock;
import com.cocha.hotels.model.content.hotel.Hotel;

/**
 * En los siguientes tests se busca comparar hoteles distintos para validar que
 * las reglas usadas no los matchean.
 *
 */
public class NegativeMappingTest extends BaseHotelMappingTest {

    private Hotel reference;

    @Before
    public void setUp() throws Exception {
        HotelMock builder = new ArmadaHotelMock();
        reference = builder.buildWithEan();
    }

    @Test
    public void testArmadaAgainstBlackstoneName() {
        HotelMock builder = new BlackstoneHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelNameRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstBlackstoneAddress() {
        HotelMock builder = new BlackstoneHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelAddressRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

}
