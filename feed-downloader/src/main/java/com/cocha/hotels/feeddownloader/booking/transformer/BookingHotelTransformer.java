package com.cocha.hotels.feeddownloader.booking.transformer;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Converter;
import org.apache.commons.lang3.StringUtils;

import com.cocha.hotels.feeddownloader.booking.model.BookingSupplierHotel;
import com.cocha.hotels.feeddownloader.booking.model.GetHotelDescriptionTranslations;
import com.cocha.hotels.feeddownloader.booking.model.GetHotelsResponse;
import com.cocha.hotels.feeddownloader.booking.model.HotelDescriptionTranslation;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.hotel.HotelDescription;

@Converter
public class BookingHotelTransformer {

    @SuppressWarnings("rawtypes")
    @Converter
    public static ArrayList toCanonicalHotels(GetHotelsResponse hotelsResponse) {
        ArrayList<Hotel> hotels = null;
        if (hotelsResponse != null) {
            hotels = new ArrayList<Hotel>();
            List<BookingSupplierHotel> supplierHotels = hotelsResponse.getHotels();
            if (supplierHotels != null) {
                for (BookingSupplierHotel supplierHotel : supplierHotels) {
                    hotels.add(toCanonicalHotel(supplierHotel));
                }
            }
        }
        return hotels;
    }

    private static Hotel toCanonicalHotel(BookingSupplierHotel supplierHotel) {
        Hotel canonicalHotel = null;
        if (supplierHotel != null) {
            canonicalHotel = new Hotel();
            canonicalHotel.setId(supplierHotel.getHotelId());
            canonicalHotel.setAddress(supplierHotel.getAddress());
            canonicalHotel.setCountryCode(StringUtils.upperCase(supplierHotel.getCountryCode()));
            canonicalHotel.setCurrencyCode(supplierHotel.getCurrencyCode());
            if (supplierHotel.getLocation() != null) {
                canonicalHotel.setLatitude(Double.parseDouble(supplierHotel.getLocation().getLatitude()));
                canonicalHotel.setLongitude(Double.parseDouble(supplierHotel.getLocation().getLongitude()));
            }
            canonicalHotel.setName(supplierHotel.getName());
            canonicalHotel.setStarRating(supplierHotel.getStars());
            canonicalHotel.setZipCode(supplierHotel.getZip());
            canonicalHotel.setSupplierCode(Hotel.BOOKING_SUPPLIER_CODE);
        }
        return canonicalHotel;
    }

    @SuppressWarnings("rawtypes")
    @Converter
    public static ArrayList toCanonicalDescriptions(GetHotelDescriptionTranslations descriptionsResponse) {
        ArrayList<HotelDescription> descriptions = null;
        if (descriptionsResponse != null) {
            descriptions = new ArrayList<HotelDescription>();
            List<HotelDescriptionTranslation> supplierDescriptions = descriptionsResponse.getDescriptionTranslations();
            if (supplierDescriptions != null) {
                for (HotelDescriptionTranslation supplierDescription : supplierDescriptions) {
                    HotelDescription canonicalDescription = toCanonicalDescription(supplierDescription);
                    if (canonicalDescription != null) {
                        descriptions.add(canonicalDescription);
                    }
                }
            }
        }
        return descriptions;
    }

    private static HotelDescription toCanonicalDescription(HotelDescriptionTranslation supplierDescription) {
        HotelDescription canonicalDescription = null;
        if (supplierDescription != null) {
            canonicalDescription = new HotelDescription();
            canonicalDescription.setHotelId(supplierDescription.getHotelId());
            canonicalDescription.setSupplierCode(Hotel.BOOKING_SUPPLIER_CODE);
            canonicalDescription.setDescription(supplierDescription.getDescription());
            canonicalDescription.setLanguageCode(supplierDescription.getLanguageCode().substring(0, 2));
        }
        return canonicalDescription;
    }
}
