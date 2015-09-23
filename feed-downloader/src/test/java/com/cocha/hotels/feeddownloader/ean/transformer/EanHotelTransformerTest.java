package com.cocha.hotels.feeddownloader.ean.transformer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.cocha.hotels.feeddownloader.ean.model.EanHotelDescription;
import com.cocha.hotels.feeddownloader.ean.model.EanSupplierHotel;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.hotel.HotelDescription;

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
    private static final String TEST_LANGUAGE_CODE = "es";

    private EanHotelTransformer eanHotelTransformer = new EanHotelTransformer();

    @Test
    public void testTransformNullSupplierHotels() {
        assertNull(eanHotelTransformer.toCanonicalHotels(null));
    }

    @Test
    public void testTransformNotNullSupplierHotelData() {
        List<Hotel> canonicalHotels = eanHotelTransformer.toCanonicalHotels(createSupplierHotel());

        assertEquals(TEST_ADDRESS, canonicalHotels.get(0).getAddress());
        assertEquals(StringUtils.upperCase(TEST_COUNTRY_CODE), canonicalHotels.get(0).getCountryCode());
        assertEquals(TEST_CURRENCY_CODE, canonicalHotels.get(0).getCurrencyCode());
        assertEquals(TEST_HOTEL_ID, canonicalHotels.get(0).getId());
        assertEquals(TEST_LATITUDE, canonicalHotels.get(0).getLatitude());
        assertEquals(TEST_LONGITUDE, canonicalHotels.get(0).getLongitude());
        assertEquals(TEST_NAME, canonicalHotels.get(0).getName());
        assertEquals(TEST_STARS, canonicalHotels.get(0).getStarRating());
        assertEquals(TEST_ZIP, canonicalHotels.get(0).getZipCode());
        assertEquals(Hotel.EAN_SUPPLIER_CODE, canonicalHotels.get(0).getSupplierCode());
    }

    private List<EanSupplierHotel> createSupplierHotel() {
        List<EanSupplierHotel> supplierHotels = new ArrayList<EanSupplierHotel>();
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
        supplierHotels.add(supplierHotel);
        return supplierHotels;
    }

    @Test
    public void testTransformNullSupplierDescriptions() {
        assertNull(eanHotelTransformer.toCanonicalHotelDescriptions(null));
    }

    @Test
    public void testTransformNotNullSupplierDescriptionsData() {
        List<HotelDescription> canonicalDescriptions = eanHotelTransformer
                .toCanonicalHotelDescriptions(createSupplierDescription());

        assertEquals(TEST_HOTEL_ID, canonicalDescriptions.get(0).getHotelId());
        assertEquals(TEST_DESCRIPTION, canonicalDescriptions.get(0).getDescription());
        assertEquals(TEST_LANGUAGE_CODE, canonicalDescriptions.get(0).getLanguageCode());
        assertEquals(Hotel.EAN_SUPPLIER_CODE, canonicalDescriptions.get(0).getSupplierCode());

    }

    private List<EanHotelDescription> createSupplierDescription() {
        List<EanHotelDescription> supplierDescriptions = new ArrayList<EanHotelDescription>();
        EanHotelDescription supplierDescription = new EanHotelDescription();
        supplierDescription.setHotelId(TEST_HOTEL_ID);
        supplierDescription.setPropertyDescription(TEST_DESCRIPTION);
        supplierDescription.setLanguageCode(TEST_LANGUAGE_CODE);
        supplierDescriptions.add(supplierDescription);
        return supplierDescriptions;
    }

}
