package br.com.apresentacoes.sprint01.polimorfismo.override;

public class Jogador extends Futebol{

    private String nomeJogador;
    private int idadeJogador;

    public Jogador(String nomeJogador, int idadeJogador){
        this.nomeJogador = nomeJogador;
        this.idadeJogador = idadeJogador;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public int getIdadeJogador() {
        return idadeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public void setIdadeJogador(int idadeJogador) {
        this.idadeJogador = idadeJogador;
    }

    @Override
    void locomover() {
        System.out.println("Jogando futebol.");
    }
}