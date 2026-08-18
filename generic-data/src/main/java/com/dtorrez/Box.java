package com.dtorrez;

public class Box<T> {

    private T dato;

    public Box(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }
    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Box{" + "dato=" + dato + '}';
    }
}
