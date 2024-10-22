package com.alexandermakunin.tema04.metodos;

import java.util.Scanner;

public class Ejercicio2 {
    public static double area(double n1){
        return Math.PI*(n1*n1);
    }
    public static double longitud(double n1){
        return Math.PI*n1;
    }
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ponga un numero para calcular el area");
        float numero1;
        numero1 = Float.parseFloat(leer.nextLine());
        System.out.println("Ponga un numero para calcular la longitud");
        float numero2;
        numero2 = Float.parseFloat(leer.nextLine());
        double area = area(numero1);
        double longitud = longitud(numero2);
        System.out.println(area);
        System.out.println(longitud);
    }
}