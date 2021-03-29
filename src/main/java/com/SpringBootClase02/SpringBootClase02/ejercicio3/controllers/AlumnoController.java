package com.SpringBootClase02.SpringBootClase02.ejercicio3.controllers;

import com.SpringBootClase02.SpringBootClase02.ejercicio3.dtos.DiplomaDTO;
import com.SpringBootClase02.SpringBootClase02.ejercicio3.entities.Alumno;
import com.SpringBootClase02.SpringBootClase02.ejercicio3.services.CalculadorDiploma;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alumno")
public class AlumnoController {
    CalculadorDiploma calculadorDiploma = new CalculadorDiploma();
    @PostMapping("diploma")
    public ResponseEntity<DiplomaDTO> getDiploma(@RequestBody Alumno alumno){
        return new ResponseEntity<>(calculadorDiploma.getDiploma(alumno), HttpStatus.OK);
    }
}
