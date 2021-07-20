package br.com.apresentacoes.sprint02.lambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);

        // Nao utilizando lambda
        asList.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer e) {
                        return e % 2 == 0;
                    }
                }).forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer e) {
                System.out.println("Sem utilizacao de lambda em stream: " + e);
            }
        });


        // Utilizando expressao lambda
        asList.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println("Utilizando expressao lambda em stream: " + e));
    }
}
