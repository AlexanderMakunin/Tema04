package com.alexandermakunin.tema04.metodos;

public class Ejercicio7 {
    public static int factorial(int n1){
        int resultado = 1;
        for (int i = n1; i > 0; i--){
            resultado = n1 * resultado;
            n1--;
        } return resultado;
    }
    public static void main(String [] args){
        int numero1 = 5;
        int resultado = factorial(numero1);
        System.out.print(resultado);
    }
}
