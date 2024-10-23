package com.alexandermakunin.tema04.metodos;

public class Ejercicio6 {
    public static String ImprimirCaracter(char c, int num, int num2){
        String resultado = "";
        for (int i = 1; num >= i;i++){
            for (int x = 1; num2 > x;x++){
                resultado = resultado + c;
            }resultado = resultado + "\n";
        }return resultado;
    }
    public static void main(String [] args){
        char c = 'a';
        int largo = 5;
        int ancho = 4;
        String resultado = ImprimirCaracter(c,largo,ancho);
        System.out.print(resultado);
    }
}
