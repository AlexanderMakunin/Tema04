package com.alexandermakunin.tema04.metodos;

public class Ejercicio3 {
    public static int maximo(int n1, int n2){
        return n1 >= n2 ? n1 : n2;
    }
    public static void main(String [] args){
        int numero1 = 3;
        int numero2 = 2;
        int resultado = maximo(numero1,numero2);
        System.out.print(resultado);
    }
}