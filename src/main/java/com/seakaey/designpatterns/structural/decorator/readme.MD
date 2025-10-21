Concept — Decorator Design Pattern

Definition:

The Decorator Pattern allows you to add new behavior to an object dynamically at runtime,
without changing its original class.

In simple words:

You "wrap" an object with another object to extend or modify its behavior.

Real-World Example: Coffee Shop ☕ (like Starbucks)

Imagine you own a coffee shop.
You sell base coffee, and customers can add toppings:

Milk 🥛

Sugar 🍬

Whip Cream 🍦

Chocolate 🍫

Each topping adds extra cost and extra description,
but you don’t want to create 100 classes like MilkCoffee, SugarMilkCoffee, WhipCreamSugarCoffee, etc. 😅

So, you use Decorator Pattern to “wrap” the base coffee with multiple decorators.

Easy Way to Remember

Decorator = Add toppings to your base object — like coffee or pizza — without changing the original class.

Or simply:

“Wrap an object → add new behavior.”

Real-World Analogy

Think of gift wrapping 🎁:

The gift is your core object.

Each wrapping (paper, ribbon, card) is a decorator that adds something new — looks, message, etc.

The final package looks different, but the gift inside is the same.