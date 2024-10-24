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
        Calificacion Salida;
        if (NotaEntrada <= 4) {
            Salida = Calificacion.INSUFICIENTE;
        } else if (NotaEntrada <= 6) {
            Salida = Calificacion.SUFICIENTE;
        } else if (NotaEntrada <= 7) {
            Salida = Calificacion.BIEN;
        } else if (NotaEntrada <= 8) {
            Salida = Calificacion.NOTABLE;
        } else {
            Salida = Calificacion.EXCELENTE;
        }
        return Salida;
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