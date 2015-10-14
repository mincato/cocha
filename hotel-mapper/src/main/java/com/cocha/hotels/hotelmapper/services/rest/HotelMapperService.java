package com.cocha.hotels.hotelmapper.services.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Just a definition of the service. No implementation needed.
 * 
 * Needs to be a class so that Spring can call a default constructor (which it
 * can't do with an interface).
 */
@Path("/")
public class HotelMapperService {

    /**
     * Camel intercepts this. Receives a request with one URL-based argument and
     * responds with JSON.
     * 
     */
    @GET
    @Path("/hotelMapper")
    public void hotelMapper() {
    }
}
