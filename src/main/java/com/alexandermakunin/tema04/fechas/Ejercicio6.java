package com.alexandermakunin.tema04.fechas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class Ejercicio6 {
    public static int contador(int a,int b){
        a = a + b;
        return a;
    }
    public static void main(String [] args){
        Timer timer = new Timer();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM HH:mm:ss");
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println(ahora);
        int diaAhora = ahora.getDayOfMonth();
        int mesAhora = ahora.getMonthValue();
        int horaAhora = ahora.getHour();
        int minutosAhora = ahora.getMinute();
        int segundosAhora = ahora.getSecond();
        LocalDateTime anyoNuevo = LocalDateTime.parse("01/01/2025 00:00:00", dateTimeFormatter);
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
        LocalDateTime Segundos = ChronoUnit.SECONDS.addTo(anyoNuevo, -segundos -1);
        LocalDateTime Minutos = ChronoUnit.MINUTES.addTo(Segundos, -minutos -1);
        LocalDateTime Horas = ChronoUnit.HOURS.addTo(Minutos, -hora -1);
        LocalDateTime Dias = ChronoUnit.DAYS.addTo(Horas, -dia -1);
        LocalDateTime Meses = ChronoUnit.MONTHS.addTo(Dias, -mes -1);
        final int a = 1;
        //LocalTime minusSeconds(long seconds);
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 1;
            @Override
            public void run() {
                i = contador(a,i);
                LocalDateTime queda = ChronoUnit.SECONDS.addTo(Meses, -i);
                String fechaFormateada = queda.format(dateTimeFormatter2);
                System.out.println(fechaFormateada);
            }
        }, 0, 1000);
    }
}
