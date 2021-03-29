package com.SpringBootClase02.SpringBootClase02.ejercicio3.entities;

import lombok.Data;

import java.util.List;

@Data
public class Alumno {
    private String nombre;
    private List<Asignatura> asignaturas;

    public double getPromedio() {
        double num = 0;
        for (Asignatura a: asignaturas) {
            num += a.getNota();
        }
        return num/asignaturas.size();
    }
}
