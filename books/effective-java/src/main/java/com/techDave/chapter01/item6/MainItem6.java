/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter01.item6;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class MainItem6 {
    
    public static void main(String[] args) {
        
        System.out.println("Hello MainItem6");
        // 1. Reutilización e Inmutabilidad
        String s1 = new String("hola"); // bad
        String s2 = "hola"; // good
        
        // Bad ------
        String sum1 = "";
        for (int i = 0; i < 1000; i++) {
            sum1 += i;  // Crea un nuevo StringBuilder y un nuevo String en cada iteración
        }
        //Cada += crea un nuevo objeto String
        
        // Good -------
        StringBuilder sum2 = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sum2.append(i);
        }
        String result = sum2.toString();
        
        // 2. Usa métodos de fábrica estáticos en lugar de constructores
      
        Integer numero1 = new Integer(5);  // bad: Obsoleto, pero ilustra el punto
        Integer numero2 = Integer.valueOf(5); // Good: reutiliza instancias del Integer cache
        
        BigDecimal total1 = new BigDecimal("0"); // bad
        BigDecimal total2 = BigDecimal.ZERO; // good
        // Bad impacto en loop grande
        for (int i = 0; i < 1_000_000; i++) {
            Integer x = new Integer(i); // MAL
        }
        
        // Cuándo NO reutilizar objetos
        // No reutilices objetos mutables si su estado debe ser diferente.
        Date inicio = new Date();
        // ... pasa el tiempo
        inicio.setYear(2025); // ¡Peligro! Estás mutando un objeto que quizás otro código usa
        
        //-- Bad
        Date date = new Date();
        //return date; // expones objeto mutable
        
        // Good
        //return new Date(date.getTime());
        
    }
    
}
