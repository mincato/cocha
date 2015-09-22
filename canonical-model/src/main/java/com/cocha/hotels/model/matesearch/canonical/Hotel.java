package com.cocha.hotels.model.matesearch.canonical;

public class Hotel {

    private Long id;
    private Long idSupplier;
    private String name;
    private String addres;
    private String city;
    private String stateProvince;
    private String country;
    private Room roomDetail;

    public Room getRoomDetail() {
        return roomDetail;
    }

    public void setRoomDetail(Room roomDetail) {
        this.roomDetail = roomDetail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Long idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
