package org.elhg._18ejercicios;/*
    Problema:
    Dada el arreglo de números, filtrar sólo los números pares.
 */

import java.util.Arrays;

public class Ejercicio01 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[]arrayPares = Arrays.stream(arreglo)
                .filter(item-> item%2==0)
                .toArray();
        System.out.println("Pares: "+Arrays.toString(arrayPares));
    }
}