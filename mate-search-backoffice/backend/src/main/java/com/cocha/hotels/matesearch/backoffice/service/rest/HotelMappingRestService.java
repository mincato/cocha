package com.cocha.hotels.matesearch.backoffice.service.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.matesearch.backoffice.dto.HotelMappingDTO;
import com.cocha.hotels.matesearch.backoffice.model.HotelMappingCount;
import com.cocha.hotels.matesearch.backoffice.model.HotelMappingReview;
import com.cocha.hotels.matesearch.backoffice.service.HotelMappingService;
import com.cocha.hotels.matesearch.backoffice.util.RestResponseHandler;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@Service
@Path("/hoteles/mapping")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HotelMappingRestService {

	@Autowired
	private HotelMappingService hotelMappingService;
	
    @Autowired
    private RestResponseHandler responseHandler;
	
    @GET
    @Path("{id}/review")
    public Response getHotelMapping(@Context HttpServletRequest request, @PathParam("id") Long id) {
        try {
            HotelMappingReview review = hotelMappingService.findReview(id);
            return responseHandler.buildSuccessResponse(review, Status.OK);
        } catch (Exception e) {
            return responseHandler.buildErrorResponse(e);
        }       
    }
	
	@GET
	@Path("byCountry")
    public Response getAllByCountry(@Context HttpServletRequest request, @QueryParam("countryCode") String countryCode) {
        try {
            List<HotelMapping> mappings = hotelMappingService.getAllByCountry(countryCode);
            return responseHandler.buildSuccessResponse(mappings, Status.OK);
        } catch (Exception e) {
            return responseHandler.buildErrorResponse(e);
        }
    }
	
	@GET
	@Path("top")
    public Response getTopMappings(@Context HttpServletRequest request, @QueryParam("howMany") Integer howMany) {
        try {
            
            List<HotelMappingCount> mappingCount = hotelMappingService.getTopMappings(howMany);
            return responseHandler.buildSuccessResponse(mappingCount, Status.OK);
        } catch (Exception e) {
            return responseHandler.buildErrorResponse(e);
        }
    }
	
	@POST
    public Response createHotelMapping(@Context HttpServletRequest request, HotelMappingDTO dto) {
        try {
            HotelMapping mapping = hotelMappingService.create(dto);
            return responseHandler.buildSuccessResponse(mapping, Status.CREATED);
        } catch (Exception e) {
            return responseHandler.buildErrorResponse(e);
        }
    }
    
    @PUT
    @Path("{id}/confirm")
    public Response confirmHotelMapping(@Context HttpServletRequest request, @PathParam("id") Long id) {
        try {
            hotelMappingService.confirmMapping(id);
            return responseHandler.buildSuccessResponse(Status.ACCEPTED);
        } catch (Exception e) {
            return responseHandler.buildErrorResponse(e);
        }            
    }
    
    @PUT
    @Path("{id}/reject")
    public Response rejectHotelMapping(@Context HttpServletRequest request, @PathParam("id") Long id) {
        try {
            hotelMappingService.rejectMapping(id);
            return responseHandler.buildSuccessResponse(Status.ACCEPTED);
        } catch (Exception e) {
            return responseHandler.buildErrorResponse(e);
        }            
    }
    
    @PUT
    @Path("{id}/deactivate")
    public Response deactivateHotelMapping(@Context HttpServletRequest request, @PathParam("id") Long id) {
        try {
            HotelMapping mapping = hotelMappingService.deactivateMapping(id);
            return responseHandler.buildSuccessResponse(mapping, Status.ACCEPTED);
        } catch (Exception e) {
            return responseHandler.buildErrorResponse(e);
        }            
    }
    
    @PUT
    @Path("{id}/activate")
    public Response activateHotelMapping(@Context HttpServletRequest request, @PathParam("id") Long id) {
        try {
            HotelMapping mapping = hotelMappingService.activateMapping(id);
            return responseHandler.buildSuccessResponse(mapping, Status.ACCEPTED);
        } catch (Exception e) {
            return responseHandler.buildErrorResponse(e);
        }            
    }
 
    @DELETE
    @Path("{id}")
    public Response deleteHotelMapping(@Context HttpServletRequest request, @PathParam("id") Long id) {
        try {            
            hotelMappingService.delete(id);
            return responseHandler.buildSuccessResponse(Status.ACCEPTED);
        } catch (Exception e) {
            return responseHandler.buildErrorResponse(e);
        }            
    }
	
}
