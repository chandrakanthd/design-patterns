package com.seakaey.designpatterns.behavioral.strategy;

public class BusRouteStrategy implements RouteStrategy{
    @Override
    public void createRoute() {
        System.out.println("Bus route created");
    }
}
