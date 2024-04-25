package org.elhg._18ejercicios;/*
    Problema:
    Dado el arreglo de números, devuelve el producto de todos sus elementos.
 */

import java.util.Arrays;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mult = Arrays.stream(arreglo)
                .reduce((a, b) -> a * b)
                .orElseThrow();
        System.out.println(mult);
    }
}