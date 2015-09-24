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
import com.cocha.hotels.model.content.mapping.HotelMatch;

/**
 * Tests para probar las reglas con cada hotel y obtener el nivel de confianza
 * del mapping.
 *
 */
public class ConfidenceLevelTest {

    private static final Integer MINIMUM_CONFIDENCE_LEVEL = 60;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testArmadaMappingRules() {
        HotelMock mock = new ArmadaHotelMock();
        Hotel hotelReference = mock.buildWithEan();
        Hotel hotelToCompare = mock.buildWithBooking();

        HotelRulesProcessor rulesProcessor = new HotelRulesProcessor();

        HotelMatch match = rulesProcessor.applyRules(hotelReference, hotelToCompare);

        verify(match).hasGreatOrEqualConfidenceThan(MINIMUM_CONFIDENCE_LEVEL);
    }

    @Test
    public void testBlackstoneMappingRules() {
        HotelMock mock = new BlackstoneHotelMock();
        Hotel hotelReference = mock.buildWithEan();
        Hotel hotelToCompare = mock.buildWithBooking();

        HotelRulesProcessor rulesProcessor = new HotelRulesProcessor();

        HotelMatch match = rulesProcessor.applyRules(hotelReference, hotelToCompare);

        verify(match).hasGreatOrEqualConfidenceThan(MINIMUM_CONFIDENCE_LEVEL);
    }

    @Test
    public void testComfortInnMappingRules() {
        HotelMock mock = new ComfortInnHotelMock();
        Hotel hotelReference = mock.buildWithEan();
        Hotel hotelToCompare = mock.buildWithBooking();

        HotelRulesProcessor rulesProcessor = new HotelRulesProcessor();

        HotelMatch match = rulesProcessor.applyRules(hotelReference, hotelToCompare);

        verify(match).hasGreatOrEqualConfidenceThan(MINIMUM_CONFIDENCE_LEVEL);
    }

    @Test
    public void testLeamingtonMappingRules() {
        HotelMock mock = new LeamingtonHotelMock();
        Hotel hotelReference = mock.buildWithEan();
        Hotel hotelToCompare = mock.buildWithBooking();

        HotelRulesProcessor rulesProcessor = new HotelRulesProcessor();

        HotelMatch match = rulesProcessor.applyRules(hotelReference, hotelToCompare);

        verify(match).hasGreatOrEqualConfidenceThan(MINIMUM_CONFIDENCE_LEVEL);
    }

    @Test
    public void testQualitySuitesMappingRules() {
        HotelMock mock = new QualitySuitesHotelMock();
        Hotel hotelReference = mock.buildWithEan();
        Hotel hotelToCompare = mock.buildWithBooking();

        HotelRulesProcessor rulesProcessor = new HotelRulesProcessor();

        HotelMatch match = rulesProcessor.applyRules(hotelReference, hotelToCompare);

        verify(match).hasGreatOrEqualConfidenceThan(MINIMUM_CONFIDENCE_LEVEL);
    }

    @Test
    public void testQualitySuitesUSMappingRules() {
        HotelMock mock = new QualitySuitesUSHotelMock();
        Hotel hotelReference = mock.buildWithEan();
        Hotel hotelToCompare = mock.buildWithBooking();

        HotelRulesProcessor rulesProcessor = new HotelRulesProcessor();

        HotelMatch match = rulesProcessor.applyRules(hotelReference, hotelToCompare);

        verify(match).hasGreatOrEqualConfidenceThan(MINIMUM_CONFIDENCE_LEVEL);
    }

    @Test
    public void testSaintEugeneMappingRules() {
        HotelMock mock = new SaintEugeneHotelMock();
        Hotel hotelReference = mock.buildWithEan();
        Hotel hotelToCompare = mock.buildWithBooking();

        HotelRulesProcessor rulesProcessor = new HotelRulesProcessor();

        HotelMatch match = rulesProcessor.applyRules(hotelReference, hotelToCompare);

        verify(match).hasGreatOrEqualConfidenceThan(MINIMUM_CONFIDENCE_LEVEL);
    }

    @Test
    public void testStaybridgeMappingRules() {
        HotelMock mock = new StaybridgeSuitesHotelMock();
        Hotel hotelReference = mock.buildWithEan();
        Hotel hotelToCompare = mock.buildWithBooking();

        HotelRulesProcessor rulesProcessor = new HotelRulesProcessor();

        HotelMatch match = rulesProcessor.applyRules(hotelReference, hotelToCompare);

        verify(match).hasGreatOrEqualConfidenceThan(MINIMUM_CONFIDENCE_LEVEL);
    }

    @Test
    public void testTaybridgeMappingRules() {
        HotelMock mock = new TaybridgeSuitesHotelMock();
        Hotel hotelReference = mock.buildWithEan();
        Hotel hotelToCompare = mock.buildWithBooking();

        HotelRulesProcessor rulesProcessor = new HotelRulesProcessor();

        HotelMatch match = rulesProcessor.applyRules(hotelReference, hotelToCompare);

        verify(match).hasGreatOrEqualConfidenceThan(MINIMUM_CONFIDENCE_LEVEL);
    }

    @Test
    public void testTravelodgeMappingRules() {
        HotelMock mock = new TravelodgeFlagstaffHotelMock();
        Hotel hotelReference = mock.buildWithEan();
        Hotel hotelToCompare = mock.buildWithBooking();

        HotelRulesProcessor rulesProcessor = new HotelRulesProcessor();

        HotelMatch match = rulesProcessor.applyRules(hotelReference, hotelToCompare);

        // SON HOTELES DISTINTOS
        verify(match).hasLessConfidenceThan(MINIMUM_CONFIDENCE_LEVEL);
    }

    @Test
    public void testWallStreetMappingRules() {
        HotelMock mock = new WallStreet_HI_HotelMock();
        Hotel hotelReference = mock.buildWithEan();
        Hotel hotelToCompare = mock.buildWithBooking();

        HotelRulesProcessor rulesProcessor = new HotelRulesProcessor();

        HotelMatch match = rulesProcessor.applyRules(hotelReference, hotelToCompare);

        verify(match).hasGreatOrEqualConfidenceThan(MINIMUM_CONFIDENCE_LEVEL);
    }

    private MatchVerifier verify(HotelMatch match) {
        return new MatchVerifier(match);
    }

}
