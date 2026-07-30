package com.dtorrez.set;

import java.util.Comparator;

public class ComparatorDni implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getDni().compareTo(o2.getDni());
    }
}
