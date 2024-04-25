package org.elhg._14flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


public class Main {
    public static void main(String[] args) {
        System.out.println("1. Sumar todos los elementos de la matriz");
        int[][] matriz = {{2, 3}, {4, 5, 6}, {7, 8, 9}};


        int suma = Arrays.stream(matriz)
                .flatMapToInt(Arrays::stream)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Suma elementos matriz : "+suma);

        System.out.println("2. Listar todos los telefonos de todas las personas");
        List<Persona> personaList = List.of(new Persona("Ian", 3, List.of("5527172302", "5527172303")),
                new Persona("Daniel", 15, List.of("5527172304", "5527172305")),
                new Persona("Benjamin", 12, List.of("5527172306", "5527172307")));


        personaList.stream()
                .flatMap(persona -> persona.getTelefonos().stream())
                .forEach(System.out::println);

        System.out.println("3. Promedio de las edades de las personas");

        OptionalDouble avg = personaList.stream()
                .mapToInt(Persona::getEdad)
                .average();

        System.out.println("Promedio de edades : "+ avg);

    }
}
