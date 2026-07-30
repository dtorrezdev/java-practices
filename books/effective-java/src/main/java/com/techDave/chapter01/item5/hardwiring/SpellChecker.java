/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter01.item5.hardwiring;

import com.techDave.chapter01.item5.libraries.Dictionary;

public class SpellChecker {
    // mal disenio: acoplamiento fuerte
    private static final Dictionary dictionary = new Dictionary();
    public SpellChecker() {
        System.out.println("(HC) construct SpellChecker ");
        
    }

    public boolean isValid(String word) {
        System.out.println("(HC ) SpellChecker isValid");
        return dictionary.contains(word);
    }
}
