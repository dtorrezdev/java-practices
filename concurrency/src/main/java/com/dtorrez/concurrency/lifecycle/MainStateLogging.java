package com.dtorrez.concurrency.lifecycle;

public class MainStateLogging {

    public static void log(Thread thread) {
        System.out.printf(
                "%s -> %s%n",
                thread.getName(),
                thread.getState()
        );
    }

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Worker-1");

        log(worker);

        worker.start();

        log(worker);

        Thread.sleep(500);

        log(worker);

        worker.join();

        log(worker);
    }

}
