package com.dtorrez.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {
        HashMap<String, Persona> mapa = new HashMap<>();

        mapa.put("1", new Persona("1", "pepe", 20, 1));
        mapa.put("2", new Persona("2", "maria", 32, 3));
        mapa.put("3", new Persona("3", "carlos", 40, 2));
        mapa.put("4", new Persona("4", "david", 23, 4));

        Set<Map.Entry<String,Persona>> entradas = mapa.entrySet();

        for (Map.Entry<String,Persona> e : entradas) {
            System.out.println(e.getKey());
            System.out.println(e.getValue().getNombre());
        }
    }
}
