/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter01.item5.moderno;

import com.techDave.chapter01.item5.diwithfactory.IDelivery;
import com.techDave.chapter01.item5.diwithfactory.InstantDelivery;
import com.techDave.chapter01.item5.diwithfactory.ScheduledDelivery;
import java.util.Map;
import java.util.function.Supplier;

/**
 *
 * @author DELL
 */
public class DeliveryFactory {
    private final Map<String, Supplier<IDelivery>> factoryMap;

    public DeliveryFactory(Map<String, Supplier<IDelivery>> factoryMap) {
        this.factoryMap = factoryMap;
    }

    public IDelivery getInstance(String mode) {
        Supplier<IDelivery> supplier = factoryMap.get(mode);

        if (supplier == null) {
            throw new RuntimeException("Not supported");
        }

        return supplier.get();
    }
    
    public static void main(String[] args) {
        Map<String, Supplier<IDelivery>> map = Map.of(
            "INSTANCE", InstantDelivery::new,
            "SCHEDULED", ScheduledDelivery::new
        );

        DeliveryFactory factory = new DeliveryFactory(map);

        IDelivery d = factory.getInstance("INSTANCE");
    }
}
