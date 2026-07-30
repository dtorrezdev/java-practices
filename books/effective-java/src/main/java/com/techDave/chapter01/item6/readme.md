# Avoid create unnecesary objects

- Item 6: Avoid creating unnecesary objects.

- Reuse  can be both faster and more stylish. An object can always be reused if it is immutable.
- You can often avoid creating unnecessary objects by using static factory methods
- When an object is immutable, it is obvious it can be reused safely, but there are other situations where it is far less obvious, even counterintuitive.
- While String.matches is the easiest way to check if a string matches a regular expression, it’s not suitable for repeated use in performance-critical situations.
- Autoboxing  blurs  but  does  not  erase  the  distinction between primitive and boxed primitive types.
- The lesson is clear: prefer primitives to boxed primitives, and watch out for unintentional autoboxing.
- This item should not be misconstrued to imply that object creation is expensive and should be avoided. On the contrary, the creation and reclamation of small objects whose constructors do little explicit work is cheap, especially on modern JVM implementations.
- Creating additional objects to enhance the clarity, simplicity, or power of a program is generally a good thing.
- This item should not be misconstrued to imply that object creation is expensive and should be avoided. On the contrary, the creation and reclamation of small objects whose constructors do little explicit work is cheap, especially on modern JVM implementations.
- The  present item  says, “Don’t create a new  object when you should reuse an existing one,”
- “Don’t reuse an existing object when you should create a new one.”
  

- Idea General
  - Si un objeto no puede cambiar después de crearse (inmutable), puedes reutilizarlo sin miedo.
  - No crees objetos innecesarios cuando puedes reutilizar uno existente sin romper el diseño.
  - “Don’t create a new object when you should reuse one Don’t reuse one when you should create a new one”

- 1. Reutiliza objetos inmutables
- 2. Static factory methods (evitan objetos nuevos)
- 3. El caso peligroso: String.matches()
- 4. Autoboxing (el enemigo silencioso)
- 5. No exagerar (parte MUY importante) 
  - Crear objetos pequeños es barato en la JVM moderna. (Mal interpretar: No crear objetos nunca)

- Reutilizar cuando: 
  - objeto es inmutable (String, BigDecimal, Pattern)
  - puedes usar cache (valueOf)
  - estás en loops intensivos
- Crear objetos cuando:
  - mejora claridad: Si crear un objeto hace que tu código sea más limpio y fácil de mantener, hazlo.
  - evita bugs (mutabilidad)
  - es código simple

- Patron Adapter:  Objetos "Adaptadores" (Vistas)
  - Un Adaptador es un objeto que delega en un objeto de respaldo, proporcionando una interfaz diferente.

- Ejemplo: Map.keySet()
  - Si llamas a keySet() varias veces en un Map, Java no crea un nuevo Set cada vez.
  - Devuelve la misma "vista". Si modificas el Map, el Set devuelto por keySet también cambia, porque todos apuntan al mismo sitio.