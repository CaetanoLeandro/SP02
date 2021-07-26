package br.com.apresentacoes.sprint01.finals.methods.example02;

import java.util.Scanner;

public class PlanilhaOrcamental{
    private int setorA;
    private int setorB;
    private int setorC;
    int senhaA = 191001;
    int senhaB = 181002;
    int senhaC = 171003;


    public void escolha(){
        Scanner scan = new Scanner(System.in);
        System.out.print("De qual setor da empresa você é: \n----------------------------------\nSetor A: 1.\nSetor B: 2.\nSetor C: 3.\n----------------------------------\nDigite o número referente ao setor: ");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("----------------------------------");
                System.out.print("Digite a senha: ");
                int leSenhaA = scan.nextInt();
                if (leSenhaA == senhaA) {
                    System.out.println("----------------------------------");
                    System.out.println(exibeDadosSetorA());
                }else{
                    System.out.println("Senha inválida");
                }
                break;
                case 2:
                    System.out.println("----------------------------------");
                    System.out.print("Digite a senha: ");
                    int leSenhaB = scan.nextInt();
                    if (leSenhaB == senhaB) {
                        System.out.println("----------------------------------");
                        System.out.println(exibeDadosSetorB());
                    }else{
                        System.out.println("Senha inválida");
                    }
                    break;
                case 3:
                    System.out.println("----------------------------------");
                    System.out.print("Digite a senha: ");
                    int leSenhaC = scan.nextInt();
                    if (leSenhaC == senhaC) {
                        System.out.println("----------------------------------");
                        System.out.println(exibeDadosSetorC());
                    }else{
                        System.out.println("Senha inválida");
                    }
                    break;
        }
    }


    public final String exibeDadosSetorA(){
        return "Salário: R$1,500";

    }

    public final String exibeDadosSetorB(){
        return "Salário: R$2,500";
    }

    public final String exibeDadosSetorC(){
        return "Salário: R$3,500";
    }
}
