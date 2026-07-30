package com.dtorrez.set;

import java.util.ArrayList;
import java.util.Collection;

public class Main1 {
    /*
    collecion: es un grupo de elemetnos (hay repetido)
    set: un conjunto limita los elementos (no hay repetido) (aplica el metodo hasCode())
      set: hereda de collection interface pero no anade ningun metodo
    */
    public static void main(String[] args) {
        System.out.println("Main1");
        Collection<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.add("tu");
        lista.add("hoy");
        lista.add("hola");
        lista.add("hoy");

        for (String texto: lista) {
            System.out.println(texto);
        }

    }
}
