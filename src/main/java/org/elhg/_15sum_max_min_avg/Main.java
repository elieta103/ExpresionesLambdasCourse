package org.elhg._15sum_max_min_avg;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Operaciones para IntStream");
        int[] arreglo = {7,3,10,4,6,10,3,2,1,9,8,2,1,1,4,9,8,5,3,10};

        // Elimina duplicados, ordenalos, solo pares
        int [] respuestaArr = Arrays.stream(arreglo)
                .distinct()
                .sorted()
                .filter(n -> n % 2 ==0)
                .toArray();

        System.out.println(Arrays.toString(respuestaArr));

        // Elemento minimo
        OptionalInt minimo = Arrays.stream(arreglo)
                .min();

        System.out.println(minimo.orElseThrow());

        // Elemento maximo
        OptionalInt maximo = Arrays.stream(arreglo)
                .max();

        System.out.println(maximo.orElseThrow());

        // Elemento suma
       int suma = Arrays.stream(arreglo)
                .sum();

        System.out.println(suma);

        // Elemento avg
        OptionalDouble avg = Arrays.stream(arreglo)
                        .average();

        System.out.println(avg.orElseThrow());
    }
}
