package br.com.apresentacoes.sprint01.referenceAndCopy;

public class AcessoValor {
    public static void main(String[] args) {
        AcessoValor pv = new AcessoValor();
        int numero = 9;
        pv.passagemValor(numero);
        System.out.println("Valor é " + numero); //Qual resultado sera exibido no terminal ?    9 ou 10 ?
    }
    public void passagemValor(int number){
        number = 10;
    }
}

