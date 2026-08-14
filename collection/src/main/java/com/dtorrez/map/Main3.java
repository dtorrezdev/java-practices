package com.dtorrez.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main3 {

    public static void main(String[] args) {
        Map<String, Persona> mapa = new TreeMap<>();

        mapa.put("1", new Persona("1", "pepe", 20, 1));
        mapa.put("4", new Persona("4", "maria", 32, 3));
        mapa.put("2", new Persona("2", "carlos", 40, 2));
        mapa.put("3", new Persona("3", "david", 23, 4));

        Set<Map.Entry<String,Persona>> entradas = mapa.entrySet();

        for (Map.Entry<String,Persona> e : entradas) {
            System.out.println(e.getKey());
            System.out.println(e.getValue().getNombre());
        }
    }
}
