package com.cocha.hotels.feeddownloader.booking.transformer;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.cocha.hotels.feeddownloader.booking.model.BookingSupplierHotel;
import com.cocha.hotels.feeddownloader.booking.model.GetHotelDescriptionTranslations;
import com.cocha.hotels.feeddownloader.booking.model.GetHotelsResponse;
import com.cocha.hotels.feeddownloader.booking.model.HotelDescriptionTranslation;
import com.cocha.hotels.feeddownloader.booking.model.Location;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.hotel.HotelDescription;

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
    private static final String TEST_DESCRIPTION = "testDescription";
    private static final String TEST_LANGUAGE_CODE = "es";

    @Test
    public void testTransformNullHotelsResponse() {
        assertNull(BookingHotelTransformer.toCanonicalHotels(null));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testTransformNullSupplierHotelList() {
        List<Hotel> canonicalHotels = BookingHotelTransformer.toCanonicalHotels(new GetHotelsResponse());
        assertTrue(canonicalHotels.isEmpty());
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testTransformNotNullSupplierHotelList() {
        List<Hotel> canonicalHotels = BookingHotelTransformer.toCanonicalHotels(createSupplierHotel());

        assertEquals(TEST_ADDRESS, canonicalHotels.get(0).getAddress());
        assertEquals(StringUtils.upperCase(TEST_COUNTRY_CODE), canonicalHotels.get(0).getCountryCode());
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

    @Test
    public void testTransformNullDescriptionsResponse() {
        assertNull(BookingHotelTransformer.toCanonicalDescriptions(null));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testTransformNullSupplierDescriptionList() {
        List<Hotel> canonicalHotels = BookingHotelTransformer
                .toCanonicalDescriptions(new GetHotelDescriptionTranslations());
        assertTrue(canonicalHotels.isEmpty());
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testTransformNotNullSupplierDescriptionList() {
        List<HotelDescription> canonicalDescriptions = BookingHotelTransformer
                .toCanonicalDescriptions(createSupplierDescription());

        assertEquals(TEST_HOTEL_ID, canonicalDescriptions.get(0).getHotelId());
        assertEquals(TEST_DESCRIPTION, canonicalDescriptions.get(0).getDescription());
        assertEquals(TEST_LANGUAGE_CODE, canonicalDescriptions.get(0).getLanguageCode());
        assertEquals(Hotel.BOOKING_SUPPLIER_CODE, canonicalDescriptions.get(0).getSupplierCode());

    }

    private GetHotelDescriptionTranslations createSupplierDescription() {
        GetHotelDescriptionTranslations hotelDescriptions = new GetHotelDescriptionTranslations();
        List<HotelDescriptionTranslation> supplierDescriptionList = new ArrayList<HotelDescriptionTranslation>();
        HotelDescriptionTranslation supplierDescription = new HotelDescriptionTranslation();
        supplierDescription.setHotelId(TEST_HOTEL_ID);
        supplierDescription.setDescription(TEST_DESCRIPTION);
        supplierDescription.setLanguageCode(TEST_LANGUAGE_CODE);
        supplierDescriptionList.add(supplierDescription);
        hotelDescriptions.setDescriptionTranslations(supplierDescriptionList);
        return hotelDescriptions;
    }

}
