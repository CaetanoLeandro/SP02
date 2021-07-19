package br.com.apresentacoes.sprint01.finals.variables.apresentado;

import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final double PREÇO_KG_PICANHA = 69.99;

        System.out.print("Quanto pesa a carne (em gramas)? ");
        double peso = scan.nextDouble();
        double kg = (PREÇO_KG_PICANHA * peso)/1000;
        System.out.println("--------------------------------------");
        System.out.printf("O preço de "+peso+" g de picanha é R$%.2f",kg);
    }
}