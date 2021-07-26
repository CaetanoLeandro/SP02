package br.com.apresentacoes.sprint01.interfaces.lambdarunnable;

public class LambdaRunnable{
    public static void main(String[] args) {

        // --------- ExampleOne --------- //
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running lambda.");
            }
        }).run();



        // Same code, but using lambda below



        // --------- ExampleTwo --------- //
        new Thread(() -> System.out.println("Hello world.")).run();
    }
}


/*
    How does java know this

    new Thread(() -> System.out.println("Hello world.")).run();

    is a runnable, since it's not written <runnable> anywhere? Like in the ExampleOne?
------------------------------------------------------------------------------------------------------------
    To understand this you have to know SAM, which is an acronym:

    SAM - Single Abstract Method

    Concept that represents any interface that contains an abstract method.
------------------------------------------------------------------------------------------------------------
    If you look at the runnable interface, you will see that it contains only one method and it is abstract.
    Therefore, the runnable interface follows the SAM concept.
------------------------------------------------------------------------------------------------------------
    Lambda, what is it ?

    It's a simpler way to implement an interface that only has a single abstract method
------------------------------------------------------------------------------------------------------------

 */
