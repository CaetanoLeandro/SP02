package br.com.apresentacoes.sprint02.streams.pipeline;

import java.util.*;
import java.util.stream.Collectors;

public class Pipeline {
    public static void main(String[] args) {
        // Java 7
        // Pegar os tres primeiros nomes das pessoas com menos de 25 anos
        // Ordenar pelo nome

        List<Pessoa> pessoas = Pessoa.bancoDeDados();
        Collections.sort(pessoas, new Comparator<Pessoa>() {      // aceita lambda
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        List<String> nomes = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if(pessoa.getIdade() < 25){
                nomes.add(pessoa.getNome());
                if(nomes.size() >= 3)
                    break;
            }
        }
        System.out.println(nomes);


        // Java 8
        // Pipeline - linha de montagem - composto por zero ou mais operacoes intermediarias e uma terminal
        // Operacoes intermediarias
        // Operacoes finais


        // Stream = fluxo de dados

        List<String> nomes02 =
                pessoas.stream()
                        //operacoes intermediarias
                        .filter(p -> p.getIdade() < 25)
                        .sorted(Comparator.comparing(Pessoa::getNome))
                        .limit(3)
                        .sorted()
                        .map(Pessoa::getNome)
                        // operacoes finais
                        .collect(Collectors.toList()); // coleta os elementos e retorna uma lista


        System.out.println(nomes02);


      List<Integer> lista = Arrays.asList(2,3,3,7,4,95,100,23,1);

      lista.stream()
               //operacoes intermediarias
              .skip(4)    // pula os elementos de acordo com o parametro
              .limit(5)   // limita o stream a "n" elementos // short-circuinting
              .distinct() // nao permite que o stream processe elementos repetidos // utiliza equals e hashcode
              .filter(e -> e % 2 == 0) // filtra os elementos baseado a uma condicao dada no parametro, representada em expressao lambda
              .map(x -> x + 10)   // aplica uma funcao a cada elemento da stream // nesse exemplo, soma-se 10
              .sorted(Comparator.naturalOrder()) // classifica os elementos utilizando comparador // nesse caso do elemento menor ao maior

               // operacoes final
              .forEach(System.out::println); // method reference
               //.count();   // retorna a quantidade de elementos da stream

    }
}
