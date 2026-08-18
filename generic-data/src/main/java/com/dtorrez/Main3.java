package com.dtorrez;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        Utility.printItem("David",1);
        Utility.printItem(28);

        MathUtils.sum(1, 2);
        MathUtils.sum(1, 4);

        List<String> names = List.of("Gabriel", "Maria");

        List<Integer> numbers1 = List.of(1, 2);
        List<Integer> numbers = new ArrayList<>(numbers1);

        printList(numbers);
        printList(names);

        sumNumbers(numbers);

        addNumbers(numbers);
    }

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }

    }

    // varianza
    public static void sumNumbers(List<? extends Number> numbers) {
        double sum = 0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        System.out.println("Sum: " + sum);
    }
    // contra varianza (puede leer, agregar)
    public static void addNumbers(List<? super Integer> numbers) {
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        Object num = numbers.get(0);
        System.out.println(num);
    }
}
