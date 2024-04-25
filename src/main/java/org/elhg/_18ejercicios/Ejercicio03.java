package org.elhg._18ejercicios;/*
    Problema:
    Dada el arreglo de números, encontrar el número más grande y el más pequeño.
 */

import java.util.Arrays;

public class Ejercicio03 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = Arrays.stream(arreglo)
                .min()
                .orElseThrow();
        int max = Arrays.stream(arreglo)
                .max()
                .orElseThrow();

        System.out.println("Minimo : "+min+" Maximo : "+max);
    }
}