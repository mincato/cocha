package com.cocha.hotels.matesearch.backoffice.service.exception;

public class InvalidParameterException extends RuntimeException {

    private static final long serialVersionUID = -5793372759072814984L;

    public InvalidParameterException(String message) {
        super(message);
    }
}
