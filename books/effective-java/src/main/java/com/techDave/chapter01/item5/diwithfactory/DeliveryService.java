/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter01.item5.diwithfactory;

/**
 *
 * @author DELL
 */
public class DeliveryService {
    
    public void processOrder(String mode) throws Exception {        
        IDelivery instance = DeliveryFactory.getInstance(mode);        
        instance.createOrder();
    }
    
}
