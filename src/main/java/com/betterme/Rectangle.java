package com.betterme;


import java.util.Scanner;

public class Rectangle {

    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double calculateArea() {
        return side1 * side2;
    }

    public double calculatePerimeter() {
        return 2 * (side1 + side2);
    }

    public static void main(String[] args) {

        System.out.println("Введіть сторону a");
        Scanner scan = new Scanner(System.in);
        double side1 = scan.nextInt();

        System.out.println("Введіть сторону b");
        double side2 = scan.nextInt();

        Rectangle rectangle = new Rectangle(side1, side2);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Площа прямокутника = " + area);
        System.out.println("Периметр прямокутника = " + perimeter);
    }
}
