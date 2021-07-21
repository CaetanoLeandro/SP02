package br.com.apresentacoes.sprint02.interfacesFuncionais.defaultEx;

public interface CaixaEletronico {

    boolean ativacaoDeToken();

    default void verificaFraude(){
        System.out.println("Verificacao de fraude inciada");
    }
}
