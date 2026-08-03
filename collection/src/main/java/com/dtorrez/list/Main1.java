package com.dtorrez.list;

import com.dtorrez.set.ComparatorDni;
import com.dtorrez.set.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();

        Persona p1 = new Persona("1", "juan", 23);
        lista.add(p1);
        lista.add(new Persona("2", "david", 20));
        lista.add(new Persona("3", "ana", 25));
        lista.add(new Persona("4", "gema", 30));

        for (Persona p: lista) {
            System.out.println(p.getNombre());
        }

    }
}
