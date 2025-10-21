package com.seakaey.designpatterns.behavioral.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        RoutingApp routingApp = new RoutingApp();
        
        routingApp.setStrategy(new BusRouteStrategy());
        routingApp.buildRoute();

        routingApp.setStrategy(new CarRouteStrategy());
        routingApp.buildRoute();

        routingApp.setStrategy(new BikeRouteStrategy());
        routingApp.buildRoute();
    }
}
