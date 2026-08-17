package com.dtorrez.legacy;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("hola");
        v.add("que");
        v.add("tal");
        v.add("estas");
        v.add("hoy");

        for(String valor : v) {
            System.out.println(valor);
        }

    }
}
