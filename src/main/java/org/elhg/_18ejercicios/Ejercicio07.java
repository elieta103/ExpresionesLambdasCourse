package org.elhg._18ejercicios;/*
    Problema:
    Dada el arreglo de cadenas, mostrar solo las cadenas que empiezan con la letra a,
    posteriormente, ordenarlas alfabéticamente tanto en orden ascendente como descendente.
 */

import java.util.Arrays;
import java.util.Comparator;

public class Ejercicio07 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "fernando", "jorge", "diana", "raul", "bob", "amelia", "aa"};
        Arrays.stream(nombres)
                .filter(item -> item.startsWith("a"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----------------------");

        Arrays.stream(nombres)
                .filter(item -> item.startsWith("a"))
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}