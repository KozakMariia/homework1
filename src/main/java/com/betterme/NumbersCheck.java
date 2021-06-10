package com.betterme;


import java.util.Scanner;

public class NumbersCheck {

    public static void main(String[] args) {

        System.out.println("Введіть число");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();


       if(number < 0)
            System.out.println("Ваше число від'ємне");
        else if (number > 0)
            System.out.println("Ваше число додатнє");


        boolean isPrimeNumber = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                isPrimeNumber = false;
                break;
            }
        }
        if (isPrimeNumber){
            System.out.println("Число просте");
        } else
            System.out.println("Число НЕ просте");


        int [] array1 = {2, 5, 3, 6, 9};
        for (int i = 0; i < array1.length; i++) {
            if (number % array1[i] == 0) {
               System.out.println(number + " ділиться без остачі на " + array1[i]);
            } else
                System.out.println(number + " не ділиться без остачі на " + array1[i]);
            }
        }

    }




