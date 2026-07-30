package com.dtorrez.set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Persona implements Comparable<Persona>{
    /*
      - Interface Comparable: se limita x q solo puede hacer una comparacion
      - Interface Comprator: permite pasar como parametro al TreeSet
    */

    private String dni;
    private String nombre;
    private int edad;

    public Persona(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public int compareTo(Persona o) {
        if(this.edad == o.edad) return 0;

        if(this.edad > o.edad) return 1;
        else return -1;

    }
}
