package com.cocha.hotels.hotelmapper.repositories.content;

import org.springframework.data.repository.CrudRepository;

import com.cocha.hotels.model.content.mapping.HotelMapping;

public interface HotelMappingRepository extends CrudRepository<HotelMapping, Long> {

}
