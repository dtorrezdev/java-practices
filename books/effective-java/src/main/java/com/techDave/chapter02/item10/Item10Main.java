/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter02.item10;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class Item10Main {

    public static void main(String[] args) {
        // 
        String a = new String("hola");
        String b = new String("hola");

        System.out.println(a == b);      // false
        System.out.println(a.equals(b)); // trueString a = new String("hola");

        // Dos objetos distintos representan el mismo valor conceptual.
        Money m1 = new Money(10, "USD");
        Money m2 = new Money(10, "USD");
        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));

        // Asimetria ROTA
        CaseInsensitiveString cis = new CaseInsensitiveString("java");

        String s = "JAVA";

        cis.equals(s); // true
        s.equals(cis); // false

        ////
        
        Set<User> users = new HashSet<>();

        users.add(new User("Juan"));

//        users.contains(new User("Juan")); // false
        System.out.println("contains: " + users.contains(new User("Juan")));
    }

}

class Money {

    private Integer monto;
    private String moneda;

    public Money(Integer monto, String moneda) {
        this.monto = monto;
        this.moneda = moneda;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 31 * hash + Objects.hashCode(this.monto);
//        hash = 31 * hash + Objects.hashCode(this.moneda);
//        return hash;
//    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Money other = (Money) obj;
//        if (!Objects.equals(this.moneda, other.moneda)) {
//            return false;
//        }
//        if (!Objects.equals(this.monto, other.monto)) {
//            return false;
//        }
//        return true;
//    }
}

class CaseInsensitiveString {

    private String s;

    public CaseInsensitiveString(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof String) {
            return s.equalsIgnoreCase((String) o);
        }

        if (o instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(
                    ((CaseInsensitiveString) o).s);
        }

        return false;
    }
}

class User {

    String name;
    int age;

    public User(String name) {
        this.name = name;
    }
    
    

//    @Override
//    public boolean equals(Object o) {
//
//        if (this == o) {
//            return true;
//        }
//
//        if (!(o instanceof User)) {
//            return false;
//        }
//
//        User other = (User) o;
//
//        return age == other.age
//                && Objects.equals(name, other.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(this.name, this.age);
//    }

}
