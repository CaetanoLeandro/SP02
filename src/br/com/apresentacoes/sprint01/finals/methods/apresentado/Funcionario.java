package br.com.apresentacoes.sprint01.finals.methods.apresentado;


public class Funcionario extends PlanilhaPagamento {
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
    }

}