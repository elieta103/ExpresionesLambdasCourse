package org.elhg._12reutilizando;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //Requisito : Filtrar nombres con la letra A

        // Para omitir el uso de el metodo estatico
        // Function recibe un tipo T (String letter) y devuelve un R (Predicate )
        /*
        Function<String, Predicate<String>> function = (letter) -> {
            return nombre -> nombre.startsWith(letter);
        };
        */

        Function<String, Predicate<String>> functionWithLetter = (letter) -> nombre -> nombre.startsWith(letter);


        List<String> amigos = List.of("ana", "anabel", "fernando");
        List<String> enemigos = List.of("adriana", "joaquin", "jorge");
        List<String> conocidos = List.of("diana", "ramon", "alan", "armando");

        List<String> amigosFiltro = amigos.stream()
                .filter(functionWithLetter.apply("a"))
                .toList();
        System.out.println(amigosFiltro);

        List<String> enemigosFiltro = enemigos.stream()
                .filter(functionWithLetter.apply("j"))
                .toList();
        System.out.println(enemigosFiltro);

        List<String> conocidosFiltro = conocidos.stream()
                .filter(functionWithLetter.apply("d"))
                .toList();
        System.out.println(conocidosFiltro);
    }

    public static Predicate<String> predicateSupplier(final String letter) {
        return nombre -> nombre.startsWith(letter);
    }
}
