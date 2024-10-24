package com.alexandermakunin.tema04.metodos;

public class Ejercicio13 {
    /**
     *
     * @param Hola El nombre a saludar
     * @param idioma El idioma a saludar
     * @return Devolvera un String
     */
    public static String Saludar(String Hola, char idioma) {
        String saludar;
        switch (idioma){
            case 'a' -> saludar = "Bon dia "+Hola;
            case 'b' -> saludar = "Buenos dias "+Hola;
            case 'c' -> saludar = "Good morning "+Hola;
            default -> saludar = "Fuera de rango";
        }
        return saludar;
    }

    public static void main(String[] args) {
        String nombre = "Alex";
        char idioma = 'b';
        String saludo = Saludar(nombre,idioma);
        System.out.print(saludo);
    }
}
