package br.com.apresentacoes.sprint02.apidatas.classes01;

import java.time.*;

public class Main {
    public static void main(String[] args) {

        // metodo now()
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);

        // metodo of()
        LocalDate ld2 = LocalDate.of(2001,10,19);
        System.out.println(ld2);

        // metodo of utilizando ENUM
        LocalDate ldEnum = LocalDate.of(2001,Month.OCTOBER, 19);
        System.out.println(ldEnum);

        // metodo plus() e minus()
        LocalDate ld3 = LocalDate.now();
        System.out.println(ld3.plusWeeks(4)); // acrescenta
        System.out.println(ld3.minusWeeks(4)); // subtrai

        // chain plus/minus
        LocalDate ld4 = LocalDate.now();
        System.out.println(ld4.plusYears(30).minusMonths(50).plusDays(131));

        // erro em tempo de execucao - valores invalidos
        // LocalDate ld5 = LocalDate.of(2002,13,23); // mes 13




        // representa uma hora: 11:40:00
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        // representa data + hora
        // 19/10/2001 12:09:34
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // representa um instante/momento na linha do tempo (milissegundos a partir de 01/01/1970 00:00:00)
        // GMT/UTC
        Instant it = Instant.now();
        System.out.println(it);

        // representa LocalDateTime com TimeZone(fuso horario)
        // 19/10/2001 12:09:34 GMT-3 (America/Sao_Paulo)
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);


    }
}


/*
* CLASSES:
*
* LocalDate
* LocalTime
* LocalDateTime
* Instant
* ZonedDateTime
*
 */
