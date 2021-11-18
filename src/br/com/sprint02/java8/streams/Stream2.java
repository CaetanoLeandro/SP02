package br.com.sprint02.java8.streams;

import java.util.*;
import java.util.stream.Collectors;


//Looping implicito (PERFORMACE)
//Permite multrheads (execução paralela)

public class Stream2 {

    public static void main(String[] args) {


    List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,0,8,4,2,3,6,10);

            //Opeações finais (Não é possível outra operação após a operação finaL)

        System.out.println("############# Count #####################");
        System.out.println("");

            long count = lista.stream()
                    .filter(e -> e % 2==0 )
                    .count(); //Faz contagem dos elementos da lista
            System.out.println(count);

        System.out.println("");
        System.out.println("############# Min e Max #####################");
        System.out.println("");

            Optional<Integer> min = lista.stream()
                    .filter(e -> e % 2 ==0)
                    .min(Comparator.naturalOrder()); // retorna o menor valor da lista
            System.out.println("Menor"+ min.get());

        System.out.println("--------------------------------");

            Optional<Integer> max = lista.stream()
                .filter(e -> e % 2 ==0)
                .max(Comparator.naturalOrder()); // retorna o maior valor da lista
            System.out.println("Maior"+ max.get());

        System.out.println("");
        System.out.println("############# To list  #####################");
        System.out.println("");

            List<Integer> newList = lista.stream()
                    .filter(e -> e % 2 ==0)
                    .map(e -> e * 10)
                    .collect(Collectors.toList()); // Armazena em uma nova lista os novos valores
            System.out.println(newList);

        System.out.println("");
        System.out.println("############# GroupingBy #####################");
        System.out.println("");

             Map<Integer, List<Integer>> map = lista.stream()
                .collect(Collectors.groupingBy(e -> e % 3 )); // Agrupa em mapas divididos em resto de divisão 0/1/2
             System.out.println(map);

        System.out.println("");
        System.out.println("############# Joining #####################");
        System.out.println("");

             String collect = lista.stream()
                     .map(e -> String.valueOf(e))
                     .collect(Collectors.joining("-")); // Agrupa em lista ap de Strings
             System.out.println(collect);
     }
}