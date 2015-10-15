package com.cocha.hotels.feeddownloader.ean.model;

public class EanSupplierGeoAirport {

    private String airportID;

    private String airportCode;

    private String airportName;

    private double latitude;

    private double longitude;

    private String mainCityID;

    private String countryCode;

    public String getAirportID() {
        return airportID;
    }

    public void setAirportID(String airportID) {
        this.airportID = airportID;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getMainCityID() {
        return mainCityID;
    }

    public void setMainCityID(String mainCityID) {
        this.mainCityID = mainCityID;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
