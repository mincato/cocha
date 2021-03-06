package com.cocha.hotels.matesearch.backoffice.repository.feeds;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cocha.hotels.model.content.hotel.Hotel;

public interface HotelRepository {

    @Select("SELECT * FROM Hotel")
    List<Hotel> findAll();

    @Select("SELECT * FROM Hotel WHERE id = #{hotelId} AND supplierCode = #{supplierCode}")
    Hotel findOne(@Param("hotelId") String hotelId, @Param("supplierCode") String supplierCode);

}
