What Are Design Patterns?

Design patterns are proven solutions to common problems that occur in software design.
They are not code, but templates or blueprints for writing clean, reusable, and maintainable code.

🏗️ **Types of Design Patterns**

There are 3 main categories:

**1. Creational Patterns — Object Creation**

These deal with how objects are created, to make the system independent of how its objects are instantiated.

Pattern	Description	Example

Singleton	

Ensures a class has only one instance and provides a global point of access to it.	Logger, DB Connection

Factory Method	

Lets a subclass decide which class to instantiate.	ShapeFactory creates Circle, Square

Abstract Factory	

Creates families of related objects without specifying concrete classes.	GUI toolkit for Windows/macOS

Builder	

Separates object construction from its representation.	Building complex objects like HttpRequest

Prototype	

Clones existing objects instead of creating new ones from scratch.	Copying configuration objects


**2. Structural Patterns — Object Composition**

These deal with how classes and objects are combined to form larger structures.

Pattern	Description	Example

Adapter	

Converts one interface into another expected by the client.	USB-to-HDMI converter

Bridge	

Separates abstraction from implementation so they can evolve independently.	Remote and device implementations

Composite	

Treats individual objects and compositions uniformly.	File system (files and folders)

Decorator	

Adds behavior to an object dynamically.	Java I/O streams (BufferedReader)

Facade	

Provides a simplified interface to a complex system.	HibernateUtil or JDBCUtil

Flyweight	

Reduces memory usage by sharing common state.	Character objects in a text editor

Proxy	

Controls access to another object.	Virtual proxy for lazy loading images

**3. Behavioral Patterns — Object Interaction**

These define how objects communicate and cooperate with each other.

Pattern	Description	Example

Chain of Responsibility	

Passes a request along a chain of handlers.	Servlet filters, logging chain

Command	

Encapsulates a request as an object.	Undo/redo in text editors

Iterator	

Provides a way to traverse elements without exposing structure.	Java Iterator interface

Mediator	

Centralizes communication between objects.	Chat room, Air Traffic Controller

Memento	

Captures and restores an object’s internal state.	Save/restore in games

Observer	

Defines dependency where objects are notified of state changes.	Event listeners, stock price updates

State	

Changes behavior when internal state changes.	Traffic light, media player

Strategy	

Selects an algorithm’s behavior at runtime.	Payment strategies (CreditCard, PayPal)

Template Method	

Defines the skeleton of an algorithm; subclasses fill in steps.	Abstract class with hooks

Visitor	

Adds new operations to existing class structures without modifying them.	Syntax tree visitors in compilers


💡 Why Use Design Patterns?

✅ Improve code reusability

✅ Make code easier to maintain and extend

✅ Provide common vocabulary for developers

✅ Encourage best practices in software design


**Most Commonly Used Design Patterns**

🔹 1. Singleton Pattern

Why used: Tests your understanding of object creation control, thread safety, and lazy initialization.

Key discussion points:

How to make it thread-safe

Eager vs Lazy initialization

Singleton in Spring (@Bean scope) or DB connections

✅ Use case: Logger, Database connection pool, Configuration manager

🔹 2. Factory Pattern (Factory Method / Abstract Factory)

Why used: Tests how you decouple object creation from implementation.

Key discussion points:

Difference between Factory Method and Abstract Factory

How to add new types without changing client code

Relation to Spring BeanFactory / ApplicationContext

✅ Use case: GUI toolkit (Windows, Mac), Payment gateway selector

🔹 3. Builder Pattern

Why used: Very common in modern APIs; shows clarity in object creation.

Key discussion points:

Difference between Builder and Factory

Immutability & method chaining

Usage in Lombok’s @Builder, StringBuilder, or HttpRequest.Builder

✅ Use case: Building complex objects (Requests, DTOs, Reports)

🔹 4. Prototype Pattern

Why used: Tests knowledge of cloning vs creating new instances.

Key discussion points:

Deep vs Shallow copy

Implementing Cloneable in Java

Reducing cost of object creation

✅ Use case: Copying configuration templates or documents

🔹 5. Strategy Pattern

Why used: Shows if you can design systems that are open for extension, closed for modification (OCP).

Key discussion points:

Polymorphism & runtime algorithm switching

Example: Payment strategy, Sorting algorithm strategy

Used in Spring with @Qualifier or Context switching

✅ Use case: Choosing payment mode, compression algorithm, routing logic

🔹 6. Observer Pattern

Why used: Shows event-driven thinking & decoupling.

Key discussion points:

Pub-Sub mechanism

Java’s Observer or Spring’s ApplicationEventPublisher

How you’d notify multiple listeners

✅ Use case: Event systems, Notifications, WebSocket updates

🔹 7. Decorator Pattern

Why used: Commonly used in Spring and Java I/O; tests composition vs inheritance.

Key discussion points:

Adding features dynamically

Example: BufferedReader wraps FileReader

How it differs from inheritance

✅ Use case: Adding logging, caching, or security dynamically

🔹 8. Proxy Pattern

Why used: Tests understanding of AOP, lazy loading, and indirect access.

Key discussion points:

Real-life examples: Spring AOP, Hibernate proxy

Difference between Proxy and Decorator

Use in security, caching, or remote access

✅ Use case: Security proxy, Remote service proxy

🔹 9. Command Pattern

Why used: Tests encapsulation of actions and undo/redo functionality.

Key discussion points:

Command queueing and history

Functional programming alternatives (lambdas)

Used in job schedulers or UI frameworks

✅ Use case: Undo/Redo system, Task queues, Macro commands

🔹 10. Chain of Responsibility

Why used: Common in middleware frameworks.

Key discussion points:

How to pass a request through multiple handlers

Real example: Spring Security filters, Servlet Filters

Dynamic reordering or chain customization

✅ Use case: Logging chain, Request validation pipeline

🔹 11. Template Method Pattern

Why used: Checks abstraction and inheritance design ability.

Key discussion points:

Defining algorithm skeleton in parent class

Overriding steps in subclasses

Usage in frameworks (e.g., JdbcTemplate, RestTemplate)

✅ Use case: Database operations, Batch processing

🔹 12. Adapter / Facade

Why used: Tests understanding of integration and simplifying complex systems.

Key discussion points:

Adapter = Interface translation

Facade = Simplified API for complex subsystems

Example: RestTemplate wraps HTTP calls

✅ Use case: Legacy system integration, External API wrapper