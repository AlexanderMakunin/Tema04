package com.alexandermakunin.tema03.metodos;
//por arreglar
public class Ejercicio8 {
    public static void capicua(int numero1, int numero2, int numero3, int numero4){
        String nada = "";
        String nada2 = "";
        char A;
        nada = nada + numero1;
        for (int b = (nada.length()); b >=0; b--) {
            A = (nada.charAt(b));
            nada2 = A + nada2;
            System.out.println(nada2);
        }
        if (nada2.equals(nada)){
            System.out.println("Es equivalente");
        } else {
            System.out.println("No es equivalente");
        }

    }
    public static void main(String [] args){
        int numero1 = 1321;
        int numero2 = 2252;
        int numero3 = 2123;
        int numero4 = 2552;
        capicua(numero1,numero2,numero3,numero4);
    }
}
