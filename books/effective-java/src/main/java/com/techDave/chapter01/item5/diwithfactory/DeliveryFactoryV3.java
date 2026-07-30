/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter01.item5.diwithfactory;

import java.util.Map;

/**
 *
 * @author DELL
 */
public class DeliveryFactoryV3 {
    private final Map<String, IDelivery> deliveryMap;

    public DeliveryFactoryV3(Map<String, IDelivery> deliveryMap) {
        this.deliveryMap = deliveryMap;
    }
    /*
    - No usa instanceof
    - menos acoplamiento
    - Más alineado con DI moderno
    */
    public IDelivery getInstance(String mode) {
        IDelivery delivery = deliveryMap.get(mode);
        
        if (delivery == null) {
            throw new RuntimeException("Not supported");
        }

        return delivery;
    }
}
