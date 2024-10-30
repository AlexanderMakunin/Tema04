package com.alexandermakunin.tema04.fechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio4 {
    /**
     * Indicar el zodiaco
     */
    public enum Zodiaco{
        ACUARIO,PISCIS,ARIES,TAURO,GEMINIS,CANCER,LEO,VIRGO,LIBRA,ESCORPIO,OFIUCO,SAGITARIO,CAPRICORNIO,NULL
    }

    /**
     * Calcula tu año en los planetas
     * @param fechaNacimiento recibe tu fecha de nacimiento
     * @return devuelve dependiendo del dia y el mes el signo del zodiaco
     */
    public static Zodiaco CualEsTuSignoZodiaco(LocalDate fechaNacimiento){
        int dia = fechaNacimiento.getDayOfMonth();
        Month mes = fechaNacimiento.getMonth();
        if (dia >= 18 && mes == Month.FEBRUARY || dia <= 11 && mes == Month.MARCH){
            return Zodiaco.ACUARIO;
        } else if (dia >= 12 && mes == Month.MARCH || dia <=16 && mes == Month.APRIL){
            return Zodiaco.PISCIS;
        } else if (dia >= 17 && mes == Month.APRIL || dia <=14 && mes == Month.MAY){
            return Zodiaco.ARIES;
        } else if (dia >= 15 && mes == Month.MAY || dia <=21 && mes == Month.JUNE){
            return Zodiaco.TAURO;
        } else if (dia >= 22 && mes == Month.JUNE || dia <=19 && mes == Month.JULY){
            return Zodiaco.GEMINIS;
        } else if (dia >= 20 && mes == Month.JULY || dia <=10 && mes == Month.AUGUST){
            return Zodiaco.CANCER;
        } else if (dia >= 11 && mes == Month.AUGUST || dia <=16 && mes == Month.SEPTEMBER){
            return Zodiaco.LEO;
        } else if (dia >= 17 && mes == Month.SEPTEMBER || dia <=30 && mes == Month.OCTOBER){
            return Zodiaco.VIRGO;
        } else if (dia == 31 && mes == Month.OCTOBER || dia <=22 && mes == Month.NOVEMBER){
            return Zodiaco.LIBRA;
        } else if (23 <= dia && 28 >= dia && mes == Month.NOVEMBER) {
            return Zodiaco.ESCORPIO;
        } else if ((dia >= 29 && mes == Month.NOVEMBER) || (dia <=17 && mes == Month.DECEMBER)){
            return Zodiaco.OFIUCO;
        } else if (dia >= 18 && mes == Month.DECEMBER    || dia <= 20 && mes == Month.JANUARY){
            return Zodiaco.SAGITARIO;
        } else if (dia >= 21 && mes == Month.JANUARY || dia <=17 && mes == Month.FEBRUARY){
            return Zodiaco.CAPRICORNIO;
        }
        return Zodiaco.NULL;
    }
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Pon tu fecha de nacimiento en: dd/mm/yyyy");
        String fechaStr = leer.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr,formatter);
        Zodiaco resultado = CualEsTuSignoZodiaco(fechaNacimiento);
        System.out.println("Tu signo del zodiaco es " + resultado);
    }
}