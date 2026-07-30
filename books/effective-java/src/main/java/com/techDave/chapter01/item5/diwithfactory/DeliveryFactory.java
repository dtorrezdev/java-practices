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
public class DeliveryFactory {
    
    private DeliveryFactory() {
        throw new AssertionError();
    }
    
    public static IDelivery getInstance(String mode) throws Exception {
        switch(mode) {
          case  "INSTANCE": 
              System.out.println("DeliveryService processOrder INSTANCE");
              return new InstantDelivery();              
          case "SCHEDULED": 
              System.out.println("DeliveryService processOrder SCHEDULED");
              return new ScheduledDelivery(new Scheduler());              
          default:
              throw new Exception("Not supported mode " + mode);
        } 
    }    
}
