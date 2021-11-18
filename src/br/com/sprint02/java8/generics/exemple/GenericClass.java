package br.com.sprint02.java8.generics.exemple;

public class GenericClass<Nome, Idede> {


    // Uso em variáveis
    Nome nome;
    Idede idade;

    // Uso em constructores

    public GenericClass(Nome nome, Idede idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Tipo das classes
    void dataType(){
        System.out.println(nome.getClass().getName());
        System.out.println(idade.getClass().getName());
    }
}
