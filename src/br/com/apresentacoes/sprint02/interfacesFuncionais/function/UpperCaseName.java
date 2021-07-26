package br.com.apresentacoes.sprint02.interfacesFuncionais.function;

import br.com.apresentacoes.sprint02.interfacesFuncionais.predicate.Product;

import java.util.Locale;
import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase(Locale.ROOT);
    }
}
