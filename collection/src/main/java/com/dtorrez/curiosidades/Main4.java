package com.dtorrez.curiosidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        Collections.addAll(lista, "hola", "que", "tal", "estas", "hoy");

        int contador = 0;
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            contador++;
            System.out.println(iterator.next());
            if(contador == 1) {
                break;
            }
        }
        // iterador queda a media, y se necesitar procesar el resto
        iterator.forEachRemaining(
                (s) -> System.out.println(s.toUpperCase())
        );

    }
}
