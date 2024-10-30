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
        LocalTime fecha = LocalTime.now();
        //Period queda = Period.between(fechaHora, fecha);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        //LocalTime minusSeconds(long seconds);
        int a;
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                LocalTime queda = fecha.minusSeconds(1);
                System.out.println(queda);
            }
        }, 0, 1000);
    }
}
