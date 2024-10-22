package com.alexandermakunin.tema04.metodos;

public class Ejercicio5 {
    public static void ImprimirCaracter(char c, int num){
        for (int i = 0; num > i;i++){
            System.out.print(c);
        }
    }
    public static void main(String [] args){
        char c = 'a';
        int num = 5;
        ImprimirCaracter(c,num);
    }
}
