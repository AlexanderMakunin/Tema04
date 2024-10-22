package com.alexandermakunin.tema03.metodos;

public class Ejercicio4 {
    public static int maximo(int n1, int n2,int n3, int n4){
        int max1 = n1 >= n2 ? n1 : n2;
        int max2 = n3 >= n4 ? n3 : n4;
        int max3 = max1 >= max2 ? max1 : max2;
        return max3;
    }
    public static void main(String [] args){
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int resultado = maximo(numero1,numero2,numero3,numero4);
        System.out.print(resultado);
    }
}
