package com.dtorrez.concurrency.lifecycle;

import com.dtorrez.concurrency.RunnableDemo;

public class MainThreadPriority {

    public static void main(String[] args) {

        Thread t1 = new Thread(new RunnableDemo("High Priority Thread"));
        t1.setPriority(Thread.MAX_PRIORITY);

        Thread t2 = new Thread(new RunnableDemo("Normal Priority Thread"));
        t2.setPriority(Thread.NORM_PRIORITY);

        Thread t3 = new Thread(new RunnableDemo("Low Priority Thread"));
        t3.setPriority(Thread.MIN_PRIORITY);

        t2.start();
        t3.start();
        t1.start();
    }

}
