package com.dtorrez.concurrency.lifecycle;

public class MainTrafficLight {

    public static void main(String[] args) throws InterruptedException {

        Thread northSouth = new Thread(
                new TrafficLight("North-South")
        );

        Thread eastWest = new Thread(
                new TrafficLight("East-West")
        );
        System.out.println(" state - northSouth: " + northSouth.getState());
        System.out.println(" state - eastWest: " + eastWest.getState());
        northSouth.start();
        eastWest.start();
        System.out.println(" state - northSouth: " + northSouth.getState());
        System.out.println(" state - eastWest: " + eastWest.getState());

        Thread.sleep(10000);
        System.out.println(" state - northSouth: " + northSouth.getState());
        System.out.println(" state - eastWest: " + eastWest.getState());
        northSouth.interrupt();
        eastWest.interrupt();

        System.out.println(" state - northSouth: " + northSouth.getState());
        System.out.println(" state - eastWest: " + eastWest.getState());
    }

}
