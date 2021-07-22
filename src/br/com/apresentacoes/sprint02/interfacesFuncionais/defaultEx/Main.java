package br.com.apresentacoes.sprint02.interfacesFuncionais.defaultEx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = scan.nextDouble();
        System.out.println("Months: ");
        int months = scan.nextInt();

        UsaInterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months.");
        System.out.printf("%.2f", payment);

        scan.close();


//        Cliente c1 = new Cliente("Giovane", "05045065017", "giovane@gmail", 191001);
//        c1.depositar(80.50);
//        c1.ativacaoDeToken();
//


    }
}
