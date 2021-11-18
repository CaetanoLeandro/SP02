package br.com.sprint02.java8.lombok.constructor.noargs;


public class Main {
    public static void main(String[] args) {

        // Construtor vazio
        var emp1 = new employee();

        System.out.println(emp1);

        // Construtor com atributos
        employee emp2 = new employee("Leandro", 123456);

        System.out.println(emp2.getName());
        System.out.println(emp2.getId());

    }
}
