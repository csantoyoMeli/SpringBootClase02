package com.SpringBootClase02.SpringBootClase02.ejercicio2.controllers;

import com.SpringBootClase02.SpringBootClase02.ejercicio2.services.AgeCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Edad")
public class AgeController {
    @GetMapping("{day}/{month}/{year}")
    public int getAge(@PathVariable Integer day, @PathVariable Integer month, @PathVariable Integer year) {
        return AgeCalculator.calculateAge(day, month, year);
    }
}
