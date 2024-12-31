package com.alexandermakunin.tema04.fechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Timer;
import java.util.TimerTask;

public class Ejercicio6 {
    /**
     * Para que el contador
     * @param a para que empiece en 1
     * @param b para que vaya subiendo
     * @return el numero para ir restando al numero final
     */
    public static int contador(int a,int b){
        a = a + b;
        return a;
    }
    public static void main(String [] args){
        Timer timer = new Timer();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM HH:mm:ss");
        LocalDateTime ahora = LocalDateTime.now();
        String DiaHoy = ahora.format(dateTimeFormatter);
        System.out.println("El dia de hoy: " + DiaHoy);
        //Obtener valores del ahora
        int diaAhora = ahora.getDayOfMonth();
        int mesAhora = ahora.getMonthValue();
        int horaAhora = ahora.getHour();
        int minutosAhora = ahora.getMinute();
        int segundosAhora = ahora.getSecond();
        LocalDateTime anyoNuevo = LocalDateTime.parse("01/01/2025 00:00:00", dateTimeFormatter);
        String felicidades = anyoNuevo.format(dateTimeFormatter2);
        //Obtener valores del año nuevo
        int diaAnyoNuevo = anyoNuevo.getDayOfMonth();
        int mesAnyoNuevo = anyoNuevo.getMonthValue();
        int horaAnyoNuevo = anyoNuevo.getHour();
        int minutosAnyoNuevo = anyoNuevo.getMinute();
        int segundosAnyoNuevo = anyoNuevo.getSecond();
        int dia = diaAhora - diaAnyoNuevo;
        int mes = mesAhora - mesAnyoNuevo;
        int hora = horaAhora - horaAnyoNuevo;
        int minutos = minutosAhora - minutosAnyoNuevo;
        int segundos = segundosAhora - segundosAnyoNuevo;
        //Obtener el tiempo que falta
        LocalDateTime Segundos = ChronoUnit.SECONDS.addTo(anyoNuevo, -segundos);
        LocalDateTime Minutos = ChronoUnit.MINUTES.addTo(Segundos, -minutos);
        LocalDateTime Horas = ChronoUnit.HOURS.addTo(Minutos, -hora);
        LocalDateTime Dias = ChronoUnit.DAYS.addTo(Horas, -dia);
        LocalDateTime Resultado = ChronoUnit.MONTHS.addTo(Dias, -mes);
        final int a = 1;
        //LocalTime minusSeconds(long seconds);
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 1;
            @Override
            public void run() {
                i = contador(a,i);
                LocalDateTime queda = ChronoUnit.SECONDS.addTo(Resultado, -i);
                String TiempoFaltante = queda.format(dateTimeFormatter2);
                if (TiempoFaltante.equals(felicidades)){
                    System.out.println("Feliz año nuevo!!!");
                } else {
                    System.out.println("Queda: " + TiempoFaltante);
                }
            }
        }, 0, 1000);
    }
}
