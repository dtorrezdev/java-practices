# Dependecy Injection

Es uno de los más importantes del libro porque marca el paso de “código que funciona” a código bien diseñado, flexible y testeable.

## Definicion

- Dependency Injection is a design pattern used to implement IoC (Inversion of Control).
- the control of creating and managing dependencies is transferred from the class itself to an external entity (often a framework or container).
- Dependency injection tells a unit of code what its dependencies are, rather than it asking something for those dependencies.
- the fundamental aspect that is commonly used to allow loose coupling of the component without the need to know the dependency of each component otherwise.
- dependency injection, lifecycle management is handled by the framework outside of the code.

## Effective Java

- Item 5: Prefer dependency injection to hardwiring resources

- Static utility classes and singletons are inappropriate for
- classes whose behavior is parameterized by an underlying resource.
- pass the resource into the constructor when creating a new instance.
- The dependency injection pattern is so simple that many programmers use it for years without knowing it has a name.
- A useful variant of the pattern is to pass a resource factory to the constructor.
- A factory is an object that can be called repeatedly to create instances of a type
- Methods that take a Supplier<T> on input should typically constrain the factory’s type parameter using a bounded wildcard type.

## La idea central

No “amarres” (hardcodees) las dependencias dentro de tu clase.
En su lugar, recíbelas desde afuera (dependency injection).

# El problema: hardwiring

- acoplamiento fuerte: No es flexible
  - La clase decide su dependencia → mal diseño
- Solo puedes usar ese diccionario
- ¿Y si quieres otro idioma? → imposible
- No es testeable: No puedes usar un mock o fake

## Por qué singleton o static tampoco ayudan

- Sigue siendo malo porque:
  - Sigues sin poder cambiar la implementación
  - Sigues acoplado.

## Solucion Dependency Injection (DI)

- Flexibilidad total
- Testabilidad
- Bajo acoplamiento

## Idea profunda
👉 Tu clase deja de ser “dueña de sus recursos”
👉 y pasa a ser consumidora de ellos
Esto es clave en arquitectura moderna.

## Variantes Modernas

### Injectar Fabrica

- Factory: Un objeto que crea otros objetos

- Cuando Usar
  - necesitas múltiples instancias
  - o creación diferida (lazy)
  - o lógica compleja de construcción

### Uso moderno: Supplier<T>

- es la forma moderna, simple y estándar en Java de representar una fábrica.
- Soy algo que puede producir objetos de tipo T bajo demanda.
- Un Supplier es un proveedor y por lo tanto nos devuelve un valor o un objeto sin que nosotros le pasemos ningún parámetro.

- Proposito real
  - Crear objetos bajo demanda (lazy)
  - Desacoplar la creación del uso
  - Permitir múltiples estrategias de creación

- Uso en
  - Dependency Injection
    - Creación diferida (lazy)
    - Nueva instancia cada vez (si quieres)
    - Control externo total
    - Fácil de testear
  - Uso como Factory

- Cuando usar 
  - La creación es costosa
  - Necesitas múltiples instancias
  - Quieres lazy initialization
  - Quieres inyectar comportamiento (no solo datos)

- Cuando No usar:
  - siempre necesitas la misma instancia → mejor DI simple
  - no hay lógica de creación → es overkill


## References

- [Java Supplier](https://www.arquitecturajava.com/java-supplier-interface-y-factories/)