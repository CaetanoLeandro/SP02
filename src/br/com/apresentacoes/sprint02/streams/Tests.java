package br.com.apresentacoes.sprint02.streams;

import java.util.List;
import java.util.stream.Stream;

public class Tests {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        Stream<Integer> stream = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade);
    }
}
