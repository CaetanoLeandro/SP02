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
        System.out.println(stream);


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


        // Stream.iterate = itera os elementos da stream até a condicao especificada
        // seed = elemento inicial
        Stream.iterate(1, n -> n + 1)
                .limit(10)         // sem impor limite, vai criar loop infinito
                .forEach(System.out::println);


        // Criacao de stream usando Stream builder()
        Stream.Builder<String> builder = Stream.builder();
        // Adding elements in the stream of Strings
        Stream<String> stream2 = builder
                .add("A")
                .add("B")
                .add("C")
                .build();
        stream2.forEach(System.out::println);


    }
}
