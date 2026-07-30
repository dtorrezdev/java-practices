package com.dtorrez.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main7 {

    public static void main(String[] args) {
        System.out.println("Main7");
        Collection<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");

        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        lista.clear();
        System.out.println(lista.isEmpty());
    }
}
