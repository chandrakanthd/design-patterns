package com.seakaey.designpatterns.behavioral.observer;

public class User implements Subscriber{
    public String name;

    public User(String name) {
        this.name = name;
    }


    @Override
    public void notification() {
        System.out.println(name + " has been notified");
    }
}
