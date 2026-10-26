package com.navigation.context;

import com.navigation.strategy.RouteStrategy;
import java.util.Objects;

public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        setRouteStrategy(routeStrategy);
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = Objects.requireNonNull(routeStrategy, "Стратегия не может быть null");
    }

    public void executeRoute(String origin, String destination) {
        routeStrategy.buildRoute(origin, destination);
    }
}
