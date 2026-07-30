# No Instantiability Class

Evitar que alguien cree instancias de tu clase

- Item 4: Enforce noninstantiability with a private constructor

- Attempting to enforce noninstantiability by making a class abstract does not work.
- a class can be made noninstantiable by including a private constructor.

## Error comun

- Error común: usar abstract
- Sí se puede instanciar indirectamente
- Has fallado en tu objetivo

## Solucion

- El constructor privado bloquea tanto:
  - instanciación directa
  - herencia

## Utilizar cuando 

- Estas clases:
  - solo tienen métodos static
  - no tienen estado
  - no necesitan instancias

- 👉 Crear objetos sería:
  - inútil
  - confuso
  - potencialmente peligroso

## Idea profunda del ítem

Este ítem no es solo “usa private constructor”.

Es sobre:
👉 expresar intención en el diseño

- Si una clase:
  - no tiene estado
  - no representa una entidad
  - solo agrupa comportamiento

👉 entonces no debería poder existir como objeto.

Si una clase no debe tener instancias, bloquéalo explícitamente con un constructor privado (no confíes en abstract).