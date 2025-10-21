package com.seakaey.designpatterns.structural.decorator;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffee;

    public CoffeeDecorator(Coffee simpleCoffee) {
        this.coffee = simpleCoffee;
    }

    @Override
    public int price() {
        return this.coffee.price();
    }

    @Override
    public String description() {
        return this.coffee.description();
    }
}
