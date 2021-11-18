package br.com.sprint02.java8.interfacesfuncionais.iunaryOperator;

//Interface que extende de Function, mas o tipo de entrada é o mesmo de saida
//Binaryoperator extende de Bifunction recebe 2 e retorna 1

import java.util.Arrays;
import java.util.List;

public class Unaryoperator {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,33,4,70);
        list.stream()
                .filter(e -> e % 2==0 )
                .reduce((e1, e2) -> e1 + e2)
                .ifPresent(System.out::println);
    }
}
