package com.alexandermakunin.tema04.ampliacion;

public class Ejercicio1 {
    public static void contador(int n){
        if (n > 1){
            System.out.println(n);
            n--;
            contador(n);
        } else {
            System.out.println(n);
            return;
        }
    }
    public static void main(String[] args) {
        contador(5);
    }
}
