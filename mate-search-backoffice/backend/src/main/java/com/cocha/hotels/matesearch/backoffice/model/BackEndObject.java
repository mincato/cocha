package com.cocha.hotels.matesearch.backoffice.model;

import java.io.Serializable;

import com.cocha.hotels.matesearch.backoffice.util.JSONObjectConverter;

public abstract class BackEndObject implements Serializable {

    private static final long serialVersionUID = -3704224041413428471L;

    @Override
    public String toString() {
        return JSONObjectConverter.convertToJSON(this);
    }

}
