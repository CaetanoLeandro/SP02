package br.com.apresentacoes.sprint02.java11.varlambda;

import lombok.NonNull;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Java 10 nao era permitido o uso de var em expressao lambda

        // var + lambda em list
        List<Integer> lista = List.of(1, 2, 3, 4);
        lista.forEach((var e) -> System.out.println(e));

        // declaracao explicita do tipo de a, b, c
        Calculadora cal1 = (int a, int b, int c)-> a + b * c;
        int result1 = cal1.sum(10, 20, 80);
        System.out.println(result1);

        // declaracao implicita do tipo de a, b, c
        Calculadora cal2 = (a, b, c)-> a + b * c;
        int result2 = cal2.sum(10, 20, 80);
        System.out.println(result2);

        // declaracao explicita do tipo de a, b, c
        // podemos utilizar anotacoes
        Calculadora cal3 = (@NonNull var a, var b, var c)-> a + b * c;
        int result3 = cal3.sum(10, 20, 80);
        System.out.println(result3);

    }
}
