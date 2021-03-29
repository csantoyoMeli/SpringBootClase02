package com.SpringBootClase02.SpringBootClase02.ejercicio3.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DiplomaDTO {
    private String mensaje;
    private double promedio;
    private String alumno;
}
