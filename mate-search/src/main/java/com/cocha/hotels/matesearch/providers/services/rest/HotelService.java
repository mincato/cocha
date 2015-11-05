package com.cocha.hotels.matesearch.providers.services.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Just a definition of the service. No implementation needed.
 * 
 * Needs to be a class so that Spring can call a default constructor (which it
 * can't do with an interface).
 */
@Path("/")
public class HotelService {

    /**
     * Camel intercepts this. Receives a request with one URL-based argument and
     * responds with JSON.
     * 
     * @param text
     *            text
     * @return A response in String format with MIME of application/json
     */
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("/list")
    public String list(@QueryParam("arrivalDate") String arrivalDate,
            @QueryParam("departureDate") String departureDate, @QueryParam("currencyCode") String currencyCode,
            @QueryParam("regionId") String regionId, @QueryParam("room1") String room1,
            @QueryParam("room2") String room2, @QueryParam("room3") String room3, @QueryParam("room4") String room4,
            @QueryParam("room5") String room5) {
        return null;
    }
}
