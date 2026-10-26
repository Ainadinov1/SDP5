package com.navigation.strategy;

public class CarStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("[Автомобиль] Построение автомобильного маршрута: " + origin + " -> " + destination);
        System.out.println("  * Учет дорожной ситуации: автомагистрали и объезд пробок.");
    }
}
