package org.elhg._18ejercicios;/*
    Problema:
    Dada el arreglo de números, encontrar cuántas veces aparece el número 10.
 */

import java.util.Arrays;

public class Ejercicio04 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10};

        int noVeces = Arrays.stream(arreglo)
                .filter(item -> item == 10)
                .toArray()
                .length;

        System.out.println("# Veces que aparece 10 : "+noVeces);
    }
}