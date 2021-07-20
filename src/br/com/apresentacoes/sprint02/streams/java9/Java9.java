package br.com.apresentacoes.sprint02.streams.java9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9 {
    public static void main(String[] args) {

        // takeWhile - iterar os elementos até que algum deles nao corresponda ao predicado
        Stream<Integer> stream = Stream.of(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
        List<Integer> list = stream.takeWhile(number -> number <= 20).collect(Collectors.toList());
        System.out.println(list);

        // dropWhile - descartar os elementos até que algum deles nao corresponda ao predicado fornecido
        Stream<Integer> stream1 = Stream.of(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
        List<Integer> list1 = stream1.dropWhile(number -> number <= 22).collect(Collectors.toList());
        System.out.println(list1);


        // ofNullable = retorna uma stream com o elemento informado ou uma stream vazia caso o elemento seja nulo.
        System.out.println("Apresentando ofNullable");
        int count = (int) Stream.ofNullable(5).count();
        System.out.println(count);

        // of = single element or values
        System.out.println("Apresentando of single");
        int count1 = (int) Stream.of(null).count();
        System.out.println(count1);

        System.out.println("Apresentando of values");
        int count2 = (int) Stream.of(1, 2, 3, 4).count();
        System.out.println(count2);


        // Stream nao pode ser utilizada mais de uma vez
        // stream.forEach(System.out::println);

    }
}