package com.seakaey.designpatterns.behavioral.strategy;

public class BikeRouteStrategy implements RouteStrategy{
    @Override
    public void createRoute() {
        System.out.println("Bike route strategy");
    }
}
