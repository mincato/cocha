package com.cocha.hotels.model.content.mapping;

import java.util.List;

public class HotelMappingResult implements MappingResult {

    private List<HotelMapping> mappingEntries;

    public HotelMappingResult(List<HotelMapping> mappingEntries) {
        this.mappingEntries = mappingEntries;
    }

    @Override
    public List<HotelMapping> getMappingEntries() {
        return this.mappingEntries;
    }

}
