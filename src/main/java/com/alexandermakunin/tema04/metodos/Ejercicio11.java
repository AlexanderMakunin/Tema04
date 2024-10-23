package com.alexandermakunin.tema04.metodos;

import java.util.Random;

public class Ejercicio11 {
    public static void resultados(int min, int max) {
        int partido = 1;
        for(int i = 0; 15 > i; i++) {
            int equipo1;
            int equipo2;
            String respuesta = "";
            equipo1 = proabilidades(min, max);
            equipo2 = proabilidades(min, max);
            if (equipo1 > equipo2) {
                respuesta = respuesta + 1;
            } else if (equipo1 < equipo2) {
                respuesta = respuesta + 2;
            } else if (equipo1 == equipo2) {
                respuesta = respuesta + "x";
            }
            System.out.println("Partido" + partido + " " + respuesta);
            partido++;
        }
    }
    public static int proabilidades(int min, int max) {
        Random quiniela = new Random();
        int aleatorio = quiniela.nextInt(min, max);
        return aleatorio;
    }

    public static void main(String[] args) {
        int min = 1;
        int max = 4;
        resultados(min, max);
    }
}