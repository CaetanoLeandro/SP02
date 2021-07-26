package br.com.apresentacoes.sprint01.finals.methods.example02;

import java.util.Scanner;

public class Funcionario extends PlanilhaOrcamental{
    private String name;
    private String setor;
    private int idade;

    public Funcionario(String name, String setor, int idade) {
        this.name = name;
        this.setor = setor;
        this.idade = idade;
        this.escolha();
    }

    public String getName() {
        return name;
    }

    public String getSetor() {
        return setor;
    }

    public int getIdade() {
        return idade;
    }

    public void exibeDadosFuncionario(){
        System.out.println("Nome: "+ getName());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Setor: "+ getSetor());
        System.out.println("----------------------------------");
    }

    @Override
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
                    exibeDadosFuncionario();
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
                    exibeDadosFuncionario();
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
                    exibeDadosFuncionario();
                }else{
                    System.out.println("Senha inválida");
                }
                break;
        }
    }
}
