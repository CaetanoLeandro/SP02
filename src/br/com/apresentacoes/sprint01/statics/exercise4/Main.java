package br.com.apresentacoes.sprint01.statics.exercise4;

public class Main {
    public static void main(String[] args) {
        Classroom a1 = new Classroom("Marcos");
        Classroom a2 = new Classroom("Giovane");

        a1.exibeDados();

        System.out.println("----------------");

        a2.exibeDados();
        System.out.println("----------------");

    }
}