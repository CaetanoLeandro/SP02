package br.com.apresentacoes.sprint02.interfacesfuncionais.function;

import br.com.apresentacoes.sprint02.interfacesfuncionais.predicate.Product;
import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
