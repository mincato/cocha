package com.cocha.hotels.feeddownloader.booking.transformer;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cocha.hotels.feeddownloader.booking.model.BookingSupplierHotel;
import com.cocha.hotels.feeddownloader.booking.model.GetHotelsResponse;
import com.cocha.hotels.feeddownloader.booking.model.Location;
import com.cocha.hotels.model.content.hotel.Hotel;

public class BookingHotelTransformerTest {

    private static final String TEST_ZIP = "testZip";
    private static final String TEST_STARS = "testStars";
    private static final String TEST_NAME = "testName";
    private static final Double TEST_LONGITUDE = 2.2;
    private static final Double TEST_LATITUDE = 1.1;
    private static final String TEST_HOTEL_ID = "testHotelId";
    private static final String TEST_CURRENCY_CODE = "testCurrencyCode";
    private static final String TEST_COUNTRY_CODE = "testCountryCode";
    private static final String TEST_ADDRESS = "testAddress";

    @Test
    public void testTransformNullHotelsResponse() {
        assertNull(BookingHotelTransformer.toCanonicalHotels(null));
    }

    @Test
    public void testTransformNullSupplierHotelList() {
        List<Hotel> canonicalHotels = BookingHotelTransformer.toCanonicalHotels(new GetHotelsResponse());
        assertTrue(canonicalHotels.isEmpty());
    }

    @Test
    public void testTransformNotNullSupplierHotelList() {
        List<Hotel> canonicalHotels = BookingHotelTransformer.toCanonicalHotels(createSupplierHotel());

        assertEquals(TEST_ADDRESS, canonicalHotels.get(0).getAddress());
        assertEquals(TEST_COUNTRY_CODE, canonicalHotels.get(0).getCountryCode());
        assertEquals(TEST_CURRENCY_CODE, canonicalHotels.get(0).getCurrencyCode());
        assertEquals(TEST_HOTEL_ID, canonicalHotels.get(0).getId());
        assertEquals(TEST_LATITUDE, canonicalHotels.get(0).getLatitude());
        assertEquals(TEST_LONGITUDE, canonicalHotels.get(0).getLongitude());
        assertEquals(TEST_NAME, canonicalHotels.get(0).getName());
        assertEquals(TEST_STARS, canonicalHotels.get(0).getStarRating());
        assertEquals(TEST_ZIP, canonicalHotels.get(0).getZipCode());
        assertEquals(Hotel.BOOKING_SUPPLIER_CODE, canonicalHotels.get(0).getSupplierCode());
    }

    private GetHotelsResponse createSupplierHotel() {
        GetHotelsResponse hotelsResponse = new GetHotelsResponse();
        List<BookingSupplierHotel> supplierHotelList = new ArrayList<BookingSupplierHotel>();
        BookingSupplierHotel supplierHotel = new BookingSupplierHotel();
        supplierHotel.setAddress(TEST_ADDRESS);
        supplierHotel.setCountryCode(TEST_COUNTRY_CODE);
        supplierHotel.setCurrencyCode(TEST_CURRENCY_CODE);
        supplierHotel.setHotelId(TEST_HOTEL_ID);
        Location location = new Location();
        location.setLatitude(TEST_LATITUDE.toString());
        location.setLongitude(TEST_LONGITUDE.toString());
        supplierHotel.setLocation(location);
        supplierHotel.setName(TEST_NAME);
        supplierHotel.setStars(TEST_STARS);
        supplierHotel.setZip(TEST_ZIP);
        supplierHotelList.add(supplierHotel);
        hotelsResponse.setHotels(supplierHotelList);
        return hotelsResponse;
    }

}
