/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter01.item3;

import com.techDave.chapter01.item3.enumtype.Elvis;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author DELL
 */
public class MainItem3 {
    
    public static void main(String[] args) {
        // This code would normally appear outside the class!
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
        
        com.techDave.chapter01.item3.field.Elvis elvis2 = com.techDave.chapter01.item3.field.Elvis.INSTANCE;
        elvis2.leaveTheBuilding();
        // problema 
        try {
            Constructor<Elvis> c = Elvis.class.getDeclaredConstructor();
            c.setAccessible(true);
            Elvis otro = c.newInstance();
            otro.leaveTheBuilding();
        } catch(NoSuchMethodException | SecurityException ex) {
            ex.printStackTrace();            
        } catch (InstantiationException | IllegalAccessException |
               IllegalArgumentException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
        
        
        com.techDave.chapter01.item3.staticfactory.Elvis elvis3 = 
                com.techDave.chapter01.item3.staticfactory.Elvis.getInstance();
        elvis3.leaveTheBuilding();
    }
    
}
