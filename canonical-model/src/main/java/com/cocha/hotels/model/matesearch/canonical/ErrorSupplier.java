package com.cocha.hotels.model.matesearch.canonical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "errorSupplier")
@XmlAccessorType(XmlAccessType.FIELD)
public class ErrorSupplier extends Availability implements Cloneable {

    @XmlElement
    private String idSupplier;

    @XmlElement
    private String codeSupplier;

    public ErrorSupplier(String supplier) {
        this.codeSupplier = supplier;
    }

    public ErrorSupplier() {
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCodeSupplier() {
        return codeSupplier;
    }

    public void setCodeSupplier(String codeSupplier) {
        this.codeSupplier = codeSupplier;
    }

    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

}
