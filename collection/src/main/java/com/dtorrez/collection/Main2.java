package com.dtorrez.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("Main2");
        Collection<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.remove("Hola");

        for(String texto: lista){
            System.out.println(texto);
        }
    }
}
