package com.dtorrez.map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    private String dni;
    private String nombre;
    private int edad;
    private int gravedad;

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
}
