package com.dtorrez.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        Queue<Persona> queue = new PriorityQueue<>(new ComparatorPersonaGravedad());
        queue.offer(new Persona("4", "Maria", 40,5));
        queue.offer(new Persona("1", "Pedro", 20,1));
        queue.offer(new Persona("2", "Juan", 20,1));
        queue.offer(new Persona("3", "Ana", 30,2));
        queue.offer(new Persona("5", "Gema", 50,3));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());



    }
}
