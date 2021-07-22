package br.com.apresentacoes.sprint01.threads.methods.runAndStart;

public class MeuRunnable implements  Runnable{


    @Override
    public void run() {                                              // --------- ExampleOne --------- //
        System.out.println("Hello world");                          // Compiling "hello world" -- start() and run() methods
    }

    /*
    @Override
    public void run() {
        String name = Thread.currentThread().getName();         // --------- ExampleTwo --------- //
                                                               // Using start() -- compile = "Thread-0"
        System.out.println(name);                             // Using run() -- compile = "main"
     }
     */

}
