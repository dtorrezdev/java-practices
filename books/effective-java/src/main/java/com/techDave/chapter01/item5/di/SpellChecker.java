/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter01.item5.di;

import com.techDave.chapter01.item5.libraries.Dictionary;

/**
 *
 * @author DELL
 */
public class SpellChecker {
    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        System.out.println("(DI ) construct SpellChecker ");
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        System.out.println("(DI )SpellChecker  isValid");
        return dictionary.contains(word);
    }
    
}
