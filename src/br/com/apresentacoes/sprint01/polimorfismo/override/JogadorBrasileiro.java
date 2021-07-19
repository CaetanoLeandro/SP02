package br.com.apresentacoes.sprint01.polimorfismo.override;

public class JogadorBrasileiro extends Jogador{

    private static final double salarioJogador = 290.000;

    public JogadorBrasileiro(String nomeJogador, int idadeJogador) {
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