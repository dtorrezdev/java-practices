/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter01.item7;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author DELL
 */
public class MainItem07 {
    public static void main(String[] args) {
        System.out.println("Hello Item07");
        List<String> asList = Arrays.asList("as", "asds", "asds");
        Stack stack = new Stack();
        for (String arg : asList)
            stack.push(arg);

        while (true)
            System.err.println(stack.pop());
        
    }    
}
