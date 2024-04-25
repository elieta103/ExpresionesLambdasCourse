package org.elhg._21comparator_avanzado;



import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = List.of(
                new Persona("ana", "puentes", 33),
                new Persona("pedro", "whatever", 11),
                new Persona("pedro", "whatever", 12),
                new Persona("pedro", "whatever", 13),
                new Persona("jorge", "gonzalez", 22)
        );

        Comparator<Persona> porEdad = Persona::diferenciaEdad;
        Comparator<Persona> porEdadDesc = porEdad.reversed();


        List<Persona> personas1 = personas.stream()
                .sorted(porEdad)
                .toList();
        System.out.println(personas1);

        personas1 = personas.stream()
                .sorted(porEdadDesc)
                .toList();
        System.out.println(personas1);

        Optional<Persona> personaOptional1 = personas.stream()
                .max((p1, p2)-> Integer.compare(p1.getEdad(), p2.getEdad()));
        System.out.println(personaOptional1.orElseThrow());

        Optional<Persona> personaOptional2 = personas.stream()
                .min((p1, p2)-> Integer.compare(p1.getEdad(), p2.getEdad()));
        System.out.println(personaOptional2.orElseThrow());


        Function<Persona, Integer> byEdad = Persona::getEdad;
        Function<Persona, String> byName = Persona::getNombre;

        List<Persona> personas2 = personas.stream()
                .sorted(Comparator.comparing(byEdad))
                .toList();
        System.out.println(personas2);

        List<Persona> personas3 = personas.stream()
                .sorted(Comparator.comparing(byName).thenComparing(byEdad))
                .toList();
        System.out.println(personas3);

        System.out.println("------------------------------------------------------");
        personas.stream()
                .sorted(Comparator.comparing(Persona::getApellido).thenComparing(Persona::getEdad))
                .forEach(System.out::println);

    }
}
