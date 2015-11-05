package com.cocha.hotels.model.matesearch.canonical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Status {

    public Status() {
    }

    public Status(String code, String cause) {
        this.code = code;
        this.cause = cause;
    }

    @XmlElement
    private String code;

    @XmlElement
    private String cause;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}
