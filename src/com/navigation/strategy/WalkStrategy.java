package com.navigation.strategy;

public class WalkStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("[Пешком] Построение пешеходного маршрута: " + origin + " -> " + destination);
        System.out.println("  * Приоритет: тротуары, пешеходные зоны и парки.");
    }
}
