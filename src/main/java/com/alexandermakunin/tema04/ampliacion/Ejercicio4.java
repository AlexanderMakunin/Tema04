package com.alexandermakunin.tema04.ampliacion;

public class Ejercicio4 {
    public static int sumatorioDigito(int n){
        if (n == 0){
            return 0;
        } else {
            return (n % 10) + sumatorioDigito(n / 10);
        }
    }
    public static void main(String[] args) {
        System.out.println(sumatorioDigito(456));
    }
}
