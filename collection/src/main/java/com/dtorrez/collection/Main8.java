package com.dtorrez.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Main8 {

    public static void main(String[] args) {
        System.out.println("Main8");
        Collection<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.removeIf(s -> s.equals("Hola"));
        lista.stream().forEach(System.out::println);

    }
}
