package br.com.apresentacoes.sprint02.interfacesFuncionais.defaultEx;

public class Cliente implements CaixaEletronico{

    private String nome;
    private String cpf;
    private String email;
    private int token;
    private double saldo;

    public Cliente(String nome, String cpf, String email, int token) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.token = token;
    }

    private void verExtrato() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("E-mail: " + this.email);
        System.out.printf("Saldo atual: %.2f\n",this.saldo);
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Saldo atual: " + this.saldo);
    }

    @Override
    public boolean ativacaoDeToken() {
        if (getToken() == 191001){
            System.out.println("Ativacao confirmada");
            verExtrato();
            return true;
        }else {
            System.out.println("Senha nao valida");
        }
            return false;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public int getToken() {
        return token;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setToken(int token) {
        this.token = token;
    }

}
