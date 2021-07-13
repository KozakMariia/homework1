package com.betterme;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(2001);
        Car car3 = new Car("black");
        Car car4 = new Car(2020, "white");

        System.out.println(car2.getYear());
        System.out.println(car3.getColor());
        System.out.println(car4.getYear()
                + " " + car4.getColor());
    }
}
