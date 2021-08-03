package br.com.apresentacoes.sprint02.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String s = "Number one";
        String n = "1";

        Optional<Integer> num = convertNumber(n);
        System.out.println(num.isPresent()); // retorna true ou false
        System.out.println(num.get());       // pega o valor no Optional, mas se nao tiver valor lança exception


        // outras maneiras de pegar valor no Optional ao inves de get()
        Optional<Integer> numero = convertNumber(s);

        numero.ifPresent(System.out::println);  // só executa lambda ou method reference se tiver valor
                //.orElse(2); // retorna o valor presente, senao retorna o valor do parametro
                //.orElseGet(() -> {return operacaoPesada();});  // executa uma operacao mais pesada se valor nao for presente
                //.orElseThrow(() -> new NullPointerException("Empty value")); // return value if present or throw exception if no value is present

        System.out.println(numero);


        // Optional em streams
       Stream.of(1, 2, 3)
                .findFirst()  // retorna o primeiro valor
                .ifPresent(System.out::println);

    }

    public static Optional<Integer> convertNumber(String numberStr){
            try {
                Integer integer = Integer.valueOf(numberStr);
                return Optional.of(integer);  // metodo of() armazena valores
            }catch (Exception e){
                return Optional.empty();  // retorna uma instancia de Optional vazio
            }
    }
}
