package com.dtorrez.legacy;

import java.util.Stack;
import java.util.Vector;

public class Main1 {
    public static void main(String[] args) {
        Stack<String> p = new Stack<>();

        p.add("hola");
        p.add("que");
        p.add("tal");
        p.add("estas");
        p.add("hoy");
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println("****************");
        for(String valor : p) {
            System.out.println(valor);
        }

    }
}
