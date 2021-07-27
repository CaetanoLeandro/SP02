package br.com.apresentacoes.sprint02.generics.classes.multiples;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // exemplo de Generic em Classe com multiplos parametros/construtor
        Faculdade<Integer, String> aluno1 = new Faculdade<>(1644365, "Giovane Gomes");
        Faculdade<Integer, String> aluno2 = new Faculdade<>(1126343, "Isabella Zanella");
        Faculdade<Integer, String> aluno3 = new Faculdade<>(1344535, "Bruno Giuseppe");


        // utilizando Classe Supermercado implementando a Interface GenericInterface
        GenericInterface<Integer, String> produtos = new Supermercado<>();
        produtos.add(242141234, "Pasta de dente");
        produtos.add(124124533, "Fio dental");
        produtos.add(235432321,"Pente de cabelo");
        produtos.add(346342332,"Escova de dente");
        produtos.add(353252352,"Barbeador");


        // exemplo de Generic na Classe HashMap
        HashMap<Integer, Integer> names = new HashMap<>();

    }
}
