package org.elhg._18ejercicios;/*
    Problema:
    Dada el arreglo de cadenas, devolver el primer elemento que inicia con j.
 */

import java.util.Arrays;

public class Ejercicio10 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "ana", "fernando", "joaquin", "jorge", "jorge", "diana", "raul", "bob", "amelia", "aa"};

        String primeroLetraJ = Arrays.stream(nombres)
                .filter(item -> item.startsWith("j"))
                .findFirst()
                .orElseThrow();

        System.out.println(primeroLetraJ);
    }
}