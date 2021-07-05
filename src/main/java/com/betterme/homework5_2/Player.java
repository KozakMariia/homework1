package com.betterme.homework5_2;

public class Player implements Playable, Recordable {

    public void play() {
        System.out.println("Play");
    }

    public void pause() {
        System.out.println("Pause");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void record() {
        System.out.println("Record");
    }


    public static void main(String[] args) {

        Player pl = new Player();
        pl.play();
        pl.pause();
        pl.stop();
        pl.record();
    }
}
