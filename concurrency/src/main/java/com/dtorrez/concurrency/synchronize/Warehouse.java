package com.dtorrez.concurrency.synchronize;

class Warehouse {

    private int stock = 100;

    private final Object stockLock = new Object();

    public void addStock(int amount) {

        synchronized (stockLock) {
            stock += amount;
        }
    }

    public boolean removeStock(int amount) {

        synchronized (stockLock) {

            if (stock >= amount) {
                stock -= amount;
                return true;
            }

            return false;
        }
    }

    public int getStock() {

        synchronized (stockLock) {
            return stock;
        }
    }
}