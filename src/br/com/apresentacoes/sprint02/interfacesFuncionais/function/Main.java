package br.com.apresentacoes.sprint02.interfacesFuncionais.function;

import br.com.apresentacoes.sprint02.interfacesFuncionais.predicate.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        System.out.println(names);

        list.stream().map(p -> p.getName().toUpperCase(Locale.ROOT));

    }
}
