package br.com.apresentacoes.sprint01.synchronize.exercise2;

public class Application {
    public static void main(String[] args) {
        Task taskRunner = new Task();
        taskRunner.start();

        System.out.println("Hello there...");

        Task taskRunner2 = new Task();
        taskRunner2.start();

    }
}

class Task extends Thread{
    @Override
    public void run() {
        for(int i= 0; i < 100; i++){
            System.out.println("Number: "+ i);
        }
    }
}


