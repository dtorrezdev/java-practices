package com.dtorrez.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main5 {

    public static void main(String[] args) {
        System.out.println("Main5");
        Collection<Persona> lista = new ArrayList<>();
        Persona p1 = new Persona("1", "Juan", 23);
        lista.add(p1);
        lista.add(new Persona("2", "david", 20));
        lista.add(new Persona("3", "ana", 25));
        lista.add(new Persona("4", "gema", 30));

        // la busqueda de contains funciona una vez el Obj persona implementa o override equals y hascode
        System.out.println(lista.contains(p1));
        System.out.println(lista.contains(new Persona("6")));
        System.out.println(lista.contains(new Persona("2")));

        System.out.println(lista.containsAll(List.of("1","2")));
        System.out.println(lista.containsAll(List.of("1","2", "7")));

    }
}
