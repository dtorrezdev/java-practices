# Chapter 2: Methods Common to All Objects

- Item 10: Obey the general contract when overriding equals.
  - The easiest way to avoid problems is not to override the equals method, in which case each instance of the class is equal only to itself.
- This is the right thing to do if any of the following conditions apply
  - Each instance of the class is inherently unique.
  - There  is  no  need  for  the  class  to  provide  a  “logical  equality”  test.
  - A superclass has already overridden equals, and the superclass behavior is appropriate for this class.
  - The class is private or package-private, and you are certain that its equals method will never be invoked.
- When you override the equals method, you must adhere to its general contract. Here is the contract:
  - Reflexive
  - Symetric
  - Transitive
  - Consistent
  - For any non-null reference value x, x.equals(null) should return false.

- Once you’ve violated the equals contract, you simply don’t know how other objects will behave when confronted with your object
- There is no way to extend an instantiable class and add a value component while preserving the equals contract,
- Broken - violates Liskov substitution principle
- do not write an equals method that depends on unreliable resources
  1. Use the == operator to check if the argument is a reference to this object
  2. Use the instanceof operator to check if the argument has the correct type.
  3. Cast the argument to the correct type.
  4. For each “significant” field in the class, check if that field of the argument matches the corresponding field of this object

- When you are finished writing your equals method, ask yourself three questions: Is it symmetric? Is it transitive? Is it consistent?
  - Always override hashCode when you override equals
  - Don’t try to be too clever
  - Don’t substitute another type for Object in the equals declaration

---

- Idea filosófica profunda del Item 10: equals() no compara objetos.
  - Define: qué significa identidad lógica en tu modelo de dominio
  - Y esa definición debe obedecer reglas matemáticas universales, porque TODO el ecosistema Java depende de ellas.

- ¿Qué es realmente equals()?
  - define la identidad lógica de tus objetos dentro del ecosistema de Java
  - dos objetos son iguales SOLO si son la misma instancia

- ¿Qué significa “logical equality”?
  - Dos objetos distintos representan el mismo valor conceptual.

- Cuándo NO debes sobrescribir equals()
  - NO sobrescribas equals si el objeto es inherentemente único
  Thread
  Socket
  Connection
  Scanner
  - Cada instancia representa una entidad única del sistema.

  - Si la superclase ya implementa correctamente equals()

    ```java
    class Point
    class ColoredPoint extends Point
    ```

- El contrato de equals() es un contrato Matematico
  - Reflexive: x.equals(x) debe ser true para cualquier referencia no nula x.
  - Symmetric: x.equals(y) debe ser true si y solo si y.equals(x) es true para cualquier referencia no nula x e y.
  - transitive: si x.equals(y) es true y y.equals(z) es true, entonces x.equals(z) debe ser true para cualquier referencia no nula x, y, z.
  - consistent: si x.equals(y) es true una vez, entonces siempre debe ser true, a menos que uno de los objetos sea modificado.

- Bloch dice:
“Once you've violated equals contract, you don't know how other objects behave.”

Porque el universo Java ASUME que respetas el contrato.

- Conclusión brutal de Bloch
“There is no way to extend an instantiable class and add a value component while preserving equals contract.”
Esta frase es importantísima.

- Traduccion Conceptual | NO puedes:
  - heredar
  - agregar nuevos campos significativos
  - mantener equals correcto
AL MISMO TIEMPO.

- Solución real: Usar COMPOSICIÓN, no herencia.

- Liskov Substitution Principle (LSP)
Bloch menciona: “Broken - violates Liskov substitution principle”

- LSP dice:
Una subclase debe poder sustituir a su padre sin romper comportamiento.

Si ColoredPoint rompe equals respecto a Point, entonces NO es un verdadero subtipo.

- Los 4 pasos recomendados por Bloch

1. Optimización rápida

```java
if (this == o)
    return true;
```

Si son misma referencia,ya son iguales.

2. instanceof

```java
if (!(o instanceof User))
    return false;
```

3. Cast
User other = (User) o;

4. Comparar campos significativos

```java
return age == other.age
    && Objects.equals(name, other.name);
```


- hashCode() ESTO ES CRÍTICO.
- Bloch: “Always override hashCode when you override equals”
- Por qué: HashMap y HashSet funcionan así:
hashCode decide bucket
equals compara dentro del bucket

---

- “Don’t try to be too clever”
No hagas cosas “inteligentes”. Mantenlo simple.

- “Don’t substitute another type for Object”
No hagas:
public boolean equals(User u)

Eso NO sobrescribe equals.
Sobrecarga el método.
Debe ser EXACTAMENTE:
public boolean equals(Object o)

## Item 13: Override clone judiciously

- a  class  implementing Cloneable is expected to provide a properly functioning public clone method
- immutable  classes  should  never  provide  a  clone  method 
- In  effect,  the  clone  method  functions  as  a  constructor;  you must ensure that it does no harm to the original object and that it properly establishes invariants on the clone
- the Cloneable architecture is incompatible  with  normal  use  of  final  fields  referring  to  mutable  objects
- 

Pag. 61