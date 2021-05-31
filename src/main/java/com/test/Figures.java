package com.test;

import java.util.Scanner;

public class Figures {
    static public void main(String[] args) {

        System.out.println("Введіть число : \n" +
                "1. Вивести прямокутник \n" +
                "2. Вивести прямоутний трикутник \n" +
                "3. Вивести рівносторонній трикутник \n" +
                "4. Вивести ромб");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch (number) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

            case 2:
                for (int i = 0; i < 5; i++) {
                    System.out.print("\n");
                    for (int j = 0; j < i + 1; j++) {
                        System.out.print("*");
                    }
                }
            case 3: {
                int h = 7;
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < 2 * h - 1; j++) {
                        if (j < h - 1 - i || j > h - 1 + i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.print("\n");
                }
                break;
            }
            case 4:
                int h = 7;
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < 2 * h - 1; j++) {
                        if (j < h - 1 - i || j > h - 1 + i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.print("\n");
                }
                for (int i = 0; i < h - 1; i++) {
                    for (int j = 0; j < 2 * h - 1; j++) {
                        if (j < i + 1 || j >= 2 * h-2 - i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.print("\n");
                }
                break;
        }
    }
}
