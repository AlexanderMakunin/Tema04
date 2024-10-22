package com.alexandermakunin.tema03.metodos;

public class Ejercicio6 {
    public static void ImprimirCaracter(char c, int num, int num2){
        for (int i = 1; num >= i;i++){
            for (int x = 1; num2 > x;x++){
                System.out.print(c);
            }System.out.println(c);
        }
    }
    public static void main(String [] args){
        char c = 'a';
        int largo = 5;
        int ancho = 4;
        ImprimirCaracter(c,largo,ancho);
    }
}
