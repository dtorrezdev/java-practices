package com.dtorrez.concurrency.devTalles.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadVsExecutor {
    public static void main(String[] args) {
        System.out.println("Con Thread---------------");
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                System.out.println("Tarea A Thread " + Thread.currentThread().getName());
            });
            thread.start();
        }
        System.out.println("Con Executor---------------");
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                System.out.println("Tarea A Executor " + Thread.currentThread().getName());
            });
            thread.start();

        }
        executor.shutdown();
    }
}
