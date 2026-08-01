package com.dtorrez.concurrency;

public class HelloThread extends Thread {

    public HelloThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000); // Sleep for 1 second
            System.out.println("Hello from a Thread: " + this.getName());
            // When this method ends, the thread will be TERMINATED
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
