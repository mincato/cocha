package com.cocha.hotels.matesearch.backoffice.util;

import java.net.URI;
import java.security.InvalidParameterException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.Response.StatusType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocha.hotels.matesearch.backoffice.service.exception.AuthenticationException;
import com.cocha.hotels.matesearch.backoffice.service.exception.ForbiddenException;
import com.cocha.hotels.matesearch.backoffice.service.exception.InternalServerError;
import com.cocha.hotels.matesearch.backoffice.service.exception.InternalServerErrorFactory;
import com.cocha.hotels.matesearch.backoffice.service.exception.NotFoundException;
import com.cocha.hotels.matesearch.backoffice.service.exception.UnauthorizedException;

/**
 * See http://docs.oracle.com/javaee/6/api/javax/ws/rs/core/Response.Status.html
 *
 */
@Service
public class RestResponseHandler {

    @Autowired
    private InternalServerErrorFactory errorFactory;

    private static final Logger LOGGER = Logger.getLogger(RestResponseHandler.class);

    public Response buildSuccessResponse(Object entity, StatusType successStatus) {
        return Response.status(successStatus).entity(entity).build();
    }

    public Response buildSuccessResponse(StatusType successStatus) {
        return buildSuccessResponse(null, successStatus);
    }

    public Response buildErrorResponse(Exception exc) {
        return buildErrorResponse(exc, true);
    }

    public Response buildErrorResponse(Exception exc, boolean logException) {

        if (logException) {
            LOGGER.error("Failed!", exc);
        }

        if (exc instanceof AuthenticationException) {
            return Response.status(Status.UNAUTHORIZED).entity(errorFactory.buildInternalError(exc)).build();
        }
        if (exc instanceof UnauthorizedException) {
            return Response.status(Status.UNAUTHORIZED).build();
        }
        if (exc instanceof NotFoundException) {
            return Response.status(Status.NOT_FOUND).build();
        }
        if (exc instanceof ForbiddenException) {
            return Response.status(Status.FORBIDDEN).entity(errorFactory.buildInternalError(exc)).build();
        }
        if (exc instanceof InvalidParameterException) {
            return Response.status(Status.BAD_REQUEST).build();
        }
        InternalServerError internalError = errorFactory.buildInternalError(exc);
        return Response.status(Status.INTERNAL_SERVER_ERROR).entity(internalError).build();
    }

    public Response buildRedirectURI(URI location) {
        return Response.seeOther(location).build();
    }

}
