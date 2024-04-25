package org.elhg._18ejercicios;/*
    Problema:
    Dado la matriz de números, aplana la misma, posteriormente deberás obtener:
    1. El menor
    2. El mayor
    3. La suma de todos sus elementos
    4. El promedio
    5. El producto.
 */

import java.util.Arrays;
import java.util.Comparator;

public class Ejercicio14 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int min = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .min()
                .orElseThrow();

        int max = Arrays.stream(matrix)
                .flatMapToInt(item -> Arrays.stream(item))
                .max()
                .orElseThrow();

        int suma = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum();

        double avg = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .average()
                .orElseThrow();

        double producto = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .reduce((a,b)-> a*b)
                .orElseThrow();

        System.out.println("MIn : "+min+ " Max : "+max+ " Suma : "+suma+" Avg : "+avg+" Prodcuto : "+producto);



    }
}