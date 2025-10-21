package com.seakaey.designpatterns.behavioral.strategy;

public class CarRouteStrategy implements RouteStrategy{
    @Override
    public void createRoute() {
        System.out.println("Car route created");
    }
}
