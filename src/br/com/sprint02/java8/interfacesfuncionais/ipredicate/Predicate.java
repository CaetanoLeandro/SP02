package br.com.sprint02.java8.interfacesfuncionais.ipredicate;

import java.util.Arrays;
import java.util.List;


//Interface recebe um argumento e retorna um boolean,
// que geralmente é usado para escrever lambdas de filtragem

public class Predicate {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(2,3,4,5,2,4,5,8,4,8,9);
        list.stream()
                .filter(e -> e % 2==0 )
                .forEach(System.out::println);
    }
}
