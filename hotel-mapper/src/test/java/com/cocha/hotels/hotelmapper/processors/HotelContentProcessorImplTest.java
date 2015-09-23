package com.cocha.hotels.hotelmapper.processors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.cocha.hotels.hotelmapper.repositories.feeds.HotelFeedRepository;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.hotel.HotelDescription;
import com.cocha.hotels.model.content.hotel.HotelKey;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@RunWith(MockitoJUnitRunner.class)
public class HotelContentProcessorImplTest {

    private static final String BKG_HOTEL_ID = "150";

    private static final String TEST_HOTEL_ID = "1";

    private static final String TEST_ZIP_CODE = "zipCode";

    private static final String TEST_STAR_RATING = "starRating";

    private static final String TEST_NAME = "name";

    private static final Double TEST_LONGITUDE = 15.0;

    private static final Double TEST_LATITUDE = 13.0;

    private static final String TEST_LANGUAGE_CODE = "languageCode";

    private static final String EAN_HOTEL_ID = "100";

    private static final String TEST_DESCRIPTION = "description";

    private static final String TEST_CURRENCY_CODE = "currencyCode";

    private static final String TEST_COUNTRY_CODE = "countryCode";

    private static final String TEST_ADDRESS = "address";

    @Mock
    private HotelFeedRepository hotelFeedRepository;

    @InjectMocks
    private HotelContentProcessorImpl hotelContentProcessor = new HotelContentProcessorImpl();

    @Test
    public void testProcessNullMapping() {
        assertTrue(hotelContentProcessor.process(null).isEmpty());
    }

    @Test
    public void testProcessOneMappingNullHotelId() {
        HotelMapping hotelMapping = new HotelMapping();
        hotelMapping.setConfidence(100);
        hotelMapping.setSupplierCode("supplierCode");
        hotelMapping.setSupplierHotelId("supplierHotelId");
        List<HotelMapping> hotelMappings = new ArrayList<HotelMapping>();
        hotelMappings.add(hotelMapping);
        assertTrue(hotelContentProcessor.process(hotelMappings).isEmpty());
    }

    @Test
    public void testProcessOneMappingNullSupplierHotelId() {
        HotelMapping hotelMapping = new HotelMapping();
        hotelMapping.setHotelId("hotelId");
        hotelMapping.setConfidence(100);
        hotelMapping.setSupplierCode("supplierCode");
        List<HotelMapping> hotelMappings = new ArrayList<HotelMapping>();
        hotelMappings.add(hotelMapping);
        assertTrue(hotelContentProcessor.process(hotelMappings).isEmpty());
    }

    @Test
    public void testProcessOneMappingNullSupplierCode() {
        HotelMapping hotelMapping = new HotelMapping();
        hotelMapping.setHotelId("hotelId");
        hotelMapping.setConfidence(100);
        hotelMapping.setSupplierHotelId("supplierHotelId");
        List<HotelMapping> hotelMappings = new ArrayList<HotelMapping>();
        hotelMappings.add(hotelMapping);
        assertTrue(hotelContentProcessor.process(hotelMappings).isEmpty());
    }

    @Test
    public void testProcessOneMappingNullConfidence() {
        HotelMapping hotelMapping = new HotelMapping();
        hotelMapping.setHotelId("hotelId");
        hotelMapping.setSupplierCode("supplierCode");
        hotelMapping.setSupplierHotelId("supplierHotelId");
        List<HotelMapping> hotelMappings = new ArrayList<HotelMapping>();
        hotelMappings.add(hotelMapping);
        assertTrue(hotelContentProcessor.process(hotelMappings).isEmpty());
    }

    @Test
    public void testProcessOneMappingConfidenceLessThanPerfect() {
        HotelMapping hotelMapping = new HotelMapping();
        hotelMapping.setHotelId("hotelId");
        hotelMapping.setSupplierCode("supplierCode");
        hotelMapping.setSupplierHotelId("supplierHotelId");
        hotelMapping.setConfidence(99);
        List<HotelMapping> hotelMappings = new ArrayList<HotelMapping>();
        hotelMappings.add(hotelMapping);
        assertTrue(hotelContentProcessor.process(hotelMappings).isEmpty());
    }

    @Test
    public void testProcessTwoMappings() {
        List<HotelMapping> hotelMappings = new ArrayList<HotelMapping>();
        HotelMapping hotelMapping = new HotelMapping();
        hotelMapping.setHotelId(TEST_HOTEL_ID);
        hotelMapping.setSupplierCode(Hotel.EAN_SUPPLIER_CODE);
        hotelMapping.setSupplierHotelId(EAN_HOTEL_ID);
        hotelMapping.setConfidence(100);
        hotelMappings.add(hotelMapping);

        hotelMapping = new HotelMapping();
        hotelMapping.setHotelId(TEST_HOTEL_ID);
        hotelMapping.setSupplierCode(Hotel.BOOKING_SUPPLIER_CODE);
        hotelMapping.setSupplierHotelId(BKG_HOTEL_ID);
        hotelMapping.setConfidence(99);

        HotelKey hotelKey = new HotelKey();
        hotelKey.setId(EAN_HOTEL_ID);
        hotelKey.setSupplierCode(Hotel.EAN_SUPPLIER_CODE);

        when(hotelFeedRepository.findOne(hotelKey)).thenReturn(createHotel());

        List<Hotel> hotels = hotelContentProcessor.process(hotelMappings);

        assertEquals(1, hotels.size());
        assertEquals(TEST_ADDRESS, hotels.get(0).getAddress());
        assertEquals(TEST_COUNTRY_CODE, hotels.get(0).getCountryCode());
        assertEquals(TEST_CURRENCY_CODE, hotels.get(0).getCurrencyCode());
        assertEquals(TEST_HOTEL_ID, hotels.get(0).getId());
        assertEquals(TEST_LATITUDE, hotels.get(0).getLatitude());
        assertEquals(TEST_LONGITUDE, hotels.get(0).getLongitude());
        assertEquals(TEST_NAME, hotels.get(0).getName());
        assertEquals(TEST_STAR_RATING, hotels.get(0).getStarRating());
        assertEquals(TEST_ZIP_CODE, hotels.get(0).getZipCode());
        assertEquals(Hotel.EAN_SUPPLIER_CODE, hotels.get(0).getSupplierCode());
        assertEquals(TEST_DESCRIPTION, hotels.get(0).getDescription().getDescription());

        verify(hotelFeedRepository, times(1)).findOne(Matchers.any(HotelKey.class));
    }

    private Hotel createHotel() {
        Hotel hotel = new Hotel();
        hotel.setId(EAN_HOTEL_ID);
        hotel.setAddress(TEST_ADDRESS);
        hotel.setCountryCode(TEST_COUNTRY_CODE);
        hotel.setCurrencyCode(TEST_CURRENCY_CODE);
        HotelDescription description = new HotelDescription();
        description.setDescription(TEST_DESCRIPTION);
        description.setHotelId(EAN_HOTEL_ID);
        description.setLanguageCode(TEST_LANGUAGE_CODE);
        description.setSupplierCode(Hotel.EAN_SUPPLIER_CODE);
        hotel.setDescription(description);
        hotel.setLatitude(TEST_LATITUDE);
        hotel.setLongitude(TEST_LONGITUDE);
        hotel.setName(TEST_NAME);
        hotel.setStarRating(TEST_STAR_RATING);
        hotel.setSupplierCode(Hotel.EAN_SUPPLIER_CODE);
        hotel.setZipCode(TEST_ZIP_CODE);
        return hotel;
    }

}
