/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter01.item5;

import com.techDave.chapter01.item5.di.SpellChecker;
import com.techDave.chapter01.item5.libraries.EnglishDictionary;
import com.techDave.chapter01.item5.libraries.FakeDictionary;
import com.techDave.chapter01.item5.libraries.SpanishDictionary;

/**
 *
 * @author DELL
 */
public class MainItem5 {
    
    public static void main(String[] args) {
        System.out.println("Hardwiring: acoplado");
        com.techDave.chapter01.item5.hardwiring.SpellChecker spellChecker = 
                new com.techDave.chapter01.item5.hardwiring.SpellChecker();
        
        System.out.println("DI: Flexibilidad");
        // Flexibilidad total
        SpellChecker spellChecker1 = new SpellChecker(new EnglishDictionary());
        SpellChecker spellChecker2 = new SpellChecker(new SpanishDictionary());
        
        System.out.println("DI: Testabilidad");
        // Testabilidad
        SpellChecker spellChecker3 = new SpellChecker(new FakeDictionary());
        //La clase no decide sus dependencias
        
    }
}
