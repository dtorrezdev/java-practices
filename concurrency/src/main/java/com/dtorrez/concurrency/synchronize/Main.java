package com.dtorrez.concurrency.synchronize;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        SynchronizedCounter counter = new SynchronizedCounter();
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) counter.increment();
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) counter.increment();
//        });
//
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//
//        System.out.println("Final count with synchronization: " + counter.getCount());

        Counter counter1 = new Counter();
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter1.increment();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter1.increment();
            }
        });

        t3.start();
        t4.start();

        t3.join();
        t4.join();
        /*  Pero sin sincronización puedes obtener algo menor.
            No necesariamente ocurrirá siempre.
            Ese es precisamente uno de los problemas de concurrencia:
            El bug puede aparecer unas veces y otras no.
        */
        System.out.println(counter1.getCount());
    }
}
