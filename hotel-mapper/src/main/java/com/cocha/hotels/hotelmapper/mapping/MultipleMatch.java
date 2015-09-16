package com.cocha.hotels.hotelmapper.mapping;

import java.util.List;

import com.cocha.hotels.hotelmapper.algorithm.HotelMatch;


public class MultipleMatch {

    private List<HotelMatch> matches;
    
    public MultipleMatch(List<HotelMatch> matches){
        this.matches = matches;
    }
    
    public List<HotelMatch> getHotelMatches(){
        return this.matches;
    }

}
