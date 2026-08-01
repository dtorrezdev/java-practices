package com.dtorrez.concurrency.synchronize;

public class SynchronizedDemo {
    // This keyword makes sure that only one thread can access this method at a time,
    // ensuring thread safety for operations within the method
    public synchronized void printMessage(String message) {
        System.out.println(message);
    }
}
