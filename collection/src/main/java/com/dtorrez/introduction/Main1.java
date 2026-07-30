package com.dtorrez.introduction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("Hello Main1");
        //List<String> lista = new ArrayList<>();
        Collection<String> lista = new ArrayList<>();
        // Iterable<String> lista2 = new ArrayList<>(); // es compatible pero no tiene metodo add
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");

        Iterable<String> iterable = lista;
        // nos devuelve un iterador
        Iterator<String> iterator = iterable.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*************");
        for(String cadena: lista){
            System.out.println(cadena);

        }


    }
}
