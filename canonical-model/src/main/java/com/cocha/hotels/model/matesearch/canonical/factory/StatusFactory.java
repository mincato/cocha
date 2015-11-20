package com.cocha.hotels.model.matesearch.canonical.factory;

import com.cocha.hotels.model.matesearch.canonical.Status;

public class StatusFactory {

    private static final String SUCCESS_CAUSE = "success";
    private static final String SUCCESS_STATUS = "200";

    public static Status buildSuccessStatus() {
        return new Status(SUCCESS_STATUS, SUCCESS_CAUSE);
    }

}
