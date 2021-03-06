package com.fongwama.edupalu_v3.model;



/**
 * Created by Ricken BAZOLO on 30/05/2016.
 */
public class PlaceModel {
    private int id;
    private String name;
    private String address;
    private String city;
    private long lat;
    private long lon;
    private String tel1;
    private String tel2;


    public PlaceModel() {
    }

    public PlaceModel(int id, String name, String address, String city, long lat, long lon, String tel1, String tel2) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.lat = lat;
        this.lon = lon;
        this.tel1 = tel1;
        this.tel2 = tel2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getLat() {
        return lat;
    }

    public void setLat(long lat) {
        this.lat = lat;
    }

    public long getLon() {
        return lon;
    }

    public void setLon(long lon) {
        this.lon = lon;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }
}
