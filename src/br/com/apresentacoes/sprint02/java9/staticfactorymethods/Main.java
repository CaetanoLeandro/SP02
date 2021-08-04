package br.com.apresentacoes.sprint02.java9.staticfactorymethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        // static factory methods melhora a visibilidade do codigo, nomes mais significativos
        Optional<Integer> empty = Optional.empty(); // retorna Optional vazio
        Optional<Integer> doze = Optional.of(12); // nao pode ser null
        Optional<Integer> vazio = Optional.ofNullable(null); // esse metodo pode ser null

        // Controle das Instâncias
        Integer cem = Integer.valueOf(100);
        Integer duz = Integer.valueOf(200);
        Integer tre = Integer.valueOf(300);

        // Como era Antes
        List<Integer> list2 = Arrays.asList(cem,duz,tre);

        // Java 9
        // List.of
        List<Integer> of4 = List.of(1,2,3);
        List<Object> of = List.of(cem,100,tre);
        List<Integer> of2 = List.of(cem);
        List<Integer> of3 = List.of(1,2,3);

        // Imutável - nao pode sofrer mudancas
        // of4.add(1);

        // map.of
        // set.of
    }
}
