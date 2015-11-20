package com.cocha.hotels.matesearch.backoffice.service.security;

public interface AuthenticatorService {

    boolean authenticate(String username, String password);

}
