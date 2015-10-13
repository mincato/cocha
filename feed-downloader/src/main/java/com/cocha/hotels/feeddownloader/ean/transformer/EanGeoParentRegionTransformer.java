package com.cocha.hotels.feeddownloader.ean.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.cocha.hotels.feeddownloader.ean.model.EanSupplierGeoParentRegion;
import com.cocha.hotels.model.content.geo.Region;
import com.cocha.hotels.model.content.hotel.Hotel;

@Component
public class EanGeoParentRegionTransformer {

    public List<Region> toCanonicalRegions(List<EanSupplierGeoParentRegion> supplierRegions) {
        List<Region> regions = null;

        if (supplierRegions != null) {
            regions = new ArrayList<Region>();
            for (EanSupplierGeoParentRegion supplierRegion : supplierRegions) {
                regions.add(toCanonicalRegion(supplierRegion));
            }
        }
        return regions;
    }

    private Region toCanonicalRegion(EanSupplierGeoParentRegion supplierRegion) {
        Region canonicalRegion = null;
        if (supplierRegion != null) {
            canonicalRegion = new Region();
            canonicalRegion.setId(supplierRegion.getRegionId());
            canonicalRegion.setRegionType(supplierRegion.getRegionType());
            canonicalRegion.setSubClass(supplierRegion.getSubClass());
            canonicalRegion.setRegionName(supplierRegion.getRegionName());
            canonicalRegion.setRegionNameLong(supplierRegion.getRegionNameLong());
            canonicalRegion.setSupplierCode(Hotel.EAN_SUPPLIER_CODE);
        }
        return canonicalRegion;
    }

}
