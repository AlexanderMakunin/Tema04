package com.alexandermakunin.tema04.metodos;

import java.util.Scanner;

public class Ejercicio9 {
    public static int sumatorio(int n1){
        int resultado = 0;
        for (int i = n1; i >= 1; i--){
            resultado = n1 + resultado;
            n1--;
        } return resultado;
    }
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        int numero1;
        System.out.println("Introduzca un numero");
        numero1 = Integer.parseInt(leer.nextLine());
        int resultado = sumatorio(numero1);
        System.out.print(resultado);
    }
}
