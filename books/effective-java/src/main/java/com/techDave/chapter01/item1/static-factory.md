# Static Factory

## 🧠 1. ¿Qué es un constructor vs static factory?

🔹 Constructor (lo clásico)
User user = new User("Juan", 25);
Siempre crea un objeto nuevo
No tiene nombre (solo el nombre de la clase)
Es directo, pero limitado
🔹 Static Factory Method
User user = User.create("Juan", 25);
Es un método static que devuelve un objeto
Puede tener nombre
Puede decidir cómo y si crear el objeto
⚔️ 2. Ventajas clave (con ejemplos reales)
✅ 1. Tienen nombre (MEJOR LEGIBILIDAD)
❌ Constructor
new BigInteger(1, bytes);

👉 ¿Qué significa el 1? 🤨

✅ Static factory
BigInteger.valueOf(10);

👉 Mucho más claro

✔ Ejemplo real:

Effective Java recomienda nombres como:
of()
from()
valueOf()
getInstance()
✅ 2. No siempre crean un objeto nuevo (CACHING)
Ejemplo real: Boolean
Boolean a = Boolean.valueOf(true);
Boolean b = Boolean.valueOf(true);

👉 a == b puede ser true

Porque reutiliza instancias (singleton parcial)

❌ Constructor
new Boolean(true); // SIEMPRE crea uno nuevo
✅ 3. Pueden devolver subtipos (flexibilidad brutal)
Ejemplo: interfaz
List<String> list = List.of("A", "B", "C");

👉 No sabes qué clase concreta es:

Puede ser ArrayList
o una clase interna optimizada

✔ Esto permite cambiar la implementación sin romper código

✅ 4. Pueden cambiar el tipo según parámetros
public static Shape createShape(String type) {
    if (type.equals("circle")) return new Circle();
    if (type.equals("square")) return new Square();
}

👉 Mismo método → distintos objetos

Esto es base de patrones como:

Factory Pattern
Strategy Pattern
✅ 5. No necesitas tener la clase creada aún (desacoplamiento)

Esto es más avanzado.

Ejemplo: JDBC

Connection conn = DriverManager.getConnection(url);

👉 No sabes qué clase concreta devuelve:

MySQL
PostgreSQL
Oracle

✔ Se decide en runtime

❌ 3. Desventajas (importantes)
🚫 1. No puedes heredar fácilmente

Si haces:

class MyClass {
    private MyClass() {}
    
    public static MyClass create() {
        return new MyClass();
    }
}

👉 Nadie puede hacer:

class Child extends MyClass // ❌ ERROR
🚫 2. Son difíciles de descubrir

Con constructor:

new User(...)

👉 IDE te muestra todo

Con static:

User.

👉 Debes conocer el nombre (of, create, etc.)

✔ Por eso hay convenciones

🔥 4. Ejemplo real completo (muy importante)
❌ Usando constructor
public class User {
    private String role;

    public User(String role) {
        this.role = role;
    }
}

Problema:

new User("ADMIN");
new User("USER");

👉 Strings peligrosos, sin control

✅ Usando static factories
public class User {
    private String role;

    private User(String role) {
        this.role = role;
    }

    public static User admin() {
        return new User("ADMIN");
    }

    public static User regular() {
        return new User("USER");
    }
}

Uso:

User u1 = User.admin();
User u2 = User.regular();

✔ Más claro
✔ Más seguro
✔ Más mantenible

🧠 5. Cuándo usar cada uno
Usa constructor cuando:
La clase es simple
No necesitas lógica especial
No necesitas control de instancias
Usa static factory cuando:
Quieres nombres claros
Quieres reutilizar objetos
Quieres devolver subtipos
Quieres lógica de creación compleja
🧩 6. Idea clave (la más importante)

👉 No es "uno o el otro"

✔ Puedes usar ambos:

public class User {

    public User() {} // constructor simple

    public static User createAdmin() {
        return new User("ADMIN");
    }
}
🚀 Resumen brutal
Constructor = simple pero limitado
Static factory = flexible, potente, más profesional
En código moderno → muchas veces mejor usar static factory