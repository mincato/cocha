package com.cocha.hotels.hotelmapper.mapping;

import java.util.List;

public class HotelMappingResult implements MappingResult {

    private List<MappingEntry> mappingEntries;

    public HotelMappingResult(List<MappingEntry> mappingEntries) {
        this.mappingEntries = mappingEntries;
    }

    @Override
    public List<MappingEntry> getMappingEntries() {
        return this.mappingEntries;
    }

}
