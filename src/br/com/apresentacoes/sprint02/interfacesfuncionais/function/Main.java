package br.com.apresentacoes.sprint02.interfacesfuncionais.function;

import br.com.apresentacoes.sprint02.interfacesfuncionais.predicate.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // fazer um programa que, a partir de uma lista de produtos, gere uma nova
        // lista contendo os nomes dos produtos em caixa alta.

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // utilizando metodo map() normal com lambda
        list.stream().
                map(p -> p.getName().toUpperCase())
                .forEach(System.out::println);



        // passando uma nova instancia da classe UpperCaseName no argumento do metodo map()
        List<String> names = list
                .stream()
                .map(new UpperCaseName()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
