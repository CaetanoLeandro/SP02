package br.com.apresentacoes.sprint02.lombok.exemplos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalTime;

@Builder
@Data
public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String email;
    private String endereco;
    private LocalTime tempoLogin;

}
