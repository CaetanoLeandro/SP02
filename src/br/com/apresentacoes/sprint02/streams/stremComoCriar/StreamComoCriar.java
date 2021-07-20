package br.com.apresentacoes.sprint02.streams.stremComoCriar;

import java.util.*;
import java.util.stream.Stream;

public class StreamComoCriar {
    public static void main(String[] args) {

        // Criação de uma stream a partir de um List.
        List<String> list = new ArrayList<>();
            list.add("Um");
            list.add("Dois");
            list.add("Tres");
        Stream<String> stream = list.stream();


        // Criação de uma stream a partir de um Map.
        Map<String, String> map = new HashMap<>();
             map.put("key1", "abacate");
             map.put("key2", "melancia");
             map.put("key3", "manga");
        Stream<String> stream1 = map.values().stream();


        // Criação de uma stream a partir de valores.
        Stream<Integer> numbersFromValues = Stream.of(1, 2, 3, 4, 5);


        // Criação de uma stream a partir de uma Array.
        Integer[] intArray = new Integer[] {1, 2, 3,4 };
        Arrays.stream(intArray)
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
