package com.alexandermakunin.tema04.metodos;

import java.util.Scanner;

public class Ejercicio10 {
    public static void TablaDeMultiplicar(int n1){
        int resultado;
        for (int i = 1;i <= 10; i++){
            resultado = n1 * i;
            System.out.println(resultado);
        }
    }
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        int numero1 = 0;
        while (numero1>=0) {
            System.out.println("Introduzca un numero");
            numero1 = Integer.parseInt(leer.nextLine());
            if (numero1 < 0){
                break;
            }
            TablaDeMultiplicar(numero1);
        }
    }
}
