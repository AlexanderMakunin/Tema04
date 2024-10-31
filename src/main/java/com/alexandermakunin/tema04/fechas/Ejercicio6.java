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
        //LocalTime minusSeconds(long seconds);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                LocalDateTime fecha = LocalDateTime.now();
                //Period queda = Period.between(fechaHora, fecha);
                DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                LocalDateTime salida = LocalDateTime.parse(fecha,sdf);
                long a = 20;
                LocalDateTime queda = fecha.minusSeconds(a);
                fechaFormateada = queda.format(sdf);
                System.out.println(fechaFormateada);
            }
        }, 0, 1000);
    }
}
