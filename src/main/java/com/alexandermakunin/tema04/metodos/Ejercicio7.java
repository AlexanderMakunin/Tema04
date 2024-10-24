package com.alexandermakunin.tema04.metodos;

public class Ejercicio7 {
    public static long factorial(int n1){
        long resultado = 1;
        for (int i = n1; i >= 1; i--){
            resultado = i * resultado;
        } return resultado;
    }
    public static void main(String [] args){
        int numero1 = 2;
        double resultado = factorial(numero1);
        System.out.print(resultado);
    }
}
