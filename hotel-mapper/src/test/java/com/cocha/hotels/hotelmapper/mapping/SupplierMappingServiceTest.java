package com.cocha.hotels.hotelmapper.mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


public class SupplierMappingServiceTest {

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
        
        builders = Arrays.asList(armada, blackstone, comfort, 
                leamington, quality, qualityUS, saintEugene, 
                staybridge, taybridge, travelodge, wallstreet);
        
        mappingService = new HotelMappingService();
    }

    @Test
    public void mappingEANtoBookingHotels() {
        List<Hotel> eanHotels = buildHotelsFromEAN();
        List<Hotel> bookingHotels = buildHotelsFromBooking();
        
        MappingResult mappingResult = mappingService.map(eanHotels, bookingHotels);
        
        List<MappingEntry> mapping = mappingResult.getMappingEntries();

        verify(mapping).hasAllHotelsMapped(bookingHotels);
    }
    
    @Test
    public void metricsEANtoBookingHotels() {
        List<Hotel> eanHotels = buildHotelsFromEAN();
        List<Hotel> bookingHotels = buildHotelsFromBooking();
        
        MappingResult mappingResult = mappingService.map(eanHotels, bookingHotels);
        
        List<MappingEntry> metrics = mappingResult.getMappingMetrics();

        verify(metrics).hasAllHotelsMapped(bookingHotels);
    }
    
    private MappingResultVerifier verify(List<MappingEntry> mapping) {
        return new MappingResultVerifier(mapping);
    }

    class MappingResultVerifier {

        private List<MappingEntry> mapping;
        
        public MappingResultVerifier(List<MappingEntry> mapping) {
            this.mapping = mapping;
        }

        public void hasAllHotelsMapped(List<Hotel> hotels) {
            Assert.assertEquals(hotels.size(), mapping.size());
            
            hotels.forEach((hotel) -> {
                Long count = mapping.stream()
                    .filter((entry) -> entry.getBookingHotel().getId().equals(hotel.getId())).count();
                Assert.assertTrue(count.equals(1l));
                }
            );
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
