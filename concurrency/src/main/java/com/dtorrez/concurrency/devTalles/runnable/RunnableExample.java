package com.dtorrez.concurrency.devTalles.runnable;

public class RunnableExample implements Runnable {
    private String name;

    public RunnableExample(String name) {this.name = name;}

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " Mensaje: " + i + " Ejecutando en: " + Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableExample("T1"));
        Thread t2 = new Thread(new RunnableExample("T2"));
    }
}
