package com.cocha.hotels.matesearch.providers.services.rest;

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
    public Object availabilityBooking(@QueryParam("arrival_date") String arrival_date,
            @QueryParam("hotel_ids") String hotel_ids, @QueryParam("currency_code") String currency_code,
            @QueryParam("departure_date") String departure_date);

}
