package com.cocha.hotels.matesearch.backoffice.repository.content;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cocha.hotels.model.content.mapping.HotelMapping;

public interface HotelMappingRepository {

    @Select("SELECT * FROM HotelMapping")
    List<HotelMapping> findAll();

    @Select("SELECT * FROM HotelMapping WHERE id = #{id}")
    HotelMapping findOne(@Param("id") Long id);

}
