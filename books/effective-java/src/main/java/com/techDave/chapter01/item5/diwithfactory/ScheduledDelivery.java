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
public class ScheduledDelivery implements IDelivery {
    
    private final Scheduler scheduler;
    
    public ScheduledDelivery(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    public void createOrder() {
        if(this.scheduler.check()) {
            System.out.println("ScheduledDelivery createOrder");
        }        
    }
    
}
