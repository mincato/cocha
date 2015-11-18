package com.cocha.hotels.matesearch.backoffice.dto;

import java.io.Serializable;


public class HotelMappingDTO implements Serializable{

    private static final long serialVersionUID = 2954178702977493463L;

    private String referenceId;
    private String referenceSupplierCode;
    private String mapId;
    private String mapSupplierCode;
    
    public String getReferenceId() {
        return referenceId;
    }
    
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }
    
    public String getReferenceSupplierCode() {
        return referenceSupplierCode;
    }
    
    public void setReferenceSupplierCode(String referenceSupplierCode) {
        this.referenceSupplierCode = referenceSupplierCode;
    }
    
    public String getMapId() {
        return mapId;
    }
    
    public void setMapId(String mapId) {
        this.mapId = mapId;
    }
    
    public String getMapSupplierCode() {
        return mapSupplierCode;
    }
    
    public void setMapSupplierCode(String mapSupplierCode) {
        this.mapSupplierCode = mapSupplierCode;
    }
}
