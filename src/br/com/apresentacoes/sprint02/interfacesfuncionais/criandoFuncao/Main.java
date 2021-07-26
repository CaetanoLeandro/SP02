package br.com.apresentacoes.sprint02.interfacesfuncionais.criandoFuncao;


import br.com.apresentacoes.sprint02.interfacesfuncionais.predicate.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> lista = new ArrayList<>();

        lista.add(new Product("Tv", 900.00));
        lista.add(new Product("Mouse", 50.00));
        lista.add(new Product("Tablet", 350.00));
        lista.add(new Product("HD Case", 80.90));

       ProductService ps = new ProductService();

        double sum = ps.filteredSum(lista, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum = "+ String.format("%.2f", sum));

    }

}
