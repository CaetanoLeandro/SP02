package br.com.apresentacoes.sprint02.lambda.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Antes do lambda e method reference
        List<String> nomes = Arrays.asList("Lucas", "Rodrigo", "Paulo");
        for(String nome : nomes) {
            System.out.println(nome);
        }


        // com uso da expressao lambda
        nomes.forEach(nome -> System.out.println(nome));


        // com uso do method reference
        nomes.forEach(System.out::println);


        // sem a possibilidade de method reference
        List<String> nomesReduzidos = nomes.stream()
                .map(nome -> nome.substring(1))   // mostrar só a primeira letra dos nomes
                .collect(Collectors.toList());

        System.out.println(nomesReduzidos);

    }
}
