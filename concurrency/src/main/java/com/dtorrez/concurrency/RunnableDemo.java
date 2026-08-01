package com.dtorrez.concurrency;

public class RunnableDemo implements Runnable {
    private String threadName;

    public RunnableDemo(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        // When this method ends, the thread will be TERMINATED
    }
}
