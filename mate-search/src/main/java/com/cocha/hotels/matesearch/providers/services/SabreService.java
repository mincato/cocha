package com.cocha.hotels.matesearch.providers.services;

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
public class SabreService {

    /**
     * Camel intercepts this. Receives a request with one URL-based argument and
     * responds with XML.
     * 
     * @param text
     *            text
     * @return A response in String format with MIME of application/json
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/send")
    public Object send(@QueryParam("code") String code, @QueryParam("idHotel") String idHotel,
            @QueryParam("session") String session) {
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/createsession")
    public Object createsession(@QueryParam("code") String code) {
        return null;
    }
}
