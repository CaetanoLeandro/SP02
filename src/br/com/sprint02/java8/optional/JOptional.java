package br.com.sprint02.java8.optional;

// É uma classe "tipada" e respeitamdfo o a semântica, usado para verificar a de o valor de um determinado o
// bjeto é nulo, evitanto o "nullpointerexception"
// Permite o uso de dados primitivos

import java.util.Optional;

public class JOptional {

    public static void main(String[] args) {

        String s = "y";
        //String s = "Teste";

        Optional<Integer> number = convertToNumber(s);

        //System.out.println(number.isPresent());// Verifica se o valor da variável está preenchido (bollean)

        //System.out.println(number.get()); // Pega o valor amarzenado na String, se não houver um valor válido,
        //irá retornar um Exception "No value present"

        //convertToNumber(s).ifPresent(n -> System.out.println(n));// Recebe uma expressão lambda, como argumento.

        //Integer number = convertToNumber(s).orElse(2);// Se o valor for inválido, ele retorna o valor
        //predeterminado(2)

        //Integer number = convertToNumber(s).orElseGet(()-> 5); // Tem o comportamento parecido com orElse, poreém é
        // possível usar uma oreção, mais "pesada", porém só será executada, ao ser invocada.
        //Obs: Ela só recebe um valor válido , se houver um dentro.

        //Integer number = convertToNumber(s).orElseThrow(() -> new NullPointerException("Valor inválido"));// Se o
        // Optional estiver null, ele lança uma exceção

        System.out.println(number);


        }


    public static Optional<Integer> convertToNumber(String numberStr) {

        try {
            Integer integer = Integer.valueOf(numberStr);
            return Optional.of(integer);// Criando um Optional
           // return Optional.ofNullable(null); // Permite retornar "null", sem a ocorrẽncia de "NPE"
        } catch (Exception e) {
            return Optional.empty();// Retorna um vazio
        }
    }
}
