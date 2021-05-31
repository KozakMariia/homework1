package com.test;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        int operand1 = 2;
        int operand2 = 0;
        double result = 0;
        System.out.println("Введіть знак арифметичної операції");
        Scanner scan = new Scanner(System.in);
        String sign = scan.nextLine();

        switch (sign)
        {
            case "+":
                result = operand1 + operand2;
                System.out.println("Результат:" + result);
                break;

            case "-":
                result = operand1 - operand2;
                System.out.println("Результат:" + result);
                break;

            case "*":
                result = operand1 * operand2;
                System.out.println("Результат:" + result);
                break;

            case "/":
                if (operand2 == 0){
                    System.out.println("Не можна ділити на нуль");
                }
                else {
                    result = operand1 / (double) operand2;
                    System.out.println("Результат:" + result);
                }
                break;
        }
    }
}
