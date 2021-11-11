package br.com.sprint02.java8.apidatas;

import java.time.*;

public class Main {

    public static void main(String[] args) {

        // # Classses #

        //LocalDate - representa uma data: 11/11/2021
        LocalDate IdNow = LocalDate.now();
        System.out.println(IdNow);
        LocalDate id = LocalDate.of(1982, Month.SEPTEMBER, 30);
        System.out.println(id);

        //LocalTime - reprensta uma hora: 10:45:05
        LocalTime ItNow = LocalTime.now();
        System.out.println(ItNow);
        LocalTime it = LocalTime.of(10,26,10, 200000);
        System.out.println(it);

        //LocalDateTime - representa Date  + Time (sem timezone)
        //11/11/2021 13:04:05
        LocalDateTime IdtNow = LocalDateTime.now();
        System.out.println(IdtNow);
        LocalDateTime idt = LocalDateTime.of(id, it);
        System.out.println(idt);


        //Instatnt - representa um momento/instante na linha do tempo (milisegundos a partir de 01/01/1970
        //OBS: Não tem infomação de localidade
        //11/11/2021 13:04:05 GMT/UTC
        Instant iNow = Instant.now();
        System.out.println(iNow);
        Instant i = Instant.ofEpochMilli(408011251555L);
        System.out.println("Intstant: "+ i);


        //ZonedDateTime - representa LocalDateTime + TimeZone (fuso horário)
        //11/11/2021 13:04:05 GMT-3 (America/Sao Paulo)
        ZonedDateTime zdtNow = ZonedDateTime.now();
        System.out.println(zdtNow);


    }

}
