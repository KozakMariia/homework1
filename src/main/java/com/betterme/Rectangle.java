package com.betterme;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        System.out.println("Введіть сторону a");
        Scanner scan = new Scanner(System.in);
        double side11 = scan.nextInt();

        System.out.println("Введіть сторону b");
        Scanner scan1 = new Scanner(System.in);
        double side22 = scan1.nextInt();

        double area = areaCalculator(side11, side22);
        double perimeter = perimeterCalculator(side11, side22);

        System.out.println("Площа прямокутника = " + area);
        System.out.println("Периметр прямокутника = " + perimeter);
    }

    static double areaCalculator(double side1, double side2) {

        return side1 * side2;

    }

    static double perimeterCalculator(double side1, double side2) {

        return 2 * (side1 + side2);

    }

}
