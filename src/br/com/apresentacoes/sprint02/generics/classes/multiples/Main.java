package br.com.apresentacoes.sprint02.generics.classes.multiples;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Exemplo de Generic em Classe com multiplos parametros
        Faculdade<Integer, String> aluno1 = new Faculdade<>(1645, "Giovane");
        Faculdade<Integer, String> aluno2 = new Faculdade<>(1123, "Bruno");
        Faculdade<Integer, String> aluno3 = new Faculdade<>(1345, "Lara");


        // utilizando Classe Faculdade
        GenericInterface<Integer, String> produtos = new Supermercado<>();
        produtos.add(242141234, "Pasta de dente");
        produtos.add(124124533, "Fio dental");
        produtos.add(235432321,"Pente de cabelo");
        produtos.add(346342332,"Escova de dente");
        produtos.add(353252352,"Barbeador");


        // Exemplo de Generic na Classe HashMap
        HashMap<Integer, Integer> names1 = new HashMap<>();

    }
}
