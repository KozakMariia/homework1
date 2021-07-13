package com.betterme;

public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Author: " + name);
    }
}
