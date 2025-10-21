package com.seakaey.designpatterns.structural.decorator;

public class SugarCoffee extends CoffeeDecorator{
    public SugarCoffee(Coffee simpleCoffee) {
        super(simpleCoffee);
    }

    @Override
    public int price() {
        return super.price() + 1;
    }

    @Override
    public String description() {
        return super.description() + ", Sugar";
    }
}
