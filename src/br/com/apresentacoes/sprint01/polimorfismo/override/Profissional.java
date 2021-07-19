package br.com.apresentacoes.sprint01.polimorfismo.override;

public class Profissional extends Atleta {
    @Override
    void locomover() {
        System.out.println("Praticando esporte.");
    }
}