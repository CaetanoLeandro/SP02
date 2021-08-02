package br.com.apresentacoes.sprint02.lombok.noargs;


public class Main {
    public static void main(String[] args) {

        // construtor vazio os atributos caso nao estejam
        // setados ficarão com o valor padrão do tipo
        var nome = new Person();

        System.out.println(nome);

        // exemplo construtor com atributos setados
        Person nome2 = new Person("Giovane", 19);

        System.out.println(nome2.getName());
        System.out.println(nome2.getIdade());

    }
}
