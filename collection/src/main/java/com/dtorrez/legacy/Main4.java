package com.dtorrez.legacy;

import java.util.Hashtable;

public class Main4 {
    public static void main(String[] args) {
        String[] lista = new String[]{"hola", "que", "tal", "estas", "hoy"};

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        System.out.println("*****************");
        for (String cadena : lista) {
            System.out.println(cadena);
        }
    }
}
