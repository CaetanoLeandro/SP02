package br.com.apresentacoes.sprint02.java8.interfacesfuncionais.supplier;

import java.time.LocalDate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // exemplo Supplier retornando current date.
        Supplier<LocalDate> s = LocalDate::now;
        LocalDate time = s.get();
        System.out.println(time);




        // utilizando supplier como argumento no metodo generate()
        Stream.generate(LocalDate::now)
                .limit(1)
                .forEach(System.out::println);

    }
}
