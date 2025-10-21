Concept — Strategy Pattern

Definition:

Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
It lets the algorithm vary independently from clients that use it.

In simple terms: 

Instead of writing multiple if-else or switch statements to decide which algorithm or behavior to use,
you define them as separate “strategies” (classes) and switch them dynamically at runtime.

Real-World Example: Travel Route Planner (Google Maps Analogy)

Imagine you’re building an app like Google Maps.
You want to calculate the route between two locations — but the mode of travel can vary:

Car → fastest via highways

Bike → avoids highways, prefers shorter routes

Public Transport → mixes walking + bus/train

Strategy Pattern in Action

Goal

Encapsulate each route-finding algorithm separately, and switch between them dynamically based on user choice.

Why This Example Is Perfect for “Family of Algorithms” -

You have multiple algorithms (Car, Bike, PublicTransport) solving the same core problem (“build route”).

Each algorithm is interchangeable — you can swap strategies without changing the Navigator class.

New algorithms (like “WalkingRouteStrategy”) can be added without touching existing code → Open/Closed Principle (OCP).

Easy Way to Remember

Strategy = Choose one of many ways to do the same thing.

Replace “conditional logic” with “interchangeable algorithms”.
