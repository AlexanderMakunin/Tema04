package com.alexandermakunin.tema04.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio7 {
    /**
     * Calcula tu año en los planetas
     * @param fechaNacimiento recibe tu fecha de nacimiento
     * @param planeta que planeta
     * @return devuelve tu año en dias planetarios
     */
    public static String Operaciones(String fecha){
        int eleccion;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaCambiada = LocalDate.parse(fecha,dateTimeFormatter);
        Scanner leer = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.printf("*** FECHA CALCULADA: %s ***\n",fechaCambiada);
        System.out.println("*********************************");
        System.out.println("1. Modificar fecha calculada");
        System.out.println("2. Operaciones …");
        System.out.println("------------------------------------------");
        System.out.println("0. Salir del programa");
        eleccion = Integer.parseInt(leer.nextLine());
        switch (eleccion){
            case 1 -> System.out.println("Indique cuantos años quiere sumar");
            eleccion = Integer.parseInt(leer.nextLine());
            fecha = ChronoUnit.DAYS.addTo(fecha, eleccion);
            case 2 -> 226.7f;
            case 3 -> 365.25f;
            case 4 -> 687f;
            case 5 -> 4333f;
            case 6 -> 10759f;
            default ->
        };
        return ;
    }
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        int eleccion;
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        do {
            String fecha = ahora.format(dateTimeFormatter);
            System.out.println("*********************************");
            System.out.printf("*** FECHA CALCULADA: %s ***\n",fecha);
            System.out.println("*********************************");
            System.out.println("1. Modificar fecha calculada");
            System.out.println("2. Operaciones …");
            System.out.println("------------------------------------------");
            System.out.println("0. Salir del programa");
            eleccion = Integer.parseInt(leer.nextLine());
            fecha = switch (eleccion) {
                case 1 -> fecha = leer.nextLine();
                case 2 -> fecha = Operaciones(fecha);
                default -> fecha = "Saliendo del programa...";
            };
        }
        while (eleccion != 0);
        leer.close();
    }
}
