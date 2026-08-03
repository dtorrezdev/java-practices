package com.dtorrez.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Hola");
        queue.offer("que");
        queue.offer("tal");
        queue.offer("estas");
        queue.offer("tu");
        queue.offer("hoy");
        queue.offer("pues");
        queue.offer("hoy");
        System.out.println(queue.peek());
        System.out.println("********");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
