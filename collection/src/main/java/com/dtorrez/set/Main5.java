package com.dtorrez.set;

import java.util.*;

public class Main5 {
    /*
    collecion: es un grupo de elemetnos (hay repetido)
    set: un conjunto limita los elementos (no hay repetido) (aplica el metodo hasCode())
      set: hereda de collection interface pero no anade ningun metodo
     la forma de agrupar los Set: es mediante taza (butket)
        lo calcula atraves del hasCode() y hace uso del operador % modulo, va agrupando por multiplos comunes (en listas)
           - butcket: o taza se van generando segun llega los elemento y usando el hasCode() y operador modulo
            https://cursos.arquitecturajava.com/courses/1997283/lectures/45143938
    */
    public static void main(String[] args) {
        System.out.println("Main5");
//        Collection<String> lista = new ArrayList<>();
//        Set<Persona> lista = new TreeSet<>(new ComparatorNombre());
        Set<Persona> lista = new TreeSet<>(new ComparatorDni());

        Persona p1 = new Persona("1", "juan", 23);
        lista.add(p1);
        lista.add(new Persona("2", "david", 20));
        lista.add(new Persona("3", "ana", 25));
        lista.add(new Persona("4", "gema", 30));

        for (Persona texto: lista) {
            System.out.println(texto.getNombre());
        }
    }
}
