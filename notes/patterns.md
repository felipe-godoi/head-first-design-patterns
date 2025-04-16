# Strategy Pattern (Ducks)
### The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
This patterns aims to reduce problems created by inheritance. It does that favoring composition over inheritance.
With the help of polymorphism we can define a behavior as a property of one superclass. This way we can have an abstract superclass for one behavior and extend this superclass with specific implementations for this behavior.
Because of polymorphism, these behaviors become interchangeable, what enables us to change them even at runtime.
This pattern is important because it deals with code reusability and behavior sharing in a way that doesn't enforce all inherited classes to depend of the same behavior implementation without needing to override methods.

# Observer Pattern
### The Observer Pattern defines a one-to-many dependency between objects so that when one object changes states, all of its dependents are notified and updated automatically
