package com.cocha.hotels.hotelmapper.mapping;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cocha.hotels.hotelmapper.algorithm.HotelRulesProcessor;
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
import com.cocha.hotels.model.content.mapping.MultipleMatch;

public class MultipleSupplierHotelsMappingTest {

    private HotelMatchingService matchingService;

    @Before
    public void setUp() throws Exception {
        matchingService = new HotelMatchingService(new HotelRulesProcessor());
    }

    @Test
    public void multipleMatchHasEqualAmountOfMatchesThanHotelsToCompare() {
        HotelMock hotelBuilder = new ArmadaHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        Assert.assertEquals(hotelsFromOtherSupplier.size(), matches.getHotelMatches().size());
    }

    @Test
    public void matchArmadaHotelAgainstOthers() {
        HotelMock hotelBuilder = new ArmadaHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).hasOneValidMatchFor(reference);
    }

    @Test
    public void validMatchForArmadaHotel() {
        HotelMock hotelBuilder = new ArmadaHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).validMatchIdsFor(reference, hotelBuilder.buildWithBooking());
    }

    @Test
    public void matchBlackstoneHotelAgainstOthers() {
        HotelMock hotelBuilder = new BlackstoneHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).hasOneValidMatchFor(reference);
    }

    @Test
    public void validMatchForBlackstoneHotel() {
        HotelMock hotelBuilder = new BlackstoneHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).validMatchIdsFor(reference, hotelBuilder.buildWithBooking());
    }

    @Test
    public void matchComfortInnHotelAgainstOthers() {
        HotelMock hotelBuilder = new ComfortInnHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).hasOneValidMatchFor(reference);
    }

    @Test
    public void validMatchForComfortInnHotel() {
        HotelMock hotelBuilder = new ComfortInnHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).validMatchIdsFor(reference, hotelBuilder.buildWithBooking());
    }

    @Test
    public void matchLeamingtonHotelAgainstOthers() {
        HotelMock hotelBuilder = new LeamingtonHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).hasOneValidMatchFor(reference);
    }

    @Test
    public void validMatchForLeamingtonHotel() {
        HotelMock hotelBuilder = new LeamingtonHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).validMatchIdsFor(reference, hotelBuilder.buildWithBooking());
    }

    @Test
    public void matchQualitySuitesHotelAgainstOthers() {
        HotelMock hotelBuilder = new QualitySuitesHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).hasOneValidMatchFor(reference);
    }

    @Test
    public void validMatchForQualitySuitesHotel() {
        HotelMock hotelBuilder = new QualitySuitesHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).validMatchIdsFor(reference, hotelBuilder.buildWithBooking());
    }

    @Test
    public void matchQualitySuitesUSHotelAgainstOthers() {
        HotelMock hotelBuilder = new QualitySuitesUSHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).hasOneValidMatchFor(reference);
    }

    @Test
    public void validMatchForQualitySuitesUSHotel() {
        HotelMock hotelBuilder = new QualitySuitesUSHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).validMatchIdsFor(reference, hotelBuilder.buildWithBooking());
    }

    @Test
    public void matchSaintEugeneHotelAgainstOthers() {
        HotelMock hotelBuilder = new SaintEugeneHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).hasOneValidMatchFor(reference);
    }

    @Test
    public void validMatchForSaintEugeneHotel() {
        HotelMock hotelBuilder = new SaintEugeneHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).validMatchIdsFor(reference, hotelBuilder.buildWithBooking());
    }

    @Test
    public void matchStaybridgeSuitesHotelAgainstOthers() {
        HotelMock hotelBuilder = new StaybridgeSuitesHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).hasOneValidMatchFor(reference);
    }

    @Test
    public void validMatchForStaybridgeSuitesHotel() {
        HotelMock hotelBuilder = new StaybridgeSuitesHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).validMatchIdsFor(reference, hotelBuilder.buildWithBooking());
    }

    @Test
    public void matchTaybridgeSuitesHotelAgainstOthers() {
        HotelMock hotelBuilder = new TaybridgeSuitesHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).hasOneValidMatchFor(reference);
    }

    @Test
    public void validMatchForTaybridgeSuitesHotel() {
        HotelMock hotelBuilder = new TaybridgeSuitesHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).validMatchIdsFor(reference, hotelBuilder.buildWithBooking());
    }

    @Test
    public void matchWallStreetHotelAgainstOthers() {
        HotelMock hotelBuilder = new WallStreet_HI_HotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).hasOneValidMatchFor(reference);
    }

    @Test
    public void validMatchForWallStreetHotel() {
        HotelMock hotelBuilder = new WallStreet_HI_HotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).validMatchIdsFor(reference, hotelBuilder.buildWithBooking());
    }

    @Test
    public void matchTravelodgeHotelAgainstOthers() {
        HotelMock hotelBuilder = new TravelodgeFlagstaffHotelMock();
        Hotel reference = hotelBuilder.buildWithEan();

        List<Hotel> hotelsFromOtherSupplier = buildHotelsFromBooking();

        MultipleMatch matches = matchingService.match(reference, hotelsFromOtherSupplier);

        validate(matches).hasNoValidMatchFor(reference);
    }

    private MultipleMatchVerifier validate(MultipleMatch matches) {
        return new MultipleMatchVerifier(matches);
    }

    private List<Hotel> buildHotelsFromBooking() {
        HotelMock armada = new ArmadaHotelMock();
        HotelMock blackstone = new BlackstoneHotelMock();
        HotelMock comfort = new ComfortInnHotelMock();
        HotelMock leamington = new LeamingtonHotelMock();
        HotelMock quality = new QualitySuitesHotelMock();
        HotelMock qualityUS = new QualitySuitesUSHotelMock();
        HotelMock saintEugene = new SaintEugeneHotelMock();
        HotelMock staybridge = new StaybridgeSuitesHotelMock();
        HotelMock taybridge = new TaybridgeSuitesHotelMock();
        HotelMock travelodge = new TravelodgeFlagstaffHotelMock();
        HotelMock wallstreet = new WallStreet_HI_HotelMock();
        return Arrays.asList(armada.buildWithBooking(), blackstone.buildWithBooking(), comfort.buildWithBooking(),
                leamington.buildWithBooking(), quality.buildWithBooking(), qualityUS.buildWithBooking(),
                saintEugene.buildWithBooking(), staybridge.buildWithBooking(), taybridge.buildWithBooking(),
                travelodge.buildWithBooking(), wallstreet.buildWithBooking());
    }

    class MultipleMatchVerifier {

        private MultipleMatch multipleHotelMatch;

        public MultipleMatchVerifier(MultipleMatch matches) {
            this.multipleHotelMatch = matches;
        }

        public void hasNoValidMatchFor(Hotel reference) {
            List<HotelMatch> hotelMatches = multipleHotelMatch.getHotelMatches();
            Long validMatches = hotelMatches.stream().filter((match) -> match.getConfidence() >= 60).count();
            Assert.assertTrue(validMatches == 0);
        }

        public void validMatchIdsFor(Hotel reference, Hotel toCompare) {
            HotelMatch validMatch = multipleHotelMatch.findBestMatch();
            Assert.assertEquals(reference.getId(), validMatch.getHotelReference().getId());
            Assert.assertEquals(toCompare.getId(), validMatch.getHotelToCompare().getId());
        }

        public void hasOneValidMatchFor(Hotel reference) {
            List<HotelMatch> hotelMatches = multipleHotelMatch.getHotelMatches();
            Long validMatches = hotelMatches.stream().filter((match) -> match.getConfidence() >= 60).count();
            Assert.assertTrue(validMatches > 0);
        }

    }
}
