package com.cocha.hotels.model.content.mapping;

import java.util.List;

public class MultipleMatch {

    private List<HotelMatch> matches;

    public MultipleMatch(List<HotelMatch> matches) {
        this.matches = matches;
    }

    public List<HotelMatch> getHotelMatches() {
        return this.matches;
    }

    public HotelMatch findBestMatch() {
        return this.matches.stream().max((h1, h2) -> h1.getConfidence().compareTo(h2.getConfidence())).get();
    }

}
