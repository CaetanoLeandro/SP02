package br.com.apresentacoes.sprint01.construtor;

public class Carro {
    private String modelo;
    private double km;
    private int ano;

    // Construtor padrao que Java cria
    public Carro(){
    }

    // Construtor com 2 parametros
    public Carro(String modelo, double km) {
        this.modelo = modelo;
        this.km = km;
    }

    // Construtor com 3 parametros
    public Carro(String modelo, double km, int ano) {
        this.modelo = modelo;
        this.km = km;
        this.ano = ano;
    }
}
