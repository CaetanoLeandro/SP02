package br.com.apresentacoes.sprint02.interfacesFuncionais.defaultEx;

@FunctionalInterface
public interface CaixaEletronico {

    // Nesse caso tenho apenas um metodo abstrato, sendo assim posso definir como @FunctionalInterface
    boolean ativacaoDeToken();

    // Posso utilizar sem a implementacao do metodo na classe concreta Cliente.
    default void verificaFraude(){
        System.out.println("Verificacao de fraude inciada");
    }
}
