package com.cocha.hotels.hotelmapper.mapping;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.cocha.hotels.hotelmapper.algorithm.HotelRulesProcessor;
import com.cocha.hotels.hotelmapper.managers.HotelMappingManager;
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
import com.cocha.hotels.model.content.mapping.HotelMapping;

@RunWith(MockitoJUnitRunner.class)
public class HotelMappingServiceTest {

    private List<HotelMock> builders;

    @InjectMocks
    private HotelMappingService mappingService = new HotelMappingService();

    @Mock
    private HotelMappingManager hotelMappingManager;

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

        mappingService.setCanonicalIdGenerator(new CanonicalIdGenerator());
        mappingService.setMatchingService(new HotelMatchingService(new HotelRulesProcessor()));
        mappingService.setProximityFilterService(new ProximityFilterService());
    }

    @Test
    public void mappingEANandBookingHotels() {
        when(hotelMappingManager.find(any(String.class), any(String.class), any(Integer.class))).thenReturn(null);

        List<Hotel> eanHotels = buildHotelsFromEAN();
        List<Hotel> bookingHotels = buildHotelsFromBooking();

        List<Hotel> hotels = new ArrayList<Hotel>(eanHotels);
        hotels.addAll(bookingHotels);

        List<HotelMapping> mapping = mappingService.map(hotels);

        verify(mapping).hasAllHotelsMapped(eanHotels);
        verify(mapping).hasAllHotelsMapped(bookingHotels);
    }

    @Test
    public void mappingDifferentHotels() {
        when(hotelMappingManager.find(any(String.class), any(String.class), any(Integer.class))).thenReturn(null);
        HotelMock builder = new TravelodgeFlagstaffHotelMock();
        List<Hotel> eanHotels = Arrays.asList(builder.buildWithEan());
        List<Hotel> bookingHotels = Arrays.asList(builder.buildWithBooking());

        List<Hotel> hotels = new ArrayList<Hotel>(eanHotels);
        hotels.addAll(bookingHotels);

        List<HotelMapping> mapping = mappingService.map(hotels);

        verify(mapping).hasNoHotelsMapped(eanHotels);
        verify(mapping).hasNoHotelsMapped(bookingHotels);
    }

    @Test
    public void mappingEANBookingHotelsEANInactive() {
        when(hotelMappingManager.find(any(String.class), any(String.class), any(Integer.class))).thenReturn(null);
        ArmadaHotelMock hotelMock = new ArmadaHotelMock();
        Hotel eanHotel = hotelMock.buildWithEan();
        eanHotel.setActive(false);
        List<Hotel> eanHotels = Arrays.asList(eanHotel);
        List<Hotel> bookingHotels = Arrays.asList(hotelMock.buildWithBooking());

        List<Hotel> hotels = new ArrayList<Hotel>(eanHotels);
        hotels.addAll(bookingHotels);

        List<HotelMapping> mappings = mappingService.map(hotels);
        Assert.assertEquals(2, mappings.size());
        List<HotelMapping> inactiveMappings = mappings.stream().filter(mapping -> !mapping.isActive())
                .collect(Collectors.toList());
        Assert.assertEquals(1, inactiveMappings.size());
        Assert.assertEquals(100, inactiveMappings.get(0).getConfidence().intValue());
        Assert.assertEquals(eanHotel.getSupplierCode(), inactiveMappings.get(0).getSupplierCode());
        Assert.assertEquals(eanHotel.getId(), inactiveMappings.get(0).getSupplierHotelId());
    }

    @Test
    public void mappingEANBookingHotelsBookingInactive() {
        when(hotelMappingManager.find(any(String.class), any(String.class), any(Integer.class))).thenReturn(null);
        ArmadaHotelMock hotelMock = new ArmadaHotelMock();
        List<Hotel> eanHotels = Arrays.asList(hotelMock.buildWithEan());
        Hotel bookingHotel = hotelMock.buildWithBooking();
        bookingHotel.setActive(false);
        List<Hotel> bookingHotels = Arrays.asList(bookingHotel);

        List<Hotel> hotels = new ArrayList<Hotel>(eanHotels);
        hotels.addAll(bookingHotels);

        List<HotelMapping> mappings = mappingService.map(hotels);
        Assert.assertEquals(2, mappings.size());
        List<HotelMapping> inactiveMappings = mappings.stream().filter(mapping -> !mapping.isActive())
                .collect(Collectors.toList());
        Assert.assertEquals(1, inactiveMappings.size());
        Assert.assertEquals(99, inactiveMappings.get(0).getConfidence().intValue());
        Assert.assertEquals(bookingHotel.getSupplierCode(), inactiveMappings.get(0).getSupplierCode());
        Assert.assertEquals(bookingHotel.getId(), inactiveMappings.get(0).getSupplierHotelId());
    }

    @Test
    public void unmappingEANBookingHotels() {
        ArmadaHotelMock hotelMock = new ArmadaHotelMock();
        Hotel eanHotel = hotelMock.buildWithEan();
        HotelMapping hotelMapping = new HotelMapping();
        hotelMapping.setConfidence(100);
        hotelMapping.setHotelId("1");
        hotelMapping.setId(1L);
        hotelMapping.setSupplierCode(eanHotel.getSupplierCode());
        hotelMapping.setSupplierHotelId(eanHotel.getId());
        when(hotelMappingManager.find(eanHotel.getId(), eanHotel.getSupplierCode(), 100)).thenReturn(hotelMapping);
        List<Hotel> eanHotels = Arrays.asList(eanHotel);

        Hotel bookingHotel = hotelMock.buildWithBooking();
        hotelMapping = new HotelMapping();
        hotelMapping.setConfidence(99);
        hotelMapping.setHotelId("1");
        hotelMapping.setId(2L);
        hotelMapping.setSupplierCode(bookingHotel.getSupplierCode());
        hotelMapping.setSupplierHotelId(bookingHotel.getId());
        when(hotelMappingManager.find(hotelMapping.getHotelId(), bookingHotel.getSupplierCode())).thenReturn(
                hotelMapping);
        bookingHotel.setName("no matchea");
        bookingHotel.setAddress("fake");
        List<Hotel> bookingHotels = Arrays.asList(bookingHotel);

        List<Hotel> hotels = new ArrayList<Hotel>(eanHotels);
        hotels.addAll(bookingHotels);

        List<HotelMapping> mappings = mappingService.map(hotels);
        Assert.assertEquals(3, mappings.size());
        List<HotelMapping> unMappedMappings = mappings.stream().filter(mapping -> mapping.isUnmapped())
                .collect(Collectors.toList());
        Assert.assertEquals(1, unMappedMappings.size());
        Assert.assertEquals(99, unMappedMappings.get(0).getConfidence().intValue());
        Assert.assertEquals(bookingHotel.getSupplierCode(), unMappedMappings.get(0).getSupplierCode());
        Assert.assertEquals(bookingHotel.getId(), unMappedMappings.get(0).getSupplierHotelId());
        Assert.assertFalse(unMappedMappings.get(0).isActive());
    }

    @Test
    public void mappingEANBookingHotelsMappedByUser() {
        ArmadaHotelMock hotelMock = new ArmadaHotelMock();
        Hotel eanHotel = hotelMock.buildWithEan();
        HotelMapping hotelMapping = new HotelMapping();
        hotelMapping.setConfidence(100);
        hotelMapping.setHotelId("1");
        hotelMapping.setId(1L);
        hotelMapping.setSupplierCode(eanHotel.getSupplierCode());
        hotelMapping.setSupplierHotelId(eanHotel.getId());
        when(hotelMappingManager.find(eanHotel.getId(), eanHotel.getSupplierCode(), 100)).thenReturn(hotelMapping);
        List<Hotel> eanHotels = Arrays.asList(eanHotel);

        Hotel bookingHotel = hotelMock.buildWithBooking();
        hotelMapping = new HotelMapping();
        hotelMapping.setConfidence(0);
        hotelMapping.setHotelId("1");
        hotelMapping.setId(2L);
        hotelMapping.setSupplierCode(bookingHotel.getSupplierCode());
        hotelMapping.setSupplierHotelId(bookingHotel.getId());
        hotelMapping.setMappedByUser(true);
        when(hotelMappingManager.find(hotelMapping.getHotelId(), bookingHotel.getSupplierCode())).thenReturn(
                hotelMapping);
        bookingHotel.setName("no matchea");
        bookingHotel.setAddress("fake");
        List<Hotel> bookingHotels = Arrays.asList(bookingHotel);

        List<Hotel> hotels = new ArrayList<Hotel>(eanHotels);
        hotels.addAll(bookingHotels);

        List<HotelMapping> mappings = mappingService.map(hotels);
        Assert.assertEquals(2, mappings.size());
        List<HotelMapping> mappedMappings = mappings.stream().filter(mapping -> mapping.isMappedByUser())
                .collect(Collectors.toList());
        Assert.assertEquals(1, mappedMappings.size());
        Assert.assertEquals(0, mappedMappings.get(0).getConfidence().intValue());
        Assert.assertEquals(bookingHotel.getSupplierCode(), mappedMappings.get(0).getSupplierCode());
        Assert.assertEquals(bookingHotel.getId(), mappedMappings.get(0).getSupplierHotelId());
        Assert.assertTrue(mappedMappings.get(0).isActive());
    }

    @Test
    public void mappingEANBookingHotelsMappedByUserInactive() {
        ArmadaHotelMock hotelMock = new ArmadaHotelMock();
        Hotel eanHotel = hotelMock.buildWithEan();
        HotelMapping hotelMapping = new HotelMapping();
        hotelMapping.setConfidence(100);
        hotelMapping.setHotelId("1");
        hotelMapping.setId(1L);
        hotelMapping.setSupplierCode(eanHotel.getSupplierCode());
        hotelMapping.setSupplierHotelId(eanHotel.getId());
        when(hotelMappingManager.find(eanHotel.getId(), eanHotel.getSupplierCode(), 100)).thenReturn(hotelMapping);
        List<Hotel> eanHotels = Arrays.asList(eanHotel);

        Hotel bookingHotel = hotelMock.buildWithBooking();
        hotelMapping = new HotelMapping();
        hotelMapping.setConfidence(0);
        hotelMapping.setHotelId("1");
        hotelMapping.setId(2L);
        hotelMapping.setSupplierCode(bookingHotel.getSupplierCode());
        hotelMapping.setSupplierHotelId(bookingHotel.getId());
        hotelMapping.setMappedByUser(true);
        when(hotelMappingManager.find(hotelMapping.getHotelId(), bookingHotel.getSupplierCode())).thenReturn(
                hotelMapping);
        bookingHotel.setName("no matchea");
        bookingHotel.setAddress("fake");
        bookingHotel.setActive(false);
        List<Hotel> bookingHotels = Arrays.asList(bookingHotel);

        List<Hotel> hotels = new ArrayList<Hotel>(eanHotels);
        hotels.addAll(bookingHotels);

        List<HotelMapping> mappings = mappingService.map(hotels);
        Assert.assertEquals(2, mappings.size());
        List<HotelMapping> mappedMappings = mappings.stream().filter(mapping -> mapping.isMappedByUser())
                .collect(Collectors.toList());
        Assert.assertEquals(1, mappedMappings.size());
        Assert.assertEquals(0, mappedMappings.get(0).getConfidence().intValue());
        Assert.assertEquals(bookingHotel.getSupplierCode(), mappedMappings.get(0).getSupplierCode());
        Assert.assertEquals(bookingHotel.getId(), mappedMappings.get(0).getSupplierHotelId());
        Assert.assertFalse(mappedMappings.get(0).isActive());
    }

    @Test
    public void mappingEANBookingHotelsMappedByUser2HotelsEAN() {
        ArmadaHotelMock hotelMock = new ArmadaHotelMock();
        Hotel eanHotel = hotelMock.buildWithEan();
        HotelMapping hotelMapping = new HotelMapping();
        hotelMapping.setConfidence(100);
        hotelMapping.setHotelId("1");
        hotelMapping.setId(1L);
        hotelMapping.setSupplierCode(eanHotel.getSupplierCode());
        hotelMapping.setSupplierHotelId(eanHotel.getId());
        when(hotelMappingManager.find(eanHotel.getId(), eanHotel.getSupplierCode(), 100)).thenReturn(hotelMapping);
        Hotel eanHotel2 = hotelMock.buildWithEan();
        eanHotel2.setId("EAN-12345");
        eanHotel2.setName("no matchea");
        eanHotel2.setAddress("fake");
        List<Hotel> eanHotels = Arrays.asList(eanHotel, eanHotel2);

        Hotel bookingHotel = hotelMock.buildWithBooking();
        hotelMapping = new HotelMapping();
        hotelMapping.setConfidence(0);
        hotelMapping.setHotelId("1");
        hotelMapping.setId(2L);
        hotelMapping.setSupplierCode(bookingHotel.getSupplierCode());
        hotelMapping.setSupplierHotelId(bookingHotel.getId());
        hotelMapping.setMappedByUser(true);
        when(hotelMappingManager.find(hotelMapping.getHotelId(), bookingHotel.getSupplierCode())).thenReturn(
                hotelMapping);
        bookingHotel.setName("no matchea");
        bookingHotel.setAddress("fake");
        List<Hotel> bookingHotels = Arrays.asList(bookingHotel);

        List<Hotel> hotels = new ArrayList<Hotel>(eanHotels);
        hotels.addAll(bookingHotels);

        List<HotelMapping> mappings = mappingService.map(hotels);
        Assert.assertEquals(3, mappings.size());
        List<HotelMapping> mappedMappings = mappings.stream().filter(mapping -> mapping.isMappedByUser())
                .collect(Collectors.toList());
        Assert.assertEquals(1, mappedMappings.size());
        Assert.assertEquals(0, mappedMappings.get(0).getConfidence().intValue());
        Assert.assertEquals(bookingHotel.getSupplierCode(), mappedMappings.get(0).getSupplierCode());
        Assert.assertEquals(bookingHotel.getId(), mappedMappings.get(0).getSupplierHotelId());
        Assert.assertEquals("1", mappedMappings.get(0).getHotelId());

        mappedMappings = mappings.stream().filter(mapping -> mapping.getConfidence() == 100)
                .collect(Collectors.toList());
        Assert.assertEquals(2, mappedMappings.size());
    }

    @Test
    public void mappingEANBookingHotelsMappedByUser2HotelsBooking() {
        ArmadaHotelMock hotelMock = new ArmadaHotelMock();
        Hotel eanHotel = hotelMock.buildWithEan();
        HotelMapping hotelMapping = new HotelMapping();
        hotelMapping.setConfidence(100);
        hotelMapping.setHotelId("1");
        hotelMapping.setId(1L);
        hotelMapping.setSupplierCode(eanHotel.getSupplierCode());
        hotelMapping.setSupplierHotelId(eanHotel.getId());
        when(hotelMappingManager.find(eanHotel.getId(), eanHotel.getSupplierCode(), 100)).thenReturn(hotelMapping);
        List<Hotel> eanHotels = Arrays.asList(eanHotel);

        Hotel bookingHotel = hotelMock.buildWithBooking();
        hotelMapping = new HotelMapping();
        hotelMapping.setConfidence(0);
        hotelMapping.setHotelId("1");
        hotelMapping.setId(2L);
        hotelMapping.setSupplierCode(bookingHotel.getSupplierCode());
        hotelMapping.setSupplierHotelId(bookingHotel.getId());
        hotelMapping.setMappedByUser(true);
        when(hotelMappingManager.find(hotelMapping.getHotelId(), bookingHotel.getSupplierCode())).thenReturn(
                hotelMapping);
        bookingHotel.setName("no matchea");
        bookingHotel.setAddress("fake");

        Hotel bookingHotel2 = hotelMock.buildWithBooking();
        bookingHotel2.setId("BKG - 12345");
        List<Hotel> bookingHotels = Arrays.asList(bookingHotel, bookingHotel2);

        List<Hotel> hotels = new ArrayList<Hotel>(eanHotels);
        hotels.addAll(bookingHotels);

        List<HotelMapping> mappings = mappingService.map(hotels);
        Assert.assertEquals(3, mappings.size());
        List<HotelMapping> mappedMappings = mappings.stream().filter(mapping -> mapping.isMappedByUser())
                .collect(Collectors.toList());
        Assert.assertEquals(1, mappedMappings.size());
        Assert.assertEquals(0, mappedMappings.get(0).getConfidence().intValue());
        Assert.assertEquals(bookingHotel.getSupplierCode(), mappedMappings.get(0).getSupplierCode());
        Assert.assertEquals(bookingHotel.getId(), mappedMappings.get(0).getSupplierHotelId());
        Assert.assertEquals("1", mappedMappings.get(0).getHotelId());

        mappedMappings = mappings.stream().filter(mapping -> mapping.getConfidence() == 100)
                .collect(Collectors.toList());
        Assert.assertEquals(2, mappedMappings.size());
    }

    private MappingResultVerifier verify(List<HotelMapping> mapping) {
        return new MappingResultVerifier(mapping);
    }

    class MappingResultVerifier {

        private List<HotelMapping> mapping;

        public MappingResultVerifier(List<HotelMapping> mapping) {
            this.mapping = mapping;
        }

        /*
         * If no hotels are mapped, there is one and only one entry per hotel,
         * and there is no duplicate hotelId (canonical), since no hotel share
         * the canonical id it was given.
         */
        public void hasNoHotelsMapped(List<Hotel> hotels) {
            hotels.forEach((hotel) -> {
                Predicate<HotelMapping> byHotelSupplierId = (entry) -> entry.getSupplierHotelId().equals(hotel.getId());
                Predicate<HotelMapping> byHotelSupplierCode = (entry) -> entry.getSupplierCode().equals(
                        hotel.getSupplierCode());
                Long count = mapping.stream().filter(byHotelSupplierId.and(byHotelSupplierCode))
                        .map(filteredHotel -> filteredHotel.getHotelId()).count();
                Assert.assertTrue(count.equals(1l));
            });
        }

        /*
         * If all hotels are mapped, there are N entries in the mapping per
         * hotel where N is the number of suppliers. It is assumed that all
         * hotels in the list have the same supplier code.
         */
        public void hasAllHotelsMapped(final List<Hotel> hotels) {
            hotels.forEach((hotel) -> {
                Predicate<HotelMapping> byHotelSupplierId = (entry) -> entry.getSupplierHotelId().equals(hotel.getId());
                Predicate<HotelMapping> byHotelSupplierCode = (entry) -> entry.getSupplierCode().equals(
                        hotel.getSupplierCode());

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
