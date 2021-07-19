package br.com.apresentacoes.sprint01.polimorfismo.override;

public class JogadorAmericano extends Jogador{

    private static final double salarioJogador = 149.000;

    public JogadorAmericano(String nomeJogador, int idadeJogador) {
        super(nomeJogador, idadeJogador);
    }

    public double getSalarioJogador() {
        return salarioJogador;
    }

    @Override
    void locomover() {
        System.out.println("Jogando bola");
    }
}