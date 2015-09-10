package com.cocha.hotels.feeddownloader.ean.transformer;

import org.apache.camel.Converter;

import com.cocha.hotels.feeddownloader.ean.model.EanSupplierHotel;
import com.cocha.hotels.model.content.hotel.Hotel;

@Converter
public class EanHotelTransformer {

    @Converter
    public static Hotel toCanonicalHotel(EanSupplierHotel supplierHotel) {
        Hotel canonicalHotel = null;
        if (supplierHotel != null) {
            canonicalHotel = new Hotel();
            canonicalHotel.setId(supplierHotel.getHotelId());
            canonicalHotel.setAddress(supplierHotel.getAddress());
            canonicalHotel.setCountryCode(supplierHotel.getCountry());
            canonicalHotel.setCurrencyCode(supplierHotel.getPropertyCurrency());
            canonicalHotel.setLatitude(supplierHotel.getLatitude());
            canonicalHotel.setLongitude(supplierHotel.getLongitude());
            canonicalHotel.setName(supplierHotel.getName());
            canonicalHotel.setStarRating(supplierHotel.getStarRating());
            canonicalHotel.setZipCode(supplierHotel.getPostalCode());
            canonicalHotel.setSupplierCode(Hotel.EAN_SUPPLIER_CODE);
        }
        return canonicalHotel;
    }

}
