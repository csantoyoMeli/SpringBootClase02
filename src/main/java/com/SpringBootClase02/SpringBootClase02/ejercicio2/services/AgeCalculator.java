package com.SpringBootClase02.SpringBootClase02.ejercicio2.services;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static int calculateAge(int d, int m, int y){
        Period age = Period.between(LocalDate.of(y, m, d), LocalDate.now());
        return age.getYears();
    }
}
