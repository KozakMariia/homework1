package com.betterme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Arrayes {

    public static void main(String[] args) {

        one();
        four();
        six();
        fourteen();


    }

    static void one() {

        int[] array1 = {5, 2, 4, 6, 13, 9};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.println(array1[i]);
        }
    }

    static void four() {

        int[] array2 = {5, 2, 1, 6, 13, 9};
        int min = array2[0];

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < array2[0]) {
                min = array2[i];
            }
        }

        System.out.println(min);
    }

    static void six() {

        int[] array3 = {11, 13, 20, 24, 1, 31, 148, 52};
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] <= 30 && array3[i] >= 20 && array3[i] % 2 == 0) {
                sum += array3[i];
                count++;
            }
        }

        System.out.println("Кількість елеентів в масиві від 20 до 30 = " + count);
        System.out.println("Сумма парних чисел в масиві від 20 до 30 = " + sum);
    }


    /*static void fourteen() {
        int[] array3 = new int[] {5, 2, 4, 6, 13, 9};

        int min = array3[0];
        int max = array3[0];

        for (int i = 1; i < array3.length; i++) {
            if (array3[i] < min) {
                min = array3[i];
            }
            if (array3[i] > max) {
                max = array3[i];
            }
        }

        int[] result = Arrays.stream(array3).filter(el -> el != min && el != max).toArray();
        System.out.println(min);
        System.out.println(max);

    }*/

    static void fourteen() {

        List<Integer> array3 = new ArrayList<>(Arrays.asList(5, 2, 4, 6, 13, 9));

        int min = array3.get(0);
        int max = array3.get(0);

        for (int i = 1; i < array3.size(); i++) {
            if (array3.get(i) < min) {
                min = array3.get(i);
            }
            if (array3.get(i) > max) {
                max = array3.get(i);
            }
        }

        array3.removeAll(Arrays.asList(min, max));
        System.out.println(array3);
    }

}




