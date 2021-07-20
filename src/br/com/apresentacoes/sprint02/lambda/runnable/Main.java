package br.com.apresentacoes.sprint02.lambda.runnable;

public class Main {
    public static void main(String[] args) {

        // sem utilizacao da expressao lambda
        // Java 7
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Sem expressao lambda = Hello world!");
            }
        }).start();



        // utilizando expressao lambda
        // Java 8
        new Thread(() -> System.out.println("Com expressao lambda = Hello World!")).start();
    }
}
