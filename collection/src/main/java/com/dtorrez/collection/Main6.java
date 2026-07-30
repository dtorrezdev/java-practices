package com.dtorrez.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main6 {

    public static void main(String[] args) {
        System.out.println("Main6");
        Collection<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");

        lista.retainAll(List.of("Hola", "que"));


        for(String texto: lista){
            System.out.println(texto);
        }
    }
}
