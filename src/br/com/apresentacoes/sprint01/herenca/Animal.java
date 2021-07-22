package br.com.apresentacoes.sprint01.herenca;

public class Animal {
    private String cor;
    private String nome;

    public Animal(String cor, String nome) {
        this.cor = cor;
        this.nome = nome;
    }

    public void locomover(){
        System.out.println("Animal esta se locomovendo");
    }

}
