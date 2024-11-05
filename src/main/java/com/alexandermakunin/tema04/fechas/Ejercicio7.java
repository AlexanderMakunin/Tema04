package com.alexandermakunin.tema04.fechas;

import com.alexandermakunin.tema04.lib.IO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio7 {
    public static LocalDate sumarAnios(LocalDate fechaSobreElCalculo) {
        return fechaSobreElCalculo.plusYears(1);
    }
    public static LocalDate sumarMeses(LocalDate fechaSobreElCalculo) {
        return fechaSobreElCalculo.plusMonths(1);
    }
    public static LocalDate sumarDias(LocalDate fechaSobreElCalculo) {

        return fechaSobreElCalculo.plusDays(1);
    }
    public static LocalDate restarAnios(LocalDate fechaSobreElCalculo) {

        return fechaSobreElCalculo.minusYears(1);
    }
    public static LocalDate restarMeses(LocalDate fechaSobreElCalculo) {
        return fechaSobreElCalculo.minusMonths(1);
    }
    public static LocalDate restarDias(LocalDate fechaSobreElCalculo) {
        return fechaSobreElCalculo.minusDays(1);
    }
    public static void menuPrincipal(LocalDate fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormat = fecha.format(formatter);
        System.out.println("*********************************");
        System.out.printf("*** FECHA CALCULADA: %s *\n",fechaFormat);
        System.out.println("*********************************");

        System.out.println("1. Modificar fecha calculada");
        System.out.println("2. Operaciones ...");
        System.out.println("------------------------------------------");
        System.out.println("0. Salir del programa");
    }
    public static LocalDate seleccion(LocalDate fecha) {
        int eleccion = IO.solicitarInt("",0,6);

        return switch (eleccion) {
            case 1 -> sumarAnios(fecha);
            case 2 -> sumarMeses(fecha);
            case 3 -> sumarDias(fecha);
            case 4 -> restarAnios(fecha);
            case 5 -> restarMeses(fecha);
            case 6 -> restarDias(fecha);
            default -> fecha;
        };
    }
    public static void subMenu(LocalDate fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormat = fecha.format(formatter);
        System.out.println("*********************************");
        System.out.println("***         OPERACIONES       ***");
        System.out.printf("*** FECHA CALCULADA: %s *\n",fechaFormat);
        System.out.println("*********************************");

        System.out.println("1. Sumar años");
        System.out.println("2. Sumar meses");
        System.out.println("3. Sumar días");
        System.out.println("4. Restar años");
        System.out.println("5. Restar meses");
        System.out.println("6. Restar días");
        System.out.println("------------------------------------------");
        System.out.println("0. Volver al menu principal");
    }
    public static LocalDate establecerFecha() {
        String nuevaFecha = IO.solicitarString("Introduce la nueva fecha: ",0,10);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(nuevaFecha,formatter);
    }
    public static void main(String[] args) {
        int choice;
        LocalDate ahora = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = ahora.format(formatter);
        LocalDate fecha = LocalDate.parse(fechaFormateada, formatter);
        do {
            menuPrincipal(fecha);
            choice = IO.solicitarInt("",0,3);
            if (choice == 1) {
                fecha = establecerFecha();
            } else if (choice == 2) {
                subMenu(fecha);
                fecha = seleccion(fecha);
            }
        }while (choice != 0);
    }
}