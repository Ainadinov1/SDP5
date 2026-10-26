package com.navigation.strategy;

public class PublicTransportStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("[Общественный транспорт] Маршрут: " + origin + " -> " + destination);
    }
}
