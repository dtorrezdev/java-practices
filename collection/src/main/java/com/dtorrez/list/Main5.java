package com.dtorrez.list;

import com.dtorrez.set.ComparatorNombre;
import com.dtorrez.set.Persona;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main5 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.add("tu");
        lista.add("hoy");
        lista.add("pues");
        lista.add("hoy");

        //lista.replaceAll(String::toUpperCase);
        lista.replaceAll((s)->s.toUpperCase());

        for (String texto: lista) {
            System.out.println(texto);
        }

    }
}
