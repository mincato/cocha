package com.cocha.hotels.destinationmapper.repositories.feeds;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cocha.hotels.model.content.geo.NeighborhoodArea;
import com.cocha.hotels.model.content.geo.RegionHotel;

public interface NeighborhoodCoordinatesRepository extends CrudRepository<NeighborhoodArea, String> {

    public List<RegionHotel> findById(String id);

}
