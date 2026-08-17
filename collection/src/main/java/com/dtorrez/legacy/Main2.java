package com.dtorrez.legacy;

import java.util.Hashtable;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Hashtable<String, Persona> tabla = new Hashtable<String, Persona>();

        tabla.put("1", new Persona("1", "pepe", 20, 1));
        tabla.put("2", new Persona("2", "maria", 32, 3));
        tabla.put("3", new Persona("3", "carlos", 40, 2));
        tabla.put("4", new Persona("4", "david", 23, 4));

        System.out.println("****************");
        for(String valor : tabla.keySet()) {
            System.out.println(tabla.get(valor));
        }

    }
}
