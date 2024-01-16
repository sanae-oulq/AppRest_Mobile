package com.example.restapplication;

public class RestaurantModel {
    String name,Adress;

    public RestaurantModel(String name, String adress) {
        this.name = name;
        Adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }
}
