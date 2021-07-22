package br.com.apresentacoes.sprint01.synchronize.join.exercise1;

    public class FazDeposito implements Runnable {

        private Conta conta;

        public FazDeposito(Conta conta) {
            this.conta = conta;
        }

        @Override
        public void run() {
            this.conta.deposita(100);
        }
    }

