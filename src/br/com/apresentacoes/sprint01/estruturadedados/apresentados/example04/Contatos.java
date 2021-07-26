package br.com.apresentacoes.sprint01.estruturadedados.apresentados.example04;

public class Contatos{
    private String nome;
    private int idade;

    public Contatos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Contatos{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}