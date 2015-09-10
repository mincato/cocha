package com.cocha.hotels.matesearch.providers.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path(value = "/")
public interface EanClientService {

    @GET
    @Path(value = "/avail")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public String availability(@QueryParam("cid") String cid, @QueryParam("minorRev") String minorRev,
            @QueryParam("apiKey") String apiKey, @QueryParam("locale") String locale,
            @QueryParam("currencyCode") String currencyCode, @QueryParam("sig") String sig,
            @QueryParam("xml") String xml);

}
