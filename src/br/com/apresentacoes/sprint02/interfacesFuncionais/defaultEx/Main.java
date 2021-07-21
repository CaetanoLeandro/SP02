package br.com.apresentacoes.sprint02.interfacesFuncionais.defaultEx;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Giovane", "05045065017", "giovane@gmail", 191001);
        c1.depositar(80.50);
        c1.ativacaoDeToken();
        c1.depositar(80);

    }
}
