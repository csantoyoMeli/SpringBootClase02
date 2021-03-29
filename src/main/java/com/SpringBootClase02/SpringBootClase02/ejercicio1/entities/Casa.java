package com.SpringBootClase02.SpringBootClase02.ejercicio1.entities;

import lombok.Data;
import java.util.List;

@Data
public class Casa {
    private String nombre;
    private String direccion;
    private List<Habitacion> habitaciones;
}
