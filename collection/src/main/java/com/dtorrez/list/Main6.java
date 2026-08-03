package com.dtorrez.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.add("tu");
        lista.add("hoy");
        lista.add("pues");
        lista.add("hoy");



        for (String texto: lista) {
            System.out.println(texto);
        }

    }
}
