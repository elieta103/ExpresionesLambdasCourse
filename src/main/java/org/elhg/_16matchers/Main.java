package org.elhg._16matchers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};

        // allMatch
        // Todos los numeros sean pares
        boolean allMatch = Arrays.stream(array)
                .allMatch(item -> item%2 == 0);
        System.out.println("Todos son pares : "+allMatch);

        // anyMatch
        boolean anyMatch = Arrays.stream(array)
                .anyMatch(item -> item%2 == 0);
        System.out.println("Al menos un es par : "+anyMatch);

        // noneMatch
        boolean noneMatch = Arrays.stream(array)
                .noneMatch(item -> item%2 == 0);
        System.out.println("Ninguno es par : "+noneMatch);


        // Ordenar
        int[] array2 = {2,67,2,4,67,9,1,3,6,};
        int[] arrayOrden = Arrays.stream(array2)
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(arrayOrden));

        arrayOrden = Arrays.stream(array2)
                .boxed()
                .sorted((a,b)->Integer.compare(b,a))
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(arrayOrden));
    }
}
