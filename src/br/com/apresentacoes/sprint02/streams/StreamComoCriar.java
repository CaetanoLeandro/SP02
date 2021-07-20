package br.com.apresentacoes.sprint02.streams;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamComoCriar {
    public static void main(String[] args) {

        // Utilizando Stream.of = cria stream com qualquer tipo de valor
        Stream.of("Giovane", 'G', 19, 1.9)
                .forEach(System.out::println);

        
        // Stream.iterate = introduzir limite, ou loop infinito // recebe um Seed(semente valor inicial)
        Stream.iterate(5, n -> n * 2)
                .limit(10)
                .forEach(System.out::println);

        // iterate(final T seed, final UnaryOperator<T> f
        // unaryOperator
        // predicate
    }
}
