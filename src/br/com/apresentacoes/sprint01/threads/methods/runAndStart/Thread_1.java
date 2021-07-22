package br.com.apresentacoes.sprint01.threads.methods.runAndStart;

public class Thread_1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MeuRunnable());
        t1.run();         // Just running on the same thread.
        t1.start();      // Running in a new thread. Call the run() method.
    }

}
