package com.dtorrez.concurrency.synchronize;

public class BankAccount {
    private double balance;
    private final Object balanceLock = new Object();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double amount) {

        if (amount <= 0) {
            return false;
        }

        synchronized (balanceLock) {
            if (balance >= amount) {
                balance -= amount;
                return true;
            }
        }
        // Ahora el lock está explícitamente relacionado con el estado que protege.
        // mejora bastante la legibilidad.

        return false;
    }
    // para garantizar una relación consistente entre acceso y sincronización
    // Debes identificar qué estado necesita protección y quién lo modifica.
    public synchronized double getBalance() {
        return balance;
    }

    /*
    Preguntas que deberías poder responder:
    ¿Cuál es el shared mutable state?
    ¿Cuál es la critical section?
    ¿Dónde está la race condition?
    ¿Por qué balance -= amount no es el único problema?
    ¿Cómo lo solucionarías con synchronized?
    ¿Por qué volatile no solucionaría este problema?
    ¿Qué podría ocurrir si sincronizas solamente balance -= amount pero no el if?

    Si puedes responder esas 7 preguntas, ya estás empezando a pensar en concurrencia como developer,
    */
}
