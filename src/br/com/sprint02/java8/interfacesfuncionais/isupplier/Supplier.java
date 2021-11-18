package br.com.sprint02.java8.interfacesfuncionais.isupplier;

import java.util.Random;
import java.util.stream.Stream;


//Interface que não recebe nenhum argumento, mas retorna algum valor
public class Supplier {

    public static void main(String[] args) {

        Stream.generate(() -> new Random().nextDouble())
                .limit(10)
                .forEach(System.out::println);

    }
}
