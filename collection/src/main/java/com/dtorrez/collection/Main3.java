package com.dtorrez.collection;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        System.out.println("Main3");
        Collection<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.removeAll(Arrays.asList("que", "tal"));
        lista.removeAll(List.of("que", "tal"));

        for(String texto: lista){
            System.out.println(texto);
        }
    }
}
