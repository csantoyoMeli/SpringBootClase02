package com.SpringBootClase02.SpringBootClase02.ejercicio1.services;

import com.SpringBootClase02.SpringBootClase02.ejercicio1.dtos.HabitacionDTO;
import com.SpringBootClase02.SpringBootClase02.ejercicio1.entities.Casa;
import com.SpringBootClase02.SpringBootClase02.ejercicio1.entities.Habitacion;

import java.util.ArrayList;
import java.util.List;

public class CasaService {
    public double getTotalMetrosCuadrados(Casa casa) {
        double total = 0;
        for (Habitacion h : casa.getHabitaciones()) {
            total += h.getDimensiones();
        }
        return total;
    }

    public double getValorCasa(Casa casa) {
        return 800 * getTotalMetrosCuadrados(casa);
    }

    public Habitacion getHabitacionMasGrande(Casa casa) {
        int i = 0;
        double maxValue = 0;
        for (int j = 0; j < casa.getHabitaciones().size(); j++) {
            double dim = casa.getHabitaciones().get(j).getDimensiones();
            if (maxValue < dim) {
                i = j;
                maxValue = dim;
            }
        }
        return casa.getHabitaciones().get(i);
    }

    public List<HabitacionDTO> getMetrosCuadradosxHabitacion(Casa casa) {
        List<HabitacionDTO> values = new ArrayList<>();
        for (Habitacion h : casa.getHabitaciones()) {
            values.add(new HabitacionDTO(h.getNombre(), h.getDimensiones()));
        }
        return values;
    }
}
