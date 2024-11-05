package com.alexandermakunin.tema04.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Classificar los planetas
     */
    public enum Planeta{
        MERCURIO,VENUS,TIERRA,MARTE,JUPITER,SATURNO,URANO,NEPTUNO
    }

    /**
     * Calcula tu año en los planetas
     * @param fechaNacimiento recibe tu fecha de nacimiento
     * @param planeta que planeta
     * @return devuelve tu año en dias planetarios
     */
    public static float edadEnPlanetas(LocalDate fechaNacimiento, Planeta planeta){
        float diasPlaneta = switch (planeta){
            case MERCURIO -> 87.9f;
            case VENUS -> 226.7f;
            case TIERRA -> 365.25f;
            case MARTE -> 687f;
            case JUPITER -> 4333f;
            case SATURNO -> 10759f;
            case URANO -> 30668f;
            case NEPTUNO -> 60182f;
        };
        long edadDias = Ejercicio2.calcularEdad(fechaNacimiento);
        return edadDias / diasPlaneta;
    }
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Pon tu fecha de nacimiento en: dd/mm/yyy");
        String fechaStr = leer.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Pon el planeta");
        for (int i = 0; i < Planeta.values().length;i++){
            System.out.println((i+1) + ". " + Planeta.values()[i].toString());
        }
        int Elegirplaneta = Integer.parseInt(leer.nextLine());
        Planeta planeta = Planeta.values()[Elegirplaneta - 1];
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr,formatter);
        System.out.printf("Tienes %.0f años\n", edadEnPlanetas(fechaNacimiento, planeta));
        leer.close();
    }
}
