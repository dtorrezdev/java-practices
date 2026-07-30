package com.dtorrez.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("Main1");
        Collection<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        Collection<String> lista2 = new ArrayList<>();
        lista2.add("nuevo");
        lista2.add("nuevo2");
        lista2.add("nuevo3");
        lista2.add("nuevo4");

        lista.addAll(lista2);

        for(String texto: lista){
            System.out.println(texto);
        }
    }
}
