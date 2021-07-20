package br.com.apresentacoes.sprint02.lambda.methodReference;

import java.util.Arrays;
import java.util.List;

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

    }
}
