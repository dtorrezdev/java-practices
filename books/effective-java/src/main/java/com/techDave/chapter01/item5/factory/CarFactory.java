/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techDave.chapter01.item5.factory;

/**
 *
 * @author DELL
 */
public class CarFactory {
    
    private CarFactory() {
        throw new AssertionError();
    }
    
    public static Car createCar(String carType) {
        if (carType.equalsIgnoreCase("sports")) {
            return new SportCar();
        } else if (carType.equalsIgnoreCase("sedan")) {
            return new Sedan();
        } else {
            throw new IllegalArgumentException("Unknown car type");
        }
    }
    
    public static void main(String[] args) {
        Car car = CarFactory.createCar("sports");
        System.out.println(car.drive());
        
        Car car2 = CarFactory.createCar("sedan");
        System.out.println(car2.drive());
    }
}
