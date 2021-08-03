package br.com.apresentacoes.sprint02.java8.lombok.exemplos;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        // instancia normal da classe Pessoa
        Pessoa pessoa = new Pessoa("Bruno", 23, "124-232-322-12","brunogiuseppe@gmail.com", "R. Lajeado - RS, 94090-150", LocalTime.now());

        // instancia da classe Pessoa sem var
        Pessoa.PessoaBuilder giovane = Pessoa.builder().nome("Giovane").cpf("050-450-650-17").tempoLogin(LocalTime.now());

        // var Java 10 = detecta automaticamente o tipo de variavel baseado no contexto
        var joao = Pessoa.builder().nome("Joao").cpf("343-124-435-34").tempoLogin(LocalTime.now());
        var isabella = Pessoa.builder().nome("Isabella ").idade(20).cpf("564-554-235-23").email("isabellazanella@gmail.com").tempoLogin(LocalTime.now());
        var gabriel = Pessoa.builder().nome("Gabriel").idade(19).endereco("R. dos Andradas - Centro Histórico Porto Alegre - RS").cpf("373-464-235-87").tempoLogin(LocalTime.now());

        System.out.println("\n---------------------------------------");
        System.out.println("Instanciação normal da Classe Pessoa.");
        System.out.println("---------------------------------------");

        System.out.println("Nome: "+ pessoa.getNome());
        System.out.println("Idade: "+ pessoa.getIdade());
        System.out.println("CPF: "+ pessoa.getCpf());
        System.out.println("E-mail: "+ pessoa.getEmail());
        System.out.println("Endereco: "+ pessoa.getEndereco());
        System.out.println("Tempo de execucao do cadastro: "+ pessoa.getTempoLogin());

        System.out.println("---------------------------------------");
        System.out.println("Instanciação Classe Pessoa sem o var");
        System.out.println("---------------------------------------");

        System.out.println("Nome: " + giovane.build().getNome());
        System.out.println("CPF: "+ giovane.build().getCpf());
        System.out.println("Tempo de execucao do cadastro: "+ giovane.build().getTempoLogin());

        System.out.println("---------------------------------------");
        System.out.println("Instanciação Classe Pessoa utilizando var");
        System.out.println("---------------------------------------");

        System.out.println("Nome: " + joao.build().getNome());
        System.out.println("CPF: "+ joao.build().getCpf());
        System.out.println("Tempo de execucao do cadastro: "+ joao.build().getTempoLogin());

        System.out.println("---------------------------------------");

        System.out.println("Nome: " + isabella.build().getNome());
        System.out.println("Idade: "+ isabella.build().getIdade());
        System.out.println("CPF: "+ isabella.build().getCpf());
        System.out.println("E-mail: "+ isabella.build().getEmail());
        System.out.println("Tempo de execucao do cadastro: "+ isabella.build().getTempoLogin());

        System.out.println("---------------------------------------");

        System.out.println("Nome: " + gabriel.build().getNome());
        System.out.println("Idade: " + gabriel.build().getIdade());
        System.out.println("CPF: "+ gabriel.build().getCpf());
        System.out.println("Endereco: "+ gabriel.build().getEndereco());
        System.out.println("Tempo de execucao do cadastro: "+ gabriel.build().getTempoLogin());

        System.out.println("---------------------------------------");

    }
}
