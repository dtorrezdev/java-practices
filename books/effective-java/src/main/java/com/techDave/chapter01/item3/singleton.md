# Singleton

- Un singleton garantiza que:
  - Existe una única instancia de la clase.
  - Hay un punto global de acceso a esa instancia.

- Item 3: Enforce the singleton property with a private constructor or an enum type

- Making a class a singleton can make it difficult to test its clients.
- There are two common ways to implement singletons. Both are based on
keeping the constructor private and exporting a public static member to provide access to the sole instance.
- The main advantage of the public field approach is that the API makes it clear that the class is a singleton: the public static field is final, so it will always contain the same object reference.
- Nothing that a client does can change this, with one caveat: a privileged client can invoke the private constructor reflectively.
- In the second approach to implementing singletons, the public member is a static factory method.
- One advantage of the static factory approach is that it gives you the flexibility to  change  your  mind about  whether  the  class is  a  singleton without changing its API. 
- A third way to implement a singleton is to declare a single-element enum: Enum singleton - the preferred approach. Why?
- a  single-element enum type is often the best way to implement a singleton.

## Problema conceptual importante: testabilidad

- Introduce estado global → difícil de aislar en tests.
- No puedes reemplazar fácilmente la instancia por un mock.
- Rompe principios como inyección de dependencias.

## Formas de implementar

- Campo publico estatico final
  - Muy simple.
  - La API deja claro que es singleton (INSTANCE).
  - Garantía fuerte: final → no cambia nunca.
  - Pero Bloch menciona un “caveat”: la Reflexion puede romperlo.

- Método fábrica estático
  - Flexibilidad futura
  - Hoy: singleton
  - Mañana: múltiples instancias
  - sin cambiar la API
  - Puedes añadir lógica: para test (`if (modoTest) return new ElvisFake();`)
  - Puedes devolver subtipos
  
  - Problema: La inicialización estática en Java es thread-safe.
  - Si implementas Cloneable → puedes duplicar la instancia.
  - Serialización rompe singletons

- Metodo Enum
  - Bloch lo recomienda como la mejor opción, y esto es clave.
  - Java impide crear instancias adicionales de enums.
  - Serialización automática correcta, No necesitas readResolve.
  - Seguridad fuerte (JVM-level), No depende de disciplina del programador.

## Cuándo NO usar singleton

- Evítalo si:
  - Necesitas testear fácilmente
  - La clase tiene estado mutable
  - Puedes usar DI
    👉 Ejemplo moderno:
En lugar de singleton → usar frameworks como Spring 