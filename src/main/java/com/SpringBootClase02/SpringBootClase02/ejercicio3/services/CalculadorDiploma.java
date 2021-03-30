package com.SpringBootClase02.SpringBootClase02.ejercicio3.services;

import com.SpringBootClase02.SpringBootClase02.ejercicio3.dtos.DiplomaDTO;
import com.SpringBootClase02.SpringBootClase02.ejercicio3.entities.Alumno;

public class CalculadorDiploma {
    public DiplomaDTO getDiploma(Alumno alumno) {

        String felicitacion = "En reconocimiento a su excelente promedio. La institución felicita al Alumno "
                + alumno.getNombre() + ". Buena suerte, siga juicioso y no a las drogas";

        String mensaje = "La facultad reconoce al alumno " + alumno.getNombre() + " como alguien que paso.. y sha creo..";

        return new DiplomaDTO((alumno.getPromedio() > 9) ? felicitacion : mensaje,
                alumno.getPromedio(),
                alumno
        );
    }
}
