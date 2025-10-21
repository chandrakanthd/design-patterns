package com.seakaey.designpatterns.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.description() + " will cost " + coffee.price() + "rs");

        coffee = new MilkCoffee(coffee);
        System.out.println(coffee.description() + " will cost " + coffee.price() + "rs");

        coffee = new SugarCoffee(coffee);
        System.out.println(coffee.description() + " will cost " + coffee.price() + "rs");

        coffee = new WhippedCreamCoffee(coffee);
        System.out.println(coffee.description() + " will cost " + coffee.price() + "rs");
    }
}
