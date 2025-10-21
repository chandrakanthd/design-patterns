package com.seakaey.designpatterns.structural.decorator;

public class MilkCoffee extends CoffeeDecorator {

    public MilkCoffee(Coffee simpleCoffee) {
        super(simpleCoffee);
    }

    @Override
    public int price() {
        return super.price() + 2;
    }

    @Override
    public String description() {
        return super.description() + ", Milk";
    }
}
