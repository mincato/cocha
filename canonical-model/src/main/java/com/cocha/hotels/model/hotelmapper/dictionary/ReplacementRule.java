package com.cocha.hotels.model.hotelmapper.dictionary;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name = "DictionaryReplacementRule")
public class ReplacementRule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String countryCode;

    @ElementCollection(fetch = FetchType.EAGER)
    @MapKeyColumn(name = "pattern")
    @Column(name = "value")
    @CollectionTable(name = "ReplacementTokens")
    private Map<String, String> tokens;

    @Enumerated(EnumType.STRING)
    @Column(name = "hotelAttribute")
    private HotelAttribute hotelAttribute;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Map<String, String> getTokens() {
        return tokens;
    }

    public void setTokens(Map<String, String> tokens) {
        this.tokens = tokens;
    }

    public HotelAttribute getHotelAttribute() {
        return hotelAttribute;
    }

    public void setHotelAttribute(HotelAttribute hotelAttribute) {
        this.hotelAttribute = hotelAttribute;
    }

}
