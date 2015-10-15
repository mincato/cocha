package com.cocha.hotels.feeddownloader.ean.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cocha.hotels.feeddownloader.ean.model.EanSupplierGeoAirport;
import com.cocha.hotels.feeddownloader.ean.model.EanSupplierGeoNeighborhood;
import com.cocha.hotels.feeddownloader.ean.model.EanSupplierGeoParentRegion;
import com.cocha.hotels.model.content.geo.Airport;
import com.cocha.hotels.model.content.geo.NeighborhoodArea;
import com.cocha.hotels.model.content.geo.Region;
import com.cocha.hotels.model.content.geo.RegionClass;
import com.cocha.hotels.model.content.geo.RegionType;

@Component
public class EanGeoTransformer {

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
            canonicalRegion.setRegionType(RegionType.getValue(supplierRegion.getRegionType()));
            canonicalRegion.setSubClass(RegionClass.getValue(supplierRegion.getSubClass()));
            canonicalRegion.setIdParent(supplierRegion.getParentRegionID());
            canonicalRegion.setRegionName(supplierRegion.getRegionName());
            canonicalRegion.setRegionNameLong(supplierRegion.getRegionNameLong());
        }
        return canonicalRegion;
    }

    public List<NeighborhoodArea> toCanonicalNeighborhoodsArea(
            List<EanSupplierGeoNeighborhood> supplierNeighborhoodsArea) {
        List<NeighborhoodArea> neighborhoodsArea = null;

        if (supplierNeighborhoodsArea != null) {
            neighborhoodsArea = new ArrayList<NeighborhoodArea>();
            for (EanSupplierGeoNeighborhood supplierNeighborhood : supplierNeighborhoodsArea) {
                neighborhoodsArea.add(toCanonicalNeighborhoodArea(supplierNeighborhood));
            }
        }
        return neighborhoodsArea;
    }

    private NeighborhoodArea toCanonicalNeighborhoodArea(EanSupplierGeoNeighborhood supplierNeighborhoodArea) {
        NeighborhoodArea canonicalNeighborhoodArea = null;
        if (supplierNeighborhoodArea != null) {
            canonicalNeighborhoodArea = new NeighborhoodArea();
            canonicalNeighborhoodArea.setId(supplierNeighborhoodArea.getRegionID());
            canonicalNeighborhoodArea.setCoordinates(supplierNeighborhoodArea.getCoordinates());
        }
        return canonicalNeighborhoodArea;
    }

    public List<Airport> toCanonicalAirports(List<EanSupplierGeoAirport> supplierAirports) {
        List<Airport> airports = null;

        if (supplierAirports != null) {
            airports = new ArrayList<Airport>();
            for (EanSupplierGeoAirport supplierAirport : supplierAirports) {
                airports.add(toCanonicalAirport(supplierAirport));
            }
        }
        return airports;
    }

    private Airport toCanonicalAirport(EanSupplierGeoAirport supplierAirport) {
        Airport canonicalAirport = null;
        if (supplierAirport != null) {
            canonicalAirport = new Airport();
            canonicalAirport.setId(supplierAirport.getAirportID());
            canonicalAirport.setCode(supplierAirport.getAirportCode());
            canonicalAirport.setName(supplierAirport.getAirportName());
            canonicalAirport.setCountryCode(supplierAirport.getCountryCode());
            canonicalAirport.setIdParentCity(supplierAirport.getMainCityID());
            canonicalAirport.setLatitude(supplierAirport.getLatitude());
            canonicalAirport.setLongitude(supplierAirport.getLongitude());
        }
        return canonicalAirport;
    }

}
