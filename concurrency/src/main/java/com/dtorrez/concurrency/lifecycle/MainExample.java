package com.dtorrez.concurrency.lifecycle;

public class MainExample {

    public static void main(String[] args) {
        /*
        Puede que observes que metrics recibe más tiempo de CPU,
        pero no es un comportamiento garantizado.
        */
        Thread metrics = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Saving metrics " + i);
            }
        });

        Thread reports = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Generating report " + i);
            }
        });

        metrics.setPriority(Thread.MAX_PRIORITY);
        reports.setPriority(Thread.MIN_PRIORITY);

        metrics.start();
        reports.start();
    }
}
