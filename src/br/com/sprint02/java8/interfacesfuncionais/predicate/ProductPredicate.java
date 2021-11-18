package br.com.sprint02.java8.interfacesfuncionais.predicate;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100;
    }
}
