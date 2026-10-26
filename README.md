# Strategy Pattern - Navigation System

Assignment #5 for Course: ShP-2216 - Software Design Patterns (Astana IT University).

## Project Overview
This project implements the **Strategy behavioral design pattern** in Java (JDK 17) for a navigation system with interchangeable routing algorithms (`CarStrategy`, `WalkStrategy`, `CycleStrategy`, `PublicTransportStrategy`).

## How to Build and Run
```bash
javac -d bin $(find src -name "*.java")
java -cp bin com.navigation.Main
```

## How to Add a New Strategy
1. Create a new class implementing `RouteStrategy` in `com.navigation.strategy`.
2. Implement the `buildRoute(String origin, String destination)` method.
3. Pass the new strategy instance to `navigator.setRouteStrategy(new YourNewStrategy())`.
*Note: No modifications to `Navigator` are required (Open/Closed Principle).*
