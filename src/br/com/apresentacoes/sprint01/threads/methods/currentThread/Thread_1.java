package br.com.apresentacoes.sprint01.threads.methods.currentThread;

public class Thread_1{
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();   // Show the thread that is running
        System.out.println(t1.getName());     // Show thread name
    }
}
