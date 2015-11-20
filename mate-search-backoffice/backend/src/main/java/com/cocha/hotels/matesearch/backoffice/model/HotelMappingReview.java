package com.cocha.hotels.matesearch.backoffice.model;

import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;

public class HotelMappingReview {

    private Hotel reference;
    private Hotel mapped;
    private HotelMapping mapping;

    public HotelMappingReview(Hotel reference, Hotel mapped, HotelMapping mapping) {
        this.reference = reference;
        this.mapped = mapped;
        this.mapping = mapping;
    }

    public Hotel getReference() {
        return reference;
    }

    public void setReference(Hotel reference) {
        this.reference = reference;
    }

    public Hotel getMapped() {
        return mapped;
    }

    public void setMapped(Hotel mapped) {
        this.mapped = mapped;
    }

    public HotelMapping getMapping() {
        return mapping;
    }

    public void setMapping(HotelMapping mapping) {
        this.mapping = mapping;
    }
}
