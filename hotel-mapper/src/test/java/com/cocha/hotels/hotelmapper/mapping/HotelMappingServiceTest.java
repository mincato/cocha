package com.cocha.hotels.hotelmapper.mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.junit.Assert;
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

public class HotelMappingServiceTest {

    private List<HotelMock> builders;
    private HotelMappingService mappingService;

    @Before
    public void setUp() throws Exception {
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

        builders = Arrays.asList(armada, blackstone, comfort, leamington, quality, qualityUS, saintEugene, staybridge,
                taybridge, travelodge, wallstreet);

        mappingService = new HotelMappingService();
    }

    @Test
    public void mappingEANtoBookingHotels() {
        List<Hotel> eanHotels = buildHotelsFromEAN();
        List<Hotel> bookingHotels = buildHotelsFromBooking();
        
        List<Hotel> hotels = new ArrayList<Hotel>(eanHotels);
        hotels.addAll(bookingHotels);

        MappingResult mappingResult = mappingService.map(hotels);

        List<MappingEntry> mapping = mappingResult.getMappingEntries();

        verify(mapping).hasAllHotelsMapped(eanHotels);
        verify(mapping).hasAllHotelsMapped(bookingHotels);
    }

    private MappingResultVerifier verify(List<MappingEntry> mapping) {
        return new MappingResultVerifier(mapping);
    }

    class MappingResultVerifier {

        private List<MappingEntry> mapping;

        public MappingResultVerifier(List<MappingEntry> mapping) {
            this.mapping = mapping;
        }

        /*
         * If all hotels are mapped, there are N entries in the mapping per hotel
         * where N is the number of suppliers
         * It is assumed that all hotels in the list have the same supplier code.
         */
        public void hasAllHotelsMapped(final List<Hotel> hotels) {
            hotels.forEach((hotel) -> {
                Predicate<MappingEntry> byHotelSupplierId = (entry) -> entry.getSupplierId().equals(hotel.getId());
                Predicate<MappingEntry> byHotelSupplierCode = (entry) -> entry.getSupplierCode().equals(hotel.getSupplierCode());

                Long count = mapping.stream().filter(byHotelSupplierId.and(byHotelSupplierCode)).count();
                
                Assert.assertTrue(count.equals(1l));
            });
        }
    }

    private List<Hotel> buildHotelsFromEAN() {
        List<Hotel> hotels = new ArrayList<Hotel>();

        builders.forEach((builder) -> hotels.add(builder.buildWithEan()));
        return hotels;
    }

    private List<Hotel> buildHotelsFromBooking() {
        List<Hotel> hotels = new ArrayList<Hotel>();

        builders.forEach((builder) -> hotels.add(builder.buildWithBooking()));
        return hotels;
    }

}
