package com.dtorrez.queue;

import java.util.Deque;
import java.util.LinkedList;



public class Main3 {
    public static void main(String[] args) {
        Deque<Persona> pila = new LinkedList<>();
        pila.offerFirst(new Persona("4", "Maria", 40,5));
        pila.offerFirst(new Persona("1", "Pedro", 20,1));
        pila.offerFirst(new Persona("2", "Juan", 20,1));
        pila.offerFirst(new Persona("3", "Ana", 30,2));
        pila.offerFirst(new Persona("5", "Gema", 50,3));

        System.out.println(pila.pollFirst());
        System.out.println(pila.pollFirst());
        System.out.println(pila.pollFirst());
        System.out.println(pila.pollFirst());
        System.out.println(pila.pollFirst());
    }
}
