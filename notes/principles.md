# Encapsulate what varies
A good OO design practice is to separate from the main class behaviors that may vary.
This way you can use inheritance without having to worry with changing all inherited classes when some behavior change.

# Favor composition over inheritance
Using inheritance is powerful, but it creates subtle problems that may be harmful for the code in the long term.
When you change behaviors of the super class, you are affecting all it's children. Using composition you can separate the behavior from the super class, preventing undesired behavior changes.

# Program to interfaces, not implementations
You should program thinking of interfaces and letting implementations aside. This way, one code becomes independent from others implementation. Programming to implementations leaves no other way to change the behavior than changing the code.
This ensures your code to be more robust, making changes affect only what they're supposed to affect andT protecting implementations from side effects produced in other implementations.
Also, using this principle makes easier to maintain a codebase, because without it you have to be aware of every class affected when making a change, and if needed you have to reflect the changes on them.

# Strive for loosely coupled designs between objects that interact
This way you can make code that breaks less easily. With this principle we have more flexibility when extending the code, because changes on one class does not affect the others.

# Classes should be open for extension but closed for modification
You don't need to make your whole code closed to changes, because doing that would be nearly impossible and unnecessary.
This principle aims to focus on making the most changing parts of the code isolated.
To achieve that you can use patterns that doesn't modify the base code when you need to add new functionalities, instead they just extend it.
One example of this is the Decorator Pattern, that builds new functions on existing code.
The goal of this principle is to prevent changes on existing code, once they can introduce new bugs or compromise the current behavior.
