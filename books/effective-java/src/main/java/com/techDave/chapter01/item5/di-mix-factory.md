# Factory Pattern

- The Factory Design Pattern is used to create objects without specifying the exact class of the object that will be created.
- A factory provides an instance of an object according to a set of rules.
- the factory pattern also promotes loose coupling of the component as it delegates the need to know to the factory.

- How work or implement
  - It provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

- When to use:
  - When the Exact Class of Objects Cannot be Predetermined
  - When Object Creation Logic is Complex
  - When Managing a Family of Related Objects
  - When Object Creation Needs to be Centralised.

- Benefics of Factory Pattern
  - the benefit of factory pattern is reducing the long parameter list that causes by dependency constructor injection.

## DI downsides (disavantages)

- it will lead to a code smell called the long parameter list.
- But what if there are 10 modes of object to inject
- the constructor signature is prone to changes whenever an additional mode of delivery has been introduced.


## References

- [DI and Factory Pattern](https://medium.com/javarevisited/dependency-injection-with-factory-1c24cc54b0d4)
- [StackOverflow: Why do we need Abstract Factory Design Pattern?](https://stackoverflow.com/questions/2280170/why-do-we-need-abstract-factory-design-pattern/2280289#2280289)