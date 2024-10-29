package com.alexandermakunin.tema04.fechas;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ejercicio1 {
    /**
     * calculara la edad a partir de la fecha de nacimiento y el dia de hoy
     *
     * @param fechaNacimiento la fecha de nacimiento
     * @return devuelve la edad
     */
    public static int calcularEdad(LocalDate fechaNacimiento){
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, hoy);
        return periodo.getYears();
    }

    public static void main(String[] args) {
        Scanner nacimiento = new Scanner(System.in);
        System.out.println("Pon tu fecha de nacimiento en: dd/mm/yyy");
        String fechaStr = nacimiento.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr,formatter);
        System.out.printf("Tienes %d años\n", calcularEdad(fechaNacimiento));
    }
}
