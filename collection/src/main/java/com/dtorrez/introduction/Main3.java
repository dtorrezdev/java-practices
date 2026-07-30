package com.dtorrez.introduction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Main3");

        Collection<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");

        Stream<String> flujo = lista.stream();

        flujo.forEach(e -> System.out.println(e));
        System.out.println("**************");
        flujo = lista.stream();
        // atraves de la referencia de metodo
        flujo.forEach(System.out::println);
    }
}
