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
    public static void main(String [] args){
        Timer timer = new Timer();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime ahora = LocalDateTime.now();
        String fechaFormateada = ahora.format(dateTimeFormatter);
        LocalDateTime unaFecha = LocalDateTime.parse("01/01/2025 00:00:00", dateTimeFormatter);
        LocalDateTime otraFecha = LocalDateTime.parse(fechaFormateada, dateTimeFormatter);
        long dias = ChronoUnit.DAYS.between(otraFecha, unaFecha);
        //LocalTime minusSeconds(long seconds);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                LocalDateTime queda = ChronoUnit.SECONDS.addTo(unaFecha, -1);
                System.out.println(queda);
            }
        }, 0, 1000);
    }
}
