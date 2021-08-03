package br.com.apresentacoes.sprint02.java8.apidatas.classes02;

import java.time.*;

public class Main {
    public static void main(String[] args) {

        // Classe Period - trabalha com meses, anos e dias

        // metodo of()
        Period pd = Period.of(1,5,3);
        System.out.println(pd);

        // metodo ofWeeks() armazena dia
        Period pd1 = Period.ofWeeks(5);
        System.out.println(pd1);

        // metodo between() - diferenca entre ld e ld2
        LocalDate ld = LocalDate.of(2001, Month.OCTOBER, 19);
        LocalDate ld2 = ld.plusYears(20).plusMonths(3).plusDays(19);
        Period bt = Period.between(ld, ld2);
        System.out.println(bt);

        // metodo until() - diferenca entre ld e ld2
        Period until = ld.until(ld2);
        System.out.println(until);


        // calcular idade exata de pessoas
        LocalDate nascimento = LocalDate.of(2001, Month.OCTOBER, 19);
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(nascimento, hoje);
        System.out.println("Minha idade: "+ idade);


        // erro em tempo de execucao
//        LocalTime lt = LocalTime.now();
//        LocalTime lt1 = lt.plus(pd1); // pd1 period
//        System.out.println(lt1);



        // Classe Duration - trabalha com horas, minutos, segundos e nanosegundos

        // metodo ofDays() armazena horas
        Duration dt = Duration.ofDays(1);
        System.out.println(dt);

        // metodo ofMinutes() armazena horas e minutos
        Duration dt1 = Duration.ofMinutes(500);
        System.out.println(dt1);

        // metodo between() - diferenca entre lc e lc1
        LocalTime lc = LocalTime.now();
        LocalTime lc1 = LocalTime.of(23,59,59);
        Duration bt1 = Duration.between(lc, lc1);
        System.out.println(bt1);


        // erro em tempo de execucao
//        LocalDate ld4 = LocalDate.of(2001, Month.OCTOBER, 19);
//        LocalDate ld5 = ld.plusYears(20).plusMonths(3).plusDays(19);
//        Duration pd3 = Duration.between(ld4, ld5);
//        System.out.println(pd3);

    }
}
