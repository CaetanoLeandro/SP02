package br.com.apresentacoes.sprint02.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9 {
    public static void main(String[] args) {
//        List<Integer> lista9 = Arrays.asList(2, 3, 3, 7, 4, 95, 100, 23, 1);
//        lista9.stream().takeWhile(integer -> integer <= 5);

        Stream<Integer> stream = Stream.of(1,2,3,2,1,3,2,1);  // stream.of - equivalalente ao asList
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 11, 22, 33, 44, 55);


        List<Integer> list = stream.takeWhile(number -> number <= 3).collect(Collectors.toList());
        // takeWhile - iterar os elementos até que alguum deles nao corresponda ao predicado fornecido
        System.out.println(list);


        List<Integer> list1 = stream1.dropWhile(number -> number <= 22).collect(Collectors.toList());

        
        System.out.println(list1);



        // Mostrar exemplo de que stream nao pode ser utilizada mais de uma vez. Colocar List e List1 compilando


    }


}