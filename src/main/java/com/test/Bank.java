package com.test;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        sum();
    }
    static void sum () {
        int credit = 700;

        System.out.println("Введіть число");
        Scanner scan = new Scanner(System.in);
        int summa = scan.nextInt();

       if (summa < credit) {
           int ostacha = credit - summa;
           System.out.println("Залишок по кредиту " + ostacha);
       }
       else if (summa > credit) {
           int pereplata = summa - credit;
           System.out.println("Сума переплати " + pereplata);
       } else
           System.out.println("Немає заборгованості");

    }
}
