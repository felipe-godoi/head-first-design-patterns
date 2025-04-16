# Strategy Pattern (Ducks)
### The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
This patterns aims to reduce problems created by inheritance. It does that favoring composition over inheritance.
By separating the most changing behaviors from the main class and adding them as properties with the help of polymorphism it's possible to create different behavior classes extending one abstract class.
This makes possible to create children from the main class that implements different behaviors. The behavior can be changed also during runtime.
