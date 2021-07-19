package br.com.apresentacoes.sprint01.finals.variables.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double TAXA_SELIC = 4.25;
        double montante;

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o valor inicial para investir: ");
        double valorInicial = scan.nextDouble();
        System.out.print("Informe o valor dos meses a serem investidos: ");
        int prazo = scan.nextInt();

        montante = (valorInicial*(1+TAXA_SELIC) * prazo);

        System.out.println("O seu rendimento investindo R$"+valorInicial+" em "+prazo+" meses no Tesouro Selic vai ser de: R$"+ montante+" brutos.");

    }
}

