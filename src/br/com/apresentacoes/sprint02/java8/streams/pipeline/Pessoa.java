package br.com.apresentacoes.sprint02.java8.streams.pipeline;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

import static java.util.Arrays.asList;


@AllArgsConstructor
@Data
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double salario;

    public static List<Pessoa> bancoDeDados(){
        return asList(
                new Pessoa("Giovane", 19, 1.000),
                new Pessoa("Carlos", 30, 2.500),
                new Pessoa("Richard", 23, 3.200),
                new Pessoa("Claudiosnei", 55, 6.450),
                new Pessoa("Maria", 19, 1.000),
                new Pessoa("Joao", 31, 5.000),
                new Pessoa("Priscila", 19, 1.000),
                new Pessoa("Nana", 22, 2.000),
                new Pessoa("Isabella", 23, 3.000),
                new Pessoa("Pedro", 25, 4.000)
        );
    }

    @Override
    public int compareTo(Pessoa o) {
        return 0;
    }
}
