package com.alexandermakunin.tema04.metodos;
//por arreglar
public class Ejercicio8 {
    public static void capicua(int numero1, int numero2, int numero3, int numero4){
        if  (numero1 == numero4 && numero2 == numero3) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
    public static void main(String [] args){
        int numero = 1331;
        int numero4 = numero % 10;
        int numero3 = numero % 100 - numero4;
        int resultado3 = numero3 / 10;
        int numero2 = numero % 1000 - numero3 - numero4;
        int resultado2 = numero2 / 100;
        int numero1 = numero % 10000 - numero2 - numero3 - numero4;
        int resultado1 = numero1 / 1000;
        capicua(resultado1,resultado2,resultado3,numero4);
    }
}
