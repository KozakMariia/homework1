package com.betterme;

import java.util.Scanner;

public class Book {

    private Title title;
    private Author author;
    private Content content;


    public void show() {
        title.show();
        author.show();
        content.show();
    }

    public Book(Title title, Author author, Content content) {

        this.title = title;
        this.author = author;
        this.content = content;

    }

    public static void main(String[] args) {
        System.out.println("Введіть число : \n" +
                "1. Book 1 \n" +
                "2. Book 2 \n" +
                "3. Book 3 \n" +
                "4. Book 4");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        Description(number);
    }

    private static void Description(int number) {
        switch (number) {
            case 1: {
                Title title = new Title("Філософський камінь");
                Author author = new Author("Дж. Роулінг");
                Content content = new Content("Сироту віддають на виховання його тітці-маглу. Гаррі до 11 років живе в сім'ї, \n" +
                        "не знаючи про своє походження. Але правда відкривається. Він доведался, що є чарівником \n");
                Book book = new Book(title, author, content);
                book.show();
                break;
            }

            case 2: {

                Title title = new Title("Таємна кімната");
                Author author = new Author("Дж. Роулінг");
                Content content = new Content("Повертається в \"Хогвартс\" після літніх канікул Гаррі Поттер. Жанр твору в теж час диктує \n" +
                        " свої правила, роблячи розповідь казковим і таємничим, - в підземеллях школи оголошується міфічна тварина. \n " +
                        "Починають пропадати учні маглівського походження. У коридорах все більше говорять про прокляття Салазара Слизерина. \n");
                Book book = new Book(title, author, content);
                book.show();
                break;
            }
            case 3: {

                Title title = new Title("В'язень «Азкабану");
                Author author = new Author("Дж. Роулінг");
                Content content = new Content("На цей раз ще до повернення в \"Хогвартс\" тікає з дому Гаррі Поттер. \n" +
                        "Жанр твору знову виявляється себе, і читач може дізнатися, як живуть і подорожують маги. \n" +
                        "Гаррі виявляється в чарівному трактирі «Дірявий казан». Тут він дізнається тривожна звістка – з в'язниці Азкабан \n" +
                        "втік Пожирач Смерті - Сіріус Блек.");
                Book book = new Book(title, author, content);
                book.show();
                break;
            }

            case 4: {

                Title title = new Title("Кубок Вогню");
                Author author = new Author("Дж. Роулінг");
                Content content = new Content("аррі та його друзі переживають напад Пожирачів Смерті прямо на змаганні. \n" +
                        "Потім юнак прибуває в \"Хогвартс\". Стає відомо про проведення магічного турніру між чарівними школами. \n" +
                        "Наш герой проти своєї волі опиняється серед учасників.");
                Book book = new Book(title, author, content);
                book.show();
                break;
            }
        }
    }
}
