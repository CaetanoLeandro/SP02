package br.com.apresentacoes.sprint02.lombok.constructor.noargs;


public class Main {
    public static void main(String[] args) {

        // construtor vazio = atributos caso nao estejam
        // setados ficarão com o valor padrão do seu tipo
        var nameOne = new Person();

        System.out.println(nameOne);

        // exemplo construtor com atributos setados
        Person nameTwo = new Person("Giovane", 19);

        System.out.println(nameTwo.getName());
        System.out.println(nameTwo.getIdade());

    }
}
