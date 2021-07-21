package br.com.apresentacoes.sprint02.interfacesFuncionais.defaultEx;

import lombok.*;

@RequiredArgsConstructor
public class Cliente implements CaixaEletronico{
    @NonNull @Getter @Setter private String nome;
    @NonNull @Getter @Setter private String cpf;
    @NonNull @Getter @Setter private String email;
    @NonNull @Getter @Setter private int token;
    private double saldo;

    private void verExtrato() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.printf("Saldo atual: %.2f\n",this.saldo);
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
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
}
