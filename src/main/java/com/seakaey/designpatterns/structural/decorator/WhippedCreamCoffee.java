package com.seakaey.designpatterns.structural.decorator;

public class WhippedCreamCoffee extends CoffeeDecorator{
    public WhippedCreamCoffee(Coffee simpleCoffee) {
        super(simpleCoffee);
    }

    @Override
    public int price() {
        return super.price() + 5;
    }

    @Override
    public String description() {
        return super.description() + ", Whipped cream";
    }
}
