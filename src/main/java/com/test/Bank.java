package com.test;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        sum();
    }
    static void sum () {
        int credit = 700;

        System.out.println("Введіть 7 платежів");
        Scanner scan = new Scanner(System.in);
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        int s4 = scan.nextInt();
        int s5 = scan.nextInt();
        int s6 = scan.nextInt();
        int s7 = scan.nextInt();
        int summa = s1 + s2 + s3 + s4 + s5 + s6 + s7;

        System.out.println("Сумма внеску по кредиту =" + summa);
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
