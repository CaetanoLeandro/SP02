package br.com.sprint02.java8.interfacesfuncionais.iconsumer;

import java.util.List;

// Interface que recebe um argumento e tem um retorno void

public class Consumer {
    public static void main(String[] args) {

        List<String> strings = List.of("Leandro", "Caetano", "da Silva");
        forEach(strings, s -> System.out.println(s));

    }
    public static <T> void forEach(List<T> list, java.util.function.Consumer<T> consumer){
        for (T e : list){
            consumer.accept(e);
        }
    }
}
