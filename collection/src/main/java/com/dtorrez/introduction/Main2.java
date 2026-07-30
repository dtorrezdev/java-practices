package com.dtorrez.introduction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("Hello Main2");
        //List<String> lista = new ArrayList<>();
        Collection<String> lista = new ArrayList<>();
        // Iterable<String> lista2 = new ArrayList<>(); // es compatible pero no tiene metodo add
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");

        Iterator<String> iterator = lista.iterator();
        while(iterator.hasNext()) {
            String cadena =  iterator.next();
            if(cadena.equals("Hola")) {
                iterator.remove();
            }
            System.out.println(cadena);
        }

        System.out.println("***************");
        Iterator<String> iterator2 = lista.iterator();
        while(iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
