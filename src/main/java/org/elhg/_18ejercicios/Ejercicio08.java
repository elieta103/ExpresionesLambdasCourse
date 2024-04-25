package org.elhg._18ejercicios;/*
    Problema:
    Dada el arreglo de cadenas, separar a través de una serie de filtros (reutilizando lambdas),
    de tal forma que podamos separar todas las que empiezan con "a", "f", "j", "d", "r", "b".
    Recordar como generar una función que devuelve predicados.
 */

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ejercicio08 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "fernando", "jorge", "diana", "raul", "bob", "amelia", "aa"};

        Arrays.stream(nombres)
                .filter(item -> item.startsWith("a"))
                .forEach(System.out::println);

        System.out.println("----------------------------");
        Arrays.stream(nombres)
                .filter(predicateFiltarPorLetra("f"))
                .forEach(System.out::println);

        System.out.println("----------------------------");
        Arrays.stream(nombres)
                .filter(predicateFiltarPorLetra("j"))
                .forEach(System.out::println);

        System.out.println("----------------------------");
        Arrays.stream(nombres)
                .filter(predicateFiltarPorLetra("d"))
                .forEach(System.out::println);

        System.out.println("----------------------------");
        Function<String, Predicate<String>> function1 = (letra) -> {
            return nombre -> nombre.startsWith(letra);
        };
        Arrays.stream(nombres)
                .filter(function1.apply("r"))
                .forEach(System.out::println);

        System.out.println("----------------------------");
        Function<String, Predicate<String>> function2 = letra -> nombre -> nombre.startsWith(letra);
        Arrays.stream(nombres)
                .filter(function2.apply("b"))
                .forEach(System.out::println);
    }

    // Opcion 1 : devuelve un predicado
    public static Predicate<String> predicateFiltarPorLetra(String letra) {
        return item -> item.startsWith(letra);
    }

    // Opcion 2 : Function que devuelve predicado
    public static Function<String, Predicate<String>> functionPorLetra(String letra) {
        Function<String, Predicate<String>> func = (valueLetra) -> {
            return nombre -> nombre.startsWith(letra);
        };
        return func;
    }

    // Opcion 3 : Funcion que devuelve predicado, abreviado
    public static Function<String, Predicate<String>> functionPorLetraAbreviada(String letra) {
        return valueLetra -> nombre -> nombre.startsWith(letra);
    }


}