package com.navigation;

import com.navigation.context.Navigator;
import com.navigation.strategy.CarStrategy;
import com.navigation.strategy.CycleStrategy;
import com.navigation.strategy.PublicTransportStrategy;
import com.navigation.strategy.WalkStrategy;

public class Main {
    public static void main(String[] args) {
        String startPoint = "Астана, Байтерек";
        String endPoint = "Astana IT University";

        System.out.println("=== 1. Исходная стратегия: Автомобиль ===");
        Navigator navigator = new Navigator(new CarStrategy());
        navigator.executeRoute(startPoint, endPoint);

        System.out.println("\n=== 2. Переключение в рантайме: Пешком ===");
        navigator.setRouteStrategy(new WalkStrategy());
        navigator.executeRoute(startPoint, endPoint);

        System.out.println("\n=== 3. Переключение в рантайме: Велосипед ===");
        navigator.setRouteStrategy(new CycleStrategy());
        navigator.executeRoute(startPoint, endPoint);

        System.out.println("\n=== 4. Расширение без изменения Context (OCP): Транспорт ===");
        navigator.setRouteStrategy(new PublicTransportStrategy());
        navigator.executeRoute(startPoint, endPoint);
    }
}
