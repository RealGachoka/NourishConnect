package com.example.NourishConnect;

public class ReadWriteLocation {
    public double lat , lng ;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String name,number,food;
    public ReadWriteLocation(){};
    public double getLat() {
        return lat;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
    public double getLng() {
        return lng;
    }
    public void setLng(double lng) {
        this.lng = lng;
    }
    public ReadWriteLocation(double textLat , double textLng, String textName, String textNumber,String textFood){
        this.lat=textLat;
        this.lng=textLng;
        this.name=textName;
        this.number=textNumber;
        this.food=textFood;
    }
}
