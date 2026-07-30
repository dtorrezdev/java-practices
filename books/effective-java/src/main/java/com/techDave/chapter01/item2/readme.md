# Builder Recomendation

🧠 1. El problema real que resuelve Builder

Imagina una clase con muchos parámetros:

public class Pizza {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;
    private boolean mushrooms;
}
❌ Opción 1: Constructor gigante (anti-pattern)
Pizza p = new Pizza("large", true, false, true, false);

👉 Problemas:

❓ No sabes qué significa cada true/false
❌ Muy fácil equivocarse
❌ Difícil de leer
❌ Orden importa (muy peligroso)
❌ Opción 2: Telescoping constructors
new Pizza("large");
new Pizza("large", true);
new Pizza("large", true, true);

👉 Problemas:

Explosión de constructores 🤯
Código inmanejable
❌ Opción 3: Setters (mutable)
Pizza p = new Pizza();
p.setSize("large");
p.setCheese(true);

👉 Problemas:

❌ Objeto inconsistente (estado parcial)
❌ No es thread-safe
❌ Pierdes inmutabilidad
✅ 2. Builder Pattern (la solución elegante)
🔥 Idea clave:

👉 Construyes el objeto paso a paso con métodos con nombre

Pizza p = new Pizza.Builder("large")
    .cheese(true)
    .bacon(true)
    .build();
🧩 3. Implementación real (como en Effective Java)
public class Pizza {

    private final String size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean bacon;
    private final boolean mushrooms;

    public static class Builder {
        private final String size;

        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean bacon = false;
        private boolean mushrooms = false;

        public Builder(String size) {
            this.size = size;
        }

        public Builder cheese(boolean val) {
            cheese = val;
            return this;
        }

        public Builder bacon(boolean val) {
            bacon = val;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        size = builder.size;
        cheese = builder.cheese;
        pepperoni = builder.pepperoni;
        bacon = builder.bacon;
        mushrooms = builder.mushrooms;
    }
}
🎯 4. "Simula parámetros nombrados" (LO MÁS IMPORTANTE)

En Java no puedes hacer esto:

Pizza(size="large", cheese=true, bacon=true); // ❌ no existe

Pero con Builder:

Pizza p = new Pizza.Builder("large")
    .cheese(true)
    .bacon(true)
    .build();

👉 ✔ Cada parámetro tiene nombre
👉 ✔ No importa el orden
👉 ✔ Es legible

🧬 5. Builder en jerarquías (nivel PRO)

Esto es lo que mucha gente NO entiende bien.

Problema: herencia + constructores = caos
abstract class Pizza { ... }

class NyPizza extends Pizza { ... }
class Calzone extends Pizza { ... }

👉 Con constructores:

Duplicación
Problemas de tipos
Código rígido
✅ Solución: Builder con herencia
abstract class Pizza {

    abstract static class Builder<T extends Builder<T>> {
        abstract Pizza build();

        protected abstract T self();
    }
}
Subclase:
public class NyPizza extends Pizza {

    public static class Builder extends Pizza.Builder<Builder> {

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
🔥 ¿Qué logra esto?
NyPizza pizza = new NyPizza.Builder()
    .cheese(true)
    .build();

👉 ✔ Funciona con herencia
👉 ✔ Mantiene tipado correcto
👉 ✔ Permite extender fácilmente

Esto se llama:
👉 "Simulated self-types" (truco genérico avanzado)

🚀 6. Cuándo usar Builder (regla de oro)

Usa Builder cuando:

✅ Muchos parámetros (más de 4–5)
✅ Muchos opcionales
✅ Quieres inmutabilidad
✅ Quieres código legible
✅ Hay validaciones complejas
❌ Cuándo NO usarlo
Clases pequeñas (2–3 campos)
DTOs simples
Cuando no hay complejidad
🧠 7. Ejemplo real de backend (MUY REAL)

Imagina un usuario:

User user = new User.Builder("juan@email.com", "1234")
    .name("Juan")
    .age(25)
    .admin(true)
    .build();

👉 Esto es típico en:

APIs REST
Sistemas grandes
Microservicios
⚡ 8. Ventajas clave resumidas

✔ Legibilidad extrema
✔ Evita errores
✔ Inmutabilidad
✔ Flexible
✔ Escalable
✔ Ideal para jerarquías

🧩 9. Idea profunda final

👉 Builder no es solo sintaxis bonita

Es una forma de:

controlar la construcción
evitar estados inválidos
separar construcción vs representación
🧠 Frase clave (para que lo recuerdes siempre)

👉 "Si tu constructor empieza a verse feo, necesitas un Builder."