package br.com.sprint02.java8.interfacesfuncionais.consumer;

import br.com.sprint02.java8.interfacesfuncionais.predicate.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product>{
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
