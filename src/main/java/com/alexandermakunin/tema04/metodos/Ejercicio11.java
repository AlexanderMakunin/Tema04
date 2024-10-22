package com.alexandermakunin.tema03.metodos;

import java.util.Random;
//preguntar profe por que no lo entiendo
public class Ejercicio11 {
    /*public static String Resultados() {

    }
     */
    public static int Proabilidades(int min, int max) {
        Random quiniela = new Random();
        int aleatorio = quiniela.nextInt(min, max);
        return aleatorio;
    }

    public static void main(String[] args) {
        int min = 5;
        int max = 10;
        Proabilidades(min, max);
    }
}