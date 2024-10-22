package com.alexandermakunin.tema03.metodos;

public class Ejercicio13 {
    public static void Saludar(String Hola, String codigo) {
        switch (codigo){
            case "a" -> System.out.println("Bon dia "+Hola);
            case "b" -> System.out.println("Buenos dias "+Hola);
            case "c" -> System.out.println("Good morning "+Hola);
        }
    }

    public static void main(String[] args) {
        String nombre = "Alex";
        String idioma = "b";
        Saludar(nombre,idioma);
    }
}
