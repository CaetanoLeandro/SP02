package br.com.sprint02.java8.apidatas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

    public static void main(String[] args) {

        // # Classes #

        System.out.println("######## Classes ########");
        System.out.println("------------------------------------------------");
        //LocalDate - representa uma data: 11/11/2021
        LocalDate IdNow = LocalDate.now();
        LocalDate id = LocalDate.of(1982, Month.SEPTEMBER, 30);
        System.out.println("LocalDate: " + id);

        System.out.println("------------------------------------------------");
        //LocalTime - reprensta uma hora: 10:45:05
        LocalTime ItNow = LocalTime.now();
        LocalTime it = LocalTime.of(10,26,10, 200000);
        System.out.println("LocalTime: " + it);

        System.out.println("------------------------------------------------");
        //LocalDateTime - representa Date  + Time (sem timezone)
        //11/11/2021 13:04:05
        LocalDateTime ldtNow = LocalDateTime.now();
        LocalDateTime idt = LocalDateTime.of(id, it);
        System.out.println("LocalDateTime: " +idt);

        System.out.println("------------------------------------------------");
        //Instatnt - representa um momento/instante na linha do tempo (milisegundos a partir de 01/01/1970
        //OBS: Não tem infomação de localidade
        //11/11/2021 13:04:05 GMT/UTC
        Instant iNow = Instant.now();
        Instant i = Instant.ofEpochMilli(408011251555L);
        System.out.println("Intstant: "+ i);

        System.out.println("------------------- JAVA 11 -----------------------------");
        //ZonedDateTime - representa LocalDateTime + TimeZone (fuso horário)
        //11/11/2021 13:04:05 GMT-3 (America/Sao Paulo)
        ZonedDateTime zdtNow = ZonedDateTime.now();
        ZonedDateTime zoneID = ZonedDateTime.of(idt, ZoneId.systemDefault());
        System.out.println("ZonedDateTime: " + zoneID);

        System.out.println("");
        System.out.println("");
        // # FORMATAÇÃO #

        System.out.println("######## Formatter ########");
        System.out.println("");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);

        String format1 = formatter1.format(zdtNow);
        String format2 = formatter2.format(zdtNow);
        String format3 = formatter3.format(zdtNow);
        String format4 = formatter4.format(zdtNow);

        System.out.println("-------------------- SHORT ----------------------------");
        System.out.println(format1);
        System.out.println("");
        System.out.println("------------------- MEDIUM -----------------------------");
        System.out.println(format2);
        System.out.println("");
        System.out.println("-------------------- LONG ----------------------------");
        System.out.println(format3);
        System.out.println("");
        System.out.println("--------------------- FULL---------------------------");
        System.out.println(format4);

        System.out.println("");
        // # Personalizado #
        System.out.println("######## Customized ##########");
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("dd-MM-YYYY HH-MM-ss");
        String format5 = formatter5.format(ldtNow);
        System.out.println(format5);

        System.out.println("");
        // # Period #

        LocalDate toDay= LocalDate.now();
        System.out.println("To day: " + toDay);

        LocalDate worldCup = LocalDate.of(2022, Month.NOVEMBER, 21);

        Integer anos = worldCup.getYear() - toDay.getYear();
        Period periodo = Period.between(toDay, worldCup);

        LocalDate nextCup = worldCup.plusYears(0);
        System.out.println("Next world Cup: " + nextCup);
        System.out.println(anos +" Year left the cup and "+periodo.getDays()+" days");

    }

}
