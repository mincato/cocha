package com.cocha.hotels.matesearch.backoffice.service.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.matesearch.backoffice.service.HotelService;
import com.cocha.hotels.matesearch.backoffice.util.RestResponseHandler;
import com.cocha.hotels.model.content.hotel.Hotel;

@Service
@Path("/hoteles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HotelRestService {

	@Autowired
	private HotelService hotelService;
	
    @Autowired
    private RestResponseHandler responseHandler;
	
    @GET
    @Path("{supplierCode}/{id}")
    public Response getHotel(@Context HttpServletRequest request, @PathParam("id") String id, @PathParam("supplierCode") String supplierCode) {
        try {
            Hotel hotel = hotelService.find(id, supplierCode);
            return responseHandler.buildSuccessResponse(hotel, Status.OK);
        } catch (Exception e) {
            return responseHandler.buildErrorResponse(e);
        }    	
    }
	
	@GET
	public Response getAll(@Context HttpServletRequest request) {
        try {
        	List<Hotel> hoteles = hotelService.getAll();
            return responseHandler.buildSuccessResponse(hoteles, Status.OK);
        } catch (Exception e) {
            return responseHandler.buildErrorResponse(e);
        }
	}
	
}
