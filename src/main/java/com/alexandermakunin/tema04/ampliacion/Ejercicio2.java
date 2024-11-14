package com.alexandermakunin.tema04.ampliacion;

public class Ejercicio2 {
    public static int sumador(int n){
        if (n > 1){
            return n+ sumador(n -1);
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(sumador(5));
    }
}
