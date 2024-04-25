package org.elhg._01comparable.comparators;

import java.util.Comparator;

public class ComparadorPorLongitudDeNombre implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        int primer = o1.getNombre().length();
        int segundo = o2.getNombre().length();

        return Integer.compare(primer, segundo);

    }
}
