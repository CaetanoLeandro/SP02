package br.com.apresentacoes.sprint01.synchronize.example01;

public class ContaConjunta {

    private int saldo = 100;

    public int getSaldo() {
        return saldo;
    }

    public void sacar(int valor, String pessoa) {
        if(saldo >= valor) {
            int saldoOriginal = saldo;
            System.out.println(pessoa + " vai sacar.");
            try {
                System.out.println(pessoa + " esperando.");
                Thread.sleep(500);
            }
            catch(InterruptedException e) { }
            saldo -= valor;
            String msg = pessoa + " SACOU = R$" + valor + " ---- Saldo original = R$"+ saldoOriginal + " ---- Saldo final = R$"+ saldo + " ";
            System.out.println(msg);
        }else{
            System.out.println("Saldo insuficiente para "+ pessoa +".");
        }
    }
}