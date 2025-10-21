package com.seakaey.designpatterns.behavioral.strategy;

public class RoutingApp {
    public RouteStrategy routeStrategy;

    public void setStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void buildRoute() {
        routeStrategy.createRoute();
    }
}
