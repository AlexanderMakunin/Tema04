package com.alexandermakunin.tema04.fechas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Calcula tu año en los planetas
     * @param fechaNacimiento recibe tu fecha de nacimiento
     * @param planeta que planeta
     * @return devuelve tu año en dias planetarios
     */
    public static float edadEnPlanetas(LocalDate fechaNacimiento, Ejercicio3.Planeta planeta){
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
        System.out.println("Pon tu fecha de nacimiento en: dd/mm/yyyy");
        String fechaStr = leer.nextLine();
        System.out.println("ingrese la velocidad de la nave en kilómetros por hora (km/h)");
        int Km = Integer.parseInt(leer.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //System.out.printf("Tienes %.0f años\n", edadEnPlanetas(fechaNacimiento, planeta));
    }
}
