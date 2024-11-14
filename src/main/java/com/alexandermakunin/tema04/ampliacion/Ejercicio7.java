package com.alexandermakunin.tema04.ampliacion;

public class Ejercicio7 {
    public static int potencia(int a,int b){
        if (b >= 1){
            return a * potencia(a,b -1);
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(potencia(2,3));
    }
}
