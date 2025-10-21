package com.seakaey.designpatterns.structural.decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public int price() {
        return 5;
    }

    @Override
    public String description() {
        return "Coffee";
    }
}
