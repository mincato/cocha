package com.cocha.hotels.model.matesearch.supplier.ean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelRoomAvailabilityResponse {

    @JsonProperty("hotelId")
    private java.lang.Integer hotelid;

    @JsonProperty("tripAdvisorReviewCount")
    private java.lang.Integer tripadvisorreviewcount;

    @JsonProperty("hotelCity")
    private java.lang.String hotelcity;

    @JsonProperty("HotelRoomResponse")
    private List<HotelRoomResponseElement> hotelroomresponse;

    @JsonProperty("departureDate")
    private java.lang.String departuredate;

    @JsonProperty("arrivalDate")
    private java.lang.String arrivaldate;

    @JsonProperty("numberOfRoomsRequested")
    private java.lang.Integer numberofroomsrequested;

    @JsonProperty("tripAdvisorRating")
    private java.lang.Integer tripadvisorrating;

    @JsonProperty("hotelStateProvince")
    private java.lang.String hotelstateprovince;

    @JsonProperty("hotelAddress")
    private java.lang.String hoteladdress;

    @JsonProperty("hotelName")
    private java.lang.String hotelname;

    @JsonProperty("customerSessionId")
    private java.lang.String customersessionid;

    @JsonProperty("hotelCountry")
    private java.lang.String hotelcountry;

    public java.lang.Integer getHotelid() {
        return hotelid;
    }

    public java.lang.Integer getTripadvisorreviewcount() {
        return tripadvisorreviewcount;
    }

    public java.lang.String getHotelcity() {
        return hotelcity;
    }

    public java.lang.String getDeparturedate() {
        return departuredate;
    }

    public java.lang.String getArrivaldate() {
        return arrivaldate;
    }

    public java.lang.Integer getNumberofroomsrequested() {
        return numberofroomsrequested;
    }

    public java.lang.Integer getTripadvisorrating() {
        return tripadvisorrating;
    }

    public java.lang.String getHotelstateprovince() {
        return hotelstateprovince;
    }

    public java.lang.String getHoteladdress() {
        return hoteladdress;
    }

    public java.lang.String getHotelname() {
        return hotelname;
    }

    public java.lang.String getCustomersessionid() {
        return customersessionid;
    }

    public java.lang.String getHotelcountry() {
        return hotelcountry;
    }

    public void setHotelid(java.lang.Integer hotelid) {
        this.hotelid = hotelid;
    }

    public void setTripadvisorreviewcount(java.lang.Integer tripadvisorreviewcount) {
        this.tripadvisorreviewcount = tripadvisorreviewcount;
    }

    public void setHotelcity(java.lang.String hotelcity) {
        this.hotelcity = hotelcity;
    }

    public void setDeparturedate(java.lang.String departuredate) {
        this.departuredate = departuredate;
    }

    public void setArrivaldate(java.lang.String arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public void setNumberofroomsrequested(java.lang.Integer numberofroomsrequested) {
        this.numberofroomsrequested = numberofroomsrequested;
    }

    public void setTripadvisorrating(java.lang.Integer tripadvisorrating) {
        this.tripadvisorrating = tripadvisorrating;
    }

    public void setHotelstateprovince(java.lang.String hotelstateprovince) {
        this.hotelstateprovince = hotelstateprovince;
    }

    public void setHoteladdress(java.lang.String hoteladdress) {
        this.hoteladdress = hoteladdress;
    }

    public void setHotelname(java.lang.String hotelname) {
        this.hotelname = hotelname;
    }

    public void setCustomersessionid(java.lang.String customersessionid) {
        this.customersessionid = customersessionid;
    }

    public void setHotelcountry(java.lang.String hotelcountry) {
        this.hotelcountry = hotelcountry;
    }

    public List<HotelRoomResponseElement> getHotelroomresponse() {
        return hotelroomresponse;
    }

    public void setHotelroomresponse(List<HotelRoomResponseElement> hotelroomresponse) {
        this.hotelroomresponse = hotelroomresponse;
    }

}