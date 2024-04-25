package org.elhg._08foreach;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> listaNombres = List.of("July", "Daniel", "Benjamin", "Ian");
        listaNombres.forEach(new Consumidor());

        listaNombres.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        listaNombres.forEach(nombre -> System.out.println(nombre));
    }
}
