package com.alexandermakunin.tema04.ampliacion;

public class Ejercicio3 {
    public static int contadorDigito(int n){
        if (n < 10){
            return 1;
        } else {
            return 1+ contadorDigito(n/10);
        }
    }
    public static void main(String[] args) {
        System.out.println(contadorDigito(456));
    }
}
