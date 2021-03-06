package com.cocha.hotels.destinationmapper.processors;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.destinationmapper.repositories.content.HotelMappingContentRepository;
import com.cocha.hotels.destinationmapper.repositories.feeds.RegionHotelRepository;
import com.cocha.hotels.model.content.geo.RegionHotel;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.content.mapping.RegionHotelMapping;

@Component
public class RegionMapperProcessorImpl implements RegionMapperProcessor {

    private Logger logger = Logger.getLogger(RegionMapperProcessorImpl.class);

    @Autowired
    private RegionHotelRepository regionHotelRepository;

    @Autowired
    private HotelMappingContentRepository hotelMappingContentRepository;

    public List<RegionHotelMapping> process(List<Hotel> hotels) {
        List<RegionHotelMapping> mapping = new ArrayList<RegionHotelMapping>();

        for (Hotel hotel : hotels) {
            logger.info("Started mapping regions-hotels. hotel id: " + hotel.getId());
            HotelMapping hotelMapping = hotelMappingContentRepository.findByhotelIdAndSupplierCodeAndUnmapped(
                    hotel.getId(), Hotel.EAN_SUPPLIER_CODE, false);

            if (hotelMapping != null) {
                String supplierHotelId = hotelMapping.getSupplierHotelId();
                List<RegionHotel> regionHotels = regionHotelRepository.findByidHotelAndSupplierCode(supplierHotelId,
                        RegionHotel.EAN_SUPPLIER_CODE);
                for (RegionHotel regionHotel : regionHotels) {
                    RegionHotelMapping regionHotelMapping = createRegionHotelMappingContent(supplierHotelId,
                            regionHotel, hotel);
                    mapping.add(regionHotelMapping);
                }
            }
        }
        return mapping;
    }

    private RegionHotelMapping createRegionHotelMappingContent(String supplierHotelId, RegionHotel regionHotel,
            Hotel hotel) {
        RegionHotelMapping contentRegionHotel = null;
        if (regionHotel != null) {
            contentRegionHotel = new RegionHotelMapping();
            contentRegionHotel.setActive(true);
            contentRegionHotel.setHotelId(hotel.getId());
            contentRegionHotel.setRegionId(regionHotel.getIdRegion());
            contentRegionHotel.setSupplierCode(regionHotel.getSupplierCode());
            contentRegionHotel.setSupplierHotelId(supplierHotelId);
        }
        return contentRegionHotel;
    }
}
