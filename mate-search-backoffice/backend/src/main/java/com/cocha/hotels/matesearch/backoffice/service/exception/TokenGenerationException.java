package com.cocha.hotels.matesearch.backoffice.service.exception;

public class TokenGenerationException extends RuntimeException {

    private static final long serialVersionUID = -877720068698717425L;

    public TokenGenerationException(Throwable t) {
        super(t);
    }
}
