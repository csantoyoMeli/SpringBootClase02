package com.SpringBootClase02.SpringBootClase02.ejercicio1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HabitacionDTO {
    private String nombre;
    private double tamaño;
}
