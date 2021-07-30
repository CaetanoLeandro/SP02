package br.com.apresentacoes.sprint02.lombok;

import java.time.LocalTime;
import java.util.Objects;

public class PessoaLombok {
    private String nome;
    private int idade;
    private String cpf;
    private String email;
    private String endereco;
    private LocalTime tempoLogin;

    // construtor com 3 parametros
    public PessoaLombok(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // construtor com todos parametros
    public PessoaLombok(String nome, int idade, String cpf, String email, String endereco, LocalTime tempoLogin) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.tempoLogin = tempoLogin;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public LocalTime getTempoLogin() {
        return tempoLogin;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTempoLogin(LocalTime tempoLogin) {
        this.tempoLogin = tempoLogin;
    }


    // equals e hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaLombok that = (PessoaLombok) o;
        return idade == that.idade && Objects.equals(nome, that.nome) && Objects.equals(cpf, that.cpf) && Objects.equals(email, that.email) && Objects.equals(endereco, that.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, cpf, email, endereco);
    }

    @Override
    public String toString() {
        return "PessoaLombok{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", tempoLogin=" + tempoLogin +
                '}';
    }
}

/*

LOMBOK:

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Data
@Builder

 */