package org.elhg._21comparator_avanzado;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;


    public int diferenciaEdad(Persona p){
        return edad - p.getEdad();
    }
}
