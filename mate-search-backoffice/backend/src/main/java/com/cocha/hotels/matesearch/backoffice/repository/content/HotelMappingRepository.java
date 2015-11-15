package com.cocha.hotels.matesearch.backoffice.repository.content;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cocha.hotels.model.content.mapping.HotelMapping;

public interface HotelMappingRepository {

    String INSERT = "INSERT INTO HotelMapping "
            + "(active, confidence, hotelId, mappedByUser, supplierCode, supplierHotelId, unmapped, countryCode) "
            + "VALUES "
            + "(#{active}, #{confidence}, #{hotelId}, #{mappedByUser}, #{supplierCode}, #{supplierHotelId}, #{unmapped}, #{countryCode})";
    
    String UPDATE = "UPDATE HotelMapping SET "
            + "active = #{active}, "
            + "confidence = #{confidence}, "
            + "hotelId = #{hotelId}, "
            + "mappedByUser = #{mappedByUser}, "
            + "supplierCode = #{supplierCode}, "
            + "supplierHotelId = #{supplierHotelId}, "
            + "unmapped = #{unmapped}, "
            + "countryCode = #{countryCode} "
            + "WHERE id = #{id}";
    
    @Select("SELECT * FROM HotelMapping")
    List<HotelMapping> findAll();

    @Select("SELECT * FROM HotelMapping WHERE id = #{id}")
    HotelMapping findOne(@Param("id") Long id);

    @Delete("DELETE FROM HotelMapping WHERE id = #{id}")
    void delete(HotelMapping mapping);

    @Insert(INSERT)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void create(HotelMapping mapping);

    @Insert(UPDATE)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void update(HotelMapping mapping);
}
