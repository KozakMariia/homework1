package com.betterme;

public class Car {

    private int year;
    String color;

    public Car() {

    }

    public Car(int year) {

        this.year = year;
    }

    public Car(String color) {

        this.color = color;
    }

    public Car(int year, String color) {

        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
