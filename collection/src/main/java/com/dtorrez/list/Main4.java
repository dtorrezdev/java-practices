package com.dtorrez.list;

import com.dtorrez.set.Persona;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main4 {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();

        Persona p1 = new Persona("1", "juan", 23);
        lista.add(p1);
        lista.add(new Persona("2", "david", 20));
        lista.add(new Persona("3", "ana", 25));
        lista.add(new Persona("4", "gema", 30));

        ListIterator<Persona> listIterator = lista.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next().getNombre());
        }

        System.out.println("***************");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous().getNombre());
        }

    }
}
