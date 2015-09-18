package com.cocha.hotels.hotelmapper.mapping;

import java.util.List;

import com.cocha.hotels.hotelmapper.algorithm.HotelMatch;

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
