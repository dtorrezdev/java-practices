/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter01.item6;

import java.util.regex.Pattern;

/**
 *
 * @author DELL
 */
public class RomanNumerals {
     
    // Performance can be greatly improved! (Page 22)
    static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }
    
    // Reusing expensive object for improved performance (Page 23)
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeralFast(String s) {
        return ROMAN.matcher(s).matches();
    }
    
    public static void main(String[] args) {
        int numSets = Integer.parseInt("10");
        int numReps = Integer.parseInt("10000000");
        
        boolean b = false;

        for (int i = 0; i < numSets; i++) {
            long start = System.nanoTime();
            for (int j = 0; j < numReps; j++) {
                //b ^= isRomanNumeralSlow("MCMLXXVI");  // Change Slow to Fast to see performance difference
                b ^= isRomanNumeralFast("MCMLXXVI");
            }
            long end = System.nanoTime();
            System.out.println(((end - start) / (1_000. * numReps)) + " ?s.");
        }

        // Prevents VM from optimizing away everything.
        if (!b)
            System.out.println();
    }
}
