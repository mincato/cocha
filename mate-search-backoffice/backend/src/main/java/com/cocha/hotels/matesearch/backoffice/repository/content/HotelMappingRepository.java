package com.cocha.hotels.matesearch.backoffice.repository.content;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cocha.hotels.matesearch.backoffice.model.HotelMappingCount;
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
    
    String FIND_TOP = "SELECT count( * ) AS nroMapeos, countryCode "
            + "FROM HotelMapping "
            + "WHERE confidence < 64 "
            + "AND supplierCode = 'BKG' "
            + "GROUP BY countryCode "
            + "ORDER BY nroMapeos DESC "
            + "LIMIT 0 , #{howMany}";

    String FIND_BY_COUNTRY = "SELECT * "
            + "FROM HotelMapping "
            + "WHERE confidence < 64 "
            + "AND supplierCode = 'BKG' "
            + "AND countryCode = #{countryCode} "
            + "ORDER BY confidence";

    String FIND_REFERENCE = "SELECT * "
            + "FROM HotelMapping "
            + "WHERE hotelId = #{hotelId} "
            + "AND confidence = 100";
    
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

    @Select(FIND_TOP)
    List<HotelMappingCount> findTopMappings(@Param("howMany") Integer howMany);

    @Select(FIND_BY_COUNTRY)
    List<HotelMapping> findAllByCountry(@Param("countryCode") String countryCode);

    @Select(FIND_REFERENCE)
    HotelMapping findReferenceMapping(@Param("hotelId") String hotelId);
}
