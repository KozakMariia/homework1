package com.betterme;

public class Content {

    private String name;

    public Content(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Content: " + name);
    }

}
