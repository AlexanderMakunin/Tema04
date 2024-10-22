package com.alexandermakunin.tema04.metodos;

import java.util.Random;

public class Ejercicio12 {
    public static String Proabilidades(int NotaEntrada) {
        String Salida = "";
        if (NotaEntrada < 4){
            Salida = "INSUFICIENTE";
        } else if (NotaEntrada <= 6){
            Salida = "SUFICIENTE";
        } else if (NotaEntrada <= 7){
            Salida = "BIEN";
        } else if (NotaEntrada <= 8){
            Salida = "NOTABLE";
        } else {
            Salida = "EXCELENTE";
        }
        return Salida;
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int nota = aleatorio.nextInt(0,11);
        String resultado = Proabilidades(nota);
        System.out.println(resultado);
    }
}