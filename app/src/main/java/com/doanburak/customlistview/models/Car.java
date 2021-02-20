package com.doanburak.customlistview.models;

public class Car {

    private String brand;
    private String model;
    private int year;
    private int price;
    private int image;

    public Car(String brand, String model, int year, int price, int image){

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.image = image;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
