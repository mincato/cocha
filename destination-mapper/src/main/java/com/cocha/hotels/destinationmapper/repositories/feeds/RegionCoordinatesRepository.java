package com.cocha.hotels.destinationmapper.repositories.feeds;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cocha.hotels.model.content.geo.RegionCoordinates;
import com.cocha.hotels.model.content.geo.RegionType;

public interface RegionCoordinatesRepository extends CrudRepository<RegionCoordinates, String> {

    public List<RegionCoordinates> findByRegionType(RegionType type);

}
