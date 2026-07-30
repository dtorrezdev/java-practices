package com.dtorrez.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Main4 {

    public static void main(String[] args) {
        System.out.println("Main4");
        Collection<Persona> lista = new ArrayList<>();
        Persona p1 = new Persona("1", "Juan", 23);
        lista.add(p1);
        lista.add(new Persona("2", "david", 20));
        lista.add(new Persona("3", "ana", 25));
        lista.add(new Persona("4", "gema", 30));


        //lista.remove(new Persona("1", "Juan", 23));// no va funcionar Objetos en memoria diferentes
        // lista.remove(p1); //eliminando con el mismo objeto en memoria
        // eliminando una vez el Obj persona implementa o override equals y hascode
        lista.remove(new Persona("2"));

        for (Persona persona : lista) {
            System.out.println(persona);
        }

    }
}
