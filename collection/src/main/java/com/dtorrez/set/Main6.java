package com.dtorrez.set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main6 {
    /*
    collecion: es un grupo de elemetnos (hay repetido)
    set: un conjunto limita los elementos (no hay repetido) (aplica el metodo hasCode())
      set: hereda de collection interface pero no anade ningun metodo
     la forma de agrupar los Set: es mediante taza (butket)
        lo calcula atraves del hasCode() y hace uso del operador % modulo, va agrupando por multiplos comunes (en listas)
           - butcket: o taza se van generando segun llega los elemento y usando el hasCode() y operador modulo
            https://cursos.arquitecturajava.com/courses/1997283/lectures/45143938

    - SortedSet:


    */
    public static void main(String[] args) {
        System.out.println("Main6");
        ComparatorDni comparatorDni = new ComparatorDni();
        SortedSet<Persona> conjunto = new TreeSet<>(comparatorDni);

        Persona p1 = new Persona("1", "juan", 23);
        conjunto.add(p1);
        conjunto.add(new Persona("2", "david", 20));
        conjunto.add(new Persona("3", "ana", 25));
        conjunto.add(new Persona("4", "gema", 30));

        System.out.println(conjunto.first());
        System.out.println(conjunto.last());
        System.out.println("**********************");
        //for (Persona texto: conjunto) {
//        for (Persona texto: conjunto.tailSet(new Persona("2"))) {
        for (Persona texto: conjunto.headSet(new Persona("3"))) {
                System.out.println(texto.getNombre());
        }
    }
}
