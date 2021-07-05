package com.betterme.homework5_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan;
        System.out.println("Введіть число : \n" +
                "1. Використовувати безкоштовну версію \n" +
                "2. Ввести ключ доступу pro и exp");

        scan = new Scanner(System.in);
        int number = scan.nextInt();

        Number(number);
    }

    private static void Number(int number) {
        Scanner scan;
        switch (number) {
            case 1: {

                DocumentWorker doc = new DocumentWorker();
                doc.openDocument();
                doc.editDocument();
                doc.saveDocument();

                break;
            }

            case 2: {

                System.out.println("Введіть ключ");
                scan = new Scanner(System.in);
                int key = scan.nextInt();

                if (key == 1) {

                    System.out.println("pro: ");
                    ProDocumentWorker proDoc = new ProDocumentWorker();
                    proDoc.editDocument();
                    proDoc.saveDocument();

                } else if (key == 2) {
                    System.out.println("exp: ");
                    ExpertDocumentWorker expDoc = new ExpertDocumentWorker();
                    expDoc.saveDocument();

                } else {

                    System.out.println("Невірний ключ");
                }
                break;
            }
        }
    }
}
