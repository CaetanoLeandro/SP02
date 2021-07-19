package br.com.apresentacoes.sprint01.finals.methods.apresentado;

import java.util.Scanner;

public class PlanilhaPagamento {
    public static String nomeEmpresa = "Mastermack";
    public static String cnpj = "61.586.55/0013-29";
    public static String banco = "Bradesco";
    private static final int SENHA_A = 191001;
    private static final int SENHA_B = 181002;
    private static final int SENHA_C = 171003;


    public void dadosEmpresa(){
        System.out.println("Nome da empresa: "+ nomeEmpresa);
        System.out.println("CNPJ: "+ cnpj);
        System.out.println("Banco: "+ banco);
    }

    public void escolha(){
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.print("De qual setor da empresa você é: \n----------------------------------\nSetor A: 1.\nSetor B: 2.\nSetor C: 3.\n----------------------------------\nDigite o número referente ao setor: ");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("----------------------------------");
                System.out.print("Digite a senha: ");
                int leSenhaA = scan.nextInt();
                System.out.println("----------------------------------");
                if (leSenhaA == SENHA_A) {
                    System.out.println("\n\n----DADOS DA EMPRESA----");
                    dadosEmpresa();
                    System.out.println("\n\n----DADOS DO FUNCIONÁRIO----");
                    System.out.println(exibeSalarioSetorA());
                }else{
                    System.out.println("Senha inválida");
                }
                break;
            case 2:
                System.out.println("----------------------------------");
                System.out.print("Digite a senha: ");
                int leSenhaB = scan.nextInt();
                System.out.println("----------------------------------");
                if (leSenhaB == SENHA_B) {
                    System.out.println("\n\n----DADOS DA EMPRESA----");
                    dadosEmpresa();
                    System.out.println("\n\n----DADOS DO FUNCIONÁRIO----");
                    System.out.println(exibeSalarioSetorB());
                }else{
                    System.out.println("Senha inválida");
                }
                break;
            case 3:
                System.out.println("----------------------------------");
                System.out.print("Digite a senha: ");
                int leSenhaC = scan.nextInt();
                System.out.println("----------------------------------");
                if (leSenhaC == SENHA_C) {
                    System.out.println("\n\n----DADOS DA EMPRESA----");
                    dadosEmpresa();
                    System.out.println("\n\n----DADOS DO FUNCIONÁRIO----");
                    System.out.println(exibeSalarioSetorC());
                }else{
                    System.out.println("Senha inválida");
                }
                break;
        }
    }

    public final String exibeSalarioSetorA(){
        return "Salário: R$1,500";
    }

    public final String exibeSalarioSetorB(){
        return "Salário: R$2,500";
    }

    public final String exibeSalarioSetorC(){
        return "Salário: R$3,500";
    }
}