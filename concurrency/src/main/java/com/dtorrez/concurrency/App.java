package com.dtorrez.concurrency;

public class App {

    public static void main(String[] args) {
        // share the same memory space, making inter-thread
        // communication simpler and more efficient.
        /*
        - Advantage: Simplifies threading for small programs by
           directly embedding thread capabilities.
        - Disadvantage: Limits inheritance due to Java's single
           inheritance rule, reducing flexibility.
        */
        HelloThread t1 = new HelloThread("T1");
        t1.start(); // Creates a new thread of execution

        /*
        Advantage: Offers flexibility by allowing the class
           to extend another class, and provides cleaner separation
           of thread execution and class logic.
        Disadvantage: Slightly more complex setup, requiring a separate
           Thread object for execution.
        */

        Thread t2 = new Thread(new RunnableDemo("Thread-1"));
        t2.start(); // Creates a new thread of execution
    }
}
