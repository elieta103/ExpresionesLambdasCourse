package org.elhg._14flatmap;

import java.util.List;

public class Persona {
    private String nombre;
    private int edad;
    private List<String> telefonos;

    public Persona(String nombre, int edad, List<String> telefonos) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefonos = telefonos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
