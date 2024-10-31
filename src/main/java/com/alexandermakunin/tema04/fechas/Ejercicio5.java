package com.alexandermakunin.tema04.fechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String [] args){
        final long distancia = 225000000;
        long seg, min, horas, dias;
        Scanner leer = new Scanner(System.in);
        System.out.println("Pon la fecha y hora de salida en: dd/mm/yyyy hh:mm:ss");
        String fechaStr = leer.nextLine();
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime salida = LocalDateTime.parse(fechaStr,sdf);
        System.out.println("ingrese la velocidad de la nave en kilómetros por hora (km/h)");
        int km = Integer.parseInt(leer.nextLine());
        float tiempo = distancia / km;
        seg = (long)tiempo * 3600;
        min = seg / 60;
        seg = seg % 60;
        horas = min / 60;
        min = min % 60;
        dias = horas / 24;
        horas = horas % 24;
        LocalDateTime fechaSumSeg= salida.plusSeconds(seg);
        LocalDateTime fechaSumMin = fechaSumSeg.plusMinutes(min);
        LocalDateTime fechaSumHora = fechaSumMin.plusHours(horas);
        LocalDateTime fechaAproximada = fechaSumHora.plusDays(dias);
        String fechaFormateada = fechaAproximada.format(sdf);
        System.out.println("El tiempo total de viaje es: " + dias + "d " + horas + "h " + min + "m y " + seg+ "s");
        System.out.println("La fecha y hora estimada de llegada a Marte es a las: " + fechaFormateada);
    }
}
