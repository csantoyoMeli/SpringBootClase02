package com.SpringBootClase02.SpringBootClase02.ejercicio1.entities;

import lombok.Data;

@Data
public class Habitacion {
    private String nombre;
    private double ancho;
    private double largo;

    public double getDimensiones() {
        return ancho * largo;
    }
}