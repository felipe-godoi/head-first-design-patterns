# Strategy Pattern
### The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
This patterns aims to reduce problems created by inheritance. It does that favoring composition over inheritance.
With the help of polymorphism we can define a behavior as a property of one superclass. This way we can have an abstract superclass for one behavior and extend this superclass with specific implementations for this behavior.
Because of polymorphism, these behaviors become interchangeable, what enables us to change them even at runtime.
This pattern is important because it deals with code reusability and behavior sharing in a way that doesn't enforce all inherited classes to depend of the same behavior implementation without needing to override methods.

# Observer Pattern
### The Observer Pattern defines a one-to-many dependency between objects so that when one object changes states, all of its dependents are notified and updated automatically
In this pattern, one object can act as a subject that notifies other objects when it's state changes.
Only subscribed objects are notified, and they can opt out whenever needed.
The subscribed objects have to implement an interface with the methods that are going to be used by the Subject for notification.
All the subject has to know about the observers is the Observer interface implementation, and the same is valid for the observers, they only need to know that the subject implements the Subject interface.

# Decorator Pattern
### The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
This pattern is used based on the Open-Closed principle, because using it you can wrap a class and extend it with other behaviors or responsibilities. This way you can add more functionality to an existing code without changing it.
Some features of decorators are:
- They have the same supertype as the objects decorated
- You can use multiple decorators on the same object
- The decorator can be used at any time to decorate objects dynamically at runtime.

# Factory
### The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
This pattern is useful when you have different sets of objects that implement the same interface but are created using different approaches. It helps reduce coupling by encapsulating what varies and also reduces code duplication.
By using it, you can write a creator class that defines a creation method (factory method) of a supertype and perform operations on it.
After that, you can extend this class by creating subclasses that implement the factory method, each instantiating a specific concrete implementation.
In this way, you allow the subclasses to 'decide' which class to instantiate, although in practice, you determine what will be instantiated by choosing the appropriate subclass.
