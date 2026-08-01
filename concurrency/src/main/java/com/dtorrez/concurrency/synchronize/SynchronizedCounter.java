package com.dtorrez.concurrency.synchronize;

public class SynchronizedCounter {
    private int count = 0;

    // Adding synchronized to prevent issues
    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
