package br.com.apresentacoes.sprint02.interfacesfuncionais.consumer;

import br.com.apresentacoes.sprint02.interfacesfuncionais.predicate.Product;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        // fazer um programa que, a partir de uma lista de produtos, aumente o preco dos produtos em 10%

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        // forEach normal com lambda
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        // forEach percorre a lista aplicando o Consumer que é uma instancia de PriceUpdate
        list.forEach(new PriceUpdate());

        // method reference
        list.forEach(System.out::println);



    }
}
