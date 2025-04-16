# Encapsulate what varies
A good OO design practice is to separate from the main class behaviors that may vary.
This way you can use inheritance without having to worry with changing all inherited classes when some behavior change.

# Favor composition over inheritance
Using inheritance is powerful, but it creates subtle problems that may be harmful for the code in the long term.
When you change behaviors of the super class, you are affecting all it's children. Using composition you can separate the behavior from the super class, preventing undesired behavior changes.

# Program to interfaces, not implementations
One should program thinking of interfaces and letting implementations aside. This way, one code becomes independent from others implementation.
This ensures your code to be more robust, making changes affect only what they're supposed to affect and protecting implementations from side effects produced in other implementations.
Also, using this principle makes easier to mantain a codebase, because without it you have to be aware of every class affected when making a change, and if needed you have to reflect the changes on them.
