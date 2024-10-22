package com.alexandermakunin.tema03.metodos;

import java.util.Scanner;

public class Ejercicio14 {
    public static void Operacion(float n, float m) {
        double ResultadoN = 0;
        for (int i = 0; i < n; i++) {
            ResultadoN = ResultadoN + n;
        }
        double ResultadoM = 0;
        for (int i = 0; i < m; i++) {
            ResultadoM = ResultadoM + m;
        }
        double Resultado = ResultadoN/ResultadoM*(ResultadoN-ResultadoM);
        System.out.println(Resultado);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int m;
        System.out.println("Introduzca un numero");
        n = Integer.parseInt(leer.nextLine());
        System.out.println("Introduzca otro numero");
        m = Integer.parseInt(leer.nextLine());
        Operacion(n,m);
    }
}
