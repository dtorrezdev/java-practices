package com.dtorrez.list;

import com.dtorrez.set.Persona;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();

        Persona p1 = new Persona("1", "juan", 23);
        lista.add(p1);
        lista.add(new Persona("2", "david", 20));
        lista.add(new Persona("3", "ana", 25));
        lista.add(new Persona("4", "gema", 30));

        lista.add(2, new Persona("5", "miguel", 22));
        lista.add(2, new Persona("6", "laura", 20));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre() + " pos: " + i);
        }
        lista.remove(4);
        System.out.println("*********************");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre() + " pos: " + i);
        }

    }
}
