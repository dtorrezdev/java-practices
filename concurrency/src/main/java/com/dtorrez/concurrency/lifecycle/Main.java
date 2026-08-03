package com.dtorrez.concurrency.lifecycle;

public class Main {

    public static void main(String[] args) throws Exception {

        Thread worker = new Thread(() -> {
            System.out.println("Worker thread is running.");
            try {
                Thread.sleep(2000); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Worker thread was interrupted.");
            }

        });

        System.out.println(worker.getState());
        worker.start();
        System.out.println(worker.getState());
        Thread.sleep(500);
        System.out.println(worker.getState());
        worker.join();
        System.out.println(worker.getState());

    }
}
