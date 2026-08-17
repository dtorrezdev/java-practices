package com.dtorrez.curiosidades;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        String[] lista = new String[]{"hola", "que", "tal", "estas", "hoy"};

        Stream<String> stream = Arrays.stream(lista);

        stream.forEach(System.out::println);
        System.out.println("******************");
        Arrays.sort(lista);
        for (String value : lista) {
            System.out.println(value);
        }
        System.out.println(Arrays.toString(lista));
        System.out.println(Arrays.binarySearch(lista, "que"));
        List<String> nuevaLista = Arrays.asList("hola", "que", "tal", "estas", "hoy");
    }
}
