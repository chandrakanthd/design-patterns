package com.seakaey.designpatterns.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Globalcounter counter1 = Globalcounter.getInstance();
        Globalcounter counter2 = Globalcounter.getInstance();
        counter1.increment();
        System.out.println(counter1.getCount());
        counter2.increment();
        System.out.println(counter2.getCount());
    }
}
