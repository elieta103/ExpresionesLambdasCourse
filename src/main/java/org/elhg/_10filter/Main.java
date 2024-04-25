package org.elhg._10filter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = List.of("Alma","Amelia","July", "Ana", "Diana", "Jessica", "Angel", "Armando");

        List<String> nombresUppecase = nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .filter(nombre -> nombre.endsWith("a"))
                .filter(nombre -> nombre.contains("m"))
                .map(nombre -> nombre.toUpperCase())
                //.sorted((s1, s2)->Integer.compare(s2.length(), s1.length()))
                .toList();

        System.out.println(nombresUppecase);
    }
}
