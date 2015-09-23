package com.cocha.hotels.model.content.mapping;

import java.util.List;
import java.util.Optional;

public class MultipleMatch {

    private List<HotelMatch> matches;

    public MultipleMatch(List<HotelMatch> matches) {
        this.matches = matches;
    }

    public List<HotelMatch> getHotelMatches() {
        return this.matches;
    }

    public HotelMatch findBestMatch() {
        Optional<HotelMatch> match = this.matches
                .stream()
                .max((h1, h2) -> h1.getConfidence().compareTo(h2.getConfidence()));
        if (match.isPresent()){
            return match.get();
        }
        
        //TODO parametrizar
        return new HotelMatch(0);
    }

}
