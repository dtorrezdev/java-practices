package com.dtorrez;

public class Main2 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");

        System.out.println(stringBox.getDato());
        Box<Integer> integerBox = new Box<>(1);
        System.out.println(integerBox.getDato());

        Utility.printItem("David",1);
        Utility.printItem(28);

        MathUtils.sum(1, 2);
        MathUtils.sum(1, 4);
    }
}
