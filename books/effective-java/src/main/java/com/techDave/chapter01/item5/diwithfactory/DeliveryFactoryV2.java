/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter01.item5.diwithfactory;

import java.util.List;

/**
 *
 * @author DELL
 */
public class DeliveryFactoryV2 {
    
    private List<IDelivery> deliveryList;
    
    public DeliveryFactoryV2(List<IDelivery> deliveryList) {
        this.deliveryList = deliveryList;
    }
    
    /*
    - No usas new dentro de la factory
    - Recibes dependencias desde afuera
    - Permites múltiples implementaciones
    - pero tiene un problema de diseño: d instanceof InstantDelivery
    - Esto rompe el principio Open/Closed
      - si agregas otro tipo ? tienes que modificar la factory
    
    */
    public IDelivery getInstance(String mode) {
        switch (mode) {
            case "INSTANCE":
                return deliveryList.stream()
                        .filter(d -> d instanceof InstantDelivery)
                        .findFirst()
                        .orElseThrow(() -> new RuntimeException("InstantDelivery not found"));

            case "SCHEDULED":
                return deliveryList.stream()
                        .filter(d -> d instanceof ScheduledDelivery)
                        .findFirst()
                        .orElseThrow(() -> new RuntimeException("ScheduledDelivery not found"));

            default:
                throw new RuntimeException("Not supported");
        }
    }
    
}
