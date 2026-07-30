package com.dtorrez.set;

import java.util.Set;
import java.util.TreeSet;

public class Main4 {
    /*
    collecion: es un grupo de elemetnos (hay repetido)
    set: un conjunto limita los elementos (no hay repetido) (aplica el metodo hasCode())
      set: hereda de collection interface pero no anade ningun metodo
     la forma de agrupar los Set: es mediante taza (butket)
        lo calcula atraves del hasCode() y hace uso del operador % modulo, va agrupando por multiplos comunes (en listas)
           - butcket: o taza se van generando segun llega los elemento y usando el hasCode() y operador modulo
            https://cursos.arquitecturajava.com/courses/1997283/lectures/45143938

       - TreeSet:  Es un conjunto de elemento que sigue un orden

    */
    public static void main(String[] args) {
        System.out.println("Main1");
//        Collection<String> lista = new ArrayList<>();
        Set<String> lista = new TreeSet<String>();
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.add("tu");
        lista.add("hoy");
        // no se agrega en un conjunto valores repetido
        lista.add("pues");
        lista.add("hoy");


        for (String texto: lista) {
            System.out.println(texto);
        }

    }
}
