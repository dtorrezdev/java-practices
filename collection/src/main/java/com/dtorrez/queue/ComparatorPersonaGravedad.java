package com.dtorrez.queue;

import java.util.Comparator;

public class ComparatorPersonaGravedad implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        if(o1.getGravedad()<o2.getGravedad()) {
            return -1;
        }
        else if(o1.getGravedad()>o2.getGravedad()) {
            return 1;
        }
        return 0;
    }
}
