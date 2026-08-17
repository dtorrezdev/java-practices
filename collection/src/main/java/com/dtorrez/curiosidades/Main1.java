package com.dtorrez.curiosidades;

import java.util.List;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("hola",1, "que", 2,"tal", 3,"estas", 4, "hoy", 5);

        for (String value : map.keySet()) {
            System.out.println(map.get(value));
        }
    }
}
