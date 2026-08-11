package com.dtorrez.concurrency.synchronize;

public class SynchronizedCounter {
    private int count = 0;

    // Adding synchronized to prevent issues
    // Adquiere un monitor antes de entrar a una región crítica y libéralo al salir.
    public synchronized void increment() {
        count++; // Critical Section
    }

    public synchronized int getCount() {
        return count;
    }
}
