package com.dtorrez.curiosidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        List<String> lista = List.of("hola", "que", "tal", "estas", "hoy");
        List<String> lista3 = new ArrayList<>(lista);

        for (String value : lista) {
            System.out.println(value);
        }

        System.out.println("***********************");
        List<String> lista2 = Collections.emptyList();

        for (String value : lista2) {
            System.out.println(value);
        }

        Collections.reverse(lista3);

        for (String value : lista3) {
            System.out.println(value);
        }

        System.out.println("***********************");

        Collections.shuffle(lista3);

        for (String value : lista3) {
            System.out.println(value);
        }
        System.out.println("*****************");
        System.out.println(Collections.max(lista3));
        System.out.println(Collections.min(lista3));
        System.out.println("*****************");
        Collections.sort(lista3);
        for (String value : lista3) {
            System.out.println(value);
        }
    }
}
