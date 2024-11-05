package com.alexandermakunin.tema04;

import com.alexandermakunin.tema04.lib.IO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //IO.solicitarInt("Dime tu Edad",2,30);
        IO.solicitarString("Introduce la nueva fecha: ",0,10);
        Scanner leer = new Scanner(System.in);
        System.out.println("Pon tu fecha de nacimiento en: dd/mm/yyy");
        //String fechaStr = leer.nextLine();
        //System.out.println(fechaStr);
        //String asdf = leer.nextLine();
        //System.out.println(asdf);
    }
}