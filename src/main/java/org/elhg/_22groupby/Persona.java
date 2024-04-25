package org.elhg._22groupby;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;


}
