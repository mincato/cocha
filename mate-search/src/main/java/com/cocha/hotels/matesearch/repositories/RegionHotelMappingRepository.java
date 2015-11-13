package com.cocha.hotels.matesearch.repositories;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cocha.hotels.model.content.mapping.RegionHotelMapping;

public interface RegionHotelMappingRepository extends JpaRepository<RegionHotelMapping, String> {

    @Cacheable(value = "regionHotelMappings", unless = "#result == null")
    public List<RegionHotelMapping> findByRegionId(String regionId);

}
