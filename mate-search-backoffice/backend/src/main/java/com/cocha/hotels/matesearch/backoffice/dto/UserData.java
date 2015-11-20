package com.cocha.hotels.matesearch.backoffice.dto;

import org.apache.commons.beanutils.BeanUtils;

import com.cocha.hotels.matesearch.backoffice.model.BackEndObject;
import com.cocha.hotels.matesearch.backoffice.model.User;

public class UserData extends BackEndObject {

    private static final long serialVersionUID = -5277015751360471015L;

    private Long id;
    private String username;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;

    public UserData() {
    }

    public UserData(User user) {
        try {
            BeanUtils.copyProperties(this, user);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo extraer la data del usuario", e);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
