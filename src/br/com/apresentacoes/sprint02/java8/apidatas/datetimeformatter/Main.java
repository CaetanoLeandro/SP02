package br.com.apresentacoes.sprint02.java8.apidatas.datetimeformatter;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // ISO
        DateTimeFormatter formatter1 = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld);

        String format = formatter1.format(ld);
        System.out.println(format);



        // FormatStyle
        Locale.setDefault(Locale.FRANCE);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);

        ZonedDateTime zdtNow = ZonedDateTime.now();
        String format1 = formatter2.format(zdtNow);

        System.out.println(zdtNow);
        System.out.println(format1);



        // Pattern
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yy   HH:mm:ss");

        String fomart2 = formatter3.format(ldt);

        System.out.println(fomart2);



        // Parse - transforma a String
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        TemporalAccessor parse = formatterHora.parse("12:00:22");
        System.out.println(parse);

        LocalTime from = LocalTime.from(parse);
        System.out.println(from);


    }
}
