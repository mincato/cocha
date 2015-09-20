package com.cocha.hotels.feeddownloader.ean.transformer;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.cocha.hotels.feeddownloader.ean.model.EanHotelDescription;
import com.cocha.hotels.feeddownloader.ean.model.EanSupplierHotel;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.hotel.HotelDescription;

@Component
public class EanHotelTransformer {

    public List<Hotel> toCanonicalHotels(List<EanSupplierHotel> supplierHotels) {
        List<Hotel> hotels = null;
        if (supplierHotels != null) {
            hotels = new ArrayList<Hotel>();
            for (EanSupplierHotel supplierHotel : supplierHotels) {
                hotels.add(toCanonicalHotel(supplierHotel));
            }
        }
        return hotels;
    }

    public List<HotelDescription> toCanonicalHotelDescriptions(List<EanHotelDescription> supplierHotelDescriptions) {
        List<HotelDescription> hotels = null;
        if (supplierHotelDescriptions != null) {
            hotels = new ArrayList<HotelDescription>();
            for (EanHotelDescription supplierHotelDescription : supplierHotelDescriptions) {
                HotelDescription canonicalHotelDescription = toCanonicalHotelDescription(supplierHotelDescription);
                if (canonicalHotelDescription != null) {
                    hotels.add(canonicalHotelDescription);
                }
            }
        }
        return hotels;
    }

    private Hotel toCanonicalHotel(EanSupplierHotel supplierHotel) {
        Hotel canonicalHotel = null;
        if (supplierHotel != null) {
            canonicalHotel = new Hotel();
            canonicalHotel.setId(supplierHotel.getHotelId());
            canonicalHotel.setAddress(supplierHotel.getAddress());
            canonicalHotel.setCountryCode(StringUtils.upperCase(supplierHotel.getCountry()));
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

    private HotelDescription toCanonicalHotelDescription(EanHotelDescription supplierHotelDescription) {
        HotelDescription canonicalHotelDescription = null;
        if (supplierHotelDescription != null && supplierHotelDescription.getHotelId() != null) {
            canonicalHotelDescription = new HotelDescription();
            canonicalHotelDescription.setHotelId(supplierHotelDescription.getHotelId());
            canonicalHotelDescription.setSupplierCode(Hotel.EAN_SUPPLIER_CODE);
            canonicalHotelDescription.setDescription(supplierHotelDescription.getPropertyDescription());
            canonicalHotelDescription.setLanguageCode(supplierHotelDescription.getLanguageCode().substring(0, 2));
        }
        return canonicalHotelDescription;
    }

}
