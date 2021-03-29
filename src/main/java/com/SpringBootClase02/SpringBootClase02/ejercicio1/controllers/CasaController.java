package com.SpringBootClase02.SpringBootClase02.ejercicio1.controllers;

import com.SpringBootClase02.SpringBootClase02.ejercicio1.entities.Casa;
import com.SpringBootClase02.SpringBootClase02.ejercicio1.entities.Habitacion;
import com.SpringBootClase02.SpringBootClase02.ejercicio1.services.CasaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("casa")
public class CasaController {
    CasaService cService = new CasaService();

    @PostMapping("cantidadMetros")
    public ResponseEntity<Double> getCantidadMetros(@RequestBody Casa casa){
        return new ResponseEntity<>(cService.getTotalMetrosCuadrados(casa), HttpStatus.OK);
    }

    @PostMapping("valorCasa")
    public ResponseEntity<Double> getValor(@RequestBody Casa casa){
        return new ResponseEntity<>(cService.getValorCasa(casa), HttpStatus.OK);
    }

    @PostMapping("habitacionMasGrande")
    public ResponseEntity<Habitacion> getHabitacion(@RequestBody Casa casa){
        return new ResponseEntity<>(cService.getHabitacionMasGrande(casa), HttpStatus.OK);
    }

    @PostMapping("metrosCuadrardosxHabitacion")
    public ResponseEntity<List> getMetrosHabitacion(@RequestBody Casa casa){
        return new ResponseEntity<>(cService.getMetrosCuadradosxHabitacion(casa), HttpStatus.OK) ;
    }
}
