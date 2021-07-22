package br.com.apresentacoes.sprint02.interfacesFuncionais.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Product> list = new ArrayList<>();
//
//        // remover da lista os produtos que tiverem preco >=100
//        list.add(new Product("Tv", 900.00));
//        list.add(new Product("Mouse", 50.00));
//        list.add(new Product("Tablet", 350.50));
//        list.add(new Product("HD Case", 80.90));
//
//
//        // remover elemento da lista usando removeIf
//        // utilizando expressao lambda
//        list.removeIf(p -> p.getPrice() >= 100);
//
//
//        // predicado implementado manualmente
//        list.removeIf(new ProductPredicate());
//
//
//        list.forEach(System.out::println);


        List<Integer> numbers = Arrays.asList(1,2,6,5,3,2,235,22);
        for (Integer number : numbers) {
            if(Product.isEven(number)){
                System.out.println(number);
            }

        }

    }
}
