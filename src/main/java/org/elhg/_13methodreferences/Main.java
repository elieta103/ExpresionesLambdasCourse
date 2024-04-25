package org.elhg._13methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------1. Refencia metodo statico---------------");
        int[] arrayNumbers = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arrayNumbers)
                .mapToDouble(MathUtils::square)
                .forEach(System.out::println);


        System.out.println("----------2. Referencia constructor----------------");
        String[] nombres = {"fernando", "diana", "jorge"};
        List<Persona> personaList = Arrays.stream(nombres)
                        .map(Persona::new)
                        .toList();
        System.out.println(personaList);

        System.out.println("---------3. Referencia metodos de instancia----------------");
        List<String> listaNames = personaList.stream()
                .map(Persona::getNombre)
                .toList();
        System.out.println(listaNames);

    }
}
