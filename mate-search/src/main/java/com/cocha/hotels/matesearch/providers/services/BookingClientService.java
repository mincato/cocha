package com.cocha.hotels.matesearch.providers.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path(value = "/")
public interface BookingClientService {

    @GET
    @Path(value = "/bookings.getHotelAvailability")
    @Produces({ MediaType.APPLICATION_XML })
    public Object availabilityB(@QueryParam("arrival_date") String arrival_date,
            @QueryParam("hotel_ids") String hotel_ids, @QueryParam("departure_date") String departure_date);

}
