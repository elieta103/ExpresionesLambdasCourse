package org.elhg._22groupby;

import java.time.LocalDate;
import java.time.Period;

public class PersonaUtils {
    public static int calcularEdad(Persona p){
        return Period.between(p.getFechaNacimiento(), LocalDate.now()).getYears();
    }

    public static char getPrimerCaracter(Persona p){
        return p.getNombre().charAt(0);
    }

}
