# Lista de Patrones y Principio de Sooftware

- Factory  Method  pattern from  Design  Patterns
- Flyweight  pattern
- 

Clarity  and  simplicity  are  of  paramount  importance.

 Code should be reused rather than copied.

 The dependencies  between  components  should be kept to a minimum.

  Errors  should be detected as soon as possible after they are made, ideally at compile time.

 I'm writing programs that are clear, correct, usable, robust, flexible, and maintainable.

 The language supports four kinds of types: interfaces (including
annotations), classes (including enums), arrays, and primitives.

In Java 9, a module system was added to the platform

## Chappet 2

- Item 1: Consider static factory method instead of constructors

  - which is simply  a  static  method  that  returns  an  instance  of  the  class
  - One advantage of static factory methods is that, unlike constructors, they
have  names.

A second advantage of static factory methods is that, unlike constructors,
they are not required to create a new object each time they’re invoked.

A third advantage of static factory methods is that, unlike constructors,
they can return an object of any subtype of their return type.

A  fourth  advantage  of  static  factories  is  that  the  class  of  the  returned
object can vary from call to call as a function of the input parameters.

A fifth advantage of static factories is that the class of the returned object
need not exist when the class containing the method is written.