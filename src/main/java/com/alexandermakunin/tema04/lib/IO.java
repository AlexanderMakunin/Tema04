package com.alexandermakunin.tema04.lib;

import java.util.Scanner;

public class IO {
    /**
     * Solicita un texto y valida un longitud este comprendida entre la longitudMinima y LongitudMaxima
     *
     * @param mensaje        Mensaje que se le mostrara al usuario
     * @param longitudMinima Numero minimo de caracteres que debe tener el texto
     * @param longitudMaxima Numero maximo de caracteres que debe tener el texto
     * @return El texto leido validado
     */
    public static String solictarString(String mensaje, int longitudMinima, int longitudMaxima) {
        Scanner leer = new Scanner(System.in);
        String texto;
        do {
            System.out.println(mensaje);
            texto = leer.nextLine();
            if (texto.length() < longitudMinima || texto.length() > longitudMaxima) {
                System.err.println("Vuelve a intentarlo");
            }
        }
        while (texto.length() < longitudMinima || texto.length() > longitudMaxima);
        leer.close();
        return texto;
    }

    /**
     * Solicita un numero y valida que este entre el minimo y maximo
     *
     * @param mensaje Mensaje que se le mostrara al usuario
     * @param numMinima numero minimo que debe tener el numero
     * @param numMaxima numero maximo que debe tener el numero
     * @return Numero validado
     */
    public static int solictarInt(String mensaje, int numMinima, int numMaxima) {
        Scanner leer = new Scanner(System.in);
        int numero;
        do {
            System.out.println(mensaje);
            numero = Integer.parseInt(leer.nextLine());
            if (numero < numMinima || numero > numMaxima) {
                System.err.println("Vuelve a intentarlo");
            }
        }
        while (numero< numMinima || numero > numMaxima);
        leer.close();
        return numero;
    }
}