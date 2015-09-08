package com.cocha.hotels.hotelmapper.algorithm;

import org.junit.Before;
import org.junit.Test;

import com.cocha.hotels.hotelmapper.mocks.ArmadaHotelMock;
import com.cocha.hotels.hotelmapper.mocks.BlackstoneHotelMock;
import com.cocha.hotels.hotelmapper.mocks.ComfortInnHotelMock;
import com.cocha.hotels.hotelmapper.mocks.HotelMock;
import com.cocha.hotels.hotelmapper.mocks.LeamingtonHotelMock;
import com.cocha.hotels.hotelmapper.mocks.QualitySuitesHotelMock;
import com.cocha.hotels.hotelmapper.mocks.QualitySuitesUSHotelMock;
import com.cocha.hotels.hotelmapper.mocks.SaintEugeneHotelMock;
import com.cocha.hotels.hotelmapper.mocks.StaybridgeSuitesHotelMock;
import com.cocha.hotels.hotelmapper.mocks.TaybridgeSuitesHotelMock;
import com.cocha.hotels.hotelmapper.mocks.TravelodgeFlagstaffHotelMock;
import com.cocha.hotels.hotelmapper.mocks.WallStreet_HI_HotelMock;
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

    @Test
    public void testArmadaAgainstComfortInnName() {
        HotelMock builder = new ComfortInnHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelNameRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstComfortInnAddress() {
        HotelMock builder = new ComfortInnHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelAddressRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstLeamingtonName() {
        HotelMock builder = new LeamingtonHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelNameRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstLeamingtonAddress() {
        HotelMock builder = new LeamingtonHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelAddressRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstQualityName() {
        HotelMock builder = new QualitySuitesHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelNameRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstQualityAddress() {
        HotelMock builder = new QualitySuitesHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelAddressRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstQualityUSName() {
        HotelMock builder = new QualitySuitesUSHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelNameRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstQualityUSAddress() {
        HotelMock builder = new QualitySuitesUSHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelAddressRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstSaintEugeneName() {
        HotelMock builder = new SaintEugeneHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelNameRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstSaintEugeneAddress() {
        HotelMock builder = new SaintEugeneHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelAddressRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstStaybridgeName() {
        HotelMock builder = new StaybridgeSuitesHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelNameRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstStaybridgeAddress() {
        HotelMock builder = new StaybridgeSuitesHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelAddressRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstTaybridgeName() {
        HotelMock builder = new TaybridgeSuitesHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelNameRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstTaybridgeAddress() {
        HotelMock builder = new TaybridgeSuitesHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelAddressRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstTravelodgeName() {
        HotelMock builder = new TravelodgeFlagstaffHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelNameRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstTravelodgeAddress() {
        HotelMock builder = new TravelodgeFlagstaffHotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelAddressRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstWallStreetName() {
        HotelMock builder = new WallStreet_HI_HotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelNameRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

    @Test
    public void testArmadaAgainstWallStreetAddress() {
        HotelMock builder = new WallStreet_HI_HotelMock();
        Hotel bookingHotel = builder.buildWithBooking();

        HotelRule rule = new HotelAddressRule();
        RuleMatch ruleMatch = rule.apply(reference, bookingHotel);
        verify(ruleMatch).isNotSuccessful();
    }

}
