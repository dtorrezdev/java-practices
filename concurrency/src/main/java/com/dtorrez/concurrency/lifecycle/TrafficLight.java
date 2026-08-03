package com.dtorrez.concurrency.lifecycle;

public class TrafficLight implements Runnable {

    private final String direction;

    TrafficLight(String direction) {
        this.direction = direction;
    }

    @Override
    public void run() {
        try {

            while (true) {

                System.out.println(direction + " GREEN" + " state " + Thread.currentThread().getState());
                Thread.sleep(3000);

                System.out.println(direction + " YELLOW" + " state " + Thread.currentThread().getState());
                Thread.sleep(1000);

                System.out.println(direction + " RED" + " state " + Thread.currentThread().getState());
                Thread.sleep(3000);

            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(direction + " stopped.");
        }
    }
}
