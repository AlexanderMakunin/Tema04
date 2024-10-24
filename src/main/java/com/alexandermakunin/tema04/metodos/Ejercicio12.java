package com.alexandermakunin.tema04.metodos;

import java.util.Random;

public class Ejercicio12 {
    public enum Calificacion {
        INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, EXCELENTE
    }
    /**
     * Calcular Notas
     * @param NotaEntrada Es el numero que va a recibir para decirle la nota
     * @return Es lo que va a devolver
     */
    public static Calificacion CalcularNota(int NotaEntrada) {
        Calificacion salida;
        if (NotaEntrada <= 4) {
            salida = Calificacion.INSUFICIENTE;
        } else if (NotaEntrada <= 6) {
            salida = Calificacion.SUFICIENTE;
        } else if (NotaEntrada <= 7) {
            salida = Calificacion.BIEN;
        } else if (NotaEntrada <= 8) {
            salida = Calificacion.NOTABLE;
        } else {
            salida = Calificacion.EXCELENTE;
        }
        return salida;
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Calificacion resultado;
        for (int i = 0; i <= 50; i++) {
            int nota = aleatorio.nextInt(0, 11);
            resultado = CalcularNota(nota);
            System.out.println(resultado);
        }
    }
}