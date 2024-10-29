package com.alexandermakunin.tema04.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio2 {
    /**
     * calculara la edad a partir de la fecha de nacimiento y el dia de hoy
     * @param fechaNacimiento la fecha de nacimiento
     * @return devuelve los dias
     */
    public static long calcularEdad(LocalDate fechaNacimiento){
        LocalDate hoy = LocalDate.now();
        long dias = ChronoUnit.DAYS.between(fechaNacimiento, hoy);
        return dias;
    }

    public static void main(String[] args) {
        Scanner nacimiento = new Scanner(System.in);
        System.out.println("Pon tu fecha de nacimiento en: dd/mm/yyy");
        String fechaStr = nacimiento.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr,formatter);
        System.out.printf("Tienes %d days\n", calcularEdad(fechaNacimiento));
    }
}