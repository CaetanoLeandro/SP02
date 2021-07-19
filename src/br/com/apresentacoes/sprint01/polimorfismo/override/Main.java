package br.com.apresentacoes.sprint01.polimorfismo.override;

public class Main {
    public static void main(String[] args) {
        Futebol f = new Futebol();
        Natacao n = new Natacao();

        f.locomover();
        n.locomover();
    }
}