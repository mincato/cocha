package com.cocha.hotels.feeddownloader.ean.transformer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.cocha.hotels.feeddownloader.ean.model.EanSupplierHotel;
import com.cocha.hotels.model.content.hotel.Hotel;

public class EanHotelTransformerTest {

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

    @Test
    public void testTransformNullSupplierHotels() {
        assertNull(EanHotelTransformer.toCanonicalHotel(null));
    }

    @Test
    public void testTransformNotNullSupplierHotelData() {
        Hotel canonicalHotels = EanHotelTransformer.toCanonicalHotel(createSupplierHotel());

        assertEquals(TEST_ADDRESS, canonicalHotels.getAddress());
        assertEquals(TEST_COUNTRY_CODE, canonicalHotels.getCountryCode());
        assertEquals(TEST_CURRENCY_CODE, canonicalHotels.getCurrencyCode());
        assertEquals(TEST_HOTEL_ID, canonicalHotels.getId());
        assertEquals(TEST_LATITUDE, canonicalHotels.getLatitude());
        assertEquals(TEST_LONGITUDE, canonicalHotels.getLongitude());
        assertEquals(TEST_NAME, canonicalHotels.getName());
        assertEquals(TEST_STARS, canonicalHotels.getStarRating());
        assertEquals(TEST_ZIP, canonicalHotels.getZipCode());
        assertEquals(TEST_DESCRIPTION, canonicalHotels.getDescription());
        assertEquals(Hotel.EAN_SUPPLIER_CODE, canonicalHotels.getSupplierCode());
    }

    private EanSupplierHotel createSupplierHotel() {
        EanSupplierHotel supplierHotel = new EanSupplierHotel();
        supplierHotel.setAddress(TEST_ADDRESS);
        supplierHotel.setCountry(TEST_COUNTRY_CODE);
        supplierHotel.setPropertyCurrency(TEST_CURRENCY_CODE);
        supplierHotel.setHotelId(TEST_HOTEL_ID);
        supplierHotel.setLatitude(TEST_LATITUDE);
        supplierHotel.setLongitude(TEST_LONGITUDE);
        supplierHotel.setName(TEST_NAME);
        supplierHotel.setStarRating(TEST_STARS);
        supplierHotel.setPostalCode(TEST_ZIP);
        supplierHotel.setDescription(TEST_DESCRIPTION);
        return supplierHotel;
    }

}
