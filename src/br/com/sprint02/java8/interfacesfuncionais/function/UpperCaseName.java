package br.com.sprint02.java8.interfacesfuncionais.function;

import br.com.sprint02.java8.interfacesfuncionais.predicate.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
