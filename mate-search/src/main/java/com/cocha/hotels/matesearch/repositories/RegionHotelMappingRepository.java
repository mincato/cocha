package com.cocha.hotels.matesearch.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cocha.hotels.model.content.mapping.RegionHotelMapping;

public interface RegionHotelMappingRepository extends JpaRepository<RegionHotelMapping, String> {

    @Query("select h from RegionHotelMapping h where h.regionId = (:regionId)")
    public List<RegionHotelMapping> findByRegionId(@Param("regionId") String regionId);

}
