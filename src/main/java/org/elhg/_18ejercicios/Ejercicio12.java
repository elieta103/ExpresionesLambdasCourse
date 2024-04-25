package org.elhg._18ejercicios;/*
    Problema:
    Dado el arreglo de números, devuelve otro arreglo con cada una de las raíces cuadradas
    del arreglo original.
 */

import java.util.Arrays;

public class Ejercicio12 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] raices = Arrays.stream(arreglo)
                .mapToDouble(item -> Math.sqrt(item))
                .toArray();
        System.out.println(Arrays.toString(raices));

    }
}