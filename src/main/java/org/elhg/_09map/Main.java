package org.elhg._09map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = List.of("Alma","July", "Ana", "Diana", "Jessica", "Angel", "Armando");

        List<String> nombresUppecase = nombres.stream()
                .map(nombre -> nombre.toUpperCase())
                .toList();



    }
}
