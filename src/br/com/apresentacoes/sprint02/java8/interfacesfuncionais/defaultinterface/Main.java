package br.com.apresentacoes.sprint02.java8.interfacesfuncionais.defaultinterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = scan.nextDouble();
        System.out.println("Months: ");
        int months = scan.nextInt();

        InterestService is = new UsaInterestService(3.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months.");
        System.out.printf("%.2f", payment);

        scan.close();

    }
}
