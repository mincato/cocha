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
public class MateService {

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
    @Path("/availability")
    public String availability(@QueryParam("idHotel") String idHotel, @QueryParam("arrivalDate") String arrival_date,
            @QueryParam("departureDate") String departure_date, @QueryParam("currencyCode") String currencyCode,
            @QueryParam("token") String token) {
        return null;
    }
}
