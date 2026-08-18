package com.dtorrez;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Object viene desde java 1.0
        Object number = Integer.valueOf(10);
        System.out.println(number);

        // el concepto var aparece en java 10
//        var name = "10";
//        name = 10;
        // los generico aparecen en java 5.0

//        System.out.println(name);

        number = "Hello world";
        System.out.println(number);
    }
}
