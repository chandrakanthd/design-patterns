package com.seakaey.designpatterns.creational.singleton;

public class Globalcounter {
    public static volatile Globalcounter instance;
    private int counter = 0;

    private Globalcounter() {
    }

    public static Globalcounter getInstance() {
        if (instance == null) {
            synchronized (Globalcounter.class) {
                if (instance == null) {
                    instance = new Globalcounter();
                }
            }
        }

        return instance;
    }

    public void increment() {
        counter++;
    }

    public int getCount() {
        return counter;
    }
}
