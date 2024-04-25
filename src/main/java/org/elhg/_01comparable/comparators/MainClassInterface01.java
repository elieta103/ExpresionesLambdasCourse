package org.elhg._01comparable.comparators;

import java.util.ArrayList;
import java.util.List;

public class MainClassInterface01 {
    public static void main(String[] args) {

        List<Persona> listaPersonas = generarPersonas(100);
        System.out.println("Antes de ordenar");
        System.out.println(listaPersonas);
        listaPersonas.sort(new ComparadorPorLongitudDeNombre());
        System.out.println("Despues de ordenar");
        System.out.println(listaPersonas);

    }

    private static List<Persona> generarPersonas(int n) {
        List<Persona> personas = new ArrayList<>();

        for(int i=0; i<n; i++){
            personas.add(new Persona(FakerUtils.generarNombre(), FakerUtils.generarApellido()));
        }

        return  personas;
    }


}