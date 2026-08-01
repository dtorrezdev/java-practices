package com.dtorrez.concurrency.lifecycle;

import com.dtorrez.concurrency.HelloThread;
import com.dtorrez.concurrency.RunnableDemo;
import com.dtorrez.concurrency.synchronize.SynchronizedDemo;

public class MainLifeCycle {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new RunnableDemo("Thread-1"));
        HelloThread t2 = new HelloThread("Thread-2");
        // The Join Method
        // This ensures that t1 only starts running after t2 is done
        t2.start();
        t2.join();// Wait for t2 to finish
        t1.start();

        // BLOCKED State
        System.out.println("*********BLOCKED STATE********");
        SynchronizedDemo demo = new SynchronizedDemo();

        Runnable task = () -> {
            demo.printMessage("Hello from " + Thread.currentThread().getName());
        };

        t1 = new Thread(task, "Thread-1");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t3.start();
        // When t1 is executing this method, t3 will enter the BLOCKED state,
        // waiting for t1 to finish before it can execute the same method.
    }
}
