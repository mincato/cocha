package com.cocha.hotels.hotelmapper.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.cocha.hotels.model.content.hotel.Hotel;

public interface HotelRepository extends CrudRepository<Hotel, String> {

    List<Hotel> findByCountryCode(String countryCode);

}
