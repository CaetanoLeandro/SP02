package br.com.apresentacoes.sprint01.polimorfismo.overload;

public class Carro {

    public String modelo;
    public int ano;
    public double kmRodados;

    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(String modelo, int ano, double kmRodados){
        this.modelo = modelo;
        this.ano = ano;
        this.kmRodados = kmRodados;
    }
}

