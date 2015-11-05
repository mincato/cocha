package com.cocha.hotels.destinationmapper.repositories.feeds;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cocha.hotels.model.content.geo.Region;

public interface RegionRepository extends CrudRepository<Region, String> {

    public List<Region> findByIdParent(String idParent);

}
