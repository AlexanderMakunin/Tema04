package com.alexandermakunin.tema04.ampliacion;

public class Ejercicio6 {

    public static int factorial(int n,int i,int contador){
        i++;
        if (n > contador){
            return i * factorial(n,i,contador);
        } else {
            return n;
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(5,0,1));
    }
}