package br.com.apresentacoes.sprint02.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(2,3,3,7,4,95,100,23,1);

        // Iteracao de lista = Java 5
        for(Integer list : lista) {
            System.out.println(list);
        }

        // Iteracao de lista utilizando lambda = Java 8
        lista.stream().forEach(e -> System.out.println(e));



        // Stream = fluxo de dados
        lista.stream()
                //operacoes intermediarias
                .skip(4)    // pula os elementos de acordo com o parametro
                .limit(5)   // limita o stream a "n" elementos
                .distinct() // nao permite que o stream processe elementos repetidos // utiliza equals e hashcode
                .filter(e -> e % 2 == 0) // filtra os elementos baseado a uma condicao dada no parametro, representada em expressao lambda
                .map(x -> x + 10) // aplica uma funcao a cada elemento da stream // nesse exemplo, soma-se 10
                .sorted(Comparator.naturalOrder()) // classifica os elementos utilizando comparador // nesse caso menor ao maior
                //.peek()
                // operacoes final
                .forEach(System.out::println); // method reference


    }
}

