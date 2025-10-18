package com.seakaey.designpatterns.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Customer user1 = new Customer.Builder("Chandra", "Kanth")
                .email("chandrakanth@gmail.com")
                .phone("9876543210")
                .address("Bengaluru")
                .build();
        System.out.println(user1.toString());

        Customer user2 = new Customer.Builder("Vinuthna", "CR")
                .phone("7896543210")
                .build();
        System.out.println(user2.toString());
    }
}
