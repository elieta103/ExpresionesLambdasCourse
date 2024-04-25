package org.elhg._18ejercicios;/*
    Problema:
    Dada el arreglo de cadenas, imprimir cada nombre de tal forma que estén en mayúsculas,
    y que cada vocal sea reemplazada por una "X", ejemplo:
    "XNX", "FXRNXNDX" ... etc.
 */

import java.util.Arrays;
import java.util.List;

public class Ejercicio05 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "fernando", "jorge", "diana", "raul"};
        List<String> nombresModif = Arrays.stream(nombres)
                .map(String::toUpperCase)
                .map(item -> item.replaceAll("[AEIOU]+", "X"))
                .toList();

        System.out.println("Nombres : "+nombresModif);
    }
}