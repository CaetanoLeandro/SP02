package br.com.apresentacoes.sprint01.synchronize.join.example01;

public class Conta {

    private double saldo;


    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }
    }

    public double getSaldo(){
        return saldo;
    }

}


