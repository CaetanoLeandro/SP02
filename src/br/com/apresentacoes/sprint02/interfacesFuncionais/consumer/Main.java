package br.com.apresentacoes.sprint02.interfacesFuncionais.consumer;

import br.com.apresentacoes.sprint02.interfacesFuncionais.predicate.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        // forEach percorre a lista aplicando o Consumer que é uma instancia de PriceUpdate
        list.forEach(new PriceUpdate());

        // method reference
        list.forEach(System.out::println);

    }
}
