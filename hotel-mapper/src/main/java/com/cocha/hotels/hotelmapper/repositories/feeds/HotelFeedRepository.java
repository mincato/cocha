package com.cocha.hotels.hotelmapper.repositories.feeds;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.hotel.HotelKey;

public interface HotelFeedRepository extends CrudRepository<Hotel, HotelKey> {

    List<Hotel> findByCountryCode(String countryCode);

}
