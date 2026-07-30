/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter01.item5.moderno;

import com.techDave.chapter01.item5.libraries.Dictionary;
import java.util.function.Supplier;

/**
 *
 * @author DELL
 */
public class SpellChecker {
    private final Dictionary dictionary;

    public SpellChecker(Supplier<? extends Dictionary> factory) {
        this.dictionary = factory.get();
    }
}
