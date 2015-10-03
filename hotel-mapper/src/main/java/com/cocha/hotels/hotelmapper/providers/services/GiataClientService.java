package com.cocha.hotels.hotelmapper.providers.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "/")
public interface GiataClientService {

    @GET
    @Path(value = "/gds/expedia_ean/{hotel_id}")
    @Produces({ MediaType.APPLICATION_XML })
    public Object hotelMappingFromEAN(@PathParam("hotel_id") String hotel_id);

}
