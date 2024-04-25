package org.elhg._18ejercicios;/*
    Problema:
    Dada el arreglo de números, calcular la suma de todos los elementos.
    Posteriormente, también buscar la suma de solo los elementos pares.
 */

import java.util.Arrays;

public class Ejercicio02 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = Arrays.stream(arreglo)
                .sum();
        int sumaPares = Arrays.stream(arreglo)
                .filter(item -> item%2==0)
                .sum();

        System.out.println("Suma : "+suma+" SumaPares : "+sumaPares);

    }
}