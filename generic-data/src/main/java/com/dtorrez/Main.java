package com.dtorrez;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
//        ArrayList list = new ArrayList();

        list.add("Hello");
//        list.add(10);
        list.add("World");

        for(String o : list) {
//            String texto = (String) o;
//            System.out.println(o);
            System.out.println(o.toUpperCase());
        }
    }
}
