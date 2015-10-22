package com.cocha.hotels.feeddownloader.booking.transformer;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Converter;

import com.cocha.hotels.feeddownloader.booking.model.BookingSupplierRegion;
import com.cocha.hotels.feeddownloader.booking.model.GetRegionsResponse;
import com.cocha.hotels.model.content.geo.Region;
import com.cocha.hotels.model.content.hotel.Hotel;

@Converter
public class BookingRegionTransformer {

    @SuppressWarnings("rawtypes")
    @Converter
    public static ArrayList toCanonicalRegions(GetRegionsResponse regionsResponse) {
        ArrayList<Region> regions = null;
        if (regionsResponse != null) {
            regions = new ArrayList<Region>();
            List<BookingSupplierRegion> supplierRegions = regionsResponse.getRegions();
            if (supplierRegions != null) {
                for (BookingSupplierRegion supplierRegion : supplierRegions) {
                    regions.add(toCanonicalRegion(supplierRegion));
                }
            }
        }
        return regions;
    }

    private static Region toCanonicalRegion(BookingSupplierRegion supplierRegion) {
        Region canonicalRegion = null;
        if (supplierRegion != null) {
            canonicalRegion = new Region();

            canonicalRegion.setId(supplierRegion.getRegionId());
            canonicalRegion.setRegionName(supplierRegion.getName());
            canonicalRegion.setRegionNameLong(supplierRegion.getName());
            // canonicalRegion.setRegionType(supplierRegion.getRegionType());
            // canonicalRegion.setSubClass("City");
            // canonicalRegion.setSupplierCode(Hotel.BOOKING_SUPPLIER_CODE);
        }
        return canonicalRegion;
    }
}
