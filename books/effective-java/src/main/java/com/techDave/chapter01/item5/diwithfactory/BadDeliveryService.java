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
public class BadDeliveryService {
    
    private final InstantDelivery instantDelivery;
    private final ScheduledDelivery scheduledDelivery;
    
    public BadDeliveryService(InstantDelivery instantDelivery, ScheduledDelivery scheduledDelivery) {
        this.instantDelivery = instantDelivery;
        this.scheduledDelivery = scheduledDelivery;
    }
    
    /*
      - you will need to know the dependency of each class, 
        in which it might get tedious to create an object.
      - unit testing for BadDeliveryService class is much harder 
        to construct as DeliveryFactory will not be mockable.
    */
    public void processOrder(String mode) {
        switch(mode) {
          case  "INSTANCE": 
              System.out.println("DeliveryService processOrder INSTANCE");
              instantDelivery.createOrder();
              break;
          case "SCHEDULED": 
              System.out.println("DeliveryService processOrder SCHEDULED");
              scheduledDelivery.createOrder();
              break;
          default:
              throw new RuntimeException("Not supported mode " + mode);
        } 
    }
    
}
