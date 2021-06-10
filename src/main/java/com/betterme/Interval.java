package com.betterme;

import java.util.Scanner;


public class Interval {


    public static void main(String[] args) {


        System.out.println("Введіть число");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if(number >= 0 && number <= 14)
            System.out.println("Ваше число знаходиться в проміжку [0..14]");
        else if (number >= 15 && number <= 35)
            System.out.println("Ваше число знаходиться в проміжку [15..35]");
        else if (number >= 36 && number <= 50)
            System.out.println("Ваше число знаходиться в проміжку [36..50]");
        else if (number >= 51 && number <= 100)
            System.out.println("Ваше число знаходиться в проміжку [51..100]");
        else
            System.out.println("Ваше число не знаходиться в проміжку [0..100]");
    }
}
