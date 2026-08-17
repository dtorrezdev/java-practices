package com.dtorrez.legacy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main3 {
    public static void main(String[] args) {
        Properties propiedades = new Properties();

        try {
            propiedades.load(new FileInputStream((new File("./properties.properties"))));

            System.out.println(propiedades.getProperty("nombre"));
            System.out.println(propiedades.getProperty("apellidos"));
            System.out.println(propiedades.getProperty("provincia"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
