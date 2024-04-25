package org.elhg._22groupby;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Persona> personaList = generarLista();

        // Calcula la edad y clasifica por edad
        Map<Integer, List<Persona>> resultado = personaList.stream()
                .collect(Collectors.groupingBy(PersonaUtils::calcularEdad));

        resultado.forEach((edad, personas) -> System.out.println("Edad : "+edad+ " Total de personas : "+personas.size()+" Personas : "+personas.toString()));

        System.out.println("----------------------------------------------------------------------------------------");
        // Clasifica por la letra del nombre
        Map<Character, List<Persona>> response = personaList.stream()
                .collect(Collectors.groupingBy(PersonaUtils::getPrimerCaracter));

        response.forEach((primerLetra, personas) -> System.out.println("PrimerLetra : "+primerLetra+ " Total de personas : "+personas.size()+" Personas : "+personas.toString()));

    }

    public static List<Persona> generarLista(){
        List<Persona> personaList = new ArrayList<>();

        for(int i =0 ; i<30; i++){
            Persona persona = new Persona(FakerUtils.generarNombre(),
                    FakerUtils.generarApellido(),
                    LocalDate.parse(FakerUtils.generarFecha()));
            personaList.add(persona);
        }

        return  personaList;
    }
}
