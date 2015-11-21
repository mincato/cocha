package com.cocha.hotels.matesearch.cache;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import com.cocha.hotels.matesearch.repositories.HotelMappingRepository;
import com.cocha.hotels.matesearch.repositories.HotelRepository;
import com.cocha.hotels.matesearch.repositories.RegionHotelMappingRepository;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.content.mapping.RegionHotelMapping;
import com.cocha.hotels.model.matesearch.canonical.Hotel;

@Service
public class CacheManagerService {

    @Autowired
    private RegionHotelMappingRepository regionHotelMappingRepository;

    @Autowired
    private HotelMappingRepository hotelMappingRepository;

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private CacheManager cacheManager;

    private Logger logger = Logger.getLogger(CacheManagerService.class);

    public void init() {
        loadCache();
    }

    public void refreshCache() {
        cacheManager.getCache("regionHotelMappings").clear();
        cacheManager.getCache("hotelMappings").clear();
        cacheManager.getCache("hotels").clear();
    }

    private void loadCache() {

        logger.info("Refrescando cache regionHotelMappings");
        List<RegionHotelMapping> regionHotelMappings = regionHotelMappingRepository.findAll();
        Function<RegionHotelMapping, List<RegionHotelMapping>> value = (entry) -> {
            List<RegionHotelMapping> list = new ArrayList<RegionHotelMapping>();
            list.add(entry);
            return list;
        };
        BinaryOperator<List<RegionHotelMapping>> merge = (old, latest) -> {
            old.addAll(latest);
            return old;
        };
        Map<String, List<RegionHotelMapping>> regionHotelMappingsMap = regionHotelMappings.stream().collect(
                Collectors.toMap(RegionHotelMapping::getRegionId, value, merge));
        for (String regionId : regionHotelMappingsMap.keySet()) {
            cacheManager.getCache("regionHotelMappings").put(regionId, regionHotelMappingsMap.get(regionId));
        }
        logger.info("Cache regionHotelMappings refrescada exitosamente");

        logger.info("Refrescando cache hotelMappings");
        List<HotelMapping> hotelMappings = hotelMappingRepository.findAll();
        Function<HotelMapping, List<HotelMapping>> valueMapper = (entry) -> {
            List<HotelMapping> list = new ArrayList<HotelMapping>();
            list.add(entry);
            return list;
        };
        BinaryOperator<List<HotelMapping>> mergeMapper = (old, latest) -> {
            old.addAll(latest);
            return old;
        };
        Map<String, List<HotelMapping>> hotelMappingsMap = hotelMappings.stream().collect(
                Collectors.toMap(HotelMapping::getHotelId, valueMapper, mergeMapper));
        for (String hotelId : hotelMappingsMap.keySet()) {
            cacheManager.getCache("hotelMappings").put(hotelId, hotelMappingsMap.get(hotelId));
        }
        logger.info("Cache hotelMappings refrescada exitosamente");

        logger.info("Refrescando cache hotels");
        List<Hotel> hotels = hotelRepository.findAll();
        hotels.stream().forEach(hotel -> {
            cacheManager.getCache("hotels").put(hotel.getId(), hotel);
        });
        logger.info("Cache hotels refrescada exitosamente");

    }

}
