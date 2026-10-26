package com.navigation.strategy;

public class CycleStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("[Велосипед] Построение велосипедного маршрута: " + origin + " -> " + destination);
        System.out.println("  * Приоритет: велодорожки и безопасные улицы.");
    }
}
