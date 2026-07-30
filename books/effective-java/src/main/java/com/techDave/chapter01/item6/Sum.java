/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter01.item6;


/**
 *
 * @author DELL
 * Hideously slow program! Can you spot the object creation? (Page 24)
 * Autoboxing (el enemigo silencioso)
 */
public class Sum {
    
    private static long sum() {
        Long sum = 0L;  // Usa Long (objeto) en lugar de long (primitivo)
//        long sum = 0; // good use primitive for long operacions
        // crea millones de objetos Long
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i; // autoboxing brutal, Cada suma crea un nuevo objeto Long
           
        return sum;
    }
    
    public static void main(String[] args) {
        int numSets = Integer.parseInt("10");
        long x = 0;

        for (int i = 0; i < numSets; i++) {
            long start = System.nanoTime();
            x += sum();
            long end = System.nanoTime();
            System.out.println((end - start) / 1_000_000. + " ms.");
        }

        // Prevents VM from optimizing away everything.
        if (x == 42)
            System.out.println();
    }
}
