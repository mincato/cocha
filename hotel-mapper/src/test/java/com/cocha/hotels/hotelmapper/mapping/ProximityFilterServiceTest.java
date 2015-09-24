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


public class ProximityFilterServiceTest {

    private List<HotelMock> builders;
    private ProximityFilterService service;
    
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
        service = new ProximityFilterService();
        
    }

    @Test
    public void filterByProximityOnSameHotel_EAN() {
        HotelMock builder = new ArmadaHotelMock();
        Hotel hotel = builder.buildWithEan();
        List<Hotel> hotelsToFilter = buildHotelsFromEAN();
        
        List<Hotel> hotelsFiltered = service.filter(hotel, hotelsToFilter);
        
        Assert.assertTrue(hotelsFiltered.contains(hotel));
    }
    
    @Test
    public void filterByProximityOnSameHotel_Booking() {
        HotelMock builder = new ArmadaHotelMock();
        Hotel hotel = builder.buildWithBooking();
        List<Hotel> hotelsToFilter = buildHotelsFromBooking();
        
        List<Hotel> hotelsFiltered = service.filter(hotel, hotelsToFilter);
        
        Assert.assertTrue(hotelsFiltered.contains(hotel));
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
