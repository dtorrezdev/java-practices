package com.dtorrez.curiosidades;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> v = List.of("hola", "que", "tal", "estas", "hoy");

        for (String value : v) {
            System.out.println(value);
        }
    }
}
