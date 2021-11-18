package br.com.sprint02.java8.interfacesfuncionais.Ifunction;

import java.util.Arrays;
import java.util.List;


// Interface que recebe um valor qualquer retorna outro valor

public class Function {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,4,5,2,4,5,8,4,8,9);
        list.stream()
                .filter(e -> e % 2==0 )
                .map(e ->e.doubleValue())
                .forEach(System.out::println);
    }
}
