package org.elhg._20reduccionavanzada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = List.of("ana", "amelia", "fernando");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int reduccionSuma = Arrays.stream(arr)
                .reduce(0, (a, b) -> a + b);

        int reduccionProducto = Arrays.stream(arr)
                .reduce(1, (a, b) -> a * b);


        String reduccionString = nombres.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println(reduccionString);


        // Identidad -> T
        // Acumuladora -> lista, elemnto --> lista.add(item)
        // Combinacion -> ??? (lista1, lista2)
        /*
        nombres.stream()
                .filter(s -> s.startsWith("a"))
                .reduce(new ArrayList(),
                        (lista, elemento) -> {
                            lista.add(elemento);
                            return lista;
                        },
                        (lista1, lista2) -> lista1.addAll(lista2)
                );
         */

        nombres.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
    }
}
